package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchresultPage_Flipkart {
	
WebDriver driver;
	
	public SearchresultPage_Flipkart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath="//div[contains(text(),'Apple iPhone XR (Yellow, 64 GB)')]")
	WebElement itemName;
	
	@FindBy(xpath="//div[contains(text(),'51,900')]")
	WebElement itemPrice;

	public String getItemName()
	{
		return itemName.getText();
	}
	public String getPrice()
	{
		return itemPrice.getText();
	}
	
	

}
