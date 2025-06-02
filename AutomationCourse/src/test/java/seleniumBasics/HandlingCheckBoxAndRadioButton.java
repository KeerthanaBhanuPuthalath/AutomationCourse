package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingCheckBoxAndRadioButton extends Base
{
	public void verifyCheckBox()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkBox = driver.findElement(By.xpath("//input[@value='option-1']"));
		checkBox.click();
		System.out.println("Selected : "+checkBox.isSelected());
		
	}
	public void verifyRadioButton()
	{
		//driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='orange']"));
		radioButton.click();
	}

	public static void main(String[] args) 
	{
		HandlingCheckBoxAndRadioButton checkBoxAndRadioButton =new HandlingCheckBoxAndRadioButton();
		checkBoxAndRadioButton.initializeBrowser();
		checkBoxAndRadioButton.verifyCheckBox();
		checkBoxAndRadioButton.verifyRadioButton();
		//checkBoxAndRadioButton.browserClose();

	}

}
