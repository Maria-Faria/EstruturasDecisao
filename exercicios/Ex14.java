/*A nota final de um estudante é calculada a partir de três notas atribuídas entre o intervalo
 * de 0 até 10, respectivamente, a um trabalho de laboratório, a uma avaliação semestral
 * e a um exame final. A média das três notas mencionadas anteriormente obedece aos
 * pesos: Trabalho de laboratório: 2; Avaliação Semestral: 3; Exame Final: 5. De acordo
 * com o resultado, mostre na tela se o aluno está reprovado (média entre 0 e 2.9), de
 * recuperação (entre 3 e 4.9) ou se foi aprovado. Faça todas as verifcações necessárias.
 */

package exercicios;

import javax.swing.JOptionPane;

public class Ex14 {
    public static void main(String[] args) {
        double n1, n2, n3, nota;

        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota do trabalho de laboratório"));

        if(n1 >= 0 && n1 <= 10) {
            n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota da avaliação semestral"));

            if(n2 >= 0 && n2 <= 10) {
                n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota do exame final"));

                if(n3 >= 0 && n3 <= 10) {
                    nota = ((n1 * 2) + (n2 * 3) + (n3 * 5))/10;

                    if(nota >= 0 && nota <= 2.9) {
                        JOptionPane.showMessageDialog(null, "Aluno reprovado... :(");
                   
                    }else if(nota >= 3 && nota <= 4.9) {
                        JOptionPane.showMessageDialog(null, "Aluno de recuperação... :/");

                    }else {
                        JOptionPane.showMessageDialog(null, "Aluno aprovado! :)");
                    }

                }else{
                    JOptionPane.showMessageDialog(null, "Nota inválida!");
                }

            }else{
                JOptionPane.showMessageDialog(null, "Nota inválida!");
            }

        }else {
            JOptionPane.showMessageDialog(null, "Nota inválida!");
        }
    }
}
