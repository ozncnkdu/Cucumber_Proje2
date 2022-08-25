package Steps;

import PageElements.MainPage;
import Utilities.GeneralWebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_LoginSteps {

    MainPage mp = new MainPage();

    @Then("Click to Sign In Link")
    public void clickToSignInLink() {
        mp.findAndClick("signInLink");
    }

    @And("Fill the email as {string}")
    public void fillTheEmailAs(String email) {
        mp.findAndSend("email", email);
    }

    @And("Fill the Password as {string}")
    public void fillThePasswordAs(String pass) {
        mp.findAndSend("pass", pass);
    }

    @When("Click to Sign In button")
    public void clickToSignInButton() {
        mp.findAndClick("signInButton");
    }

    @Then("Verification of successfully login")
    public void verificationOfSuccessfullyLogin() {
        mp.findAndContainsText("verifyLoginText","Welcome, Grup3 TechnoStudy!");
    }
}
