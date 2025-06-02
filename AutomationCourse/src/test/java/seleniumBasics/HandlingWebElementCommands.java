package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingWebElementCommands extends Base
{
	public void verifyWebElementsCommands() 
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messageBox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		//to input a value -sendKeys
		messageBox.sendKeys("Keerthana");
		// to click the button element -click()
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		System.out.println("Displayed: "+showMessageButton.isDisplayed());
		System.out.println("Enabled : "+showMessageButton.isEnabled());
		showMessageButton.click();
		WebElement consoleMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(consoleMessage.getText());
		messageBox.clear();
		WebElement valueA=driver.findElement(By.id("value-a"));
		System.out.println(valueA.getTagName());
	}
	public static void main(String[] args) 
	{
		HandlingWebElementCommands webElements=new HandlingWebElementCommands();
		webElements.initializeBrowser();
		webElements.verifyWebElementsCommands();
		//webElements.browserClose();

	}

}
