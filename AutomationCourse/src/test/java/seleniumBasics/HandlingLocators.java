package seleniumBasics;

import org.openqa.selenium.By;

public class HandlingLocators extends Base
{
	public void verifyLocators()
	{
		driver.findElement(By.id("button-one"));// to find the elements from the webpage
		driver.findElement(By.className("form-group"));
		driver.findElement(By.tagName("button"));
		driver.findElement(By.name("viewport"));
		driver.findElement(By.linkText("Simple Form Demo"));
		driver.findElement(By.partialLinkText("Simple Form"));
		driver.findElement(By.cssSelector("input[id='single-input-field']"));//syntax : tag[attribute ='attribute value']
		driver.findElement(By.xpath("//button[@id='button-one']"));//syntax : //tagname[@attribute='attribute value'], two types relative and absolute
		// absolute xpath : /html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button
		driver.findElement(By.xpath("//button[text()='Show Message']"));
		driver.findElement(By.xpath("//button[starts-with(text(),'Show')   ]"));
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));//and method
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));//or method
		driver.findElement(By.xpath("//div[contains (text(), 'Single Input Field')]//parent::div[@class='card']"));//parent
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));//child
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));//following
		driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']"));//preceding
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));//ancestor
		driver.findElement(By.xpath("//div[@class='card']//descendant::div"));//descendant
		
	}
	public static void main(String[] args) 
	{
		HandlingLocators locators = new HandlingLocators();
		locators.initializeBrowser();
		locators.verifyLocators();
		//locators.browserClose();
	
		
	}

}
