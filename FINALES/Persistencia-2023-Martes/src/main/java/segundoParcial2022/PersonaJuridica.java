package segundoParcial2022;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "persona_juridica")
@DiscriminatorValue("JURIDICA")
public class PersonaJuridica extends Persona{

    @ElementCollection
    @CollectionTable(name = "persona_juridica_emails", joinColumns = @JoinColumn(name = "persona_juridica_id"))
    @Column(name = "email")
    private List<String> emailsDeContacto;

    @Column(name = "fecha_constitucion", columnDefinition = "DATE")
    private LocalDate fechaConstitucion;

    @Column(name = "razon_social")
    private String razonSocial;

    @ElementCollection
    @CollectionTable(name = "persona_juridica_telefonos",
            joinColumns = @JoinColumn(name = "persona_juridica_id"))
    @Column(name = "telefono")
    private List<String> telefonosDeContacto;
}
