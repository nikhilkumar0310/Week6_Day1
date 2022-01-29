package stepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateOGLead extends BaseClass{
	
	@Given("Click on the Leads Link")
	public void click_on_the_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@Given("Click on the Create Lead CTA")
	public void click_on_the_create_lead_cta() {
		driver.findElement(By.linkText("Create Lead")).click(); 
	}

	@Given("Enter the Company name as {string}")
	public void enter_the_company_name_as(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	}

	@Given("Enter the first name as {string}")
	public void enter_the_first_name_as(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}

	@Given("Enter the last name as {string}")
	public void enter_the_last_name_as(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}

	@Given("Select Source from Drop Down")
	public void select_source_from_drop_down() {
		WebElement sourseOptionsdd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select SourceObj = new Select(sourseOptionsdd);
		SourceObj.selectByIndex(7);
	}

	@Given("Select Marketing from DropDown")
	public void select_marketing_from_drop_down() {
		WebElement marketingCampOptions = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingCampddObj = new Select(marketingCampOptions);
		marketingCampddObj.selectByValue("CATRQ_CAMPAIGNS");
	}

	@Given("Enter first Name Local {string}")
	public void enter_first_name_local(String FLocalName) {
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(FLocalName);
	}

	@Given("Enter last Name Local {string}")
	public void enter_last_name_local(String LLocalName) {
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys(LLocalName);
	}

	@Given("Enter personal title {string}")
	public void enter_personal_title(String Title) {
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys(Title);
	}

	@Given("Enter Date of Birth {string}")
	public void enter_date_of_birth(String DOB) {
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys(DOB);
	}

	@Given("Enter Genaral Profile title {string}")
	public void enter_genaral_profile_title(String GPTitle) {
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(GPTitle);
	}

	@Given("Enter Department Name as {string}")
	public void enter_department_name_as(String Dept) {
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(Dept);
	}

	@Given("Enter Annual Revenue as {string}")
	public void enter_annual_revenue_as(String Paisa) {
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys(Paisa);
	}

	@Given("Select Inductry from DropDown")
	public void select_inductry_from_drop_down() {
	    
	}

	@Given("Select Owner Ship from Drop Down")
	public void select_owner_ship_from_drop_down() {
	    
	}

	@Given("Enter the Number of Employees {string}")
	public void enter_the_number_of_employees(String ManPower) {
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys(ManPower);
	}

	@Given("And Enter the SIC Code {string}")
	public void and_enter_the_sic_code(String sic) {
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys(sic);
	}

	@Given("Enter the Ticker Symbol {string}")
	public void enter_the_ticker_symbol(String ticker) {
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys(ticker);
	}

	@Given("Enter lead form Description as {string}")
	public void enter_lead_form_description_as(String formDescription) {
		driver.findElement(By.id("createLeadForm_description")).sendKeys(formDescription);
	}

	@Given("Enter the important Note as {string}")
	public void enter_the_important_note_as(String note) {
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys(note);  
	}

	@Given("Clear the country Code")
	public void clear_the_country_code() {
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
	}

	@Given("Enter the Country Code {string}")
	public void enter_the_country_code(String cc) {
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys(cc);
	}

	@Given("Enter the Area Code {string}")
	public void enter_the_area_code(String AC) {
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys(AC);
	}

	@Given("Enter Phone Number {string}")
	public void enter_phone_number(String PhoneNumber) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(PhoneNumber);
	}

	@Given("Enter Ask for Name {string}")
	public void enter_ask_for_name(String askName) {
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys(askName);
	}

	@Given("Enter Phone Extension as {string}")
	public void enter_phone_extension_as(String extension) {
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys(extension);
	}

	@Given("Enter primaray Email as {string}")
	public void enter_primaray_email_as(String email) {
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);
	}

	@Given("Enter Web URL as {string}")
	public void enter_web_url_as(String urlweb) {
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys(urlweb);
	}

	@Given("Enter genaral to name {string}")
	public void enter_genaral_to_name(String Gname) {
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys(Gname);
	}

	@Given("Enter attendent name {string}")
	public void enter_attendent_name(String attName) {
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys(attName);
	}

	@Given("Enter first address {string}")
	public void enter_first_address(String add1) {
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys(add1);
	}

	@Given("Enter second address {string}")
	public void enter_second_address(String add2) {
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys(add2);
	}

	@Given("Enter city name as {string}")
	public void enter_city_name_as(String city) {
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys(city);
	}

	@Given("Select the Prvince from Drop Down")
	public void select_the_prvince_from_drop_down() {
		WebElement stateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDDobj = new Select(stateDD);
		
		stateDDobj.selectByVisibleText("California");
	}

	@Given("Enter general postal code {string}")
	public void enter_general_postal_code(String gPostal) {
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys(gPostal);
	}

	@Given("Enter the Extension Code {string}")
	public void enter_the_extension_code(String extensionCode) {
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys(extensionCode);
	}
	
	@When("Press Submit Button and create Lead")
	public void pressSubmitButton() {
		driver.findElement(By.className("smallSubmit")).click();
	}

	@Then("Verify the Title")
	public void verify_the_title() {
		System.out.println(driver.getTitle());
	}

}
