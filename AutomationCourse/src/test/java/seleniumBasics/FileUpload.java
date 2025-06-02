package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base
{
	//using tow methods, sendKeys and Robots
	public void verifyFileUploadUsingSendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement chooseFile=driver.findElement(By.id("uploadfile_0"));
		chooseFile.sendKeys("C:\\Users\\HP\\git\\AutomationCourse\\AutomationCourse\\src\\test\\resources\\Complaint screenshot.pdf");
		WebElement checkBox =driver.findElement(By.id("terms"));
		checkBox.click();
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
	}
	public void verifyRobotClass() throws AWTException
	{
		{
			driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
			WebElement selectPdfFile = driver.findElement(By.id("pickfiles"));
			selectPdfFile.click();
			StringSelection selection = new StringSelection("C:\\Users\\HP\\git\\AutomationCourse\\AutomationCourse\\src\\test\\resources\\Complaint screenshot.pdf");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
			Robot robot = new Robot();
			robot.delay(2500);
			robot.keyPress (KeyEvent.VK_ENTER);
			robot.keyRelease (KeyEvent.VK_ENTER);
			robot.keyPress (KeyEvent.VK_CONTROL);
			robot.keyPress (KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress (KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		}
	}
	public static void main(String[] args)
	{
		FileUpload upload = new FileUpload();
		upload.initializeBrowser();
		//upload.verifyFileUploadUsingSendKeys();
		try 
		{
			upload.verifyRobotClass();
		} 
		catch (AWTException e)
		{
			e.printStackTrace();
		}
		//upload.browserClose();
	}

}
