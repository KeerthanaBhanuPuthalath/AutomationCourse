package testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base
{
	@Test(description = "User can login with valid credentials",priority=1)
	public void verifyUserLoginWithValidCredentials() throws IOException
	{
		HomePage homepage;
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameFieldOnUserNameField(username).enterPasswordOnPasswordField(password);
		//loginPage.enterPasswordOnPasswordField(password);
		homepage=loginPage.signUpButton();
//		boolean isDashboardDisplayed= loginPage.dashboardDisplayed();
//		Assert.assertTrue(isDashboardDisplayed,"User not able to login with valid credentials");//assert true
		String actual =loginPage.dashboardDisplayed();
		String excepted = "Dashboard";
		Assert.assertEquals(actual, excepted,"User not able to login with valid credentials");
	
	}

	
@Test(description = "User can't login because of valid username and invalid password ",priority=2)
	public void verifyLoginWithInvalidPasswordValidUsername() throws IOException
	{
	HomePage homepage;
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameFieldOnUserNameField(username).enterPasswordOnPasswordField(password);
		//loginPage.enterPasswordOnPasswordField(password);
		homepage=loginPage.signUpButton();	
	}


@Test(description = "User can't login because of valid password and invalid username", priority=3,groups = {"smoke"})
	public void verifyLoginWithValidPasswordAndInvalidUsername() throws IOException
	{
	HomePage homepage;
		String username = ExcelUtility.getStringData(2, 0,"LoginPage");
		String password = ExcelUtility.getStringData(2, 1,"LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameFieldOnUserNameField(username).enterPasswordOnPasswordField(password);
		//loginPage.enterPasswordOnPasswordField(password);
		homepage=loginPage.signUpButton();
	}
	


@Test(description = "User can't login because of invalid password and invalid username",priority=4,groups = {"smoke"},dataProvider = "logindata")
	public void verifyLoginWIthInvalidPasswordAndInvalidUSername(String username, String password) throws IOException
	{
	HomePage homepage;
		//String username = ExcelUtility.getStringData(3, 0,"LoginPage");
		//String password = ExcelUtility.getStringData(3, 1,"LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameFieldOnUserNameField(username).enterPasswordOnPasswordField(password);
		//loginPage.enterPasswordOnPasswordField(password);
		homepage=loginPage.signUpButton();
		
	}
@DataProvider(name="logindata")
public Object[][]getDataFromDataProvider()
{
	return new Object[][]
			{
				new Object[]{"Test1","Test2",}, new Object[] {"Test3","Test4"}
			};
}
}
