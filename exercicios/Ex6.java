/*Escreva um programa que, dados dois números inteiros, mostre na tela o maior deles,
 * assim como a diferença existente entre ambos.
 */

package exercicios;

import javax.swing.JOptionPane;

public class Ex6 {
    public static void main(String[] args) {
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro número"));

        if(num1 > num2) {
            JOptionPane.showMessageDialog(null, String.format("%d é maior que %d\n%d - %d = %d", num1, num2, num1, num2, (num1 - num2)));
        
        }else if(num2 > num1) {
            JOptionPane.showMessageDialog(null, String.format("%d é maior que %d\n%d - %d = %d", num2, num1, num2, num1, (num2 - num1)));

        }else {
            JOptionPane.showMessageDialog(null, String.format("Os números são iguais, portanto %d - %d = %d", num1, num2, (num1 - num2)));
        }
    }
}