package uk.co.utilita.wts.strings;

public class Strings_ {

    static String name;
    static String title;

    public static void main(String[] args) {
        // String pool
        String id1 = new String("myId");
        String id2 = "myId";

        System.out.println("memory 1: " + id1);
        System.out.println("memory 2: " + id2);
        System.out.println(id1 == id2); // compares  the heap memory address
        System.out.println(id1.equals(id2)); // compares the primitive literal values in stack memory


        name = "john"; // literal value of type of string
        title = "mr";

        char[] uuid = new char[]{'P', 'a', 'u', 'l'};
        String boy = new String(uuid);
        System.out.println(boy);

        Strings_ k = new Strings_();
        Strings_ result = k.fN().fnn();
        System.out.println(result);
    }

    Strings_ fN() {
        StringBuilder stringBuilder = new StringBuilder("String Builder");
        String str = new String(stringBuilder);
        StringBuffer stringBuffer = new StringBuffer(str);
        String buffer = new String(stringBuffer);
        System.out.println(buffer);
        return new Strings_();
    }

    Strings_ fnn() {
        String address = " entrepreneur ";

        char chartAt_ = address.charAt(0);
        System.out.println("chartAt : " + chartAt_);

        String substring_ = address.substring(2, 5);
        System.out.println("substring : " + substring_);

        String replace_ = address.replace('r', 'z');
        System.out.println("Replace: " + replace_);

        int index_ = address.indexOf('p');
        System.out.println("index_:" + index_);

        System.out.println(address.trim());

        for (int x = 0; x < address.length(); x++) {
            System.out.println("Length of the String: " + x);
        }

        boolean start = address.startsWith("en");
        boolean ends = address.endsWith("r");
        System.out.println(start);
        System.out.println(ends);


        // Method Chaining
        String result = "Sunday ".replace(' ', 'Z').trim().concat("King Igwe");
        System.out.println("Result :" + result);
        return this;
    }

}
