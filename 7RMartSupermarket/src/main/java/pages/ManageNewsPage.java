package pages;

//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage 
{
	public WebDriver driver;
	public ManageNewsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[text()='Manage News']")private WebElement managenews;
	@FindBy(xpath="//a[@onclick='click_button(1)']") private WebElement newButton;
	@FindBy(xpath="//textarea[@name='news']")private WebElement textField;
	@FindBy(xpath="//button[@type='submit']")private WebElement saveButton;
	@FindBy(xpath ="//a[@class='btn btn-rounded btn-primary']")private WebElement searchButton;
	@FindBy(xpath="//input[@type='text']")private WebElement searchBox;
	@FindBy(xpath="//button[@class='btn btn-danger btn-fix']")private WebElement searchBoxButton;
	@FindBy(xpath="//a[@class='btn btn-default btn-fix']")private WebElement resetButton;
	public ManageNewsPage clickonManagenews()
	{
		managenews.click();
		return this;
	}
	
	public ManageNewsPage clickOnNewButtonFromManageNews()
	{
		newButton.click();
		return this;
	}
	
	public ManageNewsPage enterTheNewsInNewPage(String news)
	{
		textField.sendKeys(news);
		saveButton.click();
		return this;
	}
	
	public ManageNewsPage clickOnSearchButtonFromManageNewsPage()
	{
		searchButton.click();
		return this;
	}
	
	public ManageNewsPage enterValueInSearchField(String news)
	{
		searchBox.sendKeys(news);
		searchBoxButton.click();
		//resetButton.click();
		return this;
	}
	
	public boolean isManageNewsPageDisplayed()
	{
		return managenews.isDisplayed();
	}
	
	public boolean isNewNewsPageDisplayed()
	{
		return managenews.isDisplayed();
	}
	
	public boolean isNewsSaved(String news)
	{
		return managenews.isDisplayed();
	}
	
	public boolean isSearchResultsDisplayed()
	{
		return managenews.isDisplayed();	
	}
	
	public boolean isNewsFound(String news)
	{
		return managenews.isDisplayed();	}
}
