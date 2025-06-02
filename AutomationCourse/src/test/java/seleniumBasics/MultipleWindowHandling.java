package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base
{
	public void multipleWindow()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		WebElement clickHere = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHere.click();
		Set<String>HandleIDs=driver.getWindowHandles();
		System.out.println(HandleIDs);
		Iterator<String>values=HandleIDs.iterator();
		while(values.hasNext())
		{
			String currentID=values.next();
			if(!currentID.equals(parentWindow))
			{
				driver.switchTo().window(currentID);
				WebElement emailID =driver.findElement(By.xpath("//input[@name='emailid']"));
				emailID.sendKeys("keerthana@gmail.com");
				WebElement submit =driver.findElement(By.xpath("//input[@name='btnLogin']"));
				submit.click();
				
			}
		}
		
	}

	public static void main(String[] args) 
	{
		MultipleWindowHandling window = new MultipleWindowHandling();
		window.initializeBrowser();
		window.multipleWindow();
		//window.browserClose();

	}

}
