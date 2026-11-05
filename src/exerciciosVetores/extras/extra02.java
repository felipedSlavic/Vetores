package exerciciosVetores.extras;

import java.util.Scanner;

public class extra02 {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //VETORES

        double[] valor = new double[6];

        char[] tipo = new char[6];

        // VARIÁVEL
        double credito = 0, debito = 0, dif=0;


        for (int i = 0; i < 6; i++) {

            System.out.print("Digite o Valor: ");
            valor[i] = entrada.nextDouble();

            System.out.print("Digite o Tipo de Operação (D-Débito) ou (C-Crédito) : ");
            tipo[i] = entrada.next().toUpperCase().charAt(0);

            while (tipo[i] != 'C' && tipo[i] != 'D') {
                System.out.println("Informe uma Opção Válida (D ou C)");
                tipo[i] = entrada.next().toUpperCase().charAt(0);
            }

            if (tipo[i] == 'C') {
                credito += valor[i];
            } else {
                debito += valor[i];
            }

        }

        dif=credito-debito;

        System.out.println("O total de créditos: " + credito);
        System.out.println("O total de Déditos: " + debito);
        System.out.println("Diferença: " + dif);

        if (dif>0) {
            System.out.println("SALDO POSITIVO");
        } else if (dif==0) {
            System.out.println("SALDO ZERADO");
        } else {
            System.out.println("SALDO NEGATIVO");
        }





    } //main
}
