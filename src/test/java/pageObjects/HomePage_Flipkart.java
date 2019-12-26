package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Flipkart {

	WebDriver driver;

	public HomePage_Flipkart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Search for products, brands and more']")
	WebElement searchBox;
	
	@FindBy(xpath="//body/div[@id='container']/div/div[@class='_3ybBIU']/div[@class='_1tz-RS']/div[@class='_3pNZKl']/div[@class='Y5-ZPI']/form[@class='_1WMLwI header-form-search']/div[@class='col-12-12 _2tVp4j']/button[@class='vh79eN']/*[1]")
	WebElement searchbtn;
	
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	WebElement closebtn;
	
	public void enterSearchBox(String itemName)
	{
		searchBox.sendKeys(itemName);
	}
	
	public void clickSearchButton()
	{
		searchbtn.click();
	}
	
	public void clickCloseBtn()
	{
		closebtn.click();
	}
	

}
