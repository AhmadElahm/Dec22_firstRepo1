package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestBase;

public class StepDefination extends TestBase {

	@Given ("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
		initDriver();
		driver.get("https://techfios.com/billing/?ng=admin/");
	}
	@When ("User enters the username as {string}")
	public void user_enters_the_username_as(String username) {
		
	}
	
	@When("User enters the password as {string}")
	public void user_enters_the_password_as(String password) {
	   
	}
	@When ("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		
	}
	
	@Then("User should land on dashboard page")
	public void user_should_land_on_dashboard_page() {
	 
	}
}
