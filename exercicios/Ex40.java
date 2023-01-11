/*O custo ao consumidor de um carro novo é a soma do custo de fábrica, da comissão
 * do distribuidor, e dos impostos. A comissão e os impostos são calculados sobre o custo
 * de fábrica, de acordo com a tabela abaixo. Leia o custo de fábrica e escreva o custo ao
 * consumidor.
 * 
 *      CUSTO DE FÁBRICA                    % DO DISTRIBUIDOR           % DOS IMPOSTOS
 *      até R$12.000,00                             5                       isento
 *      entre R$12.000,00 e 25.000,00               10                        15
 *      acima de R$25.000,00                        15                        20
 */

package exercicios;

import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        double fabrica, consumidor;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o custo de fábrica do carro: ");
        fabrica = sc.nextDouble();

        sc.close();

        System.out.println("-------------------------------------------");

        if(fabrica <= 12000) {
            consumidor = fabrica + (fabrica * 0.05);

        }else if(fabrica > 12000 && fabrica <= 25000) {
            consumidor = fabrica + (fabrica * 0.10) + (fabrica * 0.15);

        }else {
            consumidor = fabrica + (fabrica * 0.15) + (fabrica * 0.20);
        }

        System.out.printf("Custo ao consumidor: R$%.2f", consumidor);
    }    
}
