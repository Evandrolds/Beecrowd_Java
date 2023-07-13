package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class ImparesConsecutivos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int impar =1;
         while(impar <= 6){
            if (x % 2 != 0) {
                System.out.printf("%d\n",x);
                  impar++;
            }
            
          x++;

        }
    }

}
