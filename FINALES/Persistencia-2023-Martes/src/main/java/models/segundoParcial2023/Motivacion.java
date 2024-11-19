package models.segundoParcial2023;

import javax.persistence.*;

@Entity
@Table(name = "motivacion")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo")
public abstract class Motivacion extends Persistente {
}
