package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class Dividir_X_Por_Y {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n >= 1) {
            double divisao = 0;
            double x = sc.nextInt();
            double y = sc.nextInt();
            
            divisao = x / y;
            if (divisao == Double.NEGATIVE_INFINITY || divisao == Double.POSITIVE_INFINITY) {
                System.out.println("divisao impossivel");
            }else{
                System.out.println(divisao);
            }
            n--;
        }
    }
}
