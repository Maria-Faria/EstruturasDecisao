/*Faça um programa que leia três números inteiros positivos e efetue o cálculo de uma das
 * seguintes médias de acordo com um valor numérico digitado pelo usuário:
 * 
 *      (a) Geométrica: ∛(x * y * z)
 *      (b) Ponderada: (x + 2 * y + 3 * z)/6
 *      (c) Harmônica: 1/(1/x + 1/y + 1/z)
 *      (d) Aritmética: (x + y + z)/3
 */

package exercicios;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        int op;
        double x, y, z;
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número inteiro: ");
        x = sc.nextInt();

        System.out.print("Informe o segundo número inteiro: ");
        y = sc.nextInt();        
        
        System.out.print("Informe o terceiro número inteiro: ");
        z = sc.nextInt();

        System.out.println("--------------------------------");
        System.out.println("Escolha um tipo de média para realizar o cálculo: ");
        System.out.println("1- Geométrica");
        System.out.println("2- Ponderada");
        System.out.println("3- Harmônica");
        System.out.println("4- Aritmética");
        System.out.print("\nDigite o número correspondente: ");
        op = sc.nextInt();
        System.out.println("--------------------------------");

        sc.close();

        switch(op) {
            case 1:
                System.out.printf("Média geométrica: %.2f", Math.cbrt(x * y * z));
                break;

            case 2:
                System.out.printf("Média ponderada: %.2f", (x + 2 * y + 3 * z)/6);
                break;

            case 3:
                System.out.printf("Média harmônica: %.2f", 1/(1/x + 1/y + 1/z));
                break;

            case 4:
                System.out.printf("Média aritmética: %.2f", (x + y + z)/3);
                break;

            default:
                System.out.println("Opção inválida!");
        }
    }    
}