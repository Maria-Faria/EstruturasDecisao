/*Leia a nota e o número de faltas de um aluno, e escreva seu conceito. De acordo com a
 * tabela abaixo, quando o aluno tem mais de 20 faltas ocorre uma redução de conceito.
 * 
 *      NOTA              CONCEITO (ATÉ 20 FALTAS)          CONCEITO (MAIS DE 20 FALTAS)
 *      9.0 até 10.0                A                                   B
 *      7.5 até 8.9                 B                                   C
 *      5.0 té 7.4                  C                                   D
 *      4.0 até 4.9                 D                                   E
 *      0.0 até 3.9                 E                                   E
 */

package exercicios;

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        double nota;
        int falta;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nota do aluno: ");
        nota = sc.nextDouble();

        System.out.print("Número de faltas do aluno: ");
        falta = sc.nextInt();

        sc.close();

        System.out.println("----------------------------------");
    
        if(nota >= 9 && nota <= 10) {
            if(falta <= 20) {
                System.out.println("Conceito: A");
            
            }else{
                System.out.println("Conceito: B");
            }
        
        }else if(nota >= 7.5 && nota <= 8.9) {
            if(falta <= 20) {
                System.out.println("Conceito: B");
            
            }else {
                System.out.println("Conceito: C");
            }
        
        }else if(nota >= 5 && nota <= 7.4) {
            if(falta <= 20) {
                System.out.println("Conceito: C");
            
            }else {
                System.out.println("Conceito: D");
            }
        
        }else if(nota >= 4 && nota <= 4.9) {
            if(falta <= 20) {
                System.out.println("Conceito: D");
            
            }else {
                System.out.println("Conceito: E");
            }
        
        }else if(nota >= 0 && nota <= 3.9) {
            if(falta <= 20) {
                System.out.println("Conceito: E");
            
            }else {
                System.out.println("Conceito: E");
            }
        
        }else {
            System.out.println("Nota inválida!");
        }
    }
}
