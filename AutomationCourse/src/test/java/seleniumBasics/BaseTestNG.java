package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestNG 
{
	public WebDriver driver;
@BeforeMethod
	public void initializeBrowser()
	{
		driver=new ChromeDriver();// to launch the browser in chrome
		//driver=new FirefoxDriver();// to launch the browser in firefox
		//driver=new EdgeDriver();// to launch the browser in edge
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();// to maximize the window of the browser
		}
@AfterMethod
	public void browserClose()
	{
		//driver.quit();//multiple window gets closed using quit, or close can be used, in close last instance will be closed
	}
}
