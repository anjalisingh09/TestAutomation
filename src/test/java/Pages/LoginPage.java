package Pages;

import Base.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Driver{

//    private WebDriver driver;
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("#login button");

//    public LoginPage(WebDriver driver) {
//        this.driver = driver;
//    }

    public void setUsername(String username){
        Driver.getDriver().findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password){
        Driver.getDriver().findElement(passwordField).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton(){
        Driver.getDriver().findElement(loginButton).click();
        return new SecureAreaPage(Driver.getDriver());
    }
}
