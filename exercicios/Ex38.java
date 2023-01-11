/*Leia uma data de nascimento de uma pessoa fornecida através de três números inteiros:
 * Dia, Mês e Ano. Teste a validade desta data para saber se esta é uma data válida. Teste
 * se o dia fornecido é um dia válido: dia > 0, dia <= 28 para o mês de fevereiro (29 se o
 * ano for bissexto), dia <= 30 em abril, junho, setembro e novembro, dia <= 31 nos outros
 * meses. Teste a validade do mês: mês > 0 e mês < 13. Teste a validade do ano: ano <= ano 
 * atual (use uma constante definida com o valor igual a 2008). Imprimir: "data válida"
 * ou "data inválida" no final da execução do programa.
*/

package exercicios;

import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        int dia, mes, ano, anoAtual = 2008;

        Scanner sc = new Scanner(System.in);

        System.out.println("\tInsira sua data de nascimento abaixo: ");
        
        System.out.print("\nDia: ");
        dia = sc.nextInt();

        System.out.print("Mês: ");
        mes = sc.nextInt();

        System.out.print("Ano: ");
        ano = sc.nextInt();

        sc.close();

        System.out.println("---------------------------------");
        if(mes >= 1 && mes <= 12) {
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if(dia > 0 && dia <= 31 && ano <= anoAtual) {
                    System.out.println("Data válida!");
                
                }else {
                    System.out.println("Data inválida!");
                }
            }else if(mes == 2) {
                if((ano % 400 == 0 || ano % 4 == 0) && (ano % 100 != 0)) {
                    if(dia > 0 && dia <= 29 && ano <= anoAtual) {
                        System.out.println("Data válida!");
                    
                    }else {
                        System.out.println("Data inválida!");
                    }
                }else {
                    if(dia > 0 && dia <= 28 && ano <= anoAtual) {
                        System.out.println("Data válida!");
                    
                    }else {
                        System.out.println("Data inválida!");
                    }
                }
            }else {
                if(dia > 0 && dia <= 30 && ano <= anoAtual) {
                    System.out.println("Data válida!");
                
                }else {
                    System.out.println("Data inválida!");
                }
            }
        
        }else{
            System.out.println("Data inválida!");
        }
    }
}
