/*Dados três valores, A, B, C, verificar se eles podem ser valores dos lados de um triângulo
 * e, se forem, se é um triângulo escaleno, equilátero ou isósceles, considerando os seguintes
 * conceitos:
 * - O comprimento de cada lado do triângulo é menor do que a soma dos outros
 * dois lados
 * - Chama-se equilátero o triângulo que tem três lados iguais
 * - Denomina-se isósceles o triângulo que tem o comprimento de dois lados iguais
 * - Recebe o nome de escalenoo triângulo que tem os três lados diferentes
 */

package exercicios;

import javax.swing.JOptionPane;

public class Ex20 {
    public static void main(String[] args) {
        double a, b, c;

        a = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor A"));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor B"));
        c = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor C"));

        if(a < (b + c) && b < (a + c) && c < (a + b)) {

            JOptionPane.showMessageDialog(null, "A, B e C podem ser valores dos lados de um triângulo!");

            if(a == b && b == c) {
                JOptionPane.showMessageDialog(null, "Tipo: Triângulo equilátero");
            
            }else if(a == b || a == c || b == c) {
                JOptionPane.showMessageDialog(null, "Tipo: Triângulo isósceles");

            }else {
                JOptionPane.showMessageDialog(null, "Tipo: Triângulo escaleno");
            }
        
        }else{
            JOptionPane.showMessageDialog(null, "A, B e C não podem ser valores dos lados de um triângulo!");
        }
    }
}