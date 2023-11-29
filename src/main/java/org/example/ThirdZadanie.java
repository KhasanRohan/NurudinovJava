package org.example;

import java.util.Scanner;

public class ThirdZadanie {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        String hello = name.equalsIgnoreCase("Вячеслав") ? "Привет Вячеслав" : "Нет такого имени";
        System.out.printf(hello);
//       ответ на 4 задание
//        Нет, данная скобочная последовательность не является правильной, так как количество открывающих
//        и закрывающих скобок не совпадает. Для того, чтобы она стала правильной, необходимо удалить
//        квадратную и добавить закрывающую скобку после каждой открывающей скобки.:
//        [((()))()((()))]

    }
}
