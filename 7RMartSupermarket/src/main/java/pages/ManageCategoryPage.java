package pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ManageCategoryPage
{
	public WebDriver driver;
	public ManageCategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//p[text()='Manage Category']")private WebElement manageCategory;
@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement newButton;
@FindBy(xpath="//input[@name='category']")private WebElement categoryField;
@FindBy(xpath="//li[@id='134-selectable']")private WebElement selectGroup;
@FindBy(xpath="//input[@type='file']")private WebElement image;
@FindBy(xpath="//input[@type='radio' and @value='yes']")private WebElement topMenu;
@FindBy(xpath="//input[@type='radio' and @value='yes']")private WebElement leftMenu;
@FindBy(xpath="//button[@type='submit']")private WebElement saveButton;
@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement search;
@FindBy(xpath="//button[@class='btn btn-danger btn-fix']")private WebElement searchButton;
@FindBy(xpath="//input[@class='form-control']")private WebElement searchCategory;



//button[@class='btn btn-danger btn-fix']

public void clickonManageCategory()
{
	manageCategory.click();
	
}

public void clickonNewButton()
{
	newButton.click();
}

public void clickonAddCategory(String category)
{
	categoryField.sendKeys(category);
	selectGroup.click();
	image.sendKeys("C:\\Users\\HP\\eclipse-workspace\\7RMartSupermarket\\src\\test\\resources\\Screenshot 2025-03-21 202932.png");
	Actions actions = new Actions(driver);
	actions.sendKeys(Keys.PAGE_DOWN).perform();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	topMenu.click();
	leftMenu.click();
	saveButton.click();
}

//public void clickonRadioButton()
//{
////	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////	wait.until(ExpectedConditions.elementToBeClickable(topMenu)).click();
////	wait.until(ExpectedConditions.elementToBeClickable(leftMenu)).click();
////	wait.until(ExpectedConditions.visibilityOf(topMenu));
////	wait.until(ExpectedConditions.visibilityOf(leftMenu));
//	
//		//topMenu.click();
//		//System.out.println("Top menu selected: " + topMenu.isSelected());
//	    //topMenu.sendKeys(Keys.SPACE);
//		//leftMenu.click();
//		//System.out.println("left menu selected: " + leftMenu.isSelected());
//	    //leftMenu.sendKeys(Keys.SPACE);
//}

//public void clickOnSaveButton()
//{
//	saveButton.click();
//	System.out.println("Saved");
//}

public void searchNewCategory(String category)
{
	search.click();
	searchCategory.sendKeys(category);
	searchButton.click();
}

public boolean isManageCategoryPageDisplayed()
{
	return manageCategory.isDisplayed();
}

public boolean isNewCategoryFormDisplayed()
{
	return manageCategory.isDisplayed();
}

public boolean isCategoryCreated(String category)

{
	return manageCategory.isDisplayed();
}

public boolean isCategoryFound(String category)
{
	return manageCategory.isDisplayed();
}

}
