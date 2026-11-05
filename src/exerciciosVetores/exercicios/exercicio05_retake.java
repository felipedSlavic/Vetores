package exerciciosVetores.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio05_retake {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat numFormat = new DecimalFormat("R$#,##0.00");

//VETORES

        int[] quantObejtos = new int[10];
        double[] valorUni = new double[10];
        double[] totalObj = new double[10];

// VARIÁVEIS
        double totalGeral = 0;
        double maiorQtd = 0;


        //ENTRADA (CARREGAR OS VETORES)

        for (int i = 0; i < 10; i++) {
            System.out.println("---------------------- PRODUTO: " + (i + 1) + "----------------------");

            System.out.print("Informe o Preço Unitário do Objeto: ");
            valorUni[i] = entrada.nextDouble();

            System.out.print("Informe a Quantidade Vendida: ");
            quantObejtos[i] = entrada.nextInt();


            //CALCULAR O TOTAL POR OBJETO
            totalObj[i] = valorUni[i] * quantObejtos[i];

        }
        System.out.println("--------------------RELATÓRIO DE VENDAS --------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "   Qtde:" + quantObejtos[i] + "         Preço: " + numFormat.format(valorUni[i]) + "       Total: " + numFormat.format(totalObj[i]));
            totalGeral += totalObj[i];

            if (valorUni[i]>maiorQtd) {
                maiorQtd=valorUni[i];
            }
        }

        System.out.println("---------------------------------------------------------------");
        System.out.println("Total Geral: " + totalGeral);
        System.out.println("---------------------------------------------------------------");
        System.out.println("Comissão: " + (totalGeral*0.05));
        System.out.println("---------PREÇO DA MAIOR QUANTIDADE VENDIDA----------------------");
        System.out.println("Preço da Maior Quantidade:" + numFormat.format(maiorQtd));


    } //main
}  //pb class

