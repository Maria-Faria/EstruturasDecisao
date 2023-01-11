/*Leia uma data e determine se ela é válida. Ou seja, verifique se o mês está entre 1 e 12,
* e se o dia existe naquele mês. Note que fevereiro tem 29 dias em anos bissextos, e 28
* dias em anos não bissextos.
*/

package exercicios;

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        int dia, mes, ano;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a data abaixo: ");

        System.out.print("Dia: ");
        dia = sc.nextInt();

        System.out.print("Mês: ");
        mes = sc.nextInt();

        System.out.print("Ano: ");
        ano = sc.nextInt();

        sc.close();

        System.out.println("-------------------------------------");

        if(mes < 1 || mes > 12) {
            System.out.println("Data inválida! Mês inexistente");
        
        }else {
            if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia < 1 || dia > 31) {
                System.out.println("Data inválida! Dia inexistente");
            
            }else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia < 1 || dia > 30) {
                System.out.println("Data inválida! Dia inexistente");
 
            }else if(mes == 2) {
                if((ano % 400 == 0 || ano % 4 == 0) && (ano % 100 != 0)) {
                    if(dia > 29 || dia < 1) {
                        System.out.println("Data inválida! Dia inexistente");
                    
                    }else {
                        System.out.println("Data válida!");
 
                    }
                }else if(dia > 28 || dia < 1) {
                    System.out.println("Data inválida! Dia inexistente");
 
                }else {
                    System.out.println("Data válida!");
                }
            }else {
                System.out.println("Data válida!");
            }
        }
    }
}