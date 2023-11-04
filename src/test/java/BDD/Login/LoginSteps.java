package BDD.Login;

import Pages.HomePage;
import Pages.LogInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginSteps {
    WebDriver driver;
    HomePage homePage;
    LogInPage logInPage;


    @Given("Navigate to Login page")
    public void navigateToLoginPage(){
        driver = LoginRunner.driver;
        homePage = new HomePage(driver);
        homePage.openLogInPage();


    }

    @When("Enter email {string}")
    public void enterEmail(String email) {
        logInPage.setEmail(email);
    }

    @And("Enter password {string}")
    public void enterPassword(String password) {
        logInPage.setPassword(password);
    }

    @And("Click on Login Button")
    public void clickOnLoginButton() {
        logInPage.clickLoginButton();
    }

    @Then("user is Logged in Successfully")
    public void userIsLoggedInSuccessfully() {
        Assert.assertTrue(logInPage.isSuccessfulLogin());


    }

    @When("Click on Logout Button")
    public void clickOnLogoutButton() {
        logInPage.clickLogOutButton();
    }



    @Then("Error message will appear with text {string}")
    public void errorMessageWillAppearWithText(String errormassage) {
        Assert.assertEquals(logInPage.getErrorMassage(),errormassage);
       
    }
}
