package Pages;

import Base.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Driver {

//    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");
//    public HomePage(WebDriver driver){
//        this.driver = driver;
//    }

    public LoginPage clickFormAuthentication(){
        Driver.getDriver().findElement(formAuthenticationLink).click();
//        return new LoginPage(Driver.getDriver());
        return new LoginPage();
    }
}
