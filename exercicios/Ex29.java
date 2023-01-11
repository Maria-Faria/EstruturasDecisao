/*Faça uma prova de matemática para crianças que estão aprendendo a somar números
 * inteiros menores do que 100. Escolha números aleatórios entre 1 e 100, e mostre na
 * tela a pergunta: qual é a soma de a + b, onde a e b são os números aleatórios. Peça a
 * resposta. Faça cinco perguntas ao aluno, e mostre para ele as perguntas e as respostas
 * corretas, além de quantas vezes o aluno acertou.
 */

package exercicios;

import javax.swing.JOptionPane;

public class Ex29 {
    public static void main(String[] args) {
        int ct = 0, resp, soma, certo = 0;

        do {
            int a = (int) (Math.random() * 100) + 1;
            int b = (int) (Math.random() * 100) + 1;

            soma = a + b;

            resp = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("%d- Qual é a soma de %d + %d?", (ct + 1), a, b)));

            if(resp == soma) {
                JOptionPane.showMessageDialog(null, "Parabéns, você acertou!\nResposta correta: " + soma);
                certo++;
            
            }else {
                JOptionPane.showMessageDialog(null, "Você errou... :(\nResposta correta: " + soma);
            }

            ct++;
        
        }while(ct < 5);

        JOptionPane.showMessageDialog(null, "Você acertou " + certo + " perguntas!");
    }
}
