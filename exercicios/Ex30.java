/*Faça um programa que receba três números e mostre-os em ordem crescente. */

package exercicios;

import javax.swing.JOptionPane;

public class Ex30 {
    public static void main(String[] args) {
        double num1, num2, num3, maior, meio, menor;

        num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número"));
        num3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o terceiro número"));

        if(num1 > num2 && num1 > num3) {
            maior = num1;

            if(num2 > num3) {
                meio = num2;
                menor = num3;
            
            }else{
                meio = num3;
                menor = num2;
            }
        
        }else if(num2 > num1 && num2 > num3) {
            maior = num2;

            if(num1 > num3) {
                meio = num1;
                menor = num3;
            
            }else {
                meio = num3;
                menor = num1;
            }
        
        }else {
            maior = num3;

            if(num1 > num2) {
                meio = num1;
                menor = num2;
            
            }else {
                meio = num2;
                menor = num1;
            }
        }

        JOptionPane.showMessageDialog(null, String.format("%.1f - %.1f - %.1f", menor, meio, maior));
    }
}
