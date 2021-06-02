package project.batch.steps;

import org.springframework.batch.core.*;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import java.io.File;

public class VerifyEmailTasklet implements Tasklet, StepExecutionListener {

        File tempFile = new File("batch1/src/main/resources/datos.csv");

        public VerifyEmailTasklet() {
        }

        @Override
        public void beforeStep(StepExecution stepExecution) {

        }

        @Override
        public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
            return RepeatStatus.FINISHED;
        }

        @Override
        public ExitStatus afterStep(StepExecution stepExecution) {
            boolean exists = tempFile.exists();
            if(exists){
                System.out.println("Enviando mail de ERROR !!");
                return ExitStatus.FAILED;
            }
            return ExitStatus.COMPLETED;
        }
}
