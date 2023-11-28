package org.example;

import java.util.Scanner;

public class  {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива:");
        int size = scanner.nextInt();
        int [] numbers = new int[size];
        for(int i = 0; i < size; i++){
            numbers[i] =scanner.nextInt();
        }
        for(int number : numbers){
            if(number % 3 == 0){
                System.out.println("Элементы кратные 3: " + number);
            }
        }
    }
}
