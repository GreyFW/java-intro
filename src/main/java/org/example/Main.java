package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Введите номер задания: ");
        int task_n = 0;

        if(scnr.hasNextInt()) {
            task_n = scnr.nextInt();
        } else {
            System.out.println("Некорректный ввод.");
        }

        switch (task_n) {
            case 1: {
                task_one();
                break;
            }
            case 2: {
                task_two();
                break;
            }
            case 3: {
                task_three();
                break;
            }
            case 4: {
                task_four();
                break;
            }
            case 5: {
                task_five();
                break;
            }
            default: {
                System.out.print("Нет задания с таким номером.");
                break;
            }
        }
    }

    public static void task_one() {

        for (int i = 0; i <= 500; i++) {
            if ((i % 5 == 0) && (i % 7 == 0)) {
                System.out.println("fizzbuzz");
            }
            else if ((i % 5 == 0) && (i % 7 != 0)) {
                System.out.println("fizz");
            }
            else if ((i % 7 == 0) && (i % 5 !=0)) {
                System.out.println("buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

    public static void task_two() {
        String str = "make install";
        String str_reversed = "";
        int length = str.length() - 1;
        for (int i = length; i >= 0; i--) {
            str_reversed += str.charAt(i);
        }
        System.out.println(str_reversed);
    }

    public static void task_three() {

    }

    public static void task_four() {

    }

    public static void task_five() {

    }

} // конец класса Main