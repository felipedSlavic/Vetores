package exerciciosVetores.exercicios;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        new Scanner(System.in);
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = new int[]{5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
        System.out.println("ELEMENTOS QUE NÃO ESTÃO B");

        for (int i = 0; i < a.length; ++i) {
            boolean encontrado = false;

            for (int j = 0; j < b.length; ++j) {
                if (a[i] == b[j]) {
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println(a[i]);
            }
        }

        System.out.println("ELEMENTOS DO B QUE ESTÃO NO A");

        for (int j = 0; j < b.length; ++j) {
            boolean encontrado = false;

            for (int i = 0; i < a.length; ++i) {
                if (b[j] == a[i]) {
                    encontrado = true;
                }
            }

            if (encontrado) {
                System.out.println(b[j]);
            }
        }

    }
}

