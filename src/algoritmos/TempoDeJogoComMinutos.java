package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class TempoDeJogoComMinutos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();
        int minutos = minutoFinal- minutoInicial;
        int horas = horaFinal - horaInicial;
        
         if (minutos < 0) {
            minutos += 60;
            horas--;

        }
        if (horas < 0) {
            horas += 24;
            
        }
       
        if (horaInicial == horaFinal && minutoInicial == minutoFinal) {
            System.out.printf("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");
        }else{
             System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);
        }
       

    }
}
