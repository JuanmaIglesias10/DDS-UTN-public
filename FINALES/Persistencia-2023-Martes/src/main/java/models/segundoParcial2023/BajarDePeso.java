package models.segundoParcial2023;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("bajarDePeso")
public class BajarDePeso extends Motivacion {
}