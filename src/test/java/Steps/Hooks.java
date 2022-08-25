package Steps;


import Utilities.GeneralWebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void before(){
        System.out.println("Senaryo başladı");
    }

    @After
    public void after(){
        GeneralWebDriver.quitDriver();
    }
}
