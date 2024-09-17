package org.example;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void task_one() {
        ByteArrayOutputStream output_stream = new ByteArrayOutputStream();
        PrintStream primary_out = new PrintStream(output_stream);
        System.setOut(primary_out);

        Main.task_one(); // весь вывод метода запишется в output_stream

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

        String fin_output = output_stream.toString();
        System.out.println("....");
    }

    @Test
    void task_two() {
    }

    @Test
    void task_three() {
    }

    @Test
    void task_four() {
    }

    @Test
    void task_five() {
    }
}