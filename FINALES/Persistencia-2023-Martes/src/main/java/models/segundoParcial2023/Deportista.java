package models.segundoParcial2023;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "deportista")
public class Deportista extends Persistente {
    @Column(name = "altura")
    private Double altura;

    @Column(name = "peso")
    private String peso;

    @ElementCollection
    @CollectionTable(name = "contacto_deportista", joinColumns = @JoinColumn(name = "deportista_id"))
    @Column(name = "contacto")
    private List<String> contactos;

    @ManyToOne
    @JoinColumn(name = "motivacion_id", referencedColumnName = "id")
    private Motivacion motivacionPrincipal;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "peso_inicial")
    private Double pesoInicial;
}
