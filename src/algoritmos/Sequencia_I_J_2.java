package algoritmos;

/**
 *
 * @author Evandro
 */
public class Sequencia_I_J_2 {

    public static void main(String[] args) {
        int count = 1;
        int m = 9;
        int jota = 7;
        for (int i = 1; i <= m; i++) {
            while (count <= 3) {
                if (i % 2 == 1) {
                    System.out.printf("I=%d j=%d\n", i,jota);
                
                }
                
                count++;
               jota--;
            }
            jota =7;
            count = 1;
        }

    }

}
