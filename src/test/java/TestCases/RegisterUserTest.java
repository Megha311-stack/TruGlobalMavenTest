package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import PageObjects.RegisterUserElements;

public class RegisterUserTest {
	
	public WebDriver driver=null;
	Actions actions=null;
	
	@BeforeClass
	public void launchApp()
	{
		System.setProperty("webdriver.edge.driver","C:\\edgedriver_win64\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void registerUser() throws InterruptedException,NullPointerException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		RegisterUserElements ru=new RegisterUserElements(driver);
		 actions=new Actions(driver);
		actions.moveToElement(ru.signinMouseHover()).perform();
		actions.click(ru.startHere()).perform();
		WebElement custname=ru.custName();
		custname.sendKeys("Megha");
		WebElement phonenumber=ru.phNumber();
		phonenumber.sendKeys("9786545678");
		WebElement pass=ru.password();
		pass.sendKeys("Testpass@123");
		WebElement cont=ru.continues();
		cont.click();
		Thread.sleep(10);
		/*WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='sc-nkuzb1-0 sc-d5trka-0 eZxMRy button' and text()='Start Puzzle']")));
		ru.puzzle().click();*/
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	
}
