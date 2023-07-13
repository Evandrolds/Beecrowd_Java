package algoritmos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class Triangulo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {

            System.out.println("Perimetro = " + String.format("%.1f", a + b + c));
        } else {

            System.out.println("Area = " + String.format("%.1f", ((a + b) * c) / 2));
        }

    }
}
