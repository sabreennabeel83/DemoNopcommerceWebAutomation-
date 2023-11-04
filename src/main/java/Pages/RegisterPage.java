package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage{



    private By firstnameField = By.id("FirstName");
    private  By lastNameField = By.id("LastName");
    private  By emailField = By.id("Email");
    private  By PasswordField = By.id("Password");
    private  By ConfirmPasswordField = By.id("ConfirmPassword");
    private By registerButton= By.xpath("//button[@id=\"register-button\"]");
    private By selectDay =By.xpath("//select[@name=\"DateOfBirthDay\"]");
    private By selectMonth =By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    private  By selectYear =By.xpath("//select[@name=\"DateOfBirthYear\"]");



    public RegisterPage(WebDriver driver){
        super(driver);

    }

    public void setFirstName(String firstName){
        //driver.findElement(firstnameField).sendKeys(firstName);
        sendkeyToWebElement(firstnameField,firstName);

    }
    public void setLastName(String lastName){
        //driver.findElement(lastNameField).sendKeys(lastName);
        sendkeyToWebElement(lastNameField,lastName);

    }
    public void setEmail(String email){
        //driver.findElement(emailField).sendKeys(email);
        sendkeyToWebElement(emailField,email);

    }

    public void setPassword(String Password){
       //driver.findElement(PasswordField).sendKeys(Password);
        sendkeyToWebElement(PasswordField,Password);

    }


    public void setConfirmPassword(String ConfirmPassword){
        //driver.findElement(ConfirmPasswordField).sendKeys(ConfirmPassword);
        sendkeyToWebElement(ConfirmPasswordField,ConfirmPassword);

    }

    public void clickRegisterButton(){
    driver.findElement(registerButton).click();
    }

    public void setDateOfBirth(String s1, String s2,String s3 ){
        Select day =new Select(driver.findElement(selectDay));
        day.selectByVisibleText(s1);
        Select mon =new Select(driver.findElement(selectMonth));
        mon.selectByVisibleText(s2);
        Select year =new Select(driver.findElement(selectYear));
        year.selectByVisibleText(s3);
    }

}
