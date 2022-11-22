package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    //WebDriver defined as public static to allow access from other packages
   public static WebDriver driver;
    public void openBrowser(String baseUrl){
        //set key to value of driver location
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        //create object for WebDriver
        driver = new ChromeDriver();
        //launch URL
        driver.get(baseUrl);
        //maximize window
        driver.manage().window().maximize();
        //set timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public void closeBrowser(){
        //close browser
        driver.quit();
    }
}
