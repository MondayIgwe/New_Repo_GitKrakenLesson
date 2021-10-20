package tester;

import java.util.Map;

public class E {
    static Another another;
    static Another_Class another_class;
    static Another_Interface another_interface;

    public static void main(String[] args) {
        another = new Another();
        another_class = new Another_Class();

        another_interface = () -> {
        };

        another_interface.getStuff();
        final var url = Another_Interface.URL;
        System.out.printf("%s", url);

        E e = new E();
        Map<Boolean, Integer> map = null;

        // e.getLists_str(map.put(true, 3));
    }

    public void getLists_str(Map<Boolean, Integer> map) {
        int exam_total = 500;

        map.put(true, 8);
    }
}

class Another {

}

class Another_Class {

}

interface Another_Interface {
    public static final String URL = "HTTP";

    public abstract void getStuff();
}
