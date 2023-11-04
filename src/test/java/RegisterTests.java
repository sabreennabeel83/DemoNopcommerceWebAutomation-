import Pages.BasePage;
import Pages.HomePage;
import Pages.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTests  extends BaseTests {

@Test
public void registertionTest(){
   homePage =new HomePage(driver);
  homePage.openRegisterPage();
    registerPage = new RegisterPage(driver);
    registerPage.setFirstName("first");
    registerPage.setLastName("last");
    registerPage.setEmail("user300@gmail.com");
    registerPage.setPassword("user0001");
    registerPage.setConfirmPassword("user0001");
    registerPage.setDateOfBirth("6","May","2008");
    registerPage.clickRegisterButton();
    WebElement registerconfirmetion  = driver.findElement(By.xpath("//div[@class=\"result\"]"));
    String actual =registerconfirmetion.getText();
    String expected ="Your registration completed";
    Assert.assertEquals(actual,expected, "actual not equal expected");





}





}
