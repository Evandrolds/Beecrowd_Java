package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class QuintandaDoSeuZe {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();
        double totalMorangos;
        double totalMacas;
        double precoTotal = 0.0;
        if (morangos <= 5 && macas <= 5) {
            totalMorangos = morangos * 2.50;
            totalMacas = macas * 1.80;
            precoTotal = totalMacas + totalMorangos;
        } else {
            totalMorangos = morangos * 2.20;
            totalMacas = macas * 1.50;
            precoTotal = totalMacas + totalMorangos;
        }
        int total = morangos + macas;
        if (total > 8 || (totalMorangos + totalMacas) > 25.0) {
            precoTotal = (totalMorangos + totalMacas);
            precoTotal -= (precoTotal * 0.1);
        }
        System.out.println("Preco total: " + precoTotal);
    }
}
