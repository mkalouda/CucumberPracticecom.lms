package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {

    @When("user enters valid usernam and password")
    public void user_enters_valid_usernam_and_password() {

        sendText(loginPage.username, ConfigReader.getPropertyValue("username"));
        sendText(loginPage.password, ConfigReader.getPropertyValue("password"));
    }

    @When("user clicks on login in button")
    public void user_clicks_on_login_in_button() {

        click(loginPage.loginInBtn);
    }

    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {

        Assert.assertTrue(homePage.logoutBtn.isDisplayed());
    }

    @Then("logo and login text {string} is displayed")
    public void logo_and_login_text_is_displayed(String expectedText) {

        Assert.assertTrue(loginPage.logo.isDisplayed());

        String actualText = loginPage.loginText.getText();
        Assert.assertEquals("Text does not match", expectedText,actualText);
    }
}
