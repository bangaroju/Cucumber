package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.junit.Assert;

public class LoginSteps {
    @Given("^I want to open browser$")
    public void iWantToOpenBrowser() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        Assert.assertTrue();
    }

    @And("^Browser opens INfusion soft login page$")
    public void browserOpensINfusionSoftLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
