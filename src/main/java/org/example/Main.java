package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gideceğiniz KM'yi girin : ");
        double km = scanner.nextDouble();

        double price = 10 + (2.20 * km);

        if(price < 20){
            System.out.println("You need to pay 20 TL.");
        }else {
            System.out.println("You need to pay "+ price + " TL.");
        }
    }
}