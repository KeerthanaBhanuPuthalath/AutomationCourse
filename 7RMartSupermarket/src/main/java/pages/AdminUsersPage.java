package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUsersPage 
{
	public WebDriver driver;
	public AdminUsersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//a[@class='small-box-footer']")private WebElement adminUser;
@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement newButton;
@FindBy(xpath="//input[@name='username']")private WebElement usernameField;
@FindBy(xpath="//input[@name='password']")private WebElement passwordField;
@FindBy(xpath="//select[@id='user_type']")private WebElement usertypeDropdown;
@FindBy(xpath="//button[@name='Create']")private WebElement saveButton;
//@FindBy(xpath="//a[@type='button']")private WebElement resetButton;
@FindBy(xpath="//input[@type='text']")private WebElement usernameSearch;
@FindBy(xpath="//select[@name='ut']")private WebElement searchDropdown;
@FindBy(xpath="//button[@name='Search']")private WebElement userSearchButton;
@FindBy(xpath="//a[@onclick='click_button(2)']")private WebElement searchButton;
public void clickonAdminUsers()
{
	adminUser.click();
	newButton.click();
}

public void newUserCreation(String username, String password)
{
	usernameField.sendKeys(username);
	passwordField.sendKeys(password);
	Select select = new Select(usertypeDropdown);
	select.selectByIndex(2);
	saveButton.click();
}

public void searchNewUser(String username)
{
	searchButton.click();
	usernameSearch.sendKeys(username);
	Select select = new Select(searchDropdown);
	select.selectByIndex(2);
	userSearchButton.click();
}

public boolean  isAdminUsersPageDisplayed()
{
	return adminUser.isDisplayed();
}

public boolean isNewUserDisplayed(String adminusername)
{
	return adminUser.isDisplayed();
}

public boolean isUserFound(String adminusername)
{
	return adminUser.isDisplayed();
}
}
