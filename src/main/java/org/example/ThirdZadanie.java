package org.example;

import java.util.Scanner;

public class ThirdZadanie {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        String hello = name.equalsIgnoreCase("Вячеслав") ? "Привет Вячеслав" : "Нет такого имени";
        System.out.printf(hello);
    }
}
