package inheritance;

import base.WebDriver_Factory;
import org.openqa.selenium.WebDriver;

public abstract class Employee extends WebDriver_Factory {

    public Employee(WebDriver driver){
        super(driver);
    }

    // Pull Out common properties
    protected String name;
    protected String phone_number;
    protected String address;
    protected float experience;

    // Pull Out common behaviours
    public abstract void accessDBA();
    public abstract void accessProjectResources();
    public abstract void meetingInvites();


    public void empl() {
        //launch_driver()
        System.out.println("Employee base");
    }

    public static void emplo(int x) {
        System.out.println("Employee base");
    }

}
