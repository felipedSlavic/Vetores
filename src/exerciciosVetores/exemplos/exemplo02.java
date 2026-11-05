package exerciciosVetores.exemplos;

import java.util.Scanner;

public class exemplo02 {

    public static void main(String[] args) {


        Scanner entrada= new Scanner(System.in);


        //Criar Vetor

        String[] nomes = new String[5];

        int [] idades= new int[5];


        //Carregar

        for (int i=0;i<5;i++) {

            System.out.print("Digite o Nome: ");
            nomes[i]=entrada.next();

            System.out.print("Digite a Idade: ");
            idades[i]=entrada.nextInt();

        }

        //Exibir Vetor
        for (int i=0;i<5;i++){

            if (idades[i]>21) {
                System.out.println("Atletas com Idade Superior a 21 anos");
                System.out.println( "-" + nomes[i]);
            }

        }



    }
}
