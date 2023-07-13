package algoritmos;

/**
 *
 * @author Evandro
 */
public class Sequencia_I_J_3 {

    public static void main(String[] args) {

        int count = 1;
        int j = 7;
        for (int i = 1; i <= 9; i++) {

            if (i % 2 == 1) {
                while (count <= 3) {

                    System.out.printf("I=%d J=%d\n", i, j);
                    count++;
                    j--;

                }
                count = 1;
                j = 8 + i;
            }

        }
    }

}
