package BDD.Login;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@CucumberOptions(glue = {"BDD/Login"},
        features = {"BDD/Login/login.feature"},
        plugin = {"pretty","html:tsrget/cucumber-html-report"}

)
public class LoginRunner extends AbstractTestNGCucumberTests {

    public static WebDriver driver;

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
