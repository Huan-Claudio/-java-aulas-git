package org.example;
import java.util.Scanner;

public class Atv5Ex1 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double area, raio;

            System.out.print("\nInforme o raio da circunferência (cm): ");
            raio = scanner.nextDouble();

            area = Math.PI * Math.pow(raio, 2);

            area = Math.round(area * 100.0) / 100.0;

            System.out.printf("A área da circunferência é %.2f cm²\n", area);

            scanner.close();
        }
    }
