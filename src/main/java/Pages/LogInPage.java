package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage  extends BasePage{

    private By Email= By.id("Email");
    private By passward = By.id("Password");
    private By loginButton =By.xpath("//button[@class=\"button-1 login-button\"]");
    private By errorMassage =By.xpath("//div[@class=\"message-error validation-summary-errors\"]");
    private  By logOutButton = By.xpath("//a[@class=\"ico-logout\"]");


    public LogInPage(WebDriver driver){
        super(driver);
    }

    public void setEmail(String email){
        sendkeyToWebElement(Email,email);

    }
    public void setPassword(String Password){
        sendkeyToWebElement(passward,Password);

    }
     public void clickLoginButton(){
        clickOnWebElement(loginButton);
     }

     public String  getErrorMassage (){
        return  getTextFromWebElement(errorMassage);
     }

     public void clickLogOutButton(){
        clickOnWebElement(logOutButton);
     }

    public boolean isSuccessfulLogin()
    {
        return isWebElementPresent(logOutButton);
    }


}
