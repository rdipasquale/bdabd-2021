package project.batch;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import ar.edu.uca.oltp.entities.Alumno;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.builder.FlatFileItemWriterBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.core.io.ClassPathResource;
import project.batch.steps.SendEmailTasklet;
import project.batch.steps.VerifyEmailTasklet;

@Configuration
@EnableBatchProcessing
public class JobConfiguration {

	@Autowired
	public JobBuilderFactory jobBuilderFactory;
	@Autowired
	public StepBuilderFactory stepBuilderFactory;
    @Autowired
    private EntityManagerFactory entityManagerFactory;



	@Bean
	public Job importUserJob(JobCompletionNotificationListener listener) {
		return jobBuilderFactory.get("importUserJob").incrementer(new RunIdIncrementer()).listener(listener)
				.start(sendEmail(null))
				.next(verifyExistingFile(null))
					.on("COMPLETED").to(sendEmail(null))
					.on("FAILED").fail()
				.from(verifyExistingFile(null))
					.next(alumnoChunk(null))
				.end()
				.build();
	}

	@Bean
	public Step alumnoChunk(FlatFileItemWriter<Alumno> fileWriter) {
		return stepBuilderFactory.get("alumnoChunk")
				.<Alumno, Alumno>chunk(10)
				.reader(databaseReader(null))
				//.processor(processor()) podemos procesar los items
				.writer(fileWriter)
				.build();
	}

	@Bean
	public FlatFileItemWriter<Alumno> fileWriter() {
		return new FlatFileItemWriterBuilder<Alumno>().name("fileWriter")
				.resource(new ClassPathResource("sample-data.csv"))
				.delimited()//.delimiter(|) podes usar el separador que quieras
				.names(new String[] { "id", "nombre" })
				.build();
	}

	@Bean
	public JdbcCursorItemReader<Alumno> databaseReader(DataSource ds) {
		return new JdbcCursorItemReaderBuilder<Alumno>()
				.sql("SELECT * FROM ALUMNOS")
				.dataSource(ds)
				.build();
	}


	@Bean
	public Step verifyExistingFile(DataSource ds) {
		return stepBuilderFactory.get("verifyExistingFile")
				.tasklet(new VerifyEmailTasklet())
				.build();
	}


	@Bean
	public Step sendEmail(DataSource ds) {
		return stepBuilderFactory.get("sendEmail")
				.tasklet(new SendEmailTasklet())
				.build();
	}

}
