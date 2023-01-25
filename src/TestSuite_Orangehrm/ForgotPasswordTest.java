package TestSuite_Orangehrm;

import browserfactory.orangehrmlive.BaseTest_orange;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest_orange {
    String basaeurl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @Before
    public void setUp() {
        openBrowser(basaeurl);
    }

    @Test
    public void UserShouldNavigateToForgotPasswordPageSuccessfully() {
        //click on forgot password link
        WebElement forgotPassword = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        forgotPassword.click();
        //verify forgot password is not coming instead comes reset password
    }

    @After
    public void tearDown() {
        closeBrowser();
    }


}
