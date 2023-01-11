/*Faça um programa que receba dois números e mostre o maior. Se por acaso, os dois
 * números forem iguais, imprima a mensagem "Números iguais".
 */

package exercicios;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        double num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        num1 = sc.nextDouble();

        System.out.print("Informe outro número: ");
        num2 = sc.nextDouble();

        sc.close();

        System.out.println("--------------------------------");
        if(num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        
        }else if(num2 >  num1) {
            System.out.println(num2 + " é maior que " + num1);
        
        }else {
            System.out.println("Números iguais!");
        }
    }
}