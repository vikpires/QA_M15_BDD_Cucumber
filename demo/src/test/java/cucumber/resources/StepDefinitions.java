package cucumber.resources;
import static org.junit.Assert.assertTrue;

import cucumber.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions{
    private LoginPage loginPage;

    @Given("User is on Homepage")
    public void user_is_on_homepage_scenario01() {
        this.loginPage = new LoginPage();
    }

    @When("User enters a valid username on username field")
    public void user_enters_a_valid_username_on_username_field_scenario01() {
        loginPage.enterUsername("username", "tomsmith");
    }

    @When("User enters a valid password on password field")
    public void user_enters_a_valid_password_on_password_field_scenario01() {
        loginPage.enterPassword("password", "SuperSecretPassword!");
    }

    @When("User doesn't fill the password on password field")
    public void user_doesn_t_fill_the_password_on_password_field_scenario02() {
        loginPage.enterPassword("password", "");
    }

    @When("User enters an invalid password on password field")
    public void user_enters_an_invalid_password_on_password_field_scenario03() {
        loginPage.enterPassword("password","superSecretPassword!");    
    }

    @When("User doesn't fill the username on username field")
    public void user_doesn_t_fill_the_username_on_username_field_scenario04() {
        loginPage.enterUsername("username","");  
    }

    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button_scenario01() {
        loginPage.clickLogin("//*[@id=\'login\']/button");
    }

    @When("User clicks on the logout button")
    public void user_clicks_on_the_logout_button_scenario05() {
        loginPage.clickLogout("//*[@id=\"content\"]/div/a");   
    }

    @Then("User should be redirected to the account page")
    public void user_should_be_redirected_to_the_account_page_scenario01() {
        assertTrue(loginPage.verifyAlertMessage("You logged into a secure area!"));
    }

    @Then("User should get an error message")
    public void user_should_get_an_error_message_scenario02() {
        assertTrue(loginPage.verifyAlertMessage("Your password is invalid!"));
    }

    @Then("User should get a password error message")
    public void user_should_get_a_password_error_message_scenario03() {
        assertTrue(loginPage.verifyAlertMessage("Your password is invalid!"));
    }

    @Then("User should get an username error message")
    public void user_should_get_an_username_error_message_scenario04() {
        assertTrue(loginPage.verifyAlertMessage("Your username is invalid!")); 
    }

    @Then("User should be redirected to Homepage")
    public void user_should_be_redirected_to_homepage_scenario05() {
        assertTrue(loginPage.verifyAlertMessage("You logged out of the secure area!"));  
    }
}
