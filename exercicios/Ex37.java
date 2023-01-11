/*As tarifas de certo parque de estacionamento são as seguintes:
 *  - 1ª e 2ª hora - R$1.00 cada
 *  - 3ª e 4ª hora - R$1.40 cada
 *  - 5ª hora e seguintes - R$2.00 cada
 * 
 * O número de horas a pagar é sempre inteiro e arredondado por execesso. Deste modo,
 * quem estacionar durante 61 minutos pagará por duas horas, que é o mesmo que pagaria
 * se tivesse permanecido 120 minutos. Os momentos de chegada ao parque e partida
 * deste são apresentados na forma de pares de inteiros, representando horas e minutos.
 * Por exemplo, o par 12 50 representará "dez para a uma da tarde". Pretende-se criar um
 * programa que, lidos pelo teclado os momentos de chegada e de partida, escreva na tela
 * o preço cobrado pelo estacionamento. Admite-se que a chegada e a partida se dão com
 * intervalo não superior a 24 horas. Portanto, se uma dada hora de chegada for superior
 * à da partida, isso não é uma situção de erro, antes significará que a partida ocorreu no
 * dia seguinte ao da chegada.
 */

package exercicios;

import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        int chegadaHora, chegadaMin, partidaHora, partidaMin;
        double valor, minutos;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("\t--- Momento de chegada ao estacionamento --- ");
        System.out.print("Hora: ");
        chegadaHora = sc.nextInt();
        System.out.print("Minuto: ");
        chegadaMin = sc.nextInt();

        System.out.println("------------------------------------------");

        System.out.println("\t--- Momento de partida do estacionamento --- ");
        System.out.print("Hora: ");
        partidaHora = sc.nextInt();
        System.out.print("Minuto: ");
        partidaMin = sc.nextInt();

        sc.close();

        minutos = ((partidaHora * 60) + partidaMin) - ((chegadaHora * 60) + chegadaMin);

        if(chegadaHora < partidaHora) {
            if(minutos <= 120) {
                if(minutos <= 60) {
                    valor = 1;
                
                }else {
                    valor = 2;
                }
            }else if(minutos > 120 && minutos <= 240) {
                if(minutos <= 180) {
                    valor = 4.20;
                
                }else {
                    valor = 5.60;
                }
            }else {
                if(minutos <= 300) {
                    valor = 10;
                
                }else {
                    valor = 2 * Math.ceil(minutos/60);
                }
            }
        }else {
            minutos = 1440 - (chegadaHora * 60 + chegadaMin);
            minutos = minutos + (partidaHora * 60 + partidaMin);

            valor = 2 * Math.ceil(minutos/60);
        }

        System.out.println("--------------------------------------------------");
        System.out.printf("Valor total a pagar por %d horas e %d minutos: R$%.2f", Math.round(minutos/60), (int)(minutos % 60), valor);
    }    
}
 