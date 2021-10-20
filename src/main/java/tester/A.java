package tester;


public class A {

    String name;
    int score;
    private Object obj;

    public A() {
        C b = new C();
        name = "argument";
        obj = b;
    }


    public Object getDate() {
        return obj;
    }

    public void setDate(Object obj) // Parameter's
    {
        this.obj = obj;
    }
}

