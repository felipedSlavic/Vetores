package exerciciosVetores.extras;

import java.util.Scanner;

public class extra03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        // VETOR

        double[] temp = new double[7];

        // VAR

        double som=0, media=0;
        int indicador=0;


        for (int i=0; i<7; i++) {

            System.out.print("Digite a Temperatura do " + (i+1) +  "º Dia: " );
            temp[i]=entrada.nextDouble();

            som+=temp[i];
        }

        media=som/7;

        System.out.println("A Média da Temperatura na Semana foi de : " + media);

        for (int i=0; i<7; i++){
            if (temp[i] > media){
                indicador++;
            }
        }
        System.out.println("A quantidade de dia(s) com temperatura acima da média: " + indicador);








    } //main
}
