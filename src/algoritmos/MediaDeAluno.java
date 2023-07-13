/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Evandro
 */
public class MediaDeAluno {
    public enum estatosDoAluno{
        APROVADO,
        REPROVADO,
        EM_RECUPERACAO
        
    }
    public static void main(String[] args) {
        String[]alunos  ={"João","Maria","Pedro"};
        Scanner sc = new Scanner(System.in);
        float[][] notas = new float[3][4];
        float mediaAluno,somaNotas;
        estatosDoAluno nomeAluno = null;
        for (int i = 0; i < 3; i++) {
            System.out.println("Aluno " + alunos[i] );
          
            somaNotas =0;
            mediaAluno = 0;
            for (int j = 0; j < 4; j++) {
               
                notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do Aluno "+ alunos[i]));
               somaNotas+= notas[i][j];
                
                mediaAluno =somaNotas/4;
               if(mediaAluno < 5.5){
                   nomeAluno = estatosDoAluno.REPROVADO;
               }else if(mediaAluno > 5.5 && mediaAluno < 7.5){
                   nomeAluno = estatosDoAluno.EM_RECUPERACAO;
               }else{
                   nomeAluno = estatosDoAluno.APROVADO;
               }
            }
        
        for (int j1 =0; j1 < 4;j1++) {
            System.out.println(j1+i + " - " + notas[i][j1]);
        }
        
            System.out.println("Média " + mediaAluno + " - " + nomeAluno.name());
        }
       sc.close();
    }
}
