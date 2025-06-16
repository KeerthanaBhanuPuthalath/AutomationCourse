package testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base
{
	@Test(description = "User able click on manage category")
	public void verifyWhetherUserAbleToClickManageCategoryTile() throws IOException
	{
		String username = ExcelUtility.getStringData(0, 0,"LoginPage");
		String password = ExcelUtility.getStringData(0, 1,"LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameFieldOnUserNameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.signUpButton();
		
		ManageCategoryPage managecategorypage = new ManageCategoryPage(driver);
		managecategorypage.clickonManageCategory();
		Assert.assertTrue(managecategorypage.isManageCategoryPageDisplayed(), "Navigation to Manage Category page failed!");
	}
	
@Test(description = "User able click on new button from manage category")	
	public void verifyWhetherUserAbleToNewButtonFromManageCategory() throws IOException
	{
		String username = ExcelUtility.getStringData(0, 0,"LoginPage");
		String password = ExcelUtility.getStringData(0, 1,"LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameFieldOnUserNameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.signUpButton();
		
		ManageCategoryPage managecategorypage = new ManageCategoryPage(driver);
		managecategorypage.clickonManageCategory();
		managecategorypage.clickonNewButton();
		Assert.assertTrue(managecategorypage.isNewCategoryFormDisplayed(), "Failed to navigate to the New Category creation form!");
	}
	

@Test(description = "User able create new category")

public void verifyWhetherUserAbleToCreateNewCategory() throws IOException
{
	String username = ExcelUtility.getStringData(0, 0,"LoginPage");
	String password = ExcelUtility.getStringData(0, 1,"LoginPage");
	String category=ExcelUtility.getStringData(0, 0, "ManageCategory");
	LoginPage loginPage = new LoginPage(driver);
	loginPage.enterUserNameFieldOnUserNameField(username);
	loginPage.enterPasswordOnPasswordField(password);
	loginPage.signUpButton();
	
	ManageCategoryPage managecategorypage = new ManageCategoryPage(driver);
	managecategorypage.clickonManageCategory();
	managecategorypage.clickonNewButton();
	managecategorypage.clickonAddCategory(category);
//	managecategorypage.clickonRadioButton();
//	managecategorypage.clickOnSaveButton();
	 Assert.assertTrue(managecategorypage.isCategoryCreated(category), "Category creation failed: New category not found!");
}

@Test(description = "User able search the newly added category")
public void verifyWhetherUserAbleToSearchTheCategory() throws IOException
{
	String username = ExcelUtility.getStringData(0, 0,"LoginPage");
	String password = ExcelUtility.getStringData(0, 1,"LoginPage");
	String category=ExcelUtility.getStringData(0, 0, "ManageCategory");
	LoginPage loginPage = new LoginPage(driver);
	loginPage.enterUserNameFieldOnUserNameField(username);
	loginPage.enterPasswordOnPasswordField(password);
	loginPage.signUpButton();
	
	ManageCategoryPage managecategorypage = new ManageCategoryPage(driver);
	managecategorypage.clickonManageCategory();
	managecategorypage.searchNewCategory(category);
	Assert.assertTrue(managecategorypage.isCategoryFound(category), "Search failed: Category not found!");
}

}
