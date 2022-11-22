package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UtilityOrangeHRMLive extends BaseTest {
    public void clickOnElement(By by) {
        //find element to click
        WebElement link = driver.findElement(by);
        //click element
        link.click();
    }

    public void sendTextToElement(By by, String text) {
        //Find the field to type in
        WebElement field = driver.findElement(by);
        //Type in field
        field.sendKeys(text);
    }

    public String getTextFromElement(By by) {
        //find the field where the desired text is
        WebElement actualMessageElement = driver.findElement(by);
        //return the WebElement as text
        return actualMessageElement.getText();
    }
}
