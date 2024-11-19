package segundoParcial2022;

import javax.persistence.*;

@Entity
@Table(name = "direccion")
public class Direccion {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "calle")
    private Integer altura;

    @Column(name = "calle")
    private String calle;

    @Column(name = "barrio")
    private String barrio;

    @Column(name = "municipio_comuna")
    private String municipioComuna;

    @Column(name = "provincia")
    private String provincia;

}
