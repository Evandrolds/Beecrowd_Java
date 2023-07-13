
package algoritmos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class Lanche {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int codigo = Integer.parseInt(sc.next());
        int quantidade = Integer.parseInt(sc.next());
        double valor = 0.0;
        switch (codigo) {
            case 1:
                valor = quantidade* 4.0;
                break;
            case 2:
                valor = quantidade* 4.50;
                break;
            case 3:
                valor = quantidade* 5.0;
                break;
            case 4:
                valor = quantidade* 2.0;
                break;
            case 5:
                valor = quantidade* 1.50;
                break;
            default:
                System.out.println("Codigo invalido!");;
        }
        System.out.println("Total: R$ " +String.format("%.2f", valor));
    }
}
