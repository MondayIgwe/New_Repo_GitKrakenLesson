package uk.co.utilita.wts.strings;

public class Stringss_ {


    public static void main(String[] args) {

        String letters = "ABCAB";
        System.out.println(letters.contains("AB"));
        System.out.println(letters.substring(0, 2).startsWith("A"));

        String exam = "OCA" + "OCP" + "JAMB";
        System.out.println(exam + " " + letters);

        int num = 20, val = 20;
        String anotherStr = "" + (num + val);
        String anotherStr1 = "" + num + val;
        String anotherStr2 = num + val + letters;
        String anotherStr3 = val + letters + num;
        System.out.println("index 0 String: " + anotherStr);
        System.out.println("First String: " + anotherStr1);
        System.out.println("SECOND String: " + anotherStr2);
        System.out.println("Third String: " + anotherStr3);


        // +=
        String lang = "java";
        lang += " is every is cool";
        System.out.println(lang);

    }

    static class AnotherClass {

        public boolean equals_(Object anObj){
            if (this == anObj){
                return true;
            }

            if(anObj instanceof String){
                String anotherStr = (String) anObj;
            }
            return Boolean.TRUE;
        }
    }
}
