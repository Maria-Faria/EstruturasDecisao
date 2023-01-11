/*Escreva um programa que, dado o valor da venda, imprima a comissão que deverá ser
 * paga ao vendedor. Para calcular a comissão, considere a tabela abaixo:
 * 
 *  Venda mensal                                                    Comissão
 *  Maior ou igual a R$100 000.00                                   R$700.00 + 16% das vendas
 *  Menor que R$100 000.00 e maior ou igual a R$80 000.00           R$650.00 + 14% das vendas
 *  Menor que R$80 000.00 e maior ou igual a R$60 000.00            R$600.00 + 14% das vendas
 *  Menor que R$60 000.00 e maior ou igual a R$40 000.00            R$550.00 + 14% das vendas
 *  Menor que R$40 000.00 e maior ou igual a R$20 000.00            R$500.00 + 14% das vendas
 *  Menor que R$20 000.00                                           R$400.00 + 14% das vendas
 */

package exercicios;

import javax.swing.JOptionPane;

public class Ex36 {
    public static void main(String[] args) {
        double venda, comissao;

        venda = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da venda mensal"));

        if(venda >= 100000) {
            comissao = 700 + (venda * 016);

        }else if(venda < 100000 && venda >= 80000) {
            comissao = 650 + (venda * 0.14);
        
        }else if(venda < 80000 && venda >= 60000) {
            comissao = 600 + (venda * 0.14);

        }else if(venda < 60000 && venda >= 40000) {
            comissao = 550 + (venda * 0.14);
        
        }else if(venda < 40000 && venda >= 20000) {
            comissao = 500 + (venda * 0.14);

        }else {
            comissao = 400 + (venda * 0.14);
        }

        JOptionPane.showMessageDialog(null, String.format("Comissão = R$%.2f", comissao));
    }
}
