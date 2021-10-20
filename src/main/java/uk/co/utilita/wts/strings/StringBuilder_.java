package uk.co.utilita.wts.strings;

import java.util.Random;

public class StringBuilder_ {

    private StringBuilder generator() {
        StringBuilder builder1 = new StringBuilder(100); //hold a capacity of hundred characters

        Random random = new Random();

        char[] chars = new char[]{'j','a','v','a'};

        String gene = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder builder = new StringBuilder(gene);

        if (builder.length() > 0) {
            builder.charAt(0);
            builder.append("book");
            builder.append(chars);
            builder.append(new Another_Class("Oracles"));
            random.nextInt(builder.length());

            char[] am = {'J','a','v','a'};

            builder.insert(0, am, 1,3);
        }
        return builder;
    }

    public static void main(String[] args) {
        StringBuilder_ build = new StringBuilder_();
        System.out.println(build.generator());


    }
}
class Another_Class{

    String name;
    int score, val, num;
    public Another_Class(String name){
        this.name = name;
    }

    private void toString_(){
        System.out.println("1540444".toString());
    }
}