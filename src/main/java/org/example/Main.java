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
            return;
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
            else if (i % 5 == 0) {
                System.out.println("fizz");
            }
            else if (i % 7 == 0) {
                System.out.println("buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

    public static void task_two() {
        String str = "make install";
        int length = str.length() - 1;

        StringBuilder str_reversed = new StringBuilder();
        for (int i = length; i >= 0; i--) {
            str_reversed.append(str.charAt(i));
        }
        System.out.println(str_reversed);
    }

    public static void task_three() {

        Scanner scnr = new Scanner(System.in);
        System.out.println("Введите коэффициенты квадратного уравнения.");
        double a_val = 0, b_val = 0, c_val = 0;

        System.out.print("a = ");
        if(scnr.hasNextDouble()) {
            a_val = scnr.nextDouble();
        } else {
            System.out.println("Некорректный ввод.");
            return;
        }

        System.out.print("b = ");
        if(scnr.hasNextDouble()) {
            b_val = scnr.nextDouble();
        } else {
            System.out.println("Некорректный ввод.");
            return;
        }

        System.out.print("c = ");
        if(scnr.hasNextDouble()) {
            c_val = scnr.nextDouble();
        } else {
            System.out.println("Некорректный ввод.");
            return;
        }

        double D = b_val * b_val - 4 * a_val * c_val;
        double root1 = 0, root2 = 0;

        if (D < 0) {
            System.out.println("Нет вещественных корней.");
        }
        else if (D == 0) {
            root1 = ( (-1) * b_val ) /  ( 2 * a_val );
            System.out.println("Один корень = " + root1);
        }
        else {
            root1 = ( (-1) * b_val + (Math.sqrt(D)) ) / ( 2 * a_val );
            root2 = ( (-1) * b_val - (Math.sqrt(D)) ) / ( 2 * a_val );
            System.out.println("Первый корень = " + root1);
            System.out.println("Второй корень = " + root2);
        }

    }

    public static void task_four() {

    }

    public static void task_five() {

    }

} // конец класса Main