public class Uber {
    private double distancia,tarifa, demanda, espera;

    public Uber(){

    }
    public Uber(double tarifa, double demanda, double espera){
        this.tarifa = tarifa;
        this.demanda = demanda;
        this.espera = espera;
    }

    public void setDistancia(double distancia){
        this.distancia = distancia;
    }
    public double getDistancia(){
        return distancia;
    }

    public double valorCorrida(){
        return (distancia * 2) + (espera * 0.5) + tarifa * demanda;
    }
    public void detalhes(){
        System.out.println("Distâcia: "+ distancia + "Km");
        System.out.println("Tempo de espera: "+ espera +" Minutos");
        System.out.println("Tarifa base: "+ tarifa);
        System.out.println("Fator da demanda: "+ demanda);
        System.out.println("Valor da corrida: R$"+ valorCorrida());
    }
}
