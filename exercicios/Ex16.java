/*Usando switch, escreva um programa que leia um inteiro entre 1 e 12 e imprima o mês
 * correspondete a este número. Isto é, janeiro se 1, fevereiro se 2, e assim por diante.
 */

package exercicios;

import javax.swing.JOptionPane;

public class Ex16 {
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro entre 1 e 12"));

        switch(num) {
            case 1:
                JOptionPane.showMessageDialog(null, "Mês correspondente: Janeiro");
                break;
            
            case 2:
                JOptionPane.showMessageDialog(null, "Mês correspondente: Fevereiro");
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Mês correspondente: Março");
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "Mês correspondente: Abril");
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "Mês correspondente: Maio");
                break;

            case 6:
                JOptionPane.showMessageDialog(null, "Mês correspondente: Junho");
                break;

            case 7:
                JOptionPane.showMessageDialog(null, "Mês correspondente: Julho");
                break;

            case 8:
                JOptionPane.showMessageDialog(null, "Mês correspondente: Agosto");
                break;

            case 9:
                JOptionPane.showMessageDialog(null, "Mês correspondente: Setembro");
                break;

            case 10:
                JOptionPane.showMessageDialog(null, "Mês correspondente: Outubro");
                break;

            case 11:
                JOptionPane.showMessageDialog(null, "Mês correspondente: Novembro");
                break;

            case 12:
                JOptionPane.showMessageDialog(null, "Mês correspondente: Dezembro");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Número inválido!");
                break;
        }
    }
}
