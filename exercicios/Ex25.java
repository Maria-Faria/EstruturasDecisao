/*Calcule as raízes da equação de 2° grau.
 *          Lembrando que:
 *        x = (-b ± √Δ)/2a
 *          Onde
 *        Δ = B² - 4ac 
 *    E ax² + bx + c = 0 representa a equação de 2° grau
 * 
 * A variável a tem que ser diferente de zero. Caso seja igual, imprima a mensagem "Não
 * é equação de segundo grau".
 * 
 * - Se Δ < 0, não existe real. Imprima a mensagem "Não existe raiz"
 * - Se Δ = 0, existe uma raiz real. Imprima a raiz e a mensagem "Raiz única"
 * - Se > 0, imprima as duas raízes reais
 */

package exercicios;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;

        Scanner sc = new Scanner(System.in);

        System.out.println("\tFormato de uma equação de 2° grau: ax² + bx + c = 0\n");
        System.out.print("Informe o valor de a: ");
        a = sc.nextDouble();
        
        System.out.print("Informe o valor de b: ");
        b = sc.nextDouble();
        
        System.out.print("Informe o valor de c: ");
        c = sc.nextDouble();

        sc.close();

        System.out.println("-------------------------------");
        System.out.printf("%.1fx² + %.1fx + %.1f = 0\n", a, b, c);
        System.out.println("-------------------------------");

        //------------------------------cálculo--------------------------------------------

        delta = (Math.pow(b, 2)) - (4 * a * c);

        x1 = (-b + Math.sqrt(delta))/(2 * a); 
        x2 = (-b - Math.sqrt(delta))/(2 * a); 

        if(delta < 0) {
            System.out.println("Não existe raiz");
        
        }else if(delta == 0) {
            System.out.println("x = " + x1);
            System.out.println("Raiz única");
        
        }else {
            System.out.println("x' = " + x1);
            System.out.println("x'' = " + x2);
        }
    }    
}