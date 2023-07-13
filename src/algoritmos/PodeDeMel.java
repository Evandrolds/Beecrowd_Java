package algoritmos;

import java.util.Locale;
import java.util.Scanner;

public class PodeDeMel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try ( Scanner sc = new Scanner(System.in)) {
            double altura, area, D, V, R, pi = 3.14;
            
            while (sc.hasNext()) {
                V = sc.nextDouble();
                D = sc.nextDouble();
                R = D / 2;
                area = pi * R * R;
                altura = V / area;
                System.out.println("Altura = " + String.format("%.2f", altura));
                System.out.println("Area = " + String.format("%.2f", area));
            }

        }

    }

}
