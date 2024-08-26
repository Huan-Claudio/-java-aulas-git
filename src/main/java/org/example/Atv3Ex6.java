package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Atv3Ex6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double nota1, nota2, nota3, media;
        int cod;

        do {

            System.out.println("Informe o Código do Aluno: ");
            cod = ler.nextInt();

            if (cod == 0){
                break;
            }

            System.out.println("Informe a 1º nota: ");
            nota1 = ler.nextDouble();

            System.out.println("Informe a 2º nota: ");
            nota2 = ler.nextDouble();

            System.out.println("Informe a 3º nota: ");
            nota3 = ler.nextDouble();

            media = (nota1+nota2+nota3)/3;

            System.out.println("A média é: " + media);
        } while (cod != 0);
    }
}
