/*Faça um programa que leia um número e, caso ele seja positivo, calcule e mostre:
 * - O número digitado ao quadrado
 * - A raiz quadrada do número digitado
 */

package exercicios;

import javax.swing.JOptionPane;

public class Ex4 {
    public static void main(String[] args) {
        double num;

        num = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número"));

        if(num >= 0) {
            JOptionPane.showMessageDialog(null, num + "² = " + Math.pow(num, 2) + "\n√" + num + " = " + Math.sqrt(num));
        
        }else{
            JOptionPane.showMessageDialog(null, "Número inválido!");
        }
    }    
}
