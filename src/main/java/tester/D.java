package tester;

/**
 * @author Monday Igwe
 * @version 2.0
 *
 */
public class D {

    public static void main(String args) {
        // Unsigned number, holds positive or negative
        char a = 'a'; // 16

        // signed number, holds positive or negative
        byte b = -128;
        short s = 16;
        int i = 32;
        long l = 65462464644L;

        float f = -2.2f;
        double d = 5.65;

        boolean b1 = false;


        // Wrapper Classes
        // Object variable
        Boolean bool = true;

        Character character = 'c';
        Integer ii = 200;
        Float ff = 45.2f;
        Double dd = 455.2;
        Long ll = 624448644846L;
        Byte bbb = 25;

        // Object References
        b1 = bool.booleanValue();
        byte byteValue = ll.byteValue();
    }

    public static void main1(String args) {
        // Object variable
        Integer integer = 500;
        String argsd = "argument";
        Character character = 'k';

        System.out.println(integer);
    }

    public static void main(String[] args) {
        main1("argument");
        try {
            int i = Integer.parseInt("25");
            System.out.println(i);

            char a = '\uabcd';
            char b = 'A';
            char c = 22;
            char cc = (char) -22;
            long lL = 83092600000L;
            System.out.printf("%s %s %c %c %d", a, b, c, cc, lL);
        }catch (NumberFormatException es){
            System.out.println(es.getMessage());
        }
    }
}
