package co.za.takemuch.webportal.methods_encapsulations;

import java.time.LocalDateTime;
import java.util.ArrayList;


/**
 * @author King
 */

public class Method_1 {

    int args;
    LocalDateTime localDateTime;

//    Method_1(int args){
//        this.args = args;
//    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("id");
        arrayList.add("uuid");
        arrayList.add("name");

        ArrayList<String> g = getFN(arrayList);
        System.out.println(g);


        // Pass By Primitive Value
        Method_1 method_1 = new Method_1();
        System.out.println(method_1.args);
        method_1.modifyInt(method_1.args);
        System.out.println(method_1.args);

        //Pass by Object Reference
        LocalDateTime dateTime = LocalDateTime.now();
        method_1.ObjectRef(dateTime);
    }

    protected void main(Integer args, Double arg) {

    }

    private static Double main(Double arg,Integer args) {
        return (arg);
    }

    public void modifyInt(int args) {
        args +=1;
        System.out.println(args);
    }

    public void ObjectRef(LocalDateTime local) {
        System.out.println(local);
    }

    static ArrayList<String> getFN(ArrayList<String> arrayList) {
        return arrayList;
    }
}
