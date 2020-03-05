package CucumberWithSelenium.StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {


    @Given("^Open the GoogleChrome and launch the application$")
    public void open_the_GoogleChrome_and_launch_the_application() throws Throwable
    {
        System.out.println("This Step open the Firefox and launch the application.");
//        throw new PendingException();
    }

    @When("^Enter the Username and Password$")
    public void enter_the_Username_and_Password() throws Throwable
    {
        System.out.println("This step enter the Username and Password on the login page.");
//        throw new PendingException();
    }

    @Then("^Reset the credential$")
    public void Reset_the_credential() throws Throwable
    {
        System.out.println("This step click on the Reset button.");
//        throw new PendingException();
    }

}
