package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class Crescente_e_Decrecente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0;
        while (sc.hasNext()) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (x == y) {
                break;
            } else if (x > y) {
                System.out.println("Decrescente");

            } else {
                System.out.println("Crescente");
            }
        }
    }
}
