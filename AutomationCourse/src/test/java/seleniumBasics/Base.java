package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base
{
public WebDriver driver;

	public void initializeBrowser()
	{
		driver=new ChromeDriver();// to launch the browser in chrome
		//driver=new FirefoxDriver();// to launch the browser in firefox
		//driver=new EdgeDriver();// to launch the browser in edge
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();// to maximize the window of the browser
		}
	public void browserClose()
	{
		driver.quit();//multiple window gets closed using quit, or close can be used, in close last instance will be closed
	}
	
	public static void main(String[] args) 
	{
		Base base=new Base();
		base.initializeBrowser();
		base.browserClose();

	}

}

