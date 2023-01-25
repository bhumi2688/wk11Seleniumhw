package TestSuite_Orangehrm;

import browserfactory.orangehrmlive.BaseTest_orange;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest_orange {
    String baseurl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @Before
    public void Setup() {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredential() {
        //enter username
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("Admin"); //sendkey to username
        //enter password
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("admin123"); //sendkey to password
        //click on login button
        WebElement loginClick = driver.findElement(By.xpath("//button[@type='submit']"));
        loginClick.click();
        //welcome message
        //the site gets opened but theres no message of welcome
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
