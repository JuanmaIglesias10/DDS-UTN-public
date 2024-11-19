package models.segundoParcial2023;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("mantener")
public class Mantener extends Motivacion {
}
