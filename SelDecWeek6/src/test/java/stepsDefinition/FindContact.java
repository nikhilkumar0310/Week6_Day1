package stepsDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FindContact extends BaseClass{
	
	@Given("Click on the Contacts CTA to find the Contacts")
	public void click_on_the_contacts_cta_to_find_the_contacts() {
		driver.findElement(By.linkText("Contacts")).click();
	}

	@Given("Click on the Find Contacts CTA")
	public void click_on_the_find_contacts_cta() {
		driver.findElement(By.linkText("Find Contacts")).click();
	}

	@Given("Click on the Email search box")
	public void click_on_the_email_search_box() {
		driver.findElement(By.xpath("//span[text()='Email']")).click();
	}

	@When("Enter the email to be found as {string}")
	public void enter_the_email_to_be_found_as_test_gmail_com(String emailFind) {
		driver.findElement(By.name("emailAddress")).sendKeys(emailFind);
	}

	@Then("Click on the Find Contacts CTA submit")
	public void click_on_the_find_contacts_submit() {
		driver.findElement(By.className("x-btn-text")).click();  
	}

}
