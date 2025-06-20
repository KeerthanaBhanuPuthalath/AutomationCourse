package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-toggle=\"dropdown\" ]")
	private WebElement adminDropDown;
	@FindBy(xpath = "//i[@class='ace-icon fa fa-power-off']")
	private WebElement logout;

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")
	private WebElement adminusersmoreinfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='active nav-link']")
	private WebElement managecategorytab;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and  @class='small-box-footer']")
	private WebElement Managenewsmoreinfo;

	public HomePage clickOnadmindropdownLink() {
		adminDropDown.click();
		return this;
	}

	public LoginPage clickOnLogoutOption() {
		logout.click();
		return new LoginPage(driver);
	}

	public boolean isLoginPageDisplayed() {
		return logout.isDisplayed();
	}

	public AdminUsersPage clickonAdminUsers()

	{
		adminusersmoreinfo.click();
		return new AdminUsersPage(driver);
	}

	public ManageCategoryPage clickonManageCategory()

	{
		managecategorytab.click();
		return new ManageCategoryPage(driver);
	}
	
	public ManageNewsPage clickonManagenews()
	{
		Managenewsmoreinfo.click();
		return new ManageNewsPage(driver);
	}
}
