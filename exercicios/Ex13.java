/*Faça um algoritmo que calcule a média ponderada das notas de 3 provas. A primeira e
 * a segunda prova têm peso 1 e a terceira tem peso 2. Ao final, mostrar a média do aluno
 * e indicar se o aluno foi aprovado ou reprovado. A nota para aprovação deve ser igual ou
 * superior a 60 pontos.
 */

package exercicios;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        double n1, n2, n3, media;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a nota 1: ");
        n1 = sc.nextDouble();

        System.out.print("Informe a nota 2: ");
        n2 = sc.nextDouble();

        System.out.print("Informe a nota 3: ");
        n3 = sc.nextDouble();

        sc.close();

        media = (n1 + n2 + (n3 * 2))/4;

        System.out.println("-------------------------");
        System.out.printf("Média: %.2f\n", media);

        if(media >= 60) {
            System.out.println("Aluno aprovado!");
        
        }else{
            System.out.println("Aluno reprovado... :(");
        }
    }
}
