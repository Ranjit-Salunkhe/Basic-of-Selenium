package Basics.BasicsofSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// Save txt fil at desktop with name "My Docs"
public class HowToUploadFiles {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver v100.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/upload-download");
	
	// To upload file - two methods -
	// 1) Sendkeys method 2) robot class
	// when choose file(webelement) has attribute value type='File'
	// then only we can use Sendkeys method
	
	WebElement ChooseFile = driver.findElement(By.id("uploadFile"));
	/*ChooseFile.sendKeys("C:\\Users\\DELL\\Desktop\\My Docs.txt"); // My Docs file path*/
	
	//2) robot class
	//when choose file(webelement) has  not attribute value  like type='File'
	//then we need to use robot class
	Actions actions = new Actions(driver);
	actions.click(ChooseFile).build().perform();
	
	Robot rb = new Robot();
	rb.delay(3000);
	
	// To copy path of file to be uploaded in clipboard
	StringSelection ss= new StringSelection("C:\\Users\\DELL\\Desktop\\MY Docs.txt");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
	
	// Prform contrl + V action
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
}

}
