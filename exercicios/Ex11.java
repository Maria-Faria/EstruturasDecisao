/*Escreva um programa que leia um número inteiro maior do que zero e devolva, na tela, a
 * soma de todos os seus algarismos. Por exemplo, ao número 251 corresponderá o valor
 * 8 (2 + 5 + 1). Se o número lido não for maior do que zero, o programa terminará com a
 * mensagem "Número inválido".
 */

package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        int num, soma = 0, resto, result;
        ArrayList<Integer> algarismos = new ArrayList<Integer>(); 

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número maior que zero: ");
        num = sc.nextInt();

        result = num;

        System.out.println("-----------------------------------");
        if(num > 0) {

            do {

                resto = result % 10;
                result = result/10;

                algarismos.add(resto);
                soma += resto;

                if(result < 10) {
                    algarismos.add(result);
                    soma += result; 
                    break;
                }

            }while(result >= 10);

            for(int i = algarismos.size(); i > 0; i--) {

                if(i == 1) {
                    System.out.print(algarismos.get(i - 1) + " = ");
                
                }else {
                    System.out.print(algarismos.get(i - 1) + " + ");
                }
            }

            System.out.println(soma);
        }else {
            System.out.println("Número inválido");
        }

        sc.close();
    }
}