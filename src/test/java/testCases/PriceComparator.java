package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageObjects.HomePage_Amazon;
import pageObjects.HomePage_Flipkart;
import pageObjects.SearchresultPage_Amazon;
import pageObjects.SearchresultPage_Flipkart;

public class PriceComparator extends BaseClass {
	
	public int amazonPrice;
	public int flipkartPrice;
	
	
	@Test
	public void priceComparatorTestCase()
	{
		HomePage_Amazon  amazon_home=new HomePage_Amazon(driver);
		SearchresultPage_Amazon amazon_search=new SearchresultPage_Amazon(driver);
	
		driver.get(amazonURL);
		logger.info("URL Entered");
		System.out.println();
		amazon_home.enterSearchBox(itemName);
		amazon_home.clickSearchButton();
		itemName=amazon_search.getItemName();
		amazonPrice=Integer.parseInt(amazon_search.getPrice().replaceAll(",", ""));
		
		HomePage_Flipkart  flipkart_home=new HomePage_Flipkart(driver);
		SearchresultPage_Flipkart flipkart_search=new SearchresultPage_Flipkart(driver);
		
		driver.get(flipkartURL);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		flipkart_home.enterSearchBox(itemName);
		flipkart_home.clickSearchButton();
		itemName=flipkart_search.getItemName();
		flipkartPrice=Integer.parseInt(flipkart_search.getPrice().replaceAll(",", "").replaceAll("?", ""));
		
		
		if(amazonPrice < flipkartPrice)
		{
			System.out.println("Amazon price is lesser than flipkart price so better buy from flipkart site");
		}
		else if(amazonPrice > flipkartPrice)
		{
			System.out.println("Flipkart price is lesser than amazon price so better buy from amazon site");
		}
		else
			System.out.println("Both the sites are having same prices so you can buy which ever site u want to buy");
			
	}
	
}
