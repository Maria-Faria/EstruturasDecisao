/*Escrever um programa que leia o código do produto escolhido do cardápio de uma lanchonete
 * e a quantidade. O programa deve calcular o valor a ser pago por aquele lanche.
 * Considere que a cada execução somente será calculado um pedido. O cardápio da lanchonete
 * segue o padrão abaixo:
 * 
 *          Especificação           Código          Preço
 *          Cachorro-quente         100             1.20
 *          Bauru simples           101             1.30
 *          Bauru com ovo           102             1.50
 *          Hambúrguer              103             1.20
 *          Cheeseburguer           104             1.70
 *          Suco                    105             2.20
 *          Refrigerante            106             1.00
 */

package exercicios;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        int codigo, qtd, aux = 0;
        double valor = 0;

        System.out.println("\t--------------- Cardápio ---------------");
        System.out.println("\tEspecificação       Código          Preço");
        System.out.println("\tCachorro-quente     100             1.20");
        System.out.println("\tBauru simples       101             1.30");
        System.out.println("\tBauru com ovo       102             1.50");
        System.out.println("\tHambúrguer          103             1.20");
        System.out.println("\tCheeseburguer       104             1.70");
        System.out.println("\tSuco                105             2.20");
        System.out.println("\tRefrigerante        106             1.00");
        System.out.println("\t----------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Código do produto escolhido: ");
        codigo = sc.nextInt();

        System.out.print("Quantidade comprada desse produto: ");
        qtd = sc.nextInt();

        sc.close();

        System.out.println("------------------------------------------");
        switch(codigo) {
            case 100:
                valor = 1.20 * qtd;
                break;

            case 101:
                valor = 1.30 * qtd;
                break;

            case 102:
                valor = 1.50 * qtd;
                break;

            case 103:
                valor = 1.20 * qtd;
                break;

            case 104:
                valor = 1.70 * qtd;
                break;

            case 105:
                valor = 2.20 * qtd;
                break;

            case 106:
                valor = 1.00 * qtd;
                break;

            default:
                System.out.println("Código inválido!");
                aux = -1;
        }

        if(aux != -1) {
            System.out.printf("Valor a ser pago pelo lanche: R$%.2f", valor);
        }
    }
}
