package uk.co.utilita.wts.strings;

import java.util.Date;

public class String_Test {

    public static void main(String[] args) {

        // String Constant Pool comparison
        String name = "Java";
        String last_name = "Java";

        System.out.println("Compares values in string pool:  " + name.equals(last_name));
        System.out.println(name == last_name);

        // String Compares Object Reference Memory address
        String first_name = new String("john");
        String las_name = new String("john");
        System.out.println("Memory address 1: " + first_name.equals(las_name));
        System.out.println("Memory address 2: " + first_name == las_name);
        System.out.println(first_name != las_name);

        ////////////====================/////////////
        Object bool = (String) new String_Test().compare(Integer.getInteger("22"));
        System.out.println(bool);
    }
    Object compare(Object date){
        if (this == date){
            return date;
        }
        return date;
    }
}
