package com.joker;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author Joker
 * @Description
 * @Date Create in 下午3:48 2018/4/23
 */
public class PrimeFactorsExerciseTest {
    private PrimeFactorsExercise primeFactorsExercise;

    @Before
    public void setup() {
        primeFactorsExercise = new PrimeFactorsExercise();
    }

    @Test
    public void generateTest() {
        List<Integer> result2 = Arrays.asList(2, 3, 5);
        List<Integer> list1 = primeFactorsExercise.generate(1);
        List<Integer> list2 = primeFactorsExercise.generate(30);
        assertEquals(list1.size(), 0);
        assertEquals(list2,result2);
    }

}