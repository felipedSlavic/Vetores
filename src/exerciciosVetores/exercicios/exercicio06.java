package exerciciosVetores.exercicios;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat fInteiro = new DecimalFormat("000");
        DecimalFormat numFormat = new DecimalFormat("R$#,##0.00");
        String[] nomes = new String[10];
        int[] codigo = new int[10];
        double[] precos = new double[10];
        double[] precoFinal = new double[10];
        double[] perc = new double[10];
        Random r = new Random();

        for (int i = 0; i < nomes.length; ++i) {
            System.out.println("------------PRODUTO" + (i + 1) + "-----------");
            System.out.println("");
            System.out.print("Digite o Nome do Produto: ");
            nomes[i] = entrada.next();
            precos[i] = r.nextDouble((double) 1300.0F);
            codigo[i] = r.nextInt(20) + 1;
            System.out.println("");
            if (codigo[i] % 2 == 0 || precos[i] > (double) 1000.0F) {
                if (codigo[i] % 2 == 0 && precos[i] > (double) 1000.0F) {
                    perc[i] = 0.2;
                } else if (codigo[i] % 2 == 0) {
                    perc[i] = 0.15;
                } else if (precos[i] > (double) 1000.0F) {
                    perc[i] = 0.1;
                } else {
                    perc[i] = (double) 0.0F;
                }
            }

            precoFinal[i] = precos[i] + precos[i] * perc[i];
        }

        System.out.println("------- TODA A LISTA DE PRODUTOS -------");

        for (int i = 0; i < nomes.length; ++i) {
            System.out.println(nomes[i] + " - " + fInteiro.format((long) codigo[i]) + " - " + numFormat.format(precos[i]) + " - " + perc[i] + " - " + numFormat.format(precoFinal[i]));
        }

        System.out.println("");
        System.out.println("------- PRODUTOS QUE RECEBERÃO AUMENTO -------");

        for (int i = 0; i < nomes.length; ++i) {
            if (perc[i] > (double) 0.0F) {
                System.out.println(nomes[i] + " - " + fInteiro.format((long) codigo[i]) + " - " + numFormat.format(precos[i]) + " - " + perc[i] + " - " + numFormat.format(precoFinal[i]));
            }
        }

        System.out.println("------- PRODUTOS QUE NÃO RECEBERÃO AUMENTO -------");

        for (int i = 0; i < nomes.length; ++i) {
            if (perc[i] == (double) 0.0F) {
                System.out.println(nomes[i] + " - " + fInteiro.format((long) codigo[i]) + " - " + numFormat.format(precos[i]) + " - " + perc[i] + " - " + numFormat.format(precoFinal[i]));
            }
        }

    }
}
