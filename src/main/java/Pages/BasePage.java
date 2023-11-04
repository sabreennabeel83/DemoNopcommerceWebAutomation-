package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    private By registerButton= By.xpath("//a[@class=\"ico-register\"]");
    private By searchBox = By.id("small-searchterms");
    private By searchButton =By.xpath("//button[@class=\"button-1 search-box-button\"]");
    private By logInButton =By.xpath("//a[@class=\"ico-login\"]");



    public BasePage(WebDriver driver){
        this.driver=driver;
    }
    public  void  waitUntilWebElementIsVisible(By element){
        //WebDriverWait webDriverWait= new WebDriverWait(driver,20);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

      wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
    public void clickOnWebElement(By element){
        waitUntilWebElementIsVisible(element);
        driver.findElement(element).click();
    }

    public void sendkeyToWebElement (By element,String text ){
        waitUntilWebElementIsVisible(element);
        driver.findElement(element).sendKeys(text);
    }

    public String getTextFromWebElement(By element)
    {
        waitUntilWebElementIsVisible(element);
        return driver.findElement(element).getText();
    }

    public boolean isWebElementPresent(By element)
    {
        boolean exist;
        try
        {
            waitUntilWebElementIsVisible(element);
            driver.findElement(element);
            exist = true;
        }
        catch (Exception e)
        {
            exist = false;
        }
        return exist;
    }



    public RegisterPage openRegisterPage(){
        //driver.findElement(registerButton).click();
        clickOnWebElement(registerButton);
        return new RegisterPage(driver);
    }



    public SearchResultPage SearchItem(String item){
        selectedItem(item);
        //driver.findElement(searchButton).click();
        clickOnWebElement(searchButton);
        return new SearchResultPage(driver);
    }
    private void selectedItem(String item){
        //driver.findElement(searchBox).sendKeys(item);
        sendkeyToWebElement(searchBox,item);
    }

    public LogInPage openLogInPage(){
        //driver.findElement(logInButton).click();
        clickOnWebElement(logInButton);
        return new LogInPage(driver);
    }

}
