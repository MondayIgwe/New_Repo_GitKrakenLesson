package co.za.takemuch.webportal.methods_encapsulations;

import java.util.Date;

public class Method_5 extends Method_4{

    double price; //Object Field or Instance variable

    Method_5(){
        this(null, 3.2);
    }

    Method_5(String str, double d){

    }

    private Method_5(int x){

    }


    public double getPrice() { //accessor or read
        return price;
    }

    public void setPrice(double price) { //write or mutator
        this.price = price;
    }

    void callee(int x, Date date){
        System.out.println("258" + x + date);
    }

    public static void main(String[] args) {
        Method_5 method_5 = new Method_5();
        System.out.println(method_5);
    }
}
