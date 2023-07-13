package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class MediasPoderadas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double media = 0, n1, n2, n3;
        int count = 0;
        int peso = 2+3+5;
        double []notas = new double[n];
        while (count < n) {
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            n3 = sc.nextDouble();
            media = (n1*2/peso) + (n2*3/peso)+ (n3*5/peso);
            notas[count] = media;
            count++;
        }
        for (double nota : notas) {
            
            System.out.printf("%.1f\n", nota);
        }
    }
}
