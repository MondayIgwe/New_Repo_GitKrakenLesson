package com.oracle.javacert.certification;

public class Assignments_Operators {
    int s, x, y, z, score, num;

    void fN() {
        this.x = 3;
        s = x += z;
        System.out.printf("%d \n", s);

        score = 5;
        num = 5;
        System.out.printf("score: %d \n", ++score);

        System.out.printf("num: %d \n", num++);
        System.out.println("now increased : " + num);

    }

    public static void main(String[] args) {
        new Assignments_Operators().fN();
    }
}
