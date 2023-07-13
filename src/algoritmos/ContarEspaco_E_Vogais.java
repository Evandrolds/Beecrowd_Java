package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class ContarEspaco_E_Vogais {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strSplit = str.toLowerCase().split(" ");

        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;
        for (String st : strSplit) {
            if (st.contains(" ")) {
                espacosEmBranco++;
            }

        }

        quantVogais = vogais(str.toLowerCase());
        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }

    private static int vogais(String texto) {

        int contarVogais = 0;
        char vogais[] = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (contem(vogais, c)) {
                contarVogais++;
            }
        }

        return contarVogais;
    }

    private static boolean contem(char vetor[], char comparacao) {
        boolean flag = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == comparacao) {
                flag = true;
            }
        }

        return flag;
    }

}
