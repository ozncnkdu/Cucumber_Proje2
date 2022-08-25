package PageElements;

import Utilities.GeneralWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {

    public void sendKeysFunction(WebElement element, String value) {
        //Waiting
        waitUntilVisible(element);
        //Scrolling
        scrollToElement(element);
        //Clear textbox
        element.clear();
        //Type text on textbox
        element.sendKeys(value);
    }

    public void clickFunction(WebElement element) {
        //Waiting
        waitUntilClickable(element);
        //Scrolling
        scrollToElement(element);
        //Click to element
        element.click();
    }

    public void waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(GeneralWebDriver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) GeneralWebDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(GeneralWebDriver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void verifyContainsText(WebElement element, String text) {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }

    public void waitUntilLoading() {
        WebDriverWait wait = new WebDriverWait(GeneralWebDriver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar>*"), 0));
    }


}