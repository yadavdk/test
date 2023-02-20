package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class HomeLoansCalculatorsAndToolsPage {

	public HomeLoansCalculatorsAndToolsPage(WebDriver webDriver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
    }
	
    @FindBy(xpath = "//label[contains(text(), 'Single')]")
    private WebElement applicationTypeSingle;
    
    @FindBy(xpath = "//select[@title='Number of dependants']")
    private WebElement numberOfDependantsSelect;
    
    @FindBy(xpath = "//label[contains(text(), 'Home to live in')]")
    private WebElement homeToLiveInButton;
    
    @FindBy(xpath = "//input[@aria-labelledby='q2q1']")
    private WebElement YourAnnualIncomeBeforeTaxTestBox;
    
    @FindBy(xpath = "//input[@aria-labelledby='q2q2']")
    private WebElement yourAnnualOtherIncomeOptionalTestBox;
    
    @FindBy(xpath = "//input[@aria-labelledby='q3q1']")
    private WebElement monthlyLivingExpensesTestBox;
    
    @FindBy(xpath = "//input[@aria-labelledby='q3q2']")
    private WebElement currentHomeLoanMonthlyRepaymentsTestBox;
    
    @FindBy(xpath = "//input[@aria-labelledby='q3q3']")
    private WebElement otherLoanMonthlyRepaymentsTestBox;
    
    @FindBy(xpath = "//input[@aria-labelledby='q3q4']")
    private WebElement otherMonthlyCommitmentsTestBox;
    
    @FindBy(xpath = "//input[@aria-labelledby='q3q5']")
    private WebElement totalCreditCardLimitsTestBox;
    
    @FindBy(xpath = "//button[@id='btnBorrowCalculater']")
    private WebElement workOutHowMuchICouldBorrowButton;
 
    @FindBy(xpath = "//*[@id='borrowResultTextAmount']")
    private WebElement weEstimateYouCouldBorrow;
    
    @FindBy(xpath = "//*[@class='result__restart']/button/span")
    private WebElement startOverButton;
    
    @FindBy(xpath = "//div[@class='borrow__error__text']")
    private WebElement borrowErrorText;
  
    
    public void clickApplicationTypeSingle() {
    	applicationTypeSingle.isEnabled();
    	applicationTypeSingle.click();
    }
    
    public void SelectNoOfDepartments(String noOfDepartments) {
    	Select sel = new Select(numberOfDependantsSelect);
    	//sel.selectByValue(noOfDepartments);
    	sel.selectByVisibleText(noOfDepartments);
    }
    
    public void ClickhomeToLiveInButton() {
    	homeToLiveInButton.click();
    }
    
    public void setYourAnnualIncomeBeforeTax(String YourAnnualIncomeBeforeTax) {
    	YourAnnualIncomeBeforeTaxTestBox.isDisplayed();
    	YourAnnualIncomeBeforeTaxTestBox.click();
    	YourAnnualIncomeBeforeTaxTestBox.sendKeys(YourAnnualIncomeBeforeTax);
    }
    
    public String getYourAnnualIncomeBeforeTax() {
    	YourAnnualIncomeBeforeTaxTestBox.isDisplayed();
    	return YourAnnualIncomeBeforeTaxTestBox.getText().trim();
    }
    
    public void setyourAnnualOtherIncomeOptional(String yourAnnualOtherIncomeOptional) {
    	yourAnnualOtherIncomeOptionalTestBox.isDisplayed();
    	yourAnnualOtherIncomeOptionalTestBox.click();
    	yourAnnualOtherIncomeOptionalTestBox.sendKeys(yourAnnualOtherIncomeOptional);
    }
    
    public String getyourAnnualOtherIncomeOptional() {
    	yourAnnualOtherIncomeOptionalTestBox.isDisplayed();
    	return yourAnnualOtherIncomeOptionalTestBox.getText().trim();
    }
    
    public void setmonthlyLivingExpenses(String monthlyLivingExpenses) {
    	monthlyLivingExpensesTestBox.isDisplayed();
    	monthlyLivingExpensesTestBox.click();
    	monthlyLivingExpensesTestBox.sendKeys(monthlyLivingExpenses);
    }
    
    public String getmonthlyLivingExpenses() {
    	monthlyLivingExpensesTestBox.isDisplayed();
    	return monthlyLivingExpensesTestBox.getText().trim();
    }
    
    public void setcurrentHomeLoanMonthlyRepayments(String currentHomeLoanMonthlyRepayments) {
    	currentHomeLoanMonthlyRepaymentsTestBox.isDisplayed();
    	currentHomeLoanMonthlyRepaymentsTestBox.click();
    	currentHomeLoanMonthlyRepaymentsTestBox.sendKeys(currentHomeLoanMonthlyRepayments);
    }
    
    public String getcurrentHomeLoanMonthlyRepayments() {
    	currentHomeLoanMonthlyRepaymentsTestBox.isDisplayed();
    	return currentHomeLoanMonthlyRepaymentsTestBox.getText().trim();
    }
    
    public void setotherLoanMonthlyRepayments(String otherLoanMonthlyRepayments) {
    	otherLoanMonthlyRepaymentsTestBox.isDisplayed();
    	otherLoanMonthlyRepaymentsTestBox.click();
    	otherLoanMonthlyRepaymentsTestBox.sendKeys(otherLoanMonthlyRepayments);
    }
    
    public String getotherLoanMonthlyRepayments() {
    	otherLoanMonthlyRepaymentsTestBox.isDisplayed();
    	return otherLoanMonthlyRepaymentsTestBox.getText().trim();
    }
    
    public void setotherMonthlyCommitments(String otherMonthlyCommitments) {
    	otherMonthlyCommitmentsTestBox.isDisplayed();
    	otherMonthlyCommitmentsTestBox.click();
    	otherMonthlyCommitmentsTestBox.sendKeys(otherMonthlyCommitments);
    }
    
    public String getotherMonthlyCommitments(String otherMonthlyCommitments) {
    	otherMonthlyCommitmentsTestBox.isDisplayed();
    	return otherMonthlyCommitmentsTestBox.getText().trim();
    }
    
    public void settotalCreditCardLimits(String totalCreditCardLimits) {
    	totalCreditCardLimitsTestBox.isDisplayed();
    	totalCreditCardLimitsTestBox.click();
    	totalCreditCardLimitsTestBox.sendKeys(totalCreditCardLimits);
    }
    
    public String gettotalCreditCardLimits(String totalCreditCardLimits) {
    	totalCreditCardLimitsTestBox.isDisplayed();
    	return totalCreditCardLimitsTestBox.getText().trim();
    }
    
    public void clickworkOutHowMuchICouldBorrow() {
    	workOutHowMuchICouldBorrowButton.isDisplayed();
    	workOutHowMuchICouldBorrowButton.click();
    }
    
    public String getBorrowAmount() {
    	weEstimateYouCouldBorrow.isDisplayed();
    	return weEstimateYouCouldBorrow.getText();
    }
    
    public void clickStartOverButton() {
    	startOverButton.isDisplayed();
    	startOverButton.click();
    }
    
    public String getBorrowErrorText() {
    	borrowErrorText.isDisplayed();
    	return borrowErrorText.getText().trim();
    }
    
    
}
