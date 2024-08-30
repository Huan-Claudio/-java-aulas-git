package org.example;

import java.util.Scanner;

public class Atv5Ex3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double A, B, C;

        System.out.print("\nInforme o valor de A: ");
        A = ler.nextDouble();
        System.out.print("\nInforme o valor de B: ");
        B = ler.nextDouble();

        C = calculaAB(A, B);
        System.out.printf("\nO resultado absoluto é: %.2f\n", C);

        ler.close();
    }

    public static double calculaAB(double X, double Y) {
        return Math.abs(X - Y);
    }
}
