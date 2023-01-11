/*Faça um programa que leia 2 notas de um aluno, verifique se as notas são válidas e
 * exiba na tela a média destas notas. Uma nota válida deve ser, obrigatoriamente, um
 * valor entre 0.0 e 10.0, onde caso a nota não possua um valor válido, este fato deve ser
 * informado ao usuário e o programa termina.
 */

package exercicios;

import javax.swing.JOptionPane;

public class Ex8 {
    public static void main(String[] args) {
        double n1, n2;

        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota"));

        if(n1 >= 0 && n1 <= 10) {
            n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota"));

            if(n2 >= 0 && n2 <= 10) {
                JOptionPane.showMessageDialog(null, "Média = " + (n1 + n2)/2);
            
            }else{
                JOptionPane.showMessageDialog(null, "Valor inválido!");
            }
        
        }else {
            JOptionPane.showMessageDialog(null, "Valor inválido!");
        }
    }
}