package algoritmos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class AlmentoDeSalario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double salario = sc.nextDouble();
        double ganho = 0.0;
        double reajuste = 0.0;
        int percentual = 0;
        if (salario >= 0 && salario <= 400.0) {
            percentual = 15;
            ganho = salario + (salario * percentual/100);
            reajuste = ganho - salario;

        } else if (salario > 400.0 && salario <= 800.0) {
            percentual = 12;
            ganho = salario + (salario * percentual/100);
            reajuste = ganho - salario;
        } else if (salario > 800.0 && salario <= 1200.0) {
            percentual = 10;
            ganho = salario + (salario * percentual/100);
            reajuste = ganho - salario;
        } else if (salario > 1200.0 && salario <= 2000.0) {
            percentual = 7;
            ganho = salario + (salario * percentual/100);
            reajuste = ganho - salario;
        } else {
            percentual = 4;
            ganho = salario + (salario * percentual/100);
            reajuste = ganho - salario;
        }
        System.out.println("Novo salario: " +String.format("%.2f",ganho));
        System.out.println("Reajuste ganho: " +String.format("%.2f",reajuste));
        System.out.println("Em percentual: " +percentual + " %");
    }
}
