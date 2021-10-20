package uk.co.utilita.wts.contacts.help;

import uk.co.utilita.wts.contacts.Protected_access_Modifier;
import uk.co.utilita.wts.homepage.Home;

import static uk.co.utilita.wts.homepage.Home.myHome;

public class A extends Protected_access_Modifier {
    A a;
    Protected_access_Modifier protected_access_modifier;

    public void main(String args) {
        a.protect = "derived class";
    }

    public static void main(String[] args) {
        Home home = new Home();
        home.myDouble2 = 2.0;
        myHome = "House";
        B b = new B();
        b.name = "book";

    }
}
