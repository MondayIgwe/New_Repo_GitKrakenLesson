package co.za.takemuch.webportal.methods_encapsulations;

public class Method_2 extends Method_1{

    Method_2(int figure){
        //super(figure);
        System.out.println("Constructor blocks");
    }


    public static void main(String[] args) {

        Method_3 method = new Method_3();

        method.aFloat = 5.5f;

        int total = 0;
        
        for (int x =0; x < 5; ++x){
            total +=x;
        }
        System.out.println(total);
    }

}
