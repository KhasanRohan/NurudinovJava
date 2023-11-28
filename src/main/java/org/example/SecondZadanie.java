package org.example;

import java.util.Scanner;

public class SecondZadanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < size; i++) {
            int number = scanner.nextInt();

            if (number % 3 == 0) {
                str.append(String.valueOf(number)).append(" ");// через пробел выведу
            }
        }

        if (!str.isEmpty()) {
            System.out.println("Элементы кратные трём: ");
            System.out.println(str);
        } else {
            System.out.println("Нет элементов кратных трем");
        }
    }
}
