package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchresultPage_Amazon {
	
WebDriver driver;
	
	public SearchresultPage_Amazon(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath="//span[contains(text(),'Apple iPhone XR (64GB) - Yellow')]")
	WebElement itemName;
	
	@FindBy(xpath="//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=0']//div[@class='s-include-content-margin s-border-bottom']//div[@class='a-section a-spacing-medium']//div[@class='sg-row']//div[@class='sg-col-4-of-12 sg-col-8-of-16 sg-col-16-of-24 sg-col-12-of-20 sg-col-24-of-32 sg-col sg-col-28-of-36 sg-col-20-of-28']//div[@class='sg-col-inner']//div[@class='sg-row']//div[@class='sg-col-4-of-24 sg-col-4-of-12 sg-col-4-of-36 sg-col-4-of-28 sg-col-4-of-16 sg-col sg-col-4-of-20 sg-col-4-of-32']//div[@class='sg-col-inner']//div[@class='a-section a-spacing-none a-spacing-top-small']//div[@class='a-row a-size-base a-color-base']//div[@class='a-row']//a[@class='a-size-base a-link-normal s-no-hover a-text-normal']//span[@class='a-price']//span//span[@class='a-price-whole'][contains(text(),'47,900')]")
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
