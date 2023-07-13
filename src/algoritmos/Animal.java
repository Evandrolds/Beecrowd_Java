package algoritmos;


import java.util.Scanner;


public class Animal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     String palavra1 = sc.nextLine();
     
    
      if(palavra1.equalsIgnoreCase("vertebrado")){
          String palavra2 =  sc.nextLine();
          if(palavra2.equalsIgnoreCase("ave")){
              String palavra3 = sc.nextLine();
              if(palavra3.equalsIgnoreCase("carnivoro")){
                  System.out.print("aguia\n");
              }else{
                   System.out.print("pomba\n");
              }
          }else{
              String mamifero = sc.nextLine();
              if(mamifero.equalsIgnoreCase("onivoro")){
                   System.out.print("homem\n");
              }else{
                   System.out.print("vaca\n");
              }
          }
      }else{
          String invert = sc.nextLine();
          if(invert.equalsIgnoreCase("inseto")){
              String inseto = sc.nextLine();
              if(inseto.equalsIgnoreCase("hematofago")){
                  System.out.print("pulga\n"); 
              }else{
                   System.out.print("lagarta\n");
              }
          }else{
              String anelideo = sc.nextLine();
              if(anelideo.equalsIgnoreCase("hematofago")){
                   System.out.print("sanguessuga\n");
              }else{
                   System.out.print("minhoca\n");
              }
          }
      }
    }
}
