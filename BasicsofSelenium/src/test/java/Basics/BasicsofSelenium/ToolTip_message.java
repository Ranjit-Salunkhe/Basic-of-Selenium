package Basics.BasicsofSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.EqualsMethod;

public class ToolTip_message {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver v100.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		WebElement Your_age= driver.findElement(By.id("age"));
		
		// to get attribute value
		String actual_tooltip=Your_age.getAttribute("title");
		String Expected_tooltip="We ask for your age only for statistical purposes.";
		if(actual_tooltip.equals(Expected_tooltip) )
		{
			System.out.println("test case passed");
		}
		else
		{
			System.out.println("test case failed");
		}
		Thread.sleep(2000);
		driver.close();
	}

}
