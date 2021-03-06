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
        getTopIsoscelesTriangle(n, space, num);
    }

    public void diamond(int n) {
        int space = n - 1;
        int num = 1;
        getTopIsoscelesTriangle(n,space,num);
        space = 1;
        num = (n - 1) * 2 - 1;
        getBottomIsoscelesTriangle(n, space, num);
    }


    public void diamondWithName(int n, String bill) {
        int space = n - 1;
        int num = 1;
        getTopIsoscelesTriangle(n - 1,space,num);
        System.out.println(bill);
        space = 1;
        num = (n - 1) * 2 - 1;
        getBottomIsoscelesTriangle(n, space, num);
    }


    private void getTopIsoscelesTriangle(int n, int space, int num) {
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

    private void getBottomIsoscelesTriangle(int n, int space, int num) {
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            space++;
            num -= 2;
            System.out.println();
        }
    }
}
