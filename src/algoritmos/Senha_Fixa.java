package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class Senha_Fixa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha =2002,x =0;
        while (sc.hasNext()) {
            x = sc.nextInt();
           
           if(x == senha){
               System.out.println("Acesso Permitido");
               break;
           }else{
               System.out.println("Senha Invalida");
           }
        }
    }
}
