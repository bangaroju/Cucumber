
package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorSteps {


    int result;
    int num1;
    int num2;



    @Given("^I have a number (\\d+) and number (\\d+)$")
    public void iHaveANumberAndNumber(int num1, int num2) throws Throwable {
        System.out.println("The first number is " +num1);
        System.out.println("The second number is " +num2);
        System.out.println();
        this.num1 = num1;
        this.num2 = num2;


    }

    @When("^I want to perform addition operation on these numbers$")
    public void iWantToPerformAdditionOperationOnTheseNumbers() throws Throwable {
        result = this.num1 + this.num2;


    }

    @Then("^the expected result will be (\\d+)$")
    public void theExpectedResultWillBe(int arg0) throws Throwable {
        System.out.println("The output of the given numbers is " +result);
        System.out.println();


    }

    @When("^I want to perform subtraction operation on these numbers$")
    public void iWantToPerformSubtractionOperationOnTheseNumbers() throws Throwable {
        result = this.num1 - this.num2;


    }

    @When("^I want to perform multiple operation on these numbers$")
    public void iWantToPerformMultipleOperationOnTheseNumbers() throws Throwable {
        result = this.num1 * this.num2;


    }


}

