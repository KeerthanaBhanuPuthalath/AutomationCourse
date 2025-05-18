package seleniumBasics;

public class HandlingNavigationCommand extends Base
{
	public void verifyNavigationCommands()
	{
		driver.navigate().to("https://www.amazon.in");//from one application to another application if we need to navigate we can use navigate.to is used
		driver.navigate().back();// if user wants to navigates to previous page
		driver.navigate().forward();// if user wants to navigates to the same page
		driver.navigate().refresh();//if the user wants to refresh the page		
	}

	public static void main(String[] args) 
	{
		HandlingNavigationCommand navigate=new HandlingNavigationCommand();
		navigate.initializeBrowser();
		navigate.verifyNavigationCommands();
		//navigate.browserClose();

	}

}
