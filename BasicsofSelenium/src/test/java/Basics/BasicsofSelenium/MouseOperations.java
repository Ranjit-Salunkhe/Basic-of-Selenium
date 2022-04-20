package Basics.BasicsofSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// Actions class is used to perform Mouse n Keyboard operations
public class MouseOperations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver v100.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		Actions actions =new Actions(driver);
		
		//right click 
		Thread.sleep(3000);
		WebElement RightClickBtn= driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		actions.contextClick(RightClickBtn).build().perform();
		
		
		// double click
		Thread.sleep(3000);
		WebElement doubleClickBtn= driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		actions.doubleClick(doubleClickBtn).build().perform();
		
		// single click
		//Thread.sleep(3000);
		//WebElement clickme= driver.findElement(By.id("soxqE"));
		//clickme.click();
	}

}
