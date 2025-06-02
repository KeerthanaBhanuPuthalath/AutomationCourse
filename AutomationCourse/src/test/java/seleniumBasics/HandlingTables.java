package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTables extends Base
{
	public void verifyTableHandlings()
	{
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement fullTable = driver.findElement(By.xpath("//table[@id='dataTable']"));
		System.out.println(fullTable.getText());
		WebElement tableRow = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[3]"));
		System.out.println(tableRow.getText());
	}

	public static void main(String[] args) 
	{
		HandlingTables tables =new HandlingTables();
		tables.initializeBrowser();
		tables.verifyTableHandlings();
		//tables.browserClose();

	}

}
