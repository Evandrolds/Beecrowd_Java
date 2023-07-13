package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class MaiorPositivo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor = 0;
        int count = 0;
        for (int i = 1; i <= 10; i++) {

            int n = sc.nextInt();
            if (valor <= n) {
                valor = n;
                count = i;
            }

        }
        System.out.printf("%d\n%d\n", valor, count);

    }

}
