package com.joker;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * @Author Joker
 * @Description
 * @Date Create in 下午3:47 2018/4/23
 */
public class DiamondExercisesTest {
    private DiamondExercises diamondExercises;
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setup() {
        System.setOut(new PrintStream(outContent));
        diamondExercises = new DiamondExercises();
    }

    @Test
    public void isosceles_triangle_test() {
        String result = "  *\n ***\n*****\n";
        diamondExercises.isoscelesTriangle(3);
        assertEquals(systemOut(),result);
    }

    private String systemOut() {
        return outContent.toString();
    }

}