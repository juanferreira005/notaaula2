import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Uber u = new Uber(15.0,10.0,1);

        System.out.println("Qual a distancia até o destino? ");
        u.setDistancia(sc.nextDouble());
        u.valorCorrida();
        u.detalhes();




    }
}

/* Metodos
     distancia (double): distancia percorrida em quilometros
     tempoespera (in): tempo de espera em minutos
     tarifabase(doube): valor cobrado pela corrida
     fator demanda(double): valor do preço em horario de alta demanda

     calcular valorcorrida():
        valorfinal = (distancia *2) + (tempoespera *0.5) + tarifabase * fatordemanda
 */