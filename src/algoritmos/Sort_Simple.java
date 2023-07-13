package algoritmos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class Sort_Simple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        List<Integer> numeros = new ArrayList<>();
        numeros.addAll(Arrays.asList(a,b,c));

        Collections.sort(numeros);
        numeros.forEach(x -> {
            System.out.println(x);
        });
        System.out.println("\n" + a);
        System.out.println(b);
        System.out.println(c);
    }
}
