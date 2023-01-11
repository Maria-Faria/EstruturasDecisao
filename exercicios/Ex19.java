/*Faça um programa para verificar se um determinado número inteiro é divisível por 3 ou
 * 5, mas não simultaneamente pelos dois.
*/

package exercicios;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        num = sc.nextInt();

        sc.close();

        System.out.println("--------------------------------------------------------");
        if(num % 3 == 0 && num % 5 == 0) {
            System.out.println("Número inválido");
        
        }else if (num % 3 == 0 || num % 5 == 0) {
            System.out.println("Número válido! Divisível por 3 ou por 5, mas não simultaneamente pelos dois.");
        }
    }
}
