/*Faça um programa que mostre ao usuário um menu com 4 opções de operações
 * matemáticas (as básicas, por exemplo). O usuário escolhe uma das opções e o seu
 * programa então pede dois valores numéricos e realiza a operação, mostrando o resultado e
 * saindo.
 */

package exercicios;

import javax.swing.JOptionPane;

public class Ex18 {
    public static void main(String[] args) {
        int op;
        String menu[] = {"+", "-", "x", "÷"};
        double v1, v2;

        op = JOptionPane.showOptionDialog(null, "Selecione uma opção", "Operações matemáticas", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, menu, 0);
        v1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: "));
        v2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro valor: "));

        switch(op) {
            case 0:
                JOptionPane.showMessageDialog(null, String.format("%.2f + %.2f = %.2f", v1, v2, (v1 + v2)));
                break;

            case 1:
                JOptionPane.showMessageDialog(null, String.format("%.2f - %.2f = %.2f", v1, v2, (v1 - v2)));
                break;

            case 2:
                JOptionPane.showMessageDialog(null, String.format("%.2f x %.2f = %.2f", v1, v2, (v1 * v2)));
                break;

            case 3:
                JOptionPane.showMessageDialog(null, String.format("%.2f ÷ %.2f = %.2f", v1, v2, (v1 / v2)));
                break;
        }
    }
}
