package uk.co.utilita.wts.array_;

public class Array_With_Primitives implements Arrays_Interface {

    public static void main(String[] args) {
        int[] i, x, d;
        double[] doubles, doubles1, dd, dollar;

        i = new int[]{1, 2, 3, 4, 5, 6, 7, 89};
        x = new int[9 / 3];
        d = new int[2 + 2];

        doubles1 = new double[2*3];
        doubles = new double[4 % 2];
        dd = new double[ 4 - 3];

        dollar = new double[Math.max(1, 5)];

    }

    void getInterface(Arrays_Interface arrays_interface) {
        arrays_interface.getTime();
    }

    @Override
    public void getTime() {
        int agge = Arrays_Interface.age;
    }
}
