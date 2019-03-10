package stepDefinitions;

import cucumber.api.java.en.When;
import pageObjects.AbstractDriver;
import pageObjects.LoginPage;


public class LoginSteps extends AbstractDriver {


    private static final String LOGIN = "egor6661999";
    private static final String PASSWORD = "Isaac96Soles13";
    private LoginPage loginPage = new LoginPage(webDriver);

    @When("^user login in mailBox$")
    public void loginToMailBox() {
        loginPage.enterLoginAndPass(LOGIN, PASSWORD);
        loginPage.clickEnterButton();
        loginPage.logoutLinkPresents();
    }


}

