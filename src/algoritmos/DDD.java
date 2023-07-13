package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class DDD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ddd = Integer.parseInt(sc.next());
        
        switch (ddd) {
            case 61:
                System.out.print("Brasilia\n");
                break;
            case 71:
                 System.out.print("Salvador\n");
                break;
                case 11:
                 System.out.print("Sao Paulo\n");
                break;
                case 21:
                 System.out.print("Rio de Janeiro\n");
                break;
                case 32:
                 System.out.print("Juiz de Fora\n");
                break;
                case 19:
                 System.out.print("Campinas\n");
                break;
                case 27:
                 System.out.print("Vitoria\n");
                break;
                case 31:
                 System.out.print("Belo Horizonte\n");
                break;
            default:
                System.out.println("DDD nao cadastrado");;
        }
    }
}
