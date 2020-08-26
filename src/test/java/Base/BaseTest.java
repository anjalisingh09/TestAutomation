package Base;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.List;

public class BaseTest extends Driver {
//    private WebDriver driver;
    protected HomePage homePage;

    @BeforeTest
    public void setUp(){

        Driver.getDriver().get("https://the-internet.herokuapp.com/");

        homePage = new HomePage();

//        driver.manage().window().maximize();
//        driver.manage().window().fullscreen();
//        driver.manage().window().setSize(new Dimension(375,812));

//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.size());
//
//        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
//        inputsLink.click();
//
//        System.out.println(driver.getTitle());
//          WebElement shiftingContentLink = driver.findElement(By.linkText("Shifting Content"));
//          shiftingContentLink.click();
//
//          WebElement menuElement = driver.findElement(By.linkText("Example 1: Menu Element"));
//          menuElement.click();
//
//          List<WebElement> elementCount = driver.findElements(By.tagName("li"));
//          System.out.println(elementCount.size());
    }
    @AfterTest
    public void tearDownn(){
        Driver.getDriver().quit();
    }

}
