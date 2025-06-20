package testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.LoginPage;
import pages.HomePage;
import utilities.ExcelUtility;

public class HomePageTest extends Base {

	@Test(description = "User able to logout")

	public void verifyWhetherUserAbleToLogout() throws IOException {
		HomePage homepage;
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameFieldOnUserNameField(username).enterPasswordOnPasswordField(password);
		// loginPage.enterPasswordOnPasswordField(password);
		homepage = loginPage.signUpButton();

		//HomePage logoutPage = new HomePage(driver);
		homepage.clickOnadmindropdownLink();
		//logoutPage.clickOnadmindropdownLink();
		homepage.clickOnLogoutOption();
		Assert.assertTrue(homepage.isLoginPageDisplayed(),
				"Logout failed: User is not redirected to the login page!");
	}

}
