package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class Positivos_E_Media {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int count =0;
     double total =0.0;
     for(int i =1; i <= 5; i++){
         double valor = sc.nextDouble();
         if(valor%2== 0){
             count++;
             
         }
     }
     System.out.printf("%d valores positivos\n", count);
     System.out.printf("%.1f\n",total/count);
    }
    
}
