/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Evandro
 */
public class Palindromo {
     public static void main(String[] args) {
        try {
            boolean c = false;
            while (!c) {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Digite o palindrome inicial(fim para terminar): ");
                String s = br.readLine();
                if (s.length() < 100) {
                    if (s.equals("fim")) {
                        c = true;
                    } else {
                        System.out.println("Maior palíndrome é: " + a(s));
                    }
                } else {
                    System.out.print("A cadeia de caracteres precisa ter no máximo 100 elementos");
                }
            }
        } catch (Exception e) {

        }
    }

    public static String a(String s) {
        String d = "";
        int e = s.length() -1;
        for (int i = 0; i < e; i++) {
            for (int z = i + 2; z < e; z++) {
                if (z - i > d.length()) {
                    String p = s.substring(i, z);
                    if (b(p)) {
                        if (p.length() > d.length()) {
                            d = p;
                        }
                    }
                }
            }
        }
        return d;
    }

    public static Boolean b(String word) {
        char[] k = word.toCharArray();
        int l = k.length / 2;
        int z = k.length / 2;
        for (int i = 0; i < l; i++) {
            if (k[i] != k[z]) {
                return true;
            }
            z--;
        }
        return false;
    }
}

