/*Faça um programa que receba dois números e mostre qual deles é o maior*/

package exercicios;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        double num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        num1 = sc.nextDouble();

        System.out.print("Informe o segundo número: ");
        num2 = sc.nextDouble();

        sc.close();

        System.out.println("-------------------------------------");
        if(num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        
        }else if (num2 > num1) {
            System.out.println(num2 + " é maior que " + num1);
        
        }else {
            System.out.println("Os números são iguais!");
        }
    }
}