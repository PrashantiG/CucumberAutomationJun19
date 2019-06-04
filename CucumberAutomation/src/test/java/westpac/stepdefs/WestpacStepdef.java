package westpac.stepdefs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.regex.*;

import cucumber.api.java.en.And;
//import org.openqa.selenium.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.DataTable;

public class WestpacStepdef {
	
	public static WebDriver driver;
	
	
	@Given("^the user navigates to Westpac kiwisaver scheme retirement calculator$")
	public void usernavigation() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\Cucumber Downloads\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://westpac.co.nz/");
		String Westpac1;
		Westpac1 = driver.getWindowHandle().toString();
		driver.switchTo().window(Westpac1);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"ubermenu-section-link-kiwisaver-ps\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"sidenav-responsive-children-title-4825-ps\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"responsive-children-title-3956-ps\"]/span")).click();
		WebDriverWait wait = new WebDriverWait(driver, 90);
	}
	
	@When("^the user clicks on the info icon the user is able to read the details$")
	public void userclicksonicon() throws InterruptedException{
		driver.switchTo().frame(0);
		WebDriverWait wait = new WebDriverWait(driver, 90);
		findButton(findRow("CurrentAge")).click();		
		findButton(findRow("EmploymentStatus")).click();
		findButton(findRow("PIRRate")).click();		
		findButton(findRow("KiwiSaverBalance")).click();		
		findButton(findRow("VoluntaryContributions")).click();		
		findButton(findRow("RiskProfile")).click();	
		findButton(findRow("SavingsGoal")).click();			
		
	}
	
	@Then("^close browser$")
	public void closebrowser() {
		driver.close();
		driver.quit();
		driver = null;
	}
	
	@And("^the user enters the values on the screen for employees \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void userentersvaluesforemployees(String Current_Age,String Emp_Status,String SalBTax,String KiwiContri,String PIR,String RiskProfile) throws InterruptedException{
			
		driver.switchTo().frame(0);			
			inputText(findRow("CurrentAge"),Current_Age);
			WebDriverWait wait1 = new WebDriverWait(driver, 60);
		
			select(findRow("EmploymentStatus"),Emp_Status);
			WebDriverWait wait2 = new WebDriverWait(driver, 60);
		
			inputText(findRow("AnnualIncome"),SalBTax);
			WebDriverWait wait3 = new WebDriverWait(driver, 60);
		
			radio(findRow("KiwiSaverMemberContribution"),KiwiContri);
			WebDriverWait wait4 = new WebDriverWait(driver, 60);
		
			select(findRow("PIRRate"),PIR);
			WebDriverWait wait5 = new WebDriverWait(driver, 60);
			
		    radio(findRow("RiskProfile"),RiskProfile);
			WebDriverWait wait9 = new WebDriverWait(driver, 60);			
			
			driver.findElement(By.xpath("//*[@id=\"widget\"]/div/div[1]/div/div[2]/button")).click();
			
			driver.close();
			driver.quit();
			driver = null;			
		}
	
	
	@And("^the user enters the values on the screen for selfemployed \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void userentersvaluesforselfemployed(String Current_Age,String Emp_Status,String PIR,String CurrBalance,String VolContri,String Freq,String RiskProfile,String SavingGoal) throws InterruptedException{
			
		driver.switchTo().frame(0);			
			inputText(findRow("CurrentAge"),Current_Age);
			WebDriverWait wait1 = new WebDriverWait(driver, 60);
		
			select(findRow("EmploymentStatus"),Emp_Status);
			WebDriverWait wait2 = new WebDriverWait(driver, 60);	
			
			select(findRow("PIRRate"),PIR);
			WebDriverWait wait5 = new WebDriverWait(driver, 60);
		
			inputText(findRow("KiwiSaverBalance"),CurrBalance);
			WebDriverWait wait6 = new WebDriverWait(driver, 60);
		
			inputText(findRow("VoluntaryContributions"),VolContri);
			WebDriverWait wait7 = new WebDriverWait(driver, 60);
		
			select(findRow("VoluntaryContributions"),Freq);
			WebDriverWait wait8 = new WebDriverWait(driver, 60);
			
			radio(findRow("RiskProfile"),RiskProfile);
			WebDriverWait wait9 = new WebDriverWait(driver, 60);
	
			inputText(findRow("SavingsGoal"),SavingGoal);
			
			
			driver.findElement(By.xpath("//*[@id=\"widget\"]/div/div[1]/div/div[2]/button")).click();
			
			driver.close();
			driver.quit();
			driver = null;
		
		}
	
	@And("^the user enters the values on the screen for nonemployed \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void userentersvaluesfornonemployed(String Current_Age,String Emp_Status,String PIR,String CurrBalance,String VolContri,String Freq,String RiskProfile,String SavingGoal) throws InterruptedException{
			
		driver.switchTo().frame(0);			
			inputText(findRow("CurrentAge"),Current_Age);
			WebDriverWait wait1 = new WebDriverWait(driver, 60);
		
			select(findRow("EmploymentStatus"),Emp_Status);
			WebDriverWait wait2 = new WebDriverWait(driver, 60);	
			
			select(findRow("PIRRate"),PIR);
			WebDriverWait wait5 = new WebDriverWait(driver, 60);
		
			inputText(findRow("KiwiSaverBalance"),CurrBalance);
			WebDriverWait wait6 = new WebDriverWait(driver, 60);
		
			inputText(findRow("VoluntaryContributions"),VolContri);
			WebDriverWait wait7 = new WebDriverWait(driver, 60);
		
			select(findRow("VoluntaryContributions"),Freq);
			WebDriverWait wait8 = new WebDriverWait(driver, 60);
			
			radio(findRow("RiskProfile"),RiskProfile);
			WebDriverWait wait9 = new WebDriverWait(driver, 60);
	
			inputText(findRow("SavingsGoal"),SavingGoal);
			
			
			driver.findElement(By.xpath("//*[@id=\"widget\"]/div/div[1]/div/div[2]/button")).click();
			
			driver.close();
			driver.quit();
			driver = null;
		}
	
	public WebElement findRow(String rowHelpId) {
		return driver.findElement(By.xpath("//div[contains(@help-id,'"+ rowHelpId +"')]"));
	}
	
	public WebElement findButton(WebElement row) {
		WebDriverWait wait = new WebDriverWait(driver, 90);
        WebElement iButton = wait.until(ExpectedConditions.elementToBeClickable(row.findElement(By.tagName("button"))));
		return iButton;
	}
	
	public void inputText(WebElement row, String text) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement textElement = wait.until(ExpectedConditions.elementToBeClickable(row.findElement(By.tagName("input"))));
        textElement.sendKeys(text);
        WebDriverWait wait2 = new WebDriverWait(driver, 30);
	}
	
	public void select(WebElement row, String text) {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(row.findElement(By.className("well-value")))).click();
		WebElement selectElement = wait.until(ExpectedConditions.elementToBeClickable(row.findElement(By.xpath("//span[contains(text(),'" + text + "')]"))));
        selectElement.click();		  
	}
	
	
	public void radio(WebElement row, String value) {
		if (value!=""){	
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(row.findElement(By.xpath("//div[contains(@value,'"+ value +"')]")))).click();
	}
	}	
	
}
