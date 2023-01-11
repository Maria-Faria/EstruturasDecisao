/*Faça um algoritmo que calcule o IMC de uma pessoa e mostre sua classificação de
 * acordo com a tabela abaixo:
 * 
 *      IMC                 Classificação
 *      < 18.5              Abaixo do peso
 *      18.6 - 24.9         Saudável
 *      25.0 - 29.9         Peso em excesso
 *      30.0 - 34.9         Obesidade grau I
 *      35.0 - 39.9         Obesidade grau II (severa)
 *      >= 40.0             Obesidade grau III (mórbida)
 */

package exercicios;

import javax.swing.JOptionPane;

public class Ex41 {
    public static void main(String[] args) {
        double altura, peso, imc;

        peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu peso", "Cálculo do IMC", JOptionPane.INFORMATION_MESSAGE));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua altura", "Cálculo do IMC", JOptionPane.INFORMATION_MESSAGE));

        imc = peso/(Math.pow(altura, 2));

        if(imc < 18.5) {
            JOptionPane.showMessageDialog(null, String.format("IMC: %.1f\nAbaixo do peso", imc), "Cálculo do IMC", JOptionPane.INFORMATION_MESSAGE);
        
        }else if(imc >= 18.5 && imc <= 24.9) {
            JOptionPane.showMessageDialog(null, String.format("IMC: %.1f\nSaudável", imc), "Cálculo do IMC", JOptionPane.INFORMATION_MESSAGE);

        }else if(imc >= 25 && imc <= 29.9) {
            JOptionPane.showMessageDialog(null, String.format("IMC: %.1f\nPeso em excesso", imc), "Cálculo do IMC", JOptionPane.INFORMATION_MESSAGE);

        }else if(imc >= 30 && imc <= 34.9){
            JOptionPane.showMessageDialog(null, String.format("IMC: %.1f\nObesidade grau I", imc), "Cálculo do IMC", JOptionPane.INFORMATION_MESSAGE);

        }else if(imc >= 35 && imc <= 39.9) {
            JOptionPane.showMessageDialog(null, String.format("IMC: %.1f\nObesidade grau II (severa)", imc), "Cálculo do IMC", JOptionPane.INFORMATION_MESSAGE);

        }else {
            JOptionPane.showMessageDialog(null, String.format("IMC: %.1f\nObesidade grau III (mórbida)", imc), "Cálculo do IMC", JOptionPane.INFORMATION_MESSAGE);

        }
    }    
}
