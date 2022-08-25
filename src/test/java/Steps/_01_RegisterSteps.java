package Steps;

import PageElements.MainPage;
import Utilities.GeneralWebDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class _01_RegisterSteps {

    MainPage mp = new MainPage();

    @Given("Navigate to Luma")
    public void navigateToLuma() {
        GeneralWebDriver.getDriver().manage().window().maximize();
        GeneralWebDriver.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @Then("Click on the element in the main page")
    public void clickOnTheElementInTheMainPage(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            mp.findAndClick(listElement.get(i));
        }
    }

    @And("User sending the keys in Dialog Content")
    public void userSendingTheKeysInDialogContent(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            mp.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }

    @When("Click to Create an Account button")
    public void clickToCreateAnAccountButton(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            mp.findAndClick(listElement.get(i));
        }
    }


    @Then("Verification of successfully registering")
    public void verificationOfSuccessfullyRegistering() {
        mp.findAndContainsText("successMessage", "Thank you for registering");
    }


}
