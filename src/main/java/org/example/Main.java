package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Введите номер задания: ");
        int task_n;

        if(scnr.hasNextInt()) {
            task_n = scnr.nextInt();
        } else {
            System.out.println("Некорректный ввод.");
            return;
        }

        switch (task_n) {
            case 1: {
                List<String> answer = new ArrayList<>();
                answer = task_one();
                break;
            }
            case 2: {
                String answer;
                answer = task_two();
                break;
            }
            case 3: {
                System.out.println("Введите коэффициенты квадратного уравнения.");
                double a_v, b_v, c_v;

                System.out.print("a = ");
                if(scnr.hasNextDouble()) {
                    a_v = scnr.nextDouble();
                } else {
                    System.out.println("Некорректный ввод.");
                    return;
                }

                System.out.print("b = ");
                if(scnr.hasNextDouble()) {
                    b_v = scnr.nextDouble();
                } else {
                    System.out.println("Некорректный ввод.");
                    return;
                }

                System.out.print("c = ");
                if(scnr.hasNextDouble()) {
                    c_v = scnr.nextDouble();
                } else {
                    System.out.println("Некорректный ввод.");
                    return;
                }

                String answer;
                answer = task_three(a_v, b_v, c_v);

                break;
            }
            case 4: {
                double result = task_four();
                break;
            }
            case 5: {
                System.out.println("Введите строку для проверки на палиндромность: ");
                scnr.nextLine();
                
                String user_input = scnr.nextLine();
                boolean result = task_five(user_input);
                break;
            }
            default: {
                System.out.print("Нет задания с таким номером.");
                break;
            }
        }
    }

    public static List<String> task_one() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i <= 500; i++) {
            if ((i % 5 == 0) && (i % 7 == 0)) {
                result.add("fizzbuzz");

                System.out.println("fizzbuzz");
            }
            else if (i % 5 == 0) {
                result.add("fizz");

                System.out.println("fizz");
            }
            else if (i % 7 == 0) {
                result.add("buzz");

                System.out.println("buzz");
            }
            else {
                result.add(String.valueOf(i));

                System.out.println(i);
            }
        }
        return result;
    }

    public static String task_two() {
        String str = "make install";
        int length = str.length() - 1;

        StringBuilder str_reversed = new StringBuilder();
        for (int i = length; i >= 0; i--) {
            str_reversed.append(str.charAt(i));
        }
        System.out.println(str_reversed);

        return str_reversed.toString();
    }

    public static String task_three(double a_val, double b_val, double c_val) {

        double D = b_val * b_val - 4 * a_val * c_val;
        double root1, root2;

        if (D < 0) {
            System.out.println("Нет вещественных корней.");

            return ("Нет вещественных корней.");
        }
        else if (D == 0) {
            root1 = ( (-1) * b_val ) /  ( 2 * a_val );
            System.out.println("Один корень = " + root1);

            return ("Один корень = " + root1);
        }
        else {
            root1 = ( (-1) * b_val + (Math.sqrt(D)) ) / ( 2 * a_val );
            root2 = ( (-1) * b_val - (Math.sqrt(D)) ) / ( 2 * a_val );
            System.out.println("Первый корень = " + root1);
            System.out.println("Второй корень = " + root2);

            return ("Первый корень = " + root1 + ", второй корень = " + root2);
        }
    }

    public static double task_four() {
        double yps = 1.0E-6, summa = 0.0, element;
        int n = 2;
        do {
            element = 1.0 / ( n*n + n - 2);
            n++;
            summa += element;
        } while (Math.abs(element) >= yps);

        System.out.println("Сумма ряда = " + summa);
        return summa;
    }

    public static boolean task_five(String input) {

        String formatted_str = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int length = formatted_str.length();
        int start, end;

        for (int i = 0; i < length / 2; i++) {
            start = i;
            end = length - i - 1;
            char ltr_r = formatted_str.charAt(end);
            char ltr_l = formatted_str.charAt(start);
            if (ltr_r != ltr_l) {
                System.out.println("Строка не палиндром.");
                return false;
            }
        }
        System.out.println("Строка палиндром.");
        return true;
    }

}
