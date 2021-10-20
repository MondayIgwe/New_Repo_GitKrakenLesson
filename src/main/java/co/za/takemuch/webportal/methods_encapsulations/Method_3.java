package co.za.takemuch.webportal.methods_encapsulations;

import java.time.LocalDateTime;

public class Method_3 {

    public Method_3() {

    }

    int x;
    double aDouble;
    float aFloat; //Instance variables
    String string = "str1";
    static LocalDateTime localDateTime; // Class variables

    public static void main(String[] args) {
        localDateTime = null;

        Method_3 method_3 = new Method_3();
        method_3.aDouble = 2.2d;

        System.out.println("First: " + method_3);

        method_3 = null;        //garbage collected

        method_3 = new Method_3();
        System.out.println("Second: " + method_3);

        method_3.caller(2.2f, 1, 2, 3, 4, 5, 6, 7, 8);

    }

    public void setX(int x) // Method Parameter
    {
        float aFloat = 2.2f; //local variable
        this.x = x;
    }

    static public void getFnn() {
        localDateTime.getChronology();
    }

    float callee(float f) {

        try {
            String string = "str2";
            return aFloat;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return 0.0f;
    }

    public void caller(float aFloat, int... ays) {

        try {
            double avg = 0;
            float score = 0.0f;
            Method_1 method_1 = null;
            System.out.println(method_1);
            float call = callee(aFloat);
            System.out.println(call + "" + ays.length);
        } catch (NullPointerException nullPointerException) {
            System.out.println(nullPointerException.getMessage());
        }


    }

}
