package com.joker;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * @Author Joker
 * @Description
 * @Date Create in 下午3:48 2018/4/23
 */
public class TriangleExercisesTest {
    private TriangleExercises triangleExercises;
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setup() {
        System.setOut(new PrintStream(outContent));
        triangleExercises = new TriangleExercises();
    }

    @Test
    public void test_easiest_exercise_ever() {
        String reuslt = "*";
        triangleExercises.easiestExerciseEver();
        assertEquals(systemOut(),reuslt);
    }

    @Test
    public void test_draw_a_horizontal_line() {
        String result = "********";
        triangleExercises.drawAHorizontalLine(8);
        assertEquals(systemOut(),result);
    }

    @Test
    public void test_draw_a_vertical_line() {
        String result = "*\n*\n*\n";
        triangleExercises.drawAVerticalLine(3);
        assertEquals(systemOut(),result);
    }

    @Test
    public void test_draw_a_right_triangle() {
        String result = "*\n**\n***\n";
        triangleExercises.drawARightTriangle(3);
        assertEquals(systemOut(),result);
    }


    private String systemOut() {
        return outContent.toString();
    }


}