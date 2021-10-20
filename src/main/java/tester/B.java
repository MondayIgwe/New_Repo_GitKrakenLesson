package tester;

import java.util.Date;
import java.util.Random;

public class B extends A {
    B b = null;
    static Date date;
    static Random random;

    public B() {
        super();
    }

    void test() {
        date = new Date();
        Long time = date.getTime();

        b = new B();
        Object f = (String) b.getDate();
        A a = new A();
        A aa = new B();
        b.name = "id";
    }

    public static void main(String[] args) {
        random = new Random();
        int rand = random.nextInt(12);

        date = new Date();
        Long timeing = date.getTime();
        System.out.printf("%d %d",timeing, rand);
    }
}
