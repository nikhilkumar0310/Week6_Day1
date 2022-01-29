package stepsDefinition;

import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadCucu extends BaseClass {
	


	@Given("Enter First Name as {string}")
	public void enter_first_name(String fName) {
        driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys(fName); 
	}

	@Given("Enter Last Name as {string}")
	public void enter_last_name(String lName) {
		driver.findElement(By.id("lastNameField")).sendKeys(lName);
	}

	@Given("Enter First Local Name as {string}")
	public void enter_first_local_name(String localfName) {
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys(localfName);
	}

	@Given("Enter Last Local Name as {string}")
	public void enter_last_local_name(String localLname) {
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys(localLname);
	}

	@Given("Enter Department as {string}")
	public void enter_department(String dept) {
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys(dept);
	}

	@Given("Enter Description as {string}")
	public void enter_description(String descrip) {
		driver.findElement(By.id("createContactForm_description")).sendKeys(descrip);
	}

	@Given("Enter Email Id as {string}")
	public void enter_email_id(String mail) {
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys(mail);
	}

	@When("Press Submit Button")
	public void press_login_button() {
		driver.findElement(By.className("smallSubmit")).click();
	}

	@Then("Verify the new Lead Created")
	public void verify_the_new_lead_created() {
	    String title = driver.getTitle();
	    if(title.contains("View Contact")) {
	    	System.out.println("Landed on the correct Page.");
	    }else {
	    	System.out.println("The Contact was not Created");
	    }
	}

}
