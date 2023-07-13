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
public class Sequencia_de_Numeros_e_Soma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M, N;
        while (((M = sc.nextInt()) > 0 && (N = sc.nextInt()) > 0)) {

            int soma = 0;
            if (M > N) {
                for (N = N; N <= M; N++) {
                    soma += N;
                    System.out.printf("%d ", N);

                }
                System.out.printf("Sum=%d\n", soma);
            } else {
                for (M = M; M <= N; M++) {
                    soma += M;
                    System.out.printf("%d ", M);

                }
                System.out.printf("Sum=%d\n", soma);
            }

        }
    }
}
