package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class registerPage extends _Parent{

    private WebDriver driver;

    public registerPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "a[class=login]")
    private WebElement signInBtn;

    @FindBy(id="email_create")
    private WebElement createEmail;

    @FindBy(id="SubmitCreate")
    private WebElement submitBtn;


    public void clickOnSignInBtn(){
        clickFunction(signInBtn);
    }

    public void typeEmail(String email){
        sendKeysFunction(createEmail,email);
    }

    public void clickOnCreateAnAccountButton(){
        clickFunction(submitBtn);
    }


}
