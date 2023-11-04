package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends  BasePage{


    private By searchBox= By.id("q");
    private By searchButton =By.xpath("//button[@class=\"button-1 search-button\"]");

    public SearchResultPage(WebDriver driver){
        super(driver);


    }

    public void searchItems(String item){
        selectedItem(item);
        //driver.findElement(searchButton).click();
        clickOnWebElement(searchButton);
    }

    private void selectedItem(String item){
       //driver.findElement(searchBox).sendKeys(item);
        sendkeyToWebElement(searchBox,item);
    }

}
