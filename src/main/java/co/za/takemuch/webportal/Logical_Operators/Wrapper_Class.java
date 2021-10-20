package co.za.takemuch.webportal.Logical_Operators;

import java.io.Serializable;

public class Wrapper_Class implements Serializable {

    public static void main(String args) {
        int score = 2;
        int score1 = 2;
        String name = "name";
        String name1 = "name";

        Wrapper_Class wrapper_class = new Wrapper_Class();
        Wrapper_Class wrapper_class1 = new Wrapper_Class();

        if (wrapper_class == wrapper_class1){

        }else {
            System.out.println("Object references: "+ wrapper_class);
            System.out.println("Object references: "+ wrapper_class1);
        }



        if (name.equals(name1)){
            System.out.println("Boolean: " + Boolean.TRUE);
        }
    }

    void fN(){
        Integer integer = 25;
        new Character('a');
        new Boolean(true);
        new Boolean("true");
        Boolean.getBoolean("true");

        int x = new Integer(22);

        System.out.println(Boolean.FALSE);

        System.out.println(Double.valueOf(3.3));
        System.out.println(Double.parseDouble("3.3"));
        System.out.println(Integer.parseInt("22"));
    }

    public static void main(String[] args) {
        new Wrapper_Class().fN();
        main("Main");
    }
}
