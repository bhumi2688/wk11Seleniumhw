package testsuite_nopcommerce;

import browserfactory.nopcommerce.BaseTest_nopcommerce;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest_nopcommerce {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigatetoComputersPageSuccessfully() {
        //computer tab
        driver.findElement(By.linkText("Computers")).click(); //will click on computer tab
        //verify computer text
        WebElement computerText = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        computerText.getText();
    }

    @Test
    public void userShouldNavigatetoElectronicsPageSuccessfully() {
        //electronics tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href=\"/electronics\"]")).click();
        // verify Electronics text
        WebElement electronicText = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        electronicText.getText();
    }

    @Test
    public void userShouldNavigatetoApparelPageSuccessfully() {
        //click on Apparel tab
        driver.findElement(By.linkText("Apparel")).click();
        //verify apparel text
        WebElement apparelText = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        apparelText.getText();
    }

    @Test
    public void userShouldNavigatetoDigitalDownloadsPageSuccessfully() {
        //click on digital download tab
        driver.findElement(By.linkText("Digital downloads")).click();
        //verify digitalDownload text
        WebElement digitalDownloadtext = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        digitalDownloadtext.getText();
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //click on books tab
        driver.findElement(By.linkText("Books")).click();
        //verify books text
        WebElement booksText = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        booksText.getText();
    }

    @Test
    public void userShouldNavigatetoJewelryPageSuccessfully() {
        //click on jewelry tab
        driver.findElement(By.linkText("Jewelry")).click();
        //verify jewelry text
        WebElement jewelryText = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        jewelryText.getText();
    }

    @Test
    public void userShouldNavigatetoGiftCardsPageSuccessfully() {
        //click on gift cards tab
        driver.findElement(By.linkText("Gift Cards")).click();
        //verify gift card text
        WebElement giftCardText = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        giftCardText.getText();
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
