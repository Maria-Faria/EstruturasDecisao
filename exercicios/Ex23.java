/*Determine se um determinado ano lido é bissexto. Sendo que um ano é bissexto se
 * for divisível por 400 ou se for divisível por 4 e não for divisível por 100. Por exemplo:
 * 1988, 1992, 1996
 */

package exercicios;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        int ano;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o ano: ");
        ano = sc.nextInt();

        sc.close();

        System.out.println("-----------------------------------");
        if((ano % 400 == 0 || ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println(ano + " é um ano bissexto");
        
        }else {
            System.out.println(ano + " não é um ano bissexto");
        }
    }
}