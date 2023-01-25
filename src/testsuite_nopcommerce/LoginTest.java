package testsuite_nopcommerce;

import browserfactory.nopcommerce.BaseTest_nopcommerce;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest_nopcommerce {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void usershouldNavigatetoLoginPageSuccessfully() {
        //click on login link
        WebElement loginLink = driver.findElement(By.className("ico-login"));
        loginLink.click();
        //verify login link
        WebElement welcomeMsg = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualText = welcomeMsg.getText();
        String expectedText = "Welcome, Please Sign In!";
        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredential() {
        //click on login link
        WebElement loginLink = driver.findElement(By.xpath("//a[text()='Log in']"));
        loginLink.click();

        //enter email id into email field
        WebElement emailIdField = driver.findElement(By.id("Email"));
        emailIdField.sendKeys("sap@yahoo.com");

        //enter password into password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("Test4567");

        //click on login button
        WebElement loginLink1 = driver.findElement(By.xpath("//button[text()='Log in']"));
        loginLink1.click();

        //varify text
        WebElement logoutLink = driver.findElement(By.xpath("//a[text()='Log out']"));
        String actualText = logoutLink.getText();
        String excpectedText = "Log out";
        Assert.assertEquals(excpectedText, actualText);

    }

    @Test
    public void verifyTheErrorMessage() {
        //click on login link
        WebElement loginLink = driver.findElement(By.className("ico-login"));
        loginLink.click();
        //enter invalid emailId
        WebElement emailIdField = driver.findElement(By.id("Email"));
        emailIdField.sendKeys("cute.tes@gmail.com");
        //enter password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("123456");
        //click on login button
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();
        //error message
        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        errorMessage.getText();

    }

    @After
    public void tearDown() {
        closeBrowser();
    }


}
