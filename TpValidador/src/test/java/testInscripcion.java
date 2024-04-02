import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class testInscripcion {
    Alumno juanma;
    Materia algoritmos;
    Materia paradigmas;
    Materia analisisDeSistemas;
    Materia disenio;

    @BeforeEach
    public void inicializar() {
         juanma             = new Alumno();
         algoritmos         = new Materia();
         paradigmas         = new Materia();
         analisisDeSistemas = new Materia();
         disenio            = new Materia();

        analisisDeSistemas.agregarCorrelativas(algoritmos);
        paradigmas.agregarCorrelativas(algoritmos);
        disenio.agregarCorrelativas(analisisDeSistemas,disenio);
    }

    @Test
    @DisplayName("La inscripcion fue satisfactoria porque cumplio las correlativas!")
    public void inscripcionAceptadaTest() {
        juanma.agregarMateriasAprobadas(algoritmos);

        Inscripcion nuevaInscripcion = new Inscripcion();
        nuevaInscripcion.setAlumnoAInscribir(juanma);
        nuevaInscripcion.inscribirse(paradigmas,analisisDeSistemas);

        Assertions.assertTrue(nuevaInscripcion.aprobada());
    }
}
