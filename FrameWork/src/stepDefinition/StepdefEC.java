package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepo.ECHomePageOR;
import objectRepo.FormfillEC;
import utilitlies.BaseClassEC;

public class StepdefEC extends BaseClassEC{
	@Given("I want to go themeforest ecommerce web")
	public void i_want_to_go_themeforest_ecommerce_web() {
		openBrowser("chrome");
		driver.manage().window().maximize();
		openbaseurl();
	  }

	@When("I select the product and add to cart")
	public void i_select_the_product_and_add_to_cart() {
		ECHomePageOR.ecom("Ecommerece");
	    	}

	@Then("I fill the form to create the account")
	public void i_fill_the_form_to_create_the_account() {
		FormfillEC.FF("adithiyan", "parthiban","maalathi@mail.com", "malathi123456", "Malathi225227");
	    	}
}
