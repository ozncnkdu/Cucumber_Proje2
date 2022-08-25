package Steps;

import PageElements.AccountPage;
import Utilities.GeneralWebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class _03_AddAddresses {
    AccountPage ap = new AccountPage();

    @When("Click to my account page")
    public void clickToMyAccountPage() {
        ap.findAndClick("menuToggle");
        ap.findAndClick("myAccount");
    }

    @And("Click to manage address")
    public void clickToManageAddress() {
        ap.findAndClick("manageAddresses");
    }

    @And("Fill the company as {string}")
    public void fillTheCompanyAs(String company) {
        ap.findAndSend("company", company);
    }

    @And("Fill the PhoneNumber as {string}")
    public void fillThePhoneNumberAs(String telephone) {
        ap.findAndSend("telephone", telephone);
    }

    @And("Fill the StreetAddress as {string}")
    public void fillTheStreetAddressAs(String streetFirst) {
        ap.findAndSend("streetFirst", streetFirst);
    }

    @And("Fill the City as {string}")
    public void fillTheCityAs(String city) {
        ap.findAndSend("city", city);
    }

    @And("Select the country")
    public void selectTheCountry() {
        Select select = new Select(ap.country);
        select.selectByVisibleText("Turkey");
    }

    @And("Fill the State as {string}")
    public void fillTheStateAs(String state) {
        ap.findAndSend("state", state);
    }

    @And("Fill the ZipCode as {string}")
    public void fillTheZipCodeAs(String zipCode) {
        ap.findAndSend("zipCode", zipCode);
    }

    @And("Click to add new address button")
    public void clickToAddNewAddressButton() {
        ap.findAndClick("addAddress");
    }

    @And("Click to save address button")
    public void clickToSaveAddressButton() {
        ap.findAndClick("saveAddress");
    }

    @And("Verify to adding address successfully")
    public void verifyToAddingAddressSuccessfully() {
        ap.findAndContainsText("successMessage", "You saved the address.");
    }
}
