package com.joker;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Joker
 * @Description
 * @Date Create in 下午3:46 2018/4/23
 */
public class PrimeFactorsExercise {
    public List<Integer> generate(int number) {
        if (number == 1)
            return new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int i = 2;
        while (number >= i) {
            if (number % i == 0) {
                number /= i;
                result.add(i);
                i = 2;
            } else {
                i++;
            }
        }
        return result;
    }
}
