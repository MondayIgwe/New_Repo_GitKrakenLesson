package inheritance;

import org.openqa.selenium.WebDriver;

public class Manager extends Employee{

    String name;

    Manager(WebDriver driver){
        super(driver);
    }

    @Override
    public void accessDBA() {

    }

    @Override
    public void accessProjectResources() {

    }

    @Override
    public void meetingInvites() {

    }

    protected int teamSize;

    public void reportProjectStatus(){
        this.name = "derived class";
        super.name = "Super class, Parent class, Base Class";
    }

    public void main() {

    }
}
