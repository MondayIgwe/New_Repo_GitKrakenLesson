package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/*
    All common properties and behaviours must be defined here
 */
public abstract class WebDriver_Factory {


    WebDriver driver;

    public WebDriver_Factory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebDriver launch_driver(String browser) {

        switch (browser) {
            case "chrome":
                System.getProperty("webdriver.driver.chrome", "");
                System.out.println("launching '" + browser + "' browser");
                break;
            default:
                System.out.println("[ Error ] Invalid browser type ");
                break;
        }
        return driver;
    }

}
