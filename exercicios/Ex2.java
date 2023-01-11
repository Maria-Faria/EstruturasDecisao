/*Leia um número fornecido pelo usuário. Se esse número for positivo, calcule a raiz
 * quadrada do número. Se o número for negativo, mostre uma mensagem dizendo que o
 * número é inválido.
 */

package exercicios;

import javax.swing.JOptionPane;

public class Ex2 {
    public static void main(String[] args) {
        double num;

        num = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número"));

        if(num >= 0) {
            JOptionPane.showMessageDialog(null, "Raiz de " + num + " = " + Math.sqrt(num));
        
        }else{
            JOptionPane.showMessageDialog(null, "Número inválido!");
        }
    }    
}
