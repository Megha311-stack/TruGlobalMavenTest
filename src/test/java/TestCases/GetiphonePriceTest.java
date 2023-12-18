package TestCases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import PageObjects.SearchItem;
public class GetiphonePriceTest {
  
	WebDriver driver=null;
	@BeforeClass
	public void initializeBrowser()
	{
		System.setProperty("webdriver.edge.driver","C:\\edgedriver_win64\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();	
	}
	@Test
  public void getPrice() throws InterruptedException {
	  
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  SearchItem sr=new SearchItem(driver);
	  sr.searchItem("iphone");
	  Thread.sleep(500);
	  sr.selectItem();
	  sr.prodDetails();
	  String priceiPhone256GB=sr.getPrice();
	  
	  System.out.println("Price of iphone15 256 GB is="+priceiPhone256GB);
	  Thread.sleep(500);
	 // WebElement addtocart=sr.addToCart();
	 // addtocart.click();
  }
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
}
