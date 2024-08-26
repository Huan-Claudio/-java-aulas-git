package org.example;

import java.util.Scanner;

public class Atv3Ex16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int x, y;

        for (x = 1; x <= 5; x++){
            for (y = 1; y <= x; y++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
