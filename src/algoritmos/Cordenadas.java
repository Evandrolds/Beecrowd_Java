package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class Cordenadas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        x = sc.nextDouble();
        y = sc.nextDouble();

        while (x != 0 && y != 0) {
            //TODO: Crie as condições para satisfazer o problema;

            if (x > 0 || y > 0) {

                if (x > 0 && y > 0) {
                    System.out.println("primeiro");
                } else if (x > 0 && y < 0) {
                    System.out.println("quarto");
                } else if (y > 0 && x < 0) {

                    System.out.println("segundo");
                } else {
                    System.out.println("terceiro");
                }

            }

        }
    }
}
