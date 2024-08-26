package org.example;

import java.util.Scanner;

public class Atv4Ex3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double media[] = new double[10];
        int aprov = 0, reprov = 0, x;

        for (x = 0; x < 10; x++){
            int xy = x+1;
            System.out.println("Informe a média do "+ xy +"º aluno: ");
            media[x] = ler.nextDouble();

            if (media[x] >= 6){
                aprov += 1;
            } else {
                reprov += 1;
            }
        }

        System.out.println("O total de alunos aprovados é: " + aprov);
        System.out.println("O total de alunos reprovados é: " + reprov);
    }
}
