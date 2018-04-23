package com.joker;

/**
 * @Author Joker
 * @Description
 * @Date Create in 下午3:45 2018/4/23
 */
public class TriangleExercises {
    public void easiestExerciseEver() {
        System.out.print("*");
    }

    public void drawAHorizontalLine(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
    }

    public void drawAVerticalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    public void drawARightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
