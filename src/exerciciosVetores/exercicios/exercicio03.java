package exerciciosVetores.exercicios;

import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);

        //VETOR

        String [] nomes = new String [10];

        //VARIÁVEL

        String nomeBusca;
        int teste=0;


        for (int i=0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "° Nome : ");
            nomes [i]= entrada.next();

        }


        System.out.println("Digite o Nome para Procurar no Vetor: ");
        nomeBusca=entrada.next();


        for (int i=0; i < 10; i++) {

            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                teste=1;
            }
        }

        //A SOLUÇÃO FOI UMA VARIÁVEL INTEIRA

        if (teste==1){
            System.out.println("Achei");
        } else {
            System.out.println("Não Achei");
        }

    }
}
