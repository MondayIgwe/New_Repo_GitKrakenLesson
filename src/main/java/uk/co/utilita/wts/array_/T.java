package uk.co.utilita.wts.array_;

public class T extends Array_Abstract_Class implements Arrays_Interface {

    @Override
    public void getTime() {

    }

    Object generics(){
        Object[] objects = new Object[]{
                new java.util.Random[5],
                new java.text.SimpleDateFormat[2],
                new T[4],
                new String[3],
                new Integer[4]
        };
        return objects;
    }
    public static void main(String[] args) {
        Arrays_Interface[] arrays_interfaces = new Arrays_Interface[]{
                new T(),
                null,

        };
        System.out.println(arrays_interfaces[0]);


        Array_Abstract_Class[] array_abstract_classes = new Array_Abstract_Class[]{
          new T(),
          null
        };

        System.out.println(array_abstract_classes[0]);

        for (Array_Abstract_Class ar: array_abstract_classes){
            System.out.println(ar);
        }
    }
}
