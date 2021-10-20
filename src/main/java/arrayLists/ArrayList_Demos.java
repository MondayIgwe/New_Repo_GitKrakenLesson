package arrayLists;


import java.sql.Time;
import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList_Demos {

    Time time;
    ArrayList_Demos(Time time){
        this.time = time;
    }

    public static void main(String[] args) {
        ArrayList_Demos demos = new ArrayList_Demos(new Time(20000));

        System.out.println(demos.arrayListDemo().get(0));
    }

    private ArrayList<Object> arrayListDemo(){
        ArrayList<Object> arrayList = new ArrayList<>(20);
        arrayList.add("id");
        arrayList.add(3);
        arrayList.set(1, "New guy");


        ListIterator<Object> iterator = arrayList.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        return arrayList;
    }
}
