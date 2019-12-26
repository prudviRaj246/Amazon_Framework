package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Amazon {

	WebDriver driver;

	public HomePage_Amazon(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchBox;
	
	@FindBy(xpath="//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")
	WebElement searchbtn;
	
	public void enterSearchBox(String itemName)
	{
		System.out.println(itemName);
		searchBox.sendKeys(itemName);
	}
	
	public void clickSearchButton()
	{
		searchbtn.click();
	}
	

}
