package tester;

public class C {
    int score, figure;

    public void getStuffs() {
        A a = new A();
        a.setDate("arguments");
        Object o = a.getDate();
        System.out.println(o);
        System.out.print(5 / 10 + "\n");
        System.out.print(6 % 10);
    }

    public static void main(String[] args) {
        new C().getStuffs();
    }
}
