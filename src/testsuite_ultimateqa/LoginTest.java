package testsuite_ultimateqa;

import browserfactory.ultimateqa.BaseTest_ultimateqa;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest_ultimateqa {
    String baseurl = "https://courses.ultimateqa.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldNavigatetoLoginPageSuccessfully() {
        //click on sign in link
        WebElement signInLink = driver.findElement(By.linkText("Sign In"));
        signInLink.click();
        //verify text welcome back
        WebElement welcomeMsg = driver.findElement(By.xpath("//h2[@class='page__heading']"));
        String actualText = welcomeMsg.getText();
        String expectedText = "Welcome Back!";
        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void verifyTheErrorMessage() {
        //click on sign in link
        WebElement signInLink = driver.findElement(By.linkText("Sign In"));
        signInLink.click();
        //enter invalid email
        WebElement emailField = driver.findElement(By.xpath("//input[@id='user[email]']"));
        emailField.sendKeys("bhupati@yaho.com"); //sendkey to email field
        //enter invalid password
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='user[password]']"));
        passwordField.sendKeys("Test1234"); //sendkey to password field
        //click on sign in button
        WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
        signInButton.click();
        //verify error message
        WebElement errorMessage = driver.findElement(By.xpath("//li[@class='form-error__list-item']"));
        errorMessage.getText();


    }


}
