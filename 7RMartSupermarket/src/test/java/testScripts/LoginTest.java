package testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base
{
	@Test
	public void verifyUserLoginWithValidCredentials() throws IOException
	{
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameFieldOnUserNameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.signUpButton();
//		boolean isDashboardDisplayed= loginPage.dashboardDisplayed();
//		Assert.assertTrue(isDashboardDisplayed,"User not able to login with valid credentials");//assert true
		String actual =loginPage.dashboardDisplayed();
		String excepted = "Dashboard";
		Assert.assertEquals(actual, excepted,"User not able to login with valid credentials");
	}

	
@Test
	public void verifyLoginWithInvalidPasswordValidUsername() throws IOException
	{
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameFieldOnUserNameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.signUpButton();	
	}


@Test
	public void verifyLoginWithValidPasswordAndInvalidUsername() throws IOException
	{
		String username = ExcelUtility.getStringData(2, 0,"LoginPage");
		String password = ExcelUtility.getStringData(2, 1,"LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameFieldOnUserNameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.signUpButton();
	}
	


@Test
	public void verifyLoginWIthInvalidPasswordAndInvalidUSername() throws IOException
	{
		String username = ExcelUtility.getStringData(3, 0,"LoginPage");
		String password = ExcelUtility.getStringData(3, 1,"LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameFieldOnUserNameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.signUpButton();
		
	}

	
}
