package org.example;

import java.util.Scanner;

public class Atv4Ex5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double valor[] = new double[10], subtotal[] = new double[10], quantidade[] = new double[10];
        int x;
        String nome[] = new String[10];

        for (x = 0; x < 10; x++){
            System.out.println("Informe o nome do produto: ");
            nome[x] = ler.next();

            System.out.println("Informe a quantidade do produto: ");
            quantidade[x] = ler.nextDouble();

            System.out.println("Informe o valor do produto: ");
            valor[x] = ler.nextDouble();

            subtotal[x] = valor[x] * quantidade[x];
        }

        for (x = 0; x < 10; x++){

        System.out.println("O sutotal do produto " + nome[x] + " é de R$ " + subtotal[x]);
    }
    }
}
