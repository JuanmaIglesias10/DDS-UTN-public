package dds;

import dds.ejercicio_01.motivaciones.BajarDePeso;
import dds.ejercicio_01.motivaciones.Mantener;
import dds.ejercicio_01.motivaciones.Motivacion;
import dds.ejercicio_01.motivaciones.Tonificar;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class MotivacionAttributeConverter implements AttributeConverter<Motivacion, String> {
    @Override
    public String convertToDatabaseColumn(Motivacion imotivacion){
        if(imotivacion==null){
            return null;
        }
        String motivacion = "";
        if(imotivacion instanceof BajarDePeso){
            motivacion = "BAJAR_DE_PESO";
        }
        else if(imotivacion instanceof Mantener){
            motivacion = "MANTENER";
        }
        else if(imotivacion instanceof Tonificar){
            motivacion = "TONIFICAR";
        }
        return motivacion;
    }

    @Override
    public Motivacion convertToEntityAttribute(String s) {
        if (s == null) {
            return null;
        }

        Motivacion motivacion = switch (s) {
            case "BAJAR_DE_PESO" -> new BajarDePeso();
            case "MANTENER" -> new Mantener();
            case "TONIFICAR" -> new Tonificar();
            default -> null;
        };

        return motivacion;
    }
}
