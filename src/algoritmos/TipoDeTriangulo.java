package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class TipoDeTriangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x;
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        if (a < b) {
            x = a;
            a = b;
            b = x;
        }
        if (b < c) {
            x = b;
            b = c;
            c = x;
        }
        if (a < b) {
            x = a;
            a = b;
            b = x;
        }

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if (a * a == b * b + c * c) {
            System.out.println("TRIANGULO RETANGULO");
        } else if (a * a > b * b + c * c) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if (a * a < b * b + c * c) {
            System.out.println("TRIANGULO ACUTANGULO");
        }if (a == b && b == c) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if (a == b || b == c || a ==c) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
