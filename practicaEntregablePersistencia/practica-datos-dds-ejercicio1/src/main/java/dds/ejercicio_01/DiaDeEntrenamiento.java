package dds.ejercicio_01;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "dia_de_entrenamiento")
public class DiaDeEntrenamiento extends Persistente {
  @OneToMany
  @JoinColumn(name = "ejercicio_id", referencedColumnName = "id")
  private List<Ejercicio> ejercicios;
  @Column(name = "numero")
  private Integer numero; // representa el orden en la duracion de la rutina.
  @OneToOne
  @JoinColumn(name = "dia_de_entrenamiento_id")
  private DiaDeEntrenamiento siguienteDia;

  public DiaDeEntrenamiento() {
    this.ejercicios = new ArrayList<>();
  }
  public void agregarEjercicio(Ejercicio ejercicio) {
    this.ejercicios.add(ejercicio);
  }
}
