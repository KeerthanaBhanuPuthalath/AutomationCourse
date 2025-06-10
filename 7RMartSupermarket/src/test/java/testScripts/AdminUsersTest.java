package testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.Base;
import pages.AdminUsersPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUsersTest extends Base
{
	@Test
	public void verifyWhetherUserAbleToClickAdminUsersTile() throws IOException
	{
		String username = ExcelUtility.getStringData(0, 0,"LoginPage");
		String password = ExcelUtility.getStringData(0, 1,"LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameFieldOnUserNameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.signUpButton();
		
		AdminUsersPage adminuserspage = new AdminUsersPage(driver);
		adminuserspage.clickonAdminUsers();
	}
@Test	
	public void verifyWhetherUserAbleToCreateNewUser() throws IOException
	{
		String username = ExcelUtility.getStringData(0, 0,"LoginPage");
		String password = ExcelUtility.getStringData(0, 1,"LoginPage");
		String adminusername = ExcelUtility.getStringData(0, 0,"AdminUsers");
		String adminpassword = ExcelUtility.getStringData(0, 1,"AdminUsers");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameFieldOnUserNameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.signUpButton();
		
		AdminUsersPage adminuserspage = new AdminUsersPage(driver);
		adminuserspage.clickonAdminUsers();
		adminuserspage.newUserCreation(adminusername, adminpassword);
	}
@Test
public void verifyWhetherUserAbleToSearchNewUser() throws IOException
{
	String username = ExcelUtility.getStringData(0, 0,"LoginPage");
	String password = ExcelUtility.getStringData(0, 1,"LoginPage");
	String adminusername = ExcelUtility.getStringData(0, 0,"AdminUsers");
	//String adminpassword = ExcelUtility.getStringData(0, 1,"AdminUsers");
	LoginPage loginPage = new LoginPage(driver);
	loginPage.enterUserNameFieldOnUserNameField(username);
	loginPage.enterPasswordOnPasswordField(password);
	loginPage.signUpButton();
	
	AdminUsersPage adminuserspage = new AdminUsersPage(driver);
	adminuserspage.clickonAdminUsers();
	adminuserspage.searchNewUser(adminusername);
}
}
