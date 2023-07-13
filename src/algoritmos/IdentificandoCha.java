package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class IdentificandoCha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipo = sc.nextInt();
        int count = 0;
        int[] competidores = new int[5];
        for (int i = 0; i < competidores.length; i++) {
            competidores[i] = sc.nextInt();
       
        }
        for (int i = 0; i < competidores.length; i++) {
            if(competidores[i]== tipo){
                count++;
            }
        }
        System.out.print(count+"\n");
    }
}
