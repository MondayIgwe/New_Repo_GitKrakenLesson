package co.za.takemuch.webportal.Logical_Operators;

import java.util.ArrayList;

public class A {
    public static void main(String[] args) {
        Double dd = 2.2D;

        if (dd.compareTo(2.2) == 0){
            System.out.println(dd.compareTo(Double.valueOf(2.2)));
        }


        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(2.2);
        arrayList.add(2.2);
        arrayList.add(2.2);

        try {
            Double total = 0.0;

            System.out.println(arrayList.get(2));

            for (Double d : arrayList){
                total +=d;
                System.out.println(total);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
