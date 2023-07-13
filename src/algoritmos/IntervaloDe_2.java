
package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class IntervaloDe_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dentroItervalo =0;
        int foraItervalo =0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if(x >=10 && x <=20){
                dentroItervalo++;
            }else{
                foraItervalo++;
            }
        }
        System.out.printf("%d in\n",dentroItervalo);
        System.out.printf("%d out\n",foraItervalo);
    }
}
