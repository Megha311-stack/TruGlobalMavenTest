package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchItem {
	
	WebDriver driver=null;
	public SearchItem(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@type='text' and @id='twotabsearchtextbox']")
	WebElement searchinput;
	public void searchItem(String item)
	{
		searchinput.sendKeys(item);
	}
	
	//String selectoption=" 15 pro max";
	@FindBy(xpath="(//span[@class='s-heavy'])[1]")  //selecting first option
	WebElement iphone;
	public void selectItem()
	{
		iphone.click();
	}
	//String prodname="iPhone 15 Pro Max (256 GB) - Natural Titanium";
	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]") // getting details of first product
	WebElement navigtoproduct;
	
	public void prodDetails()
	{
	navigtoproduct.click();
	}
	
	@FindBy(xpath="(//span[@class='a-price-whole'])[1]")
	WebElement getpriceof256GB;
	public String getPrice()
	{
		String price=getpriceof256GB.getText();
		return price;
	}
	@FindBy(xpath="(//form/div[@id='addToCart_feature_div']/div/span/span/span/input[@id='add-to-cart-button' and @name='submit.add-to-cart']")
	WebElement addtocart;
	public WebElement addToCart()
	{
		return addtocart;
	}
}
