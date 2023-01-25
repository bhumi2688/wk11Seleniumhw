package testsuite_saucedemo;

import browserfactory.saucedemo.BaseTest_saucedemo;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginTest extends BaseTest_saucedemo {
    String baseurl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //enter username
        WebElement userNameField = driver.findElement(By.xpath("//input[@id='user-name']"));
        userNameField.sendKeys("standard_user"); //send key to username
        //enter password
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        passwordField.sendKeys("secret_sauce"); //send key to password
        //click on login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
        //verify text products
        WebElement textProducts = driver.findElement(By.xpath("//*[text()[contains(.,'Products')]]"));
        String actualText = textProducts.getText();
        String expectedText = "PRODUCTS";
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void verifyThatSixProductsAreDisplayedonThepage() {
        //enter username
        WebElement userNameField = driver.findElement(By.xpath("//input[@id='user-name']"));
        userNameField.sendKeys("standard_user"); //send key to username
        //enter password
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        passwordField.sendKeys("secret_sauce"); //send key to password
        //click on login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
        //verify six products are displayed
        WebElement sixDisplay = driver.findElement(By.xpath("//div[@class='inventory_list']"));
        sixDisplay.isDisplayed();


    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}

