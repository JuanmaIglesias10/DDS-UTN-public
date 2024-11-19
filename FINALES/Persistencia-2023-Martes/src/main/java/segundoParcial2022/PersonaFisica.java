package segundoParcial2022;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "persona_fisica")
@DiscriminatorValue("FISICA")
public class PersonaFisica extends Persona{

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "email")
    private String email;

    @Column(name = "fecha_nacimiento", columnDefinition = "DATE")
    private LocalDate fechaNacinimiento;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "telefono")
    private String telefono;
}
