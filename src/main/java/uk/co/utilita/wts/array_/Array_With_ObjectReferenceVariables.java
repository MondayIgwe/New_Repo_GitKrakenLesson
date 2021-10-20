package uk.co.utilita.wts.array_;

import java.util.Arrays;

public class Array_With_ObjectReferenceVariables {

    public static void main(String[] args) {
        Array_With_ObjectReferenceVariables obj = new Array_With_ObjectReferenceVariables();

//        String[][] names = new String[5 % 2][]; //memory allocation
//        names[0][0] = "id";
//        names[0][1] = "John";
//        System.out.println(names[0][1]);


        String[] items = {};

        String[] scores = new String[]{"id", "uuid", String.valueOf(200)};
        System.out.println(Arrays.toString(scores));

        // Two Dimension Array
        obj.towDimension();

        obj.arrayFn();
    }

    void towDimension() {
        int row = 5;
        int column = 5;

        Object[][] obj = new String[row][column];
        obj[0][0] = 22;
        obj[0][1] = 25;
        obj[0][2] = 52;
        obj[0][3] = 33;
        obj[0][4] = 45;

        for (int r = 0; r < obj.length; r++) {
            for (int col = 0; col < obj[r].length; col++) {
                obj[r][col] = r + col;
                System.out.println(obj[r][col]);
            }
        }

    }

    void arrayFn() {
        String[] arr = new String[2];

        arr[0] = "200";
        arr[1] = "50";

        for (int x = 0; x < arr.length; x++) {
            arr[x] = new String("Hello " + x);
            System.out.println(arr[x]);
        }
    }
}
