package testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base

{
	@Test(description = "User able click on manage news")
	
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
		Assert.assertTrue(managenewspage.isManageNewsPageDisplayed(), "Navigation to Manage News page failed!");
	}
	
	
	@Test(description = "User able click on new button from manage news")
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
		Assert.assertTrue(managenewspage.isNewNewsPageDisplayed(), "Failed to navigate to the New News creation page!");
	}
@Test(description = "User able to create new news and save the news")
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
		Assert.assertTrue(managenewspage.isNewsSaved(news), "News creation failed: News entry not found!");
	}

@Test(description = "User able to click on search button")	
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
	    Assert.assertTrue(managenewspage.isSearchResultsDisplayed(), "Search failed: No results found!");
	}

@Test(description = "User able to search newly added news")
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
		Assert.assertTrue(managenewspage.isNewsFound(news), "Search failed: News entry not found!");
	}
}
