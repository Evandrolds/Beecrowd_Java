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
public class CalcularFibonacci {

    public static void main(String[] Args) {

        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int proximo =1, anterior = 0, soma =0;

        for (int i = 0; i < N; i++) {

            if (anterior == N) {
                System.out.print(anterior);
            } //TODO: Implemente a condição ideal para que possamos obter os valores solicitados:
            else {
                System.out.print(anterior + " ");
            }
            soma = anterior + proximo;
            anterior = proximo; 
            proximo = soma;
        }
        System.out.println("\n");
      
       
    }

}
