package exerciciosVetores.exemplos;

import java.util.Scanner;

public class exemplo03 {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        //VAR e Vetores

        double[] notas = new double[12];
        double media = 0;
        String[] classif = new String[12];


        //CARREGAR

        for (int i = 0; i < 12; i++) {

            System.out.print("Digite a Nota da GS: ");
            notas[i] = entrada.nextDouble();

            if (notas[i] >= 9) {
                classif[i] = "ÒTIMO";
            } else if (notas[i] >= 8) {
                classif[i] = "BOM";
            } else if (notas[i] >= 6) {
                classif[i] = "REGULAR";
            } else {
                classif[i] = "BAIXO";
            }
        }

        //EXIBIR RELATÒRIO
        System.out.println(" ");
        System.out.println("Relatório e Análise de Notas");
        for (int i = 0; i < 12; i++) {
            System.out.println(notas[i] + " - " + classif[i]);
            media += notas[i];
        }
        System.out.print("Média da Turma - " + media / 12);
    }
}
