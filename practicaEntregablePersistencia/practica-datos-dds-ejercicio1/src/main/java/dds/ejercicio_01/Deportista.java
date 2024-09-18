package dds.ejercicio_01;

import dds.MotivacionAttributeConverter;
import dds.ejercicio_01.motivaciones.Motivacion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "deportista")
public class Deportista extends Persistente {
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @ElementCollection
    @CollectionTable(name = "deportista_contactos" ,
            joinColumns = @JoinColumn (name = "deportista_id"))
    @Column(name = "contacto")
    private List<String> contactos;
    @Convert(converter = MotivacionAttributeConverter.class)
    @Column(name = "motivacion_principal")
    private Motivacion motivacionPrincipal;
    @Column(name = "peso_inicial_en_kilos", columnDefinition = "FLOAT")
    private Double pesoInicialEnKilos;

    public void agregarContacto(String contacto) {
        contactos.add(contacto);
    }

    public Deportista(){
        this.contactos = new ArrayList<>();
    }

}
