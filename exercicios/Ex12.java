/*Ler um número inteiro. Se o número lido for negativo, escreva a mensagem "Número
inválido". Se o número for positivo, calcular o logaritmo deste número.*/

package exercicios;

import javax.swing.JOptionPane;

public class Ex12 {
    public static void main(String[] args) {
        int num, log = 0, result;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro"));
        result = num;

        if(num < 0) {
            JOptionPane.showMessageDialog(null, "Número inválido");
        
        }else {
            do {
                result = result/10;

                log++; 

            }while(result >= 10);

            JOptionPane.showMessageDialog(null, "Log " + num + " = " + log);
        }
    }
}