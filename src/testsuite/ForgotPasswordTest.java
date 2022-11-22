package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.UtilityOrangeHRMLive;

public class ForgotPasswordTest extends UtilityOrangeHRMLive {
    @Before
    public void launchBrowser() {
        //open browser and launch URL
        openBrowser("https://opensource-demo.orangehrmlive.com/");
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //click on forgot password
        clickOnElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        //define expected message
        String expectedMessage="Reset Password";
        //get actual message
        String actualMessage = getTextFromElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']"));
        //Verify expected and actual is the same
        Assert.assertEquals("Not on forgot password page", expectedMessage,actualMessage);
    }

    @After
    public void tearDown() {
        //quit browser
        closeBrowser();
    }
}
