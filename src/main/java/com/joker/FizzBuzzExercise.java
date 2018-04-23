package com.joker;

/**
 * @Author Joker
 * @Description
 * @Date Create in 下午3:46 2018/4/23
 */
public class FizzBuzzExercise {

    public void fizzBuzz(int n) {
        String temp;
        for (int i = 1; i <= n; i++) {
            temp = "";
            temp += getFizz(i);
            temp += getBuzz(i);
            if (temp.length() == 0)
                temp = String.valueOf(i);
            System.out.println(temp);

        }
    }

    private String getFizz(int num) {
        return isMultipleOfThree(num) ? "Fizz" : "";
    }

    private String getBuzz(int num) {
        return isMultipleOfFive(num) ? "Buzz" : "";
    }

    private boolean isMultipleOfThree(int num) {
        return num % 3 == 0;
    }

    private boolean isMultipleOfFive(int num) {
        return num % 5 == 0;
    }
}
