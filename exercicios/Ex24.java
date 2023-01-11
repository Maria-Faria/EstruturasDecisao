/*Uma empresa vende o mesmo produto para quatro diferentes estados. Cada estado
 * possui uma taxa diferente de imposto sobre o produto (MG 7%; SP 12%; RJ 15%; MS 8%).
 * Faça um programa em que o usuário entre com o valor e o estado destino do
 * produto e o programa retorne o preço final do produto acrescido do imposto do estado
 * em que ele será vendido. Se o estado digitado não for válido, mostrar uma mensagem
 * de erro.
 */

package exercicios;

import javax.swing.JOptionPane;

public class Ex24 {
    public static void main(String[] args) {
        double valor, valorFinal = 0, aux = 0;
        String estado;

        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do produto"));
        estado = JOptionPane.showInputDialog(null, "Digite a sigla do estado (MG, SP, RJ o MS)");

        switch(estado) {
            case "MG":
                valorFinal = valor + (valor * 0.07);
                break;
            
            case "SP":
                valorFinal = valor + (valor * 0.12);
                break;

            case "RJ":
                valorFinal = valor + (valor * 0.15);
                break;

            case "MS":
                valorFinal = valor + (valor * 0.08);
                break;
            
            default:
                JOptionPane.showMessageDialog(null, "Erro! Estado inválido");
                aux = 1;
        }

        if(aux == 0) {
            JOptionPane.showMessageDialog(null, String.format("Valor final do produto = R$%.2f", valorFinal));
        }
    }
}
