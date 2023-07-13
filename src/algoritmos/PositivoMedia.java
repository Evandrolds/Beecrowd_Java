/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class PositivoMedia {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int count = 0;
        double media = 0;
        for (int i = 1; i <= 6; i++) {
            double x = sc.nextDouble();
            if (x > 0) {
                count++;
               media += x;
            }
          
        }

        System.out.println(count + " valores positivos");
        System.out.println(String.format("%.1f", media/count));
    }
}
