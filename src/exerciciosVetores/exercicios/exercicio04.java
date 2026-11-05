package exerciciosVetores.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat numFormat = new DecimalFormat("R$ #,##0.00");

        //VETORES

        String[] nome = new String[5];

        double[] salario = new double[5];

        int[] tempServico = new int[5];

        //VARIÁVEL
        double salFinal = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("------------" + (i + 1) + "°Funcionário-------");

            System.out.println("Informe o Nome do Funcionário : ");
            nome[i] = entrada.next();

            System.out.println("Informe o Salário do Funcionário : ");
            salario[i] = entrada.nextDouble();

            System.out.println("Informe o Tempo do Funcionário : ");
            tempServico[i] = entrada.nextInt();


        }

        System.out.println("----------Funcionários que não terão Aumento----------");

        for (int i = 0; i < 5; i++) {
            if (tempServico[i] <= 5 && salario[i] >= 780) {
                System.out.println(nome[i]);
            }

        }

        System.out.println("");
        System.out.println("----------Funcionários que Terão Aumento----------");


        for (int i = 0; i < 5; i++) {

            //IF PARA EXLUIR A LUIZA
            if (tempServico[i] > 5 || salario[i] < 780) {


                if (tempServico[i] >= 5 && salario[i] <= 780) {

                    salFinal = salario[i] + (salario[i] * 0.35);

                } else {

                    if (tempServico[i] >= 5) {

                        salFinal = salario[i] + (salario[i] * 0.25);

                    } else {
                        salFinal = salario[i] + (salario[i] * 0.15);
                    }

                    System.out.println("Nome: " + nome[i] + "- Novo Salário: " + numFormat.format(salFinal));
                }
            }


        }
    }
}
