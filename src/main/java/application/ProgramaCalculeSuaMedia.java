package application;

import java.util.Scanner;

public class ProgramaCalculeSuaMedia {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Bem vindos ao programa calcule sua nota");

            double media = 0;

            for(int i =1; i <=4; i++) {
                System.out.print("Digite a sua " + i + " nota: ");
                media += sc.nextDouble();
                if(i < 4){
                    continue;
                }

                double mediaCalculada = calculaMedia(media);

                if(mediaCalculada >= 7){
                    System.out.println();
                    System.out.println("Parabens você foi aprovado com média: " + mediaCalculada);
                    break;
                } else if(mediaCalculada >= 5){
                    System.out.println();
                    System.out.println("Ta na hora de estudar mais você esta de recuperação sua média foi: " + mediaCalculada);
                    break;
                }
                System.out.println();
                System.out.println("Você foi reprovado sua media foi " + mediaCalculada);
            }


        }

        public static double calculaMedia(double media) {
            return media / 4;
        }
}
