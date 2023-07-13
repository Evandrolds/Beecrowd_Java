package algoritmos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class Contagem_N_Repetidos {

    public static void main(String[] args) {
        try ( Scanner sc = new Scanner(System.in)) {
            var valores = sc.nextInt();
            
            Map<Integer,Integer> numeros = new HashMap<>();
            
            for (int i = 0; i < valores; i++) {
                var numero = sc.nextInt();
                
                if(numeros.containsKey(numero)){
                    int quantidade = numeros.get(numero);
                    numeros.put(numero, ++quantidade);
                }else{
                    numeros.put(numero, 1);
                }
            }
            numeros.entrySet().stream().sorted(Map.Entry.comparingByKey())
            .forEach(x->System.out.println( " O numero: " + x.getKey()+ " aparece " + x.getValue() + " Vez (es)"));
        }
    }
}
