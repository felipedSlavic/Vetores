package exerciciosVetores.extras;

import java.util.Scanner;

public class extra04 {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        // VETORES

        String[] modelo = new String[5];

        double[] consumo = new double[5];

        double[] qtdeLitros = new double[5];

        //VAR

        double modeloEco=0;
        String indModelo = "";

        for (int i = 0; i < 5; i++) {

            System.out.println("------------- Veículo" + (i + 1) + " --------------");

            System.out.print("Informe o modelo do véiculo " + (i + 1) + ": ");
            modelo[i] = entrada.next();

            System.out.print("Informe o Consumo do véiculo " + (modelo[i]) + ": ");
            consumo[i] = entrada.nextDouble();

            while (consumo[i] <= 0) {
                System.out.print("Digite um Consumo Válido: ");
                consumo[i] = entrada.nextDouble();
            }

            System.out.println("");

        }

        for (int i = 0; i < 5; i++) {

            qtdeLitros[i] = 1000 / consumo[i];

            System.out.println("O veículo   " + modelo[i] + "   Consome " + qtdeLitros[i] + "  Litro(s) de combustível para percorrer 1000km");

            if (i==0){
                modeloEco=qtdeLitros[i];
                indModelo=modelo[i];

            } else if (qtdeLitros[i] < modeloEco) {
               // modeloEco=qtdeLitros[i];
                indModelo=modelo[i];
            }

        }

        System.out.println("------------------------------");
        System.out.println("O Modelo mais econômico é o " + indModelo);


    } //main
}
