package algoritmos;

/**
 *
 * @author Evandro
 */
public class OrdenanadoVetorCrescente {

    public static void main(String[] args) {
        int[] vet = {2, 5, 7, 4, 9, 3, 1, 6};
        int num;
        for (int i = 0; i < vet.length; i++) {

            for (int j = 0; j < vet.length; j++) {
                if (vet[i] < vet[j]) {
                    num = vet[j];
                    vet[j] = vet[i];
                    vet[i] = num;

                }
               

            }

        }
        for (int i : vet) {
             System.out.println("Vet " + i);
        }
    }
}
