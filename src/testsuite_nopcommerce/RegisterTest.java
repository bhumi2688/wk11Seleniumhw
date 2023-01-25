package testsuite_nopcommerce;

import browserfactory.nopcommerce.BaseTest_nopcommerce;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends BaseTest_nopcommerce {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterpageSuccessfully() {
        //click on register link
        driver.findElement(By.linkText("Register")).click();
        //verify register text
        WebElement registerText = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
        registerText.getText();
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //click on register link
        driver.findElement(By.linkText("Register")).click();
        //Select gender radio button
        WebElement gender = driver.findElement(By.xpath("//input[@value='F']"));
        gender.click(); //will click on gender
        //enter first name
        WebElement firstNameField = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstNameField.sendKeys("bhum");//sendkeys to first name
        //enter last name
        WebElement lastNameField = driver.findElement(By.id("LastName"));
        lastNameField.sendKeys("pati"); //send keys to last name

        //select day
        WebElement dropDownDate = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        Select select = new Select(dropDownDate);
        select.selectByValue("2");
        //select month
        WebElement dropDownmonth = driver.findElement(By.name("DateOfBirthMonth"));
        Select select1 = new Select(dropDownmonth);
        select1.selectByVisibleText("June");
        //enter Email
        WebElement emailField = driver.findElement(By.xpath("//input[@id='Email']"));
        emailField.sendKeys("bhupa@yahoo.com"); //send keys to email
        //enter password
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='Password']"));
        passwordField.sendKeys("Test4567"); //send keys to password
        //enter confirm password
        WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPassword.sendKeys("Test4567");
        //click on register button
        WebElement registerButton = driver.findElement(By.xpath("//button[@id='register-button']"));
        registerButton.click();
        //verify text 'Your registration completed
        WebElement registerComplete = driver.findElement(By.className("result"));
        registerComplete.getText();

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
