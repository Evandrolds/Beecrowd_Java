package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class TempoDeUmEvento {

    public static void main(String[] args) {
        int dias, horas, minutos, segundos, total;
        Scanner sc = new Scanner(System.in);
        String []diaInicial = sc.nextLine().split(" ");
        dias =Integer.parseInt(diaInicial[1]);
        String[] tempo = sc.nextLine().replaceAll(" ", "").split(":");

        horas = Integer.parseInt(tempo[0]);
        minutos = Integer.parseInt(tempo[1]);
        segundos = Integer.parseInt(tempo[2]);
        total = segundos + ((minutos * 60) + (horas * 60 * 60) + (dias * 24 * 60 * 60));

        String []diaF = sc.nextLine().split(" ");
        int diasF =Integer.parseInt(diaF[1]);
        
        String[] tempoF = sc.nextLine().replaceAll(" ", "").split(":");

        int horasF = Integer.parseInt(tempoF[0]);
        int minutosF = Integer.parseInt(tempoF[1]);
        int segundosF = Integer.parseInt(tempoF[2]);
        int totalF = segundosF + ((minutosF * 60) + (horasF * 60 * 60) + (diasF * 24 * 60 * 60));

        int subtotal = totalF - total;
        dias = subtotal / (24 * (60 * 60));
        subtotal = subtotal % (24 * (60 * 60));
        horas = subtotal / (60 * 60);
        subtotal = subtotal % (60 * 60);
        minutos = subtotal / 60;
        subtotal = subtotal % 60;
        segundos = subtotal;

        System.out.printf("%d dia(s)\n", dias);
        System.out.printf("%d hora(s)\n", horas);
        System.out.printf("%d minuto(s)\n", minutos);
        System.out.printf("%d segundo(s)\n", segundos);
    }
}
