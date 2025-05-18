package seleniumBasics;

public class HandlingBrowserCommand extends Base
{
	public void verifyBrowserCommand()
	{
		System.out.println(driver.getTitle());// to get the title from the application
		System.out.println(driver.getCurrentUrl());//to get the current url in the console
		System.out.println(driver.getPageSource());//to get the page source in console such as html code
		System.out.println(driver.getWindowHandle());// to get the window handle unique ID
	}

	public static void main(String[] args) 
	{
		HandlingBrowserCommand browser =new HandlingBrowserCommand();
		browser.initializeBrowser();
		browser.verifyBrowserCommand();
		//browser.browserClose();

	}

}
