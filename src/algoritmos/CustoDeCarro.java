package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class CustoDeCarro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int custoFabrica = scan.nextInt();
	    int porcentagemDistribuidor = scan.nextInt();
	    int PercentualImpostos = scan.nextInt();

        // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:
 
        int  distribuidor = 0;
                
        distribuidor = custoFabrica+(custoFabrica*porcentagemDistribuidor/100);
        
      
      
        System.out.println(distribuidor+ (custoFabrica* PercentualImpostos/100));
    }
}
