package co.za.takemuch.webportal.Logical_Operators;

public class Logical {
    static int a, b, c;

    public static void main(String[] args) {
        a = 10;
        b = 20;
        System.out.println(!(a > b));
        System.out.println(a > b || b < a);
        System.out.println(a++ > 10 || ++b > 19);
        System.out.println((2 + 3) - 4 * 5);
    }
}
