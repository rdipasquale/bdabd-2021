package org.test.batch.batchTest;

import javax.persistence.*;

@Entity
public class CargoDocente {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="CARGODOCENTE_SEQ")
    private int id;
    private int categoria;
}
