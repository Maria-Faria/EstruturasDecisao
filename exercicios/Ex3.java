/*Leia um número real. Se o número for positivo imprima a raiz quadrada. Do contrário
 * imprima o número ao quadrado.
 */

package exercicios;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        double num, result;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        num = sc.nextDouble();
        
        sc.close();

        result = (num >= 0) ? Math.sqrt(num) : Math.pow(num, 2);

        System.out.println("--------------------------");
        System.out.println(result);
    }    
}