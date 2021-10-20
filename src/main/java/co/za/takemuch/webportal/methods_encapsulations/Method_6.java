package co.za.takemuch.webportal.methods_encapsulations;

import java.util.Date;

public class Method_6 {

    private String my_private_variable;
    static Method_5 method_5;

    public static void main(String[] args) {
        method_5 = new Method_5();

        method_5.setPrice(20.5);
        double price = method_5.getPrice();
        System.out.printf("%f", price);

        method_5.callee(5, new Date());
    }
}
