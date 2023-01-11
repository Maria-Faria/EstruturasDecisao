/*Usando switch, escreva um programa que leia um inteiro entre 1 e 7 e imprima o dia
 * da semana correspondente a este número. Isto é, domingo se 1, segunda-feira se 2, e 
 * assim por diante.
 */

package exercicios;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número entre 1 e 7: ");
        num = sc.nextInt();
        sc.close();

        System.out.println("-------------------------");
        if(num < 1 || num > 7) {
            System.out.println("Número inválido!");
        
        }else {
            switch(num) {
                case 1:
                    System.out.println("Domingo");
                    break;

                case 2:
                    System.out.println("Segunda-feira");
                    break;

                case 3:
                    System.out.println("Terça-feira");
                    break;

                case 4:
                    System.out.println("Quarta-feira");
                    break;

                case 5:
                    System.out.println("Quinta-feira");
                    break;

                case 6:
                    System.out.println("Sexta-feira");
                    break;
                
                case 7:
                    System.out.println("Sábado");
                    break;
            }
        }
    }
}