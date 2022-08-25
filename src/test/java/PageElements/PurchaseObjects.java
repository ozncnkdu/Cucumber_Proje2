package PageElements;

import Utilities.GeneralWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseObjects extends Parent {

    public PurchaseObjects() {
        PageFactory.initElements(GeneralWebDriver.getDriver(), this);
    }

    @FindBy(css = "[alt='Push It Messenger Bag']")
    private WebElement backpack;

    @FindBy(css = "[title='Add to Cart']")
    private WebElement addToCart;

    @FindBy(css = "[class='action showcart']")
    private WebElement basket;

    @FindBy(id = "top-cart-btn-checkout")
    private WebElement proceedToCheckOut;

    @FindBy(css = "[data-role='opc-continue']")
    private WebElement nextButton;

    @FindBy(css = "[class='action primary checkout']")
    private WebElement placeOrder;

    @FindBy(css = "[data-ui-id='page-title-wrapper']")
    private WebElement verifyText;

    @FindBy(css = "[data-ui-id='message-success']")
    private WebElement successMessage;

    WebElement myElement;

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "backpack":
                myElement = backpack;
                break;
            case "addToCart":
                myElement = addToCart;
                break;
            case "basket":
                myElement = basket;
                break;
            case "proceedToCheckOut":
                myElement = proceedToCheckOut;
                break;
            case "nextButton":
                myElement = nextButton;
                break;
            case "placeOrder":
                myElement = placeOrder;
                break;
        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {
        switch (strElement) {
            case "verifyText":
                myElement = verifyText;
                break;
            case "successMessage":
                myElement=successMessage;
                break;
        }
        verifyContainsText(myElement, text);
    }


}
