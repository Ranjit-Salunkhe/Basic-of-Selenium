package Basics.BasicsofSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLink {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver v100.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		WebElement ocart = driver.findElement(By.xpath("//img[@title='OpenCart - Demo']"));
		ocart.click();
		
		if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution"))
		{
			System.out.println("testcase is passed");
			
		}
		else 
		{
			System.out.println("testcase is Failed");
		}
	}

}
