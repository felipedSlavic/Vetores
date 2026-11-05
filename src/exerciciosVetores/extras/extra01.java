package exerciciosVetores.extras;

import java.util.Scanner;

public class extra01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        //VETORES

        int[] num = new int[6];

        // VARIÁVEL

        int pares =0, impar=0;

        //ENTRADA (CARREGAR OS VETORES)

        for (int i=0; i<6; i++) {

            System.out.print("Digite um Número: ");
            num[i]=entrada.nextInt();

            if (num[i]%2==0) {
                System.out.println("O Número (" + num[i] + ") É PAR ");
                pares++;
            } else {
                System.out.println("O Número (" + num[i] + ") É IMPAR ");
                impar++;
            }
        }
        System.out.println("");
        System.out.println("QUANTIDADE DE NÚMERO PARES: " + pares);
        System.out.println("QUANTIDADE DE NÚMERO IMPARES: " + impar);












    } // main
}
