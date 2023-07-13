package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class Experiencias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, sapos = 0, ratos = 0, coelhos = 0;
        int quantidade = 0;

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tipo = new String[n];
            String frase = sc.nextLine();
            tipo = frase.split(" ");
            quantidade = Integer.parseInt(tipo[0]);
            total += quantidade;
            if (tipo[1].equalsIgnoreCase("c")) {
                coelhos += quantidade;

            } else if (tipo[1].equalsIgnoreCase("r")) {
                ratos += quantidade;

            } else {
                sapos += quantidade;

            }
        }

        System.out.printf("Total: %d cobaias\n", total);
        System.out.printf("Total de coelhos: %d\n", coelhos);
        System.out.printf("Total de ratos: %d\n", ratos);
        System.out.printf("Total de sapos: %d\n", sapos);
        System.out.println("Percentual de coelhos: " + String.format("%.2f", (double) coelhos / total * 100) + " %");
        System.out.println("Percentual de ratos: " + String.format("%.2f", (double) ratos / total * 100) + " %");
        System.out.println("Percentual de sapos: " + String.format("%.2f", (double) sapos / total * 100) + " %");

        sc.close();
    }

}
