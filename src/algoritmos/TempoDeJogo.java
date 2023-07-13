package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class TempoDeJogo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        if (horaInicial == horaFinal) {
            System.out.printf("O JOGO DUROU 24 HORA(S)\n");
        } else if (horaFinal > horaInicial) {
            System.out.printf("O JOGO DUROU %d HORA(S)\n",(horaFinal - horaInicial));
        } else {
            int total = (int) 24 - (horaInicial - horaFinal);
            System.out.printf("O JOGO DUROU %d HORA(S)\n", total);
        }
    }
}
