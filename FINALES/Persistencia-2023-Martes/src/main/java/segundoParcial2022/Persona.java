package segundoParcial2022;


import javax.persistence.*;

@Entity
@Table(name = "persona")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
@DiscriminatorValue("PERSONA")
public abstract class Persona extends Contactable {
    @Column(name = "nombre")
    private String cuitCuil;

    @ManyToOne
    @JoinColumn(name = "direccion_id", referencedColumnName = "id")
    private Direccion direccion;

    @Convert(converter = MedioDeComunicacionConverter.class)
    @Column(name = "medio_preferido")
    private MedioDeComunicacion medioPreferido;
}
