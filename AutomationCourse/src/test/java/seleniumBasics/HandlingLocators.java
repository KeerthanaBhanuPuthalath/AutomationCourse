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
		driver.findElement(By.cssSelector("input[id='single-input-field']"));
	}
	public static void main(String[] args) 
	{
		HandlingLocators locators = new HandlingLocators();
		locators.initializeBrowser();
		locators.verifyLocators();
		//locators.browserClose();
	
		
	}

}
