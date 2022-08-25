package PageElements;

import Utilities.GeneralWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends Parent {

    public MainPage() {
        PageFactory.initElements(GeneralWebDriver.getDriver(), this);
    }

    @FindBy(linkText = "Create an Account")
    private WebElement createAnAccount;

    @FindBy(id = "firstname")
    private WebElement firstname;

    @FindBy(id = "lastname")
    private WebElement lastname;

    @FindBy(id = "email_address")
    private WebElement emailAddress;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "password-confirmation")
    private WebElement passwordConfirmation;

    @FindBy(css = "[title='Create an Account']")
    private WebElement submitButton;

    @FindBy(css = "[data-ui-id='message-success']")
    private WebElement successMessage;

    @FindBy(xpath = "(//span[contains(text(),'Welcome')])[1]")
    private WebElement verifyLoginText;

    @FindBy(xpath = "(//a[contains(text(),\"Sign In\")])[1]")
    private WebElement signInLink;
    @FindBy(id = "email")
    private WebElement email;
    @FindBy(id = "pass")
    private WebElement pass;

    @FindBy(id = "send2")
    private WebElement signInButton;



    WebElement myElement;

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "createAnAccount":
                myElement = createAnAccount;
                break;
            case "submitButton":
                myElement = submitButton;
                break;
            case "signInLink":
                myElement = signInLink;
                break;
            case "signInButton":
                myElement = signInButton;
                break;
        }
        clickFunction(myElement);
    }

    public void findAndSend(String strElement, String value) {
        switch (strElement) {
            case "firstname":
                myElement = firstname;
                break;
            case "lastname":
                myElement = lastname;
                break;
            case "emailAddress":
                myElement = emailAddress;
                break;
            case "password":
                myElement = password;
                break;
            case "passwordConfirmation":
                myElement = passwordConfirmation;
                break;
            case "email":
                myElement = email;
                break;
            case "pass":
                myElement = pass;
                break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndContainsText(String strElement, String text) {
        switch (strElement) {
            case "successMessage":
                myElement = successMessage;
                break;
            case "verifyLoginText":
                myElement = verifyLoginText;
                break;
        }
        verifyContainsText(myElement, text);
    }


}
