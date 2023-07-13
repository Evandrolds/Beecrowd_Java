package algoritmos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Evandro
 */
public class NumerosRepetidos {

    public static void main(String[] args) {
        int[] vet = {1, 6, 4, 9, 2, 8, 5, 3, 1, 7, 1, 8, 4};
        int count = 0;
        List<Integer> list = new ArrayList<>();
        int num = 0;
        for (int i = 0; i < vet.length; i++) {

            for (int j = 0; j < vet.length; j++) {
                if (vet[i] < vet[j]) {
                    num = vet[j];
                    vet[j] = vet[i];
                    vet[i] = num;

                }

            }

        }
        for (int i = 0; i < vet.length; i++) {
            if (list.contains(vet[i])) {
                vet[i]= 0;
                count++;
            }
            list.add(vet[i]);
            if(list.removeIf(x -> x==0)){
                
            }
        }
        for (Integer lis : list) {

            System.out.println("Vetor: " + lis);
        }
        System.out.println("==========");

        System.out.println("Contar " + count);
    }
}
