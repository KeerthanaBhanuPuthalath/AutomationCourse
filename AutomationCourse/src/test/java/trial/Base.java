package trial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
	public WebDriver driver;
	public void initilizeBrowser()
	{
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	public void browserClose()
	{
		driver.quit();
	}
	
	public static void main(String[] args) 
	{
		Base obj = new Base();
		obj.initilizeBrowser();
		obj.browserClose();

	}

}
