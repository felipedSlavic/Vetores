package exerciciosVetores.exercicios;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        String [] meses = new String[] {"Janeiro","Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro","Novembro", "Dezembro"};

        double [] tempoeratura = new double[12];

        double maior=0,menor=0;


        //Carregar Vetor Temperatura
        for (int i=0;i<12; i++){
            System.out.println("Informe a Temperatura do Mês de " + meses[i]+ ":");
            tempoeratura[i]=entrada.nextDouble();

        }

        for (int i=0;i<12;i++){
            if (tempoeratura[i]>maior) {
                maior=tempoeratura[i];
                System.out.println("A maior temperatura foi registrada no mês de " + meses[i] + "e foi de " + tempoeratura[i]);
            }

        }

    }
}
