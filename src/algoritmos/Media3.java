package algoritmos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class Media3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float n1, n2, n3, n4,media,exame;
        String []notas = sc.nextLine().split(" ");
        n1 = Float.parseFloat(notas[0]);
        n2 = Float.parseFloat(notas[1]);
        n3 = Float.parseFloat(notas[2]);
        n4 = Float.parseFloat(notas[3]);
        
        media = ((n1 *2 + n2*3 + n3*4 + n4*1) / 10);
        System.out.println("Media: " + String.format("%.1f", media));
        if (media >= 7.0) {

            System.out.println("Aluno aprovado. ");

        } else if (media < 5.0) {

            System.out.println("Aluno reprovado. ");
        } else {
           
            System.out.println("Aluno em exame. ");
            exame = Float.parseFloat(sc.next());
            media = (media + exame) / 2;
            System.out.println("Nota do exame: " + exame);
            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {

                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + String.format("%.1f", media));
        }
    }

}
