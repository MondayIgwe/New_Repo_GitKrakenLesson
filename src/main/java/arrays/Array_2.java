package arrays;

import java.util.List;

public class Array_2 {

    public static void main(String[] args) {
        Array_2 array_2 = new Array_2();
        array_2.fN();
    }

    void fN() {
        int[] ints = null;

        ints = new int[6];

        try {
            ints[0] = 100;
            ints[1] = 200;
            ints[2] = 300;
            ints[3] = 400;
            ints[4] = 500;
            ints[5] = 600;


            for (int x : ints) {
                System.out.print(List.of(x));
                System.out.println(x);
            }
            //================
            String[][] items = {
                    {"user", "pass"},
                    {"me@gamial.com", "pas1dme!@#"}
            };

            for (String[] rows : items) {
                for (String cols : rows) {
                    System.out.println(cols);
                }
            }

            System.out.println("==================");
            for (int x = 0;x<= items.length;x++){
                for (int j = 0; j<items[x].length; j++){
                    System.out.println(items[x][j]);
                }
            }
        } catch (ArrayIndexOutOfBoundsException ar) {
            System.out.println("\n" + ar.getLocalizedMessage());
        }
    }
}
