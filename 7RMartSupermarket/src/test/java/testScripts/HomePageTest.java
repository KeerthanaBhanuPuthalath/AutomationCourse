package testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.Base;
import pages.LoginPage;
import pages.HomePage;
import utilities.ExcelUtility;

public class HomePageTest extends Base 
{
	
	@Test

		public void verifyWhetherUserAbleToLogout() throws IOException
		{
			String username = ExcelUtility.getStringData(0, 0,"LoginPage");
			String password = ExcelUtility.getStringData(0, 1,"LoginPage");
			LoginPage loginPage = new LoginPage(driver);
			loginPage.enterUserNameFieldOnUserNameField(username);
			loginPage.enterPasswordOnPasswordField(password);
			loginPage.signUpButton();
			
			HomePage logoutPage = new HomePage(driver);
			logoutPage.clickOnadmindropdownLink();
			logoutPage.clickOnLogoutOption();
		}

}
