package testsuite_herokuapp;

import browserfactory.herokuapp.BaseTest_herokuapp;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest_herokuapp {
    String baseurl = "http://the-internet.herokuapp.com/login";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void UserShouldLoginSuccessfullyWithValidCredential() {
        //enter username
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='username']"));
        usernameField.sendKeys("tomsmith"); //sendkey to username
        //enter password
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        passwordField.sendKeys("SuperSecretPassword!"); //sendkey to password
        //click login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        //verify text area
        WebElement secureText = driver.findElement(By.linkText(" Secure Area"));
        secureText.isDisplayed();
    }

    @Test
    public void verifyTheUserNameErrorMessage() {
        //enter username
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='username']"));
        usernameField.sendKeys("tomsmith1"); //sendkey to username
        //enter password
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        passwordField.sendKeys("SuperSecretPassword!"); //sendkey to password
        //click login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        //verify error message
        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='flash error']"));
        errorMessage.getText();
    }

    @Test
    public void verifyThePasswordErrorMessage() {
        //enter username
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='username']"));
        usernameField.sendKeys("tomsmith"); //sendkey to username
        //enter password
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        passwordField.sendKeys("SuperSecretPassword"); //sendkey to password
        //click login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        //verify error message
        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='flash error']"));
        errorMessage.getText();

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
