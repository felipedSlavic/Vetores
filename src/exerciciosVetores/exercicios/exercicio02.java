package exerciciosVetores.exercicios;

import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);

        //VETOR

        String [] nomes = new String [10];

        //VARIÁVEL

        String nomeBusca;



        for (int i=0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "° Nome : ");
            nomes [i]= entrada.next();

        }


        System.out.println("Digite o Nome para Procurar no Vetor: ");
        nomeBusca=entrada.next();


        for (int i=0; i < 10; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                System.out.println("Achei - Posição do Vetor" + i);
            } else {
                System.out.println("Não Achei");
            }
        }







    }
}
