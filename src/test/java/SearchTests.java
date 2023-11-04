import Pages.HomePage;
import Pages.SearchResultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchTests extends BaseTests {


    @Test
    public void SearchNotExistItems(){

        homePage = new HomePage(driver);
        homePage.SearchItem("test");
        searchResultPage = new SearchResultPage(driver);
        By massage = By.xpath("//div[@class=\"no-result\"]");
        String actual = searchResultPage.getTextFromWebElement(massage);
        String expected ="No products were found that matched your criteria.";
        Assert.assertEquals(actual,expected,"actual not equal expected");

    }

    @Test
    public void SearchExistItems(){

        homePage = new HomePage(driver);
        homePage.SearchItem("phone");
        searchResultPage = new SearchResultPage(driver);
        By product  = By.xpath("//div[@class=\"product-item\"]");
        WebElement products = driver.findElement(product);
        Assert.assertTrue(products.isDisplayed(),"not exist item");



    }



}
