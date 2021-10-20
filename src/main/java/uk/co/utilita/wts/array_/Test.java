package uk.co.utilita.wts.array_;

public class Test {

    public static void main(String[] args) {
//        // First Array Approach
//        int[] x = new int[5 + 1];
//        x[0] = 5;
//
//        int[][] z = new int[2][];
//        z[0][0] = 55;

        char[] chars;
        chars = new char[]{};

        char[] cc = {};

        // Second Approach
        String[] str = {};

        String[][] name = {
                {"id", "first_name", "last_name"},
                {"2303", "joel", "brown"}
        };
        // System.out.println(name[1][2]);

        for (String[] row : name) {
            for (String col : row) {
                if (col.equalsIgnoreCase("joel"))
                    System.out.println(col);
            }
        }
    }
}
