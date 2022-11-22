package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.UtilityOrangeHRMLive;

public class LoginTest extends UtilityOrangeHRMLive {
    @Before
    public void launchBrowser() {
        //open browser and launch URL
        openBrowser("https://opensource-demo.orangehrmlive.com/");
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // Enter “Admin” username
        sendTextToElement(By.xpath("//input[@name='username']"), "Admin");
        // Enter “admin123“ password
        sendTextToElement(By.xpath("//input[@name='password']"), "admin123");
        // Click on ‘LOGIN’ button
        clickOnElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
        //expected text
        String expectedMessage = "Dashboard";
        //get actual message
        String actualMessage = getTextFromElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
        // Verify the ‘Dashboard’ text is displayed
        Assert.assertEquals("Not on dashboard", expectedMessage, actualMessage);

    }

    @After
    public void tearDown() {
        //quit the browser
        closeBrowser();
    }
}
