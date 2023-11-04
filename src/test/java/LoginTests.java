import Pages.HomePage;
import Pages.LogInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {

    @Test
    public void validLogin(){
        homePage = new HomePage(driver);
        homePage.openLogInPage();
        logInPage = new LogInPage(driver);
        logInPage.setEmail("user3@gmail.com");
        logInPage.setPassword("user0001");
        logInPage.clickLoginButton();
        WebElement logouticon = driver.findElement(By.xpath("//a[@class=\"ico-logout\"]"));
        Assert.assertTrue(logouticon.isDisplayed(),"Login was unsuccessful");

    }


    @Test
    public void inValidLogin(){
        homePage = new HomePage(driver);
        homePage.openLogInPage();
        logInPage = new LogInPage(driver);
        logInPage.setEmail("user1@gmail.com");
        logInPage.setPassword("user0001");
        logInPage.clickLoginButton();
        WebElement errorMassage = driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]"));
        Assert.assertTrue(errorMassage.isDisplayed(),"Login was successful");

    }




}
