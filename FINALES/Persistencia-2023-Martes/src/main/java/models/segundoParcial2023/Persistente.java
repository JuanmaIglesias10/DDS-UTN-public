package models.segundoParcial2023;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Persistente {
    @Id
    @GeneratedValue
    private Long id;
}

