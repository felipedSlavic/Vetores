package exerciciosVetores.exemplos;

import java.util.Scanner;

public class exemplo01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        //Criar vetor


        String [] times = new String[5];


        //Carregar Vetor

        for(int i=0;i<5;i++) {
            System.out.println("Digite o time: ["+ (i) + "] : ");
            times[i]=entrada.next();
        }

        //Indice da estrutura de repetição
        //Gerencia o indíce do vetor

//exibir vetor
        System.out.println("Relação de times: ");
for (int i=0;i<5;i++){
    System.out.println(  "times ["+ i + " ] : " +times[i]);
}



    }
}
