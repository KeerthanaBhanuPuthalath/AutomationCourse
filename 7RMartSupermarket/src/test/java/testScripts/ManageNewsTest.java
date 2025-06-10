package testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.Base;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base

{
	@Test
	
	public void verifyWhetherUserAbleToClickOnManageNewsTile() throws IOException
	{
		String username = ExcelUtility.getStringData(0, 0,"LoginPage");
		String password = ExcelUtility.getStringData(0, 1,"LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameFieldOnUserNameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.signUpButton();
		
		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage.clickonManagenews();
	}
	
	
	@Test
	public void verifyWhetherUserAbleToClickOnNewButton() throws IOException
	{
		String username = ExcelUtility.getStringData(0, 0,"LoginPage");
		String password = ExcelUtility.getStringData(0, 1,"LoginPage");
		//String news= ExcelUtility.getStringData(0, 0, "ManageNews");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameFieldOnUserNameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.signUpButton();
		
		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage.clickonManagenews();
		managenewspage.clickOnNewButtonFromManageNews();
	}
@Test
	public void verifyWhetherUserAbleToAddNewsAndSave() throws IOException
	{
		String username = ExcelUtility.getStringData(0, 0,"LoginPage");
		String password = ExcelUtility.getStringData(0, 1,"LoginPage");
		String news= ExcelUtility.getStringData(0, 0,"ManageNews");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameFieldOnUserNameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.signUpButton();
		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage.clickonManagenews();
		managenewspage.clickOnNewButtonFromManageNews();
		managenewspage.enterTheNewsInNewPage(news);
	}

@Test	
	public void verifyWhetherUserAbleToClickOnSearchButton() throws IOException
	{
		String username = ExcelUtility.getStringData(0, 0,"LoginPage");
		String password = ExcelUtility.getStringData(0, 1,"LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameFieldOnUserNameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.signUpButton();
		
		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage.clickonManagenews();
		managenewspage.clickOnSearchButtonFromManageNewsPage();
	}

@Test
	public void verifyWhetherUserAbleToSearchTheEnteredValue() throws IOException
	{
		String username = ExcelUtility.getStringData(0, 0,"LoginPage");
		String password = ExcelUtility.getStringData(0, 1,"LoginPage");
		String news= ExcelUtility.getStringData(0, 0,"ManageNews");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameFieldOnUserNameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.signUpButton();
		
		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage.clickonManagenews();
		managenewspage.clickOnSearchButtonFromManageNewsPage();
		managenewspage.enterValueInSearchField(news);
		
	}
}
