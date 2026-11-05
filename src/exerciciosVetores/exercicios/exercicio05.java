package exerciciosVetores.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat numFormat = new DecimalFormat("R$#,##0.00");

        //VETORES

        int[] quantObjetos = new int[10];

        double[] valorObjetos = new double[10];

        double[] total = new double[10];

        //Variável
        double totalGeral = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("------------PRODUTO" + (i + 1) + "------------------");

            System.out.print("Informe o Preço Unitário do Produto : ");
            valorObjetos[i] = entrada.nextDouble();

            System.out.println("Informe a Quantidade Vendida: ");
            quantObjetos[i] = entrada.nextInt();

            //Calcular o Valor
            total[i] =valorObjetos[i] * quantObjetos[i];


        }


        System.out.print("-------------------------RELATÓRIO DE VENDAS-------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(" Qntde: " + quantObjetos[i] + "Preço: " + numFormat.format(valorObjetos[i]) + "Total: " );
        }


    }
}
