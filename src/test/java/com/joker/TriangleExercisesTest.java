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
    public void easiest_exercise_ever_test() {
        String reuslt = "*";
        triangleExercises.easiestExerciseEver();
        assertEquals(systemOut(),reuslt);
    }

    @Test
    public void draw_a_horizontal_line_test() {
        String result = "********";
        triangleExercises.drawAHorizontalLine(8);
        assertEquals(systemOut(),result);
    }


    private String systemOut() {
        return outContent.toString();
    }


}