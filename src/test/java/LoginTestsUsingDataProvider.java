import Pages.HomePage;
import Pages.LogInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestsUsingDataProvider extends BaseTests{

    @Test (dataProvider = "dataForLogin")
    public void login(String email, String password,String expectedResult){
        homePage = new HomePage(driver);
        homePage.openLogInPage();
        logInPage = new LogInPage(driver);
        logInPage.setEmail(email);
        logInPage.setPassword(password);
        logInPage.clickLoginButton();
        if (logInPage.isSuccessfulLogin()){

            logInPage.clickLogOutButton();

        }
        else {
            WebElement errorMassage = driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]"));
            Assert.assertTrue(errorMassage.isDisplayed(),"Login was successful");

        }
    }

    @DataProvider
    public Object[][] dataForLogin(){

        Object[][] data =new Object[3][2];
        data [0][0]="user3000@gmail.com";
        data [0][1]="user0001";


        data [1][0]="Test1hji@gmail.com";
        data [1][1]="test";


        data [2][0]="Test1xyw@gmail.com";
        data [2][1]="user0001";

        return data;
    }



    }




