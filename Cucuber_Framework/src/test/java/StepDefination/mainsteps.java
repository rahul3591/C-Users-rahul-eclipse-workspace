package StepDefination;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainsteps {
	@Given("User is in netbanking page")
	public void user_is_in_netbanking_page() {
	    System.out.println("User is in landing page");
	}
	@Given("User is in signup page")
	public void user_is_in_signup_page() {
		 System.out.println("User is in singin page");
	}
	
	@When("user signup in to application")
	public void user_signup_in_to_application(List<String> data) {
	   System.out.println(data.get(0));
	   System.out.println(data.get(1));
	   System.out.println(data.get(2));
	   System.out.println(data.get(3));
	}
//	@When("User login in to application with {string} and Password {string}")
	//public void user_login_in_to_application_with_and_password(String username, String password) {
		//  System.out.println(username +"and password is "+ password);
//	}
	@When("User login in to application with {string} and Password {string}")
	public void user_login_in_to_application_with_and_password(String username, String password) {
		System.out.println(username +"and password is "+ password);
	}
//	@When("^User login in to application with (.+) and password (.+)$")
//	public void user_login_in_to_application_with_user_and_password(String username, String password) {
//		 System.out.println(username +"and password is "+ password);
//	}
	   
	@Then("Home page will be displayed")
	public void home_page_will_be_displayed() {
		 System.out.println("Home page will be displayed");
	}
	@Then("cards are displayed")
	public void cards_are_displayed() {
		 System.out.println("cards are displayed");
	}

@Given("setup the data sets")
public void setup_the_data_sets() {
	 System.out.println("**************************************");
    System.out.println("setup the data sets displayed");
}

	@When ("lanch the browser from config varibles")
	public void lanch_the_browser_from_config_varibles() {
		 System.out.println("lanch the browser from config varibles displayed");
	}
	@When ("hit the url of banking site")
	public void hit_the_url_of_banking_site() {
		 System.out.println("hit the url of banking site");
	}
	
		
	}
	   
	  
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	  