package ar.edu.uca.batch;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ar.edu.uca.batch.entities.Alumno;

public class AlumnoRowMapper implements RowMapper<Alumno> {
    public static final String ID_COLUMN = "id";
    public static final String NAME_COLUMN = "nombre";

    public Alumno mapRow(ResultSet rs, int rowNum) throws SQLException {
        Alumno alumno = new Alumno();

        alumno.setId(rs.getInt(ID_COLUMN));
        alumno.setNombre(rs.getString(NAME_COLUMN));

        return alumno;
    }
}
