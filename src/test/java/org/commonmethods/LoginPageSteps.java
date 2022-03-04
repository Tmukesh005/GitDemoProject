package org.commonmethods;

import org.repository.RepositoryPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps extends CommonMethods {
	RepositoryPage pf=new RepositoryPage();
	@Given("^open facebook and launch the application$")
	public void openFacebook() {
		CommonMethods.url("https://www.facebook.com/");
	}
	@When("^Enter username and password$")
	public void passingElement() {
        CommonMethods.typeData(pf.getUser(), "mukesh");
		CommonMethods.typeData(pf.getPassword(), "xxxxx");
		CommonMethods.clickLogin(pf.getLogin());
	}
	@Then("^close the browser$")
	public void close() {
		CommonMethods.cLaunch();
	}

}
