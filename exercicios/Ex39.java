/*Uma empresa decide dar um aumento aos seus funcionários de acordo com uma tabela
 * que considera o salário atual e o tempo de serviço de cada funcionário. Os funcionários
 * com menor salário terão um aumento proporcionalmente maior do que os funcionários 
 * com um salário maior, e conforme o tempo de serviço na empresa, cada funcionário irá
 * receber um bônus adicional de salário. Faça um programa que leia:
 * 
 * - o valor do salário atual do funcionário
 * - o tempo de serviço desse funcionário na empresa (número de anos de trabalho na
 * empresa)
 * 
 * Use as tabelas abaixo para calcular o salário reajustado deste funcionário e imprima o
 * valor do salário final reajustado, ou uma mensagem caso o funcionário não tenha direito
 * a nenhum aumento.
 * 
 *      Salário Atual       Reajuste          Tempo de Serviço      Bônus
 *      Até 500,00             25%            Abaixo de 1 ano       Sem bônus
 *      Até 1000,00            20%            De 1 a 3 anos         100,00
 *      Até 1500,00            15%            De 4 a 6 anos         200,00
 *      Até 2000,00            10%            De 7 a 10 anos        300,00
 *      Acima de 2000,00    Sem reajuste      Mais de 10 anos       500,00
 */

package exercicios;

import javax.swing.JOptionPane;

public class Ex39 {
    public static void main(String[] args) {
        double salarioAtual, salarioFinal, servico;

        salarioAtual = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do seu salário atual"));
        servico = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu tempo de serviço na empresa (em anos)"));

        if(salarioAtual <= 500) {
            salarioFinal = salarioAtual + (salarioAtual * 0.25);
        
        }else if(salarioAtual <= 1000) {
            salarioFinal = salarioAtual + (salarioAtual * 0.20);

        }else if(salarioAtual <= 1500) {
            salarioFinal = salarioAtual + (salarioAtual * 0.15);

        }else if(salarioAtual <= 2000) {
            salarioFinal = salarioAtual + (salarioAtual * 0.10);

        }else {
            salarioFinal = salarioAtual;
        }

        if(servico >= 1 && servico <= 3) {
            salarioFinal += 100;

        }else if(servico >= 4 && servico <= 6) {
            salarioFinal += 200;

        }else if(servico >= 7 && servico <= 10) {
            salarioFinal += 300;

        }else if(servico > 10) {
            salarioFinal += 500;
        }

        if(salarioFinal == salarioAtual) {
            JOptionPane.showMessageDialog(null, "Você não tem direito a nenhum aumento... :(");
        
        }else {
            JOptionPane.showMessageDialog(null, String.format("Salário reajustado: R$%.2f", salarioFinal));
        }
    }    
}
