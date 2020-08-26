package Tests;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.SecureAreaPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class LoginTests extends BaseTest {

    @Test
    public void testSuceesfullLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setUsername("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        secureAreaPage.getAlertText();
        assertTrue(secureAreaPage.getAlertText()
                .contains("You logged into a secure area!"));

    }


}
