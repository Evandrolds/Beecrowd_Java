package algoritmos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Evandro
 */
public class ContarNumerosRepetidos {

    public static void main(String[] args) {
      
           int[]n = {1,5,3,6,9,5,7,1,5,8,9,1,3}; 
            Map<Integer, Integer> numeros = new TreeMap<>();
            for (int i = 0; i < n.length; i++) {
                
                if (numeros.containsKey(n[i])) {
                    numeros.replace(n[i], numeros.get(n[i]) + 1);
                } else {
                    numeros.put(n[i], 1);
                }
            }
            for (Map.Entry<Integer, Integer> entryser : numeros.entrySet()) {
               
                System.out.println("O " + entryser.getKey() + " aparece " + entryser.getValue() + " veze(s)");
            }
        
    }

}
