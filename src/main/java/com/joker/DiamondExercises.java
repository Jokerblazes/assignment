package com.joker;

/**
 * @Author Joker
 * @Description
 * @Date Create in 下午3:46 2018/4/23
 */
public class DiamondExercises {

    public void isoscelesTriangle(int n) {
        int space = n - 1;
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }

            space--;
            num+= 2;
            System.out.println();
        }
    }
}
