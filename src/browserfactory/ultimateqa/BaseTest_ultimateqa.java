package browserfactory.ultimateqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest_ultimateqa {
    public static WebDriver driver;

    public void openBrowser(String baseurl) {

        ChromeOptions options = new ChromeOptions(); //setting webdriver
        driver = new ChromeDriver(options);
        driver.get(baseurl);
        driver.manage().window().maximize(); //maximize browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void closeBrowser() {
        driver.quit();
    }
}