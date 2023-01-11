/*Faça um programa que receba a altura e o sexo de uma pessoa e calcule e mostre seu
 * peso ideal, utilizando as seguintes fórmulas (onde h corresponde à altura):
 * - Homens : (72.7 * h) - 58
 * - Mulheres: (62.1 * h) - 44.7
 */

package exercicios;

import javax.swing.JOptionPane;

public class Ex10 {
    public static void main(String[] args) {
        double alt, peso = 0;
        String sexo[] = {"Homem", "Mulher"};
        int op;

        alt = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua altura"));

        op = JOptionPane.showOptionDialog(null, "Selecione seu sexo", null, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, sexo, 0);
    
        switch(op) {
            case 0:
                peso = (72.7 * alt) - 58;
                break;

            case 1:
                peso = (62.1 * alt) - 44.7;
                break;
        }

        JOptionPane.showMessageDialog(null, "Peso ideal = " + peso);
    }
}