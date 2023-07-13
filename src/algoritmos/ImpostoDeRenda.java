package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class ImpostoDeRenda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double x =0.0;
        if(salario <= 2000.0) {
            System.out.printf( "Isento\n");
    }
    else if(salario <= 3000.0 ){
        x = (salario - 2000.0)*0.08;
        System.out.printf( "R$ %.2f\n", x);
    }
    else if( salario <= 4500.0){
        x = (salario - 3000.0)*0.18 + (1000*0.08);
       System.out.printf( "R$ %.2f\n", x);
    }
    else {
        x = (salario - 4500)*0.28 + (1500*0.18) + (1000*0.08);
        System.out.printf( "R$ %.2f\n", x);
    }

    }

}
