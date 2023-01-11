/*Leia a distância em Km e a quantidade de litros de gasolina consumidos por um carro
 * em um percurso, calcule o consumo em Km/L e escreva uma mensagem de acordo com
 * a tabela abaixo:
 * 
 *      CONSUMO        (Km/L)       MENSAGEM
 *      menor que         8         Venda o carro!
 *      entre          8 e 14       Econômico!
 *      maior que        12         Super econômico!
 */

package exercicios;

import javax.swing.JOptionPane;

public class Ex26 {
    public static void main(String[] args) {
        double km, l, consumo;

        km = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a distância percorrida em Km"));
        l = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade de litros de gasolina consumidos no percurso"));
    
        consumo = km/l;

        if(consumo < 8) {
            JOptionPane.showMessageDialog(null, "Venda o carro!");
        
        }else if(consumo > 12) {
            JOptionPane.showMessageDialog(null, "Super econômico!");
        
        }else if(consumo >= 8 && consumo <= 14) {
            JOptionPane.showMessageDialog(null, "Econômico!");
        }
    }    
}