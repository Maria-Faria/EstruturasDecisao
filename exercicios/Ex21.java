/*Escreva o menu de opções abaixo. Leia a opção do usuário e execute a opção escolhida.
 * Escreva uma mensagem de erro se a opção for inválida.
 * 
 * Escolha a opção:
 * 1 - Soma de 2 números
 * 2 - Diferença entre 2 números (maior pelo menor)
 * 3 - Produto entre 2 números
 * 4 - Divisão entre 2 números (o denominador não pode ser zero)
 * Opção
 */

package exercicios;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        int op;
        double num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Esolha uma opção:");
        System.out.println("1- Soma de 2 números");
        System.out.println("2- Diferença entre 2 números (maior pelo menor)");
        System.out.println("3- Produto entre 2 números");
        System.out.println("4- Divisão entre 2 números (o denominador não pode ser zero)");
        System.out.println("---------------------------------");
        System.out.print("Opção: ");
        op = sc.nextInt();
        System.out.println("---------------------------------");

        System.out.print("Informe o primeiro número: ");
        num1 = sc.nextDouble();

        System.out.print("Informe o segundo número: ");
        num2 = sc.nextDouble();

        sc.close();

        System.out.println("---------------------------------");
        switch(op) {
            case 1:
                System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, (num1 + num2));
                break;
            
            case 2:
                if(num2 > num1) {
                    System.out.println("Inválido! O primeiro valor deve ser maior que o segundo!");
                
                }else {
                    System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, (num1 - num2));

                }
                break;
            
            case 3:
                System.out.printf("%.2f x %.2f = %.2f\n", num1, num2, (num1 * num2));
                break;

            case 4:
                if(num2 == 0) {
                    System.out.println("Inválido! O denominador (segundo número) não pode ser zero!");

                }else {
                    System.out.printf("%.2f ÷ %.2f = %.2f\n", num1, num2, (num1 / num2));

                }
                break;
            
            default:
                System.out.println("Opção inválida!");
        }
    }    
}