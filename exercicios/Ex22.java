/*Leia a idade e o tempo de serviço de um trabalhador e escreva se ele pode ou não se
 * aposentar. As condições para aposentadoria são:
 * - Ter pelo menos 65 anos
 * - Ou ter trabalhado pelo menos 30 anos
 * - Ou ter pelo menos 60 anos e trabalhado pelo menos 25 anos
 */

package exercicios;

import javax.swing.JOptionPane;

public class Ex22 {
    public static void main(String[] args) {
        int idade, servico;

        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade"));
        servico = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite seu tempo de serviço (em anos)"));

        if((idade >= 65) || (servico >= 30 || (idade >= 60 && servico >= 25))) {
            JOptionPane.showMessageDialog(null, "Você pode se aposentar!");
        
        }else{
            JOptionPane.showMessageDialog(null, "Você ainda não pode se aposentar...");
        }
    }
}