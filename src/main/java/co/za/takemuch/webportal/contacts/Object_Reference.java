package co.za.takemuch.webportal.contacts;

import java.util.Date;
import java.math.BigInteger;
import org.openqa.selenium.chrome.ChromeDriver;
public class Object_Reference {

    java.sql.Date date;
    static Object_Reference reference;
    int sco;
    BigInteger bigInteger;

    public void main(String args) {
        sco = 200;
        bigInteger = new BigInteger("23545414164654154");
        System.out.println(bigInteger.abs() + "\n");
        System.out.println("Memory address: " + new Object_Reference());
    }

    public static void main(String[] args) {
        Object_Reference reference = new Object_Reference();
        reference.main("");
    }
}
