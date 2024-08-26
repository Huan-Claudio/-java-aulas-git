package org.example;

import java.util.Scanner;

public class Atv3Ex1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double x, soma = 0;

        for (int cont = 0; cont < 5; cont++){

            System.out.println("Informe o número você deseja somar: ");
            x = ler.nextDouble();

            soma += x;
        }

            System.out.println("O somatório é:" + soma);


    }
}
