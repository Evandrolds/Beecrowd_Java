
package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int count =0;
      for(int i=1; i <=6; i++){
          double n = sc.nextInt();
          if(n >0){
              count++;
              
          }
      }
      System.out.printf("%d valores positivos\n ", count);
    }
    
}
