package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import PageObjects.*;
import Utilities.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeLoansCalculatorsAndToolsSteps {
	
    TestContext testContext;
    HomeLoansCalculatorsAndToolsPage homeLoansCalculatorsAndToolsPage;
    
    public HomeLoansCalculatorsAndToolsSteps(TestContext context) {
        testContext = context;
        homeLoansCalculatorsAndToolsPage = testContext.getPageObjectManager().getHomeLoansCalculatorsAndToolsPage();
       
    }

	@Given("when enter your details")
	public void when_enter_your_details(List<Map<String, String>> dataTable) {
        System.out.println(dataTable.get(0).get("Number of dependants"));
        
        homeLoansCalculatorsAndToolsPage.clickApplicationTypeSingle();
        homeLoansCalculatorsAndToolsPage.SelectNoOfDepartments(dataTable.get(0).get("Number of dependants"));
        homeLoansCalculatorsAndToolsPage.ClickhomeToLiveInButton();
	  
	   
	}
	@Given("when enter Your earnings")
	public void when_enter_your_earnings(List<Map<String, String>> dataTable) {
		homeLoansCalculatorsAndToolsPage.setYourAnnualIncomeBeforeTax(dataTable.get(0).get("Your annual income (before tax)"));
		homeLoansCalculatorsAndToolsPage.setyourAnnualOtherIncomeOptional(dataTable.get(0).get("Your annual other income (optional)"));

	}
	@Given("when enter Your expenses")
	public void when_enter_your_expenses(List<Map<String, String>> dataTable) {
		
		homeLoansCalculatorsAndToolsPage.setmonthlyLivingExpenses(dataTable.get(0).get("Monthly living expenses"));
		homeLoansCalculatorsAndToolsPage.setcurrentHomeLoanMonthlyRepayments(dataTable.get(0).get("Current home loan monthly repayments"));
		homeLoansCalculatorsAndToolsPage.setotherLoanMonthlyRepayments(dataTable.get(0).get("Other loan monthly repayments"));
		homeLoansCalculatorsAndToolsPage.setotherMonthlyCommitments(dataTable.get(0).get("Other monthly commitments"));
		homeLoansCalculatorsAndToolsPage.settotalCreditCardLimits(dataTable.get(0).get("Total credit card limits"));

	}
	@Given("click Work out how much I could borrow button")
	public void click_work_out_how_much_i_could_borrow_button() {
		homeLoansCalculatorsAndToolsPage.clickworkOutHowMuchICouldBorrow();
	    
	}
	@Then("validate Amount")
	public void validate_amount(List<Map<String, String>> dataTable) {
		String actualAmount  = homeLoansCalculatorsAndToolsPage.getBorrowAmount().replaceAll("[^0-9]", "");
		Assert.assertEquals(dataTable.get(0).get("Expected Amount"), actualAmount);
	}
	
	@When("click on start over button")
	public void click_on_start_over_button() {
		homeLoansCalculatorsAndToolsPage.clickStartOverButton();
	}
	@Then("verify the error msg")
	public void verify_the_error_msg(List<Map<String, String>> dataTable) {
		Assert.assertEquals(dataTable.get(0).get("errormsg"), homeLoansCalculatorsAndToolsPage.getBorrowErrorText());
	}
	
	@Then("verify the input fields")
	public void verify_the_input_fields(List<Map<String, String>> dataTable) {
		
		Assert.assertEquals(dataTable.get(0).get("Monthly living expenses"), homeLoansCalculatorsAndToolsPage.getmonthlyLivingExpenses());
	}
	
}
