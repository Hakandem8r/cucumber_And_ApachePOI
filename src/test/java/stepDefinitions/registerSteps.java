package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import pageObjectModel.registerPage;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class registerSteps {

   registerPage registerPage=new registerPage();
    private WebDriver driver;
    @Given("^Navigate to website$")
    public void navigateToWebsite() {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @And("^click sign i button$")
    public void clickSignIButton() {
        registerPage.clickOnSignInBtn();
    }

    @And("^type e-mail \"([^\"]*)\"$")
    public void typeEMail(String email) {
        registerPage.typeEmail(email);

    }

    @And("^click on Create an Account button$")
    public void clickOnCreateAnAccountButton() {
        registerPage.clickOnCreateAnAccountButton();
    }

    @And("^choose a tittle$")
    public void chooseATittle() {
    }

    @And("^type firstname \"([^\"]*)\" and lastname \"([^\"]*)\"$")
    public void typeFirstnameAndLastname(String arg0, String arg1) {

    }

    @And("^type a password \"([^\"]*)\"$")
    public void typeAPassword(String arg0) {

    }
}
