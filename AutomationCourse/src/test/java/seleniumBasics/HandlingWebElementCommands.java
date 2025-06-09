package seleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));//explicit wait
		wait.until(ExpectedConditions.elementToBeClickable(showMessageButton));
		Wait<WebDriver> fluent =new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		fluent.until(ExpectedConditions.elementToBeClickable(showMessageButton));
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
