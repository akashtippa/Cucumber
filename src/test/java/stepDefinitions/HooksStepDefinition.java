package stepDefinitions;

import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDefinition {

	@Before
	public void setup() 
	{
		System.out.println("Launch Chrome Browser");
		System.out.println("Entered URL of application");
	}
	@Given("^user is on add customer page$")
	public void user_is_on_add_customer_page() throws Throwable {
	       
		System.out.println("User is on add customer page");
	}

	@When("^user fills customer details$")
	public void user_fills_customer_details() throws Throwable {
		System.out.println("User fills the customer details");
	}

	@Then("^customer is added$")
	public void customer_is_added() throws Throwable {
		System.out.println("User is Added");
	}

	@Given("^user is on edit customer page$")
	public void user_is_on_edit_customer_page() throws Throwable {
		System.out.println("User is on add customer page");
	}

	@When("^user edits contact deatails$")
	public void user_edits_contact_deatails() throws Throwable {
		System.out.println("User is Edits contact details");
	}

	@Then("^contact deatils updated$")
	public void contact_deatils_updated() throws Throwable {
		System.out.println("User deatils are updated");
	}

	@Given("^user delete customer$")
	public void user_delete_customer() throws Throwable {
		System.out.println("User is Deleted successfully");
	}

	@Then("^customer deleted$")
	public void customer_deleted() throws Throwable {
	    
	}
	@After
	public void teardown()
	{
		System.out.println("Browser closed");
	}
}
