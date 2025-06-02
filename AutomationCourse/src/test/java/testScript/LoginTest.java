package testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBasics.BaseTestNG;
import utilities.ExcelUtility;

public class LoginTest extends BaseTestNG
{
	@Test
	public void verifyUserLoginWithValidCredentials() throws IOException
	{
		//WebElement usernamefield = driver.findElement(By.xpath("//input[@id='user-name']"));
		//usernamefield.sendKeys("standard_user");
		//WebElement passwordfield = driver.findElement(By.xpath("//input[@id='password']"));
		//passwordfield.sendKeys("secret_sauce");
		//WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
		//loginbutton.click();
		String username = ExcelUtility.getStringData(0, 0,"LoginPage");
		String password = ExcelUtility.getStringData(0, 1,"LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameFieldOnUserNameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnLoginButton();
		
	}
	@Test
	public void verifyUserLoginWithInvalidPasswordAndValidUsername() throws IOException
	{
//		WebElement usernamefield = driver.findElement(By.xpath("//input[@id='user-name']"));
//		usernamefield.sendKeys("standard_user");
//		WebElement passwordfield = driver.findElement(By.xpath("//input[@id='password']"));
//		passwordfield.sendKeys("Keerthana");
//		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
//		loginbutton.click();
		String username = ExcelUtility.getStringData(1, 0,"LoginPage");
		String password = ExcelUtility.getStringData(1, 1,"LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameFieldOnUserNameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnLoginButton();
	}
	@Test
	public void verifyLoginWithValidPasswordAndInvalidUsername() throws IOException
	{
//		WebElement usernamefield = driver.findElement(By.xpath("//input[@id='user-name']"));
//		usernamefield.sendKeys("Keerthana");
//		WebElement passwordfield = driver.findElement(By.xpath("//input[@id='password']"));
//		passwordfield.sendKeys("secret_sauce");
//		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
//		loginbutton.click();
		String username = ExcelUtility.getStringData(2, 0,"LoginPage");
		String password = ExcelUtility.getStringData(2, 1,"LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameFieldOnUserNameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnLoginButton();
	}
	
	@Test
	public void verifyLoginWIthInvalidPasswordAndInvalidUSername() throws IOException
	{
//			WebElement usernamefield = driver.findElement(By.xpath("//input[@id='user-name']"));
//			usernamefield.sendKeys("Keerthana");
//			WebElement passwordfield = driver.findElement(By.xpath("//input[@id='password']"));
//			passwordfield.sendKeys("Keerthana123");
//			WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
//			loginbutton.click();
		String username = ExcelUtility.getStringData(3, 0,"LoginPage");
		String password = ExcelUtility.getStringData(3, 1,"LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameFieldOnUserNameField(username);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnLoginButton();
		
	}
}
