package algoritmos;

/**
 *
 * @author Evandro
 */
public class Sequencia_I_J_1 {

    public static void main(String[] args) {

        int m = 60;
        for (int i = 1; i != m; i++) {
            System.out.printf("I=%d J=%d\n", i, m);
            if (m == 0) {
                break;
            }
            i = i + 2;
            m = m - 5;
        }

    }

}
