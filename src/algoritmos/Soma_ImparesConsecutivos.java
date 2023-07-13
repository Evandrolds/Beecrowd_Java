package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class Soma_ImparesConsecutivos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int soma = 0;
        if (x != y) {
            if (x < y) {
                for (int i = x + 1; i < y; i++) {
                    if (i % 2 != 0) {
                        soma += i;
                    }
                }
            } else {
                for (int i = y + 1; i < x; i++) {
                    if (i % 2 != 0) {
                        soma += i;
                    }
                }
            }
        }
        System.out.printf("%d\n", soma);
    }

}
