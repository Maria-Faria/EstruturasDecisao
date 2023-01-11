/*Faça um programa que receba um número inteiro e verifique se este número é par ou 
ímpar.*/

package exercicios;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        num = sc.nextInt();

        sc.close();

        if(num % 2 == 0) {
            System.out.println(num + " é par!");
        
        }else{
            System.out.println(num + " é ímpar!");
        }

    }    
}