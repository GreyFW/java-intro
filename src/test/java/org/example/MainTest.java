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

    @Test
    public void Test_task_two() {
        String result = Main.task_two();

        assertEquals("llatsni ekam", result);
    }

    @Test
    void task_three() {
        String result;

        result = Main.task_three(1, -5, 9);
        assertEquals("Нет вещественных корней.", result);

        result = Main.task_three(1, -4, 4);
        assertEquals("Один корень = " + 2, result);

        result = Main.task_three(1, 3, -4);
        assertEquals("Первый корень = " + (-4) + ", второй корень = " + 1, result);
    }

    @Test
    void task_four() {
        double result;

        result = Main.task_four();
        assertEquals(0.610112, result, 1.0E-6);
    }

    @Test
    void task_five() {

        assertTrue(Main.task_five("A roza upala na lapu Azora"));

        assertFalse(Main.task_five("weriojfowe121DFEWF"));
    }

} // конец MainTest