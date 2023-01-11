/*Faça um programa que receba a altura e o peso de uma pessoa. De acordo com a tabela
 * a seguir, verifique e mostre qual a classificação dessa pessoa.
 * 
 *      Altura                           Peso
 *                              Até 60      Entre 60 e 90 (inclusive)       Acima de 90
 *      Menor que 1.20             A                   D                        G
 *      De 1.20 a 1.70             B                   E                        H
 *      Maior que 1.70             C                   F                        I
 */

package exercicios;

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        double altura, peso;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua altura: ");
        altura = sc.nextDouble();

        System.out.print("Informe seu peso: ");
        peso = sc.nextDouble();

        sc.close();

        System.out.println("--------------------------");
        if(altura < 1.20) {
            if(peso <= 60) {
                System.out.println("Classificação: A");
            
            }else if(peso >= 60 && peso <= 90) {
                System.out.println("Classificação: D");
            
            }else{
                System.out.println("Classificação: G");
            }
        
        }else if(altura >= 1.20 && altura <= 1.70) {
            if(peso <= 60) {
                System.out.println("Classificação: B");
            
            }else if(peso >= 60 && peso <= 90) {
                System.out.println("Classificação: E");
            
            }else {
                System.out.println("Classificação: H");
            }
        
        }else {
            if(peso <= 60) {
                System.out.println("Classificação: C");
            
            }else if(peso >= 60 && peso <= 90) {
                System.out.println("Classificação: F");
            
            }else {
                System.out.println("Classificação: ");
            }
        }
    }    
}
