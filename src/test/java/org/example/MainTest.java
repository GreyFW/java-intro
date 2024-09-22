package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void Test_task_one() {
        List<String> result = Main.task_one();
        assertEquals(501, result.size());

        assertEquals("1", result.get(1));
        assertEquals("fizzbuzz", result.get(35));
        assertEquals("fizz", result.get(5));
        assertEquals("buzz", result.get(7));
        // проверили что каждая часть цикла работает корректно
        }
    }

    @Test
    public void Test_task_two() {
    String result = Main.task_two();

    assertEquals("llatsni ekam", result);
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