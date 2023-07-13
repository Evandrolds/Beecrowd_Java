package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class Par_Impar_Positivo_Negativo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] valor = new int[n];
        while (count < n) {

            valor[count] = sc.nextInt();
            count++;
        }
        for (int i = 0; i < valor.length; i++) {
            if (valor[i] != 0) {
                if (valor[i] > 0) {
                    if (valor[i] % 2 == 0) {
                        System.out.println("EVEN POSITIVE");
                    } else {
                        System.out.println("ODD POSITIVE");
                    }
                } else {
                    if (valor[i] % 2 == 0) {
                        System.out.println("EVEN NEGATIVE");
                    } else {
                        System.out.println("ODD NEGATIVE");
                    }
                }
            } else {
                System.out.println("NULL");
            }
        }
    }

}
