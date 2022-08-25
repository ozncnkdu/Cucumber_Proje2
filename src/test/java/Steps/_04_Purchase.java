package Steps;

import PageElements.Parent;
import PageElements.PurchaseObjects;
import Utilities.GeneralWebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class _04_Purchase extends Parent {

    PurchaseObjects po = new PurchaseObjects();

    @When("Click to item")
    public void clickToItem() {
        po.findAndClick("backpack");
    }

    @And("Click to add to cart button")
    public void clickToAddToCartButton() {
        po.findAndClick("addToCart");
    }

    @And("Verify to adding item")
    public void verifyToAddingItem() {
        po.findAndContainsText("successMessage", "You added");
    }

    @And("Click to basket")
    public void clickToBasket() {
        po.findAndClick("basket");
    }

    @And("Click to proceed to checkout")
    public void clickToProceedToCheckout() {
        po.findAndClick("proceedToCheckOut");
    }

    @And("Click to Next Button")
    public void clickToNextButton() {
        GeneralWebDriver.bekle(2);
        po.findAndClick("nextButton");
    }

    @And("Click to Place Order Button")
    public void clickToPlaceOrderButton() {
        GeneralWebDriver.bekle(2);
        po.findAndClick("placeOrder");
    }

    @Then("Verify to purchasing successfully")
    public void verifyToPurchasingSuccessfully() {
        GeneralWebDriver.bekle(2);
        po.findAndContainsText("verifyText", "Thank you for your purchase!");
    }


}
