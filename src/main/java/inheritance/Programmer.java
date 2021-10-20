package inheritance;

import org.openqa.selenium.WebDriver;

public class Programmer extends Employee{

    public Programmer(WebDriver driver){
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

    private String[] programming_languages;

    public void writeCode(){

    }

    public void accessBaseClassMembers(){
        name = "Programmer";
    }

    @Override
    public void empl() {
        System.out.println("Programmer subclass");

    }

}
