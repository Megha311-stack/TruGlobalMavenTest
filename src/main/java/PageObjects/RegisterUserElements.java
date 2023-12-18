package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterUserElements {
	
	WebDriver driver=null;
	public RegisterUserElements(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement registerLoginOption;
	public WebElement signinMouseHover()
	{
		return registerLoginOption;
	}
	
	//String registerLink="start here.";
	@FindBy(xpath="//div[@id='nav-flyout-ya-newCust']/a[text()='Start here.']")
	WebElement starthere;
	public WebElement startHere()
	{
		return starthere;
	}

	@FindBy(xpath="//input[@id='ap_customer_name']") WebElement customername;
	public WebElement custName()
	{
		return customername;
	}
	
	@FindBy(xpath="//input[@id='ap_phone_number']") WebElement phonenumber;
	public WebElement phNumber()
	{
		return phonenumber;
	}
	
	@FindBy(xpath="//input[@id='ap_password']") WebElement pwd;
	public WebElement password()
	{
		return pwd;
	}
	@FindBy(xpath="//input[@id='continue']") WebElement verifyMB;
	public WebElement continues()
	{
		return verifyMB;
	}
	
	/*@FindBy(xpath="//button[@class='sc-nkuzb1-0 sc-d5trka-0 eZxMRy button' and text()='Start Puzzle']") WebElement Puzzle;
	public WebElement puzzle() throws InterruptedException
	{
		
		return Puzzle;
	}*/
}
