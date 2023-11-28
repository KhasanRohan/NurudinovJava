package org.example;


import java.util.Scanner;

public class FirstZadanie {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        String hello = number > 7 ? "Привет" : "Пока";
        System.out.printf(hello);
    }
}