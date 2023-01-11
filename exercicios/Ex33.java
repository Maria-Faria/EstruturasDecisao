/*Um produto vai sofrer aumento de acordo com a tabela abaixo. Leia o preço antigo,
 * calcule e escreva o preço novo, e escreva uma mensagem em função do preço novo (de
 * acordo com a segunda tabela).
 * 
 *          PREÇO ANTIGO                PERCENTUAL DE AUMENTO
 *          até R$50                            5%
 *          entre R$50 e R$100                  10%
 *          acima de R$100                      15%
 * 
 *          PREÇO NOVO                          MENSAGEM
 *          até R$80                            Barato
 *          entre R$80 e R$120 (inclusive)      Normal
 *          entre R$120 e R$200 (inclusive)     Caro
 *          acima de R$200                      Muito caro
 */

package exercicios;

import javax.swing.JOptionPane;

public class Ex33 {
    public static void main(String[] args) {
        double precoAntigo, precoNovo;

        precoAntigo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preço do produto"));

        if(precoAntigo <= 50) {
            precoNovo = precoAntigo + (precoAntigo * 0.05);
        
        }else if(precoAntigo > 100) {
            precoNovo = precoAntigo + (precoAntigo * 0.15);
        
        }else {
            precoNovo = precoAntigo + (precoAntigo * 0.10);
        }

        if(precoNovo <= 80) {
            JOptionPane.showMessageDialog(null, String.format("Preço novo = R$%.2f\nBarato", precoNovo));
        
        }else if(precoNovo > 80 && precoNovo <= 120) {
            JOptionPane.showMessageDialog(null, String.format("Preço novo = R$%.2f\nNormal", precoNovo));

        }else if(precoNovo > 200) {
            JOptionPane.showMessageDialog(null, String.format("Preço novo = R$%.2f\nMuito caro", precoNovo));

        }else {
            JOptionPane.showMessageDialog(null, String.format("Preço novo = R$%.2f\nCaro", precoNovo));
        }
    }
}
