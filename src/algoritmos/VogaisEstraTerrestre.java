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
public class VogaisEstraTerrestre {

    public static void main(String[] args) {
        try ( Scanner sc = new Scanner(System.in)) {
            String vogais = sc.nextLine();
            String palavra = sc.nextLine();
            String[] vet = palavra.split("");
            int count = 0;
            for (int i = 0; i < vet.length; i++) {
                if (vogais.contains(vet[i])) {
                    count++;
                }
            }
            System.out.println(count);

        }
    }
}
