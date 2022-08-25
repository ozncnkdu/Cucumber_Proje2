package PageElements;

import Utilities.GeneralWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends Parent {
    public AccountPage() {
        PageFactory.initElements(GeneralWebDriver.getDriver(), this);
    }

    @FindBy(css = "[data-action='customer-menu-toggle']")
    private WebElement menuToggle;

    @FindBy(linkText = "My Account")
    private WebElement myAccount;

    @FindBy(linkText = "Manage Addresses")
    private WebElement manageAddresses;

    @FindBy(id = "company")
    private WebElement company;

    @FindBy(id = "telephone")
    private WebElement telephone;

    @FindBy(id = "street_1")
    private WebElement streetFirst;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "region")
    private WebElement state;

    @FindBy(id = "zip")
    private WebElement zipCode;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(css = "[data-action='save-address']")
    public WebElement saveAddress;

    @FindBy(css = "[role='add-address']")
    public WebElement addAddress;

    @FindBy(css = "[data-ui-id='message-success']")
    private WebElement successMessage;

    WebElement myElement;

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "menuToggle":
                myElement = menuToggle;
                break;
            case "myAccount":
                myElement = myAccount;
                break;
            case "manageAddresses":
                myElement = manageAddresses;
                break;
            case "saveAddress":
                myElement = saveAddress;
                break;
            case "addAddress":
                myElement = addAddress;
                break;
        }
        clickFunction(myElement);
    }

    public void findAndSend(String strElement, String value) {
        switch (strElement) {
            case "company":
                myElement = company;
                break;
            case "telephone":
                myElement = telephone;
                break;
            case "streetFirst":
                myElement = streetFirst;
                break;
            case "city":
                myElement = city;
                break;
            case "state":
                myElement = state;
                break;
            case "zipCode":
                myElement = zipCode;
                break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndContainsText(String strElement, String text) {
        switch (strElement) {
            case "successMessage":
                myElement = successMessage;
                break;
        }
        verifyContainsText(myElement, text);
    }


}
