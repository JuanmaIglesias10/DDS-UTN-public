

public class CalculadoraDeTiempoDeDemora {
    public Integer calcularTiempoDeDemoraAproximadoEnMinutos(CalculadoraDeDistancia calculadoraDeDistancia, List<Destino> paradas) {
        Double distanciaTotalEnKM = 0.0;
        Integer tiempoDetenidoEnMinutos = 0;

        for(int i=0; i < paradas.size() - 1; i++){
            Destino destinoInicial = paradas.get(i);
            Destino destinoFinal = paradas.get(i+1);
            distanciaTotalEnKM += calculadoraDeDistancia.calcularDistanciaEnKMEntre(destinoInicial,destinoFinal);

            if(destinoInicial.getCantidadMinutosADetenerse() > 0) {
                tiempoDetenidoEnMinutos += destinoInicial.getCantidadMinutosADetenerse();
            }
        }

        Integer velocidadPromedioEnKMPorHora = 10;
        Double tiempoTotalEnHoras = distanciaTotalEnKM/velocidadPromedioEnKMPorHora;
        Integer tiempoTotalEnMinutos = (int) (tiempoTotalEnHoras*60); //convertimos horas a minutos
        tiempoTotalEnMinutos += tiempoDetenidoEnMinutos;

        return tiempoTotalEnMinutos;
    }
}