/*Leia o salário de um trabalhador e o valor da prestação de um empréstimo. Se a
 * prestação for maior que 20% do salário imprima: "Empréstimo não concedido", caso
 * contrário imprima: "Empréstimo concedido".
 */

package exercicios;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        double sal, emp;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do salário: ");
        sal = sc.nextDouble();

        System.out.print("Informe o valor da prestação do empréstimo: ");
        emp = sc.nextDouble();

        sc.close();

        System.out.println("-------------------------------------------");
        if(emp > (0.20 * sal)) {
            System.out.println("Empréstimo não concedido");
        
        }else {
            System.out.println("Empréstimo concedido");
        }
    }
}