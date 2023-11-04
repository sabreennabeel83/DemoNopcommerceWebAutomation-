import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.*;


public class BaseTests {

    protected WebDriver driver;
    protected HomePage homePage;
    protected RegisterPage registerPage;
    protected LogInPage logInPage;
    protected  SearchResultPage searchResultPage;




    @BeforeClass
    public void setUp()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

    }



    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }




}
