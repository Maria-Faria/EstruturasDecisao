/*Faça um programa que calcule e mostre a área de um trapézio. Sabe-se que:
 * A = ((basemaior + basemenor) * altura)/2
 * Lembre-se a base maior e a base menor devem ser números maiores que zero.
 */

package exercicios;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        double basemaior, basemenor, altura, area;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a medida da base maior do trapézio: ");
        basemaior = sc.nextDouble();

        if(basemaior > 0) {
            System.out.print("Informe a medida da base menor do trapézio: ");
            basemenor = sc.nextDouble();  

            if(basemenor > 0) {
                System.out.print("Informe a medida da altura do trapézio: ");
                altura = sc.nextDouble();

                if(altura >= 0) {
                    area = ((basemaior + basemenor) * altura)/2;

                    System.out.println("----------------------------------");
                    System.out.println("Área do trapézio = " + area);
               
                }else {
                    System.out.println("Valor inválido!");
                }

            }else {
                System.out.println("Valor inválido!");
            }
        
        }else {
            System.out.println("Valor inválido!");
        }

        sc.close();
    }    
}