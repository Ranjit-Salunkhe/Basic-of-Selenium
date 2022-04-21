package Basics.BasicsofSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver v100.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.uitestpractice.com/Students/Switchto");
	
	// Find alert button and perform click 
	WebElement alert1 = driver.findElement(By.id("alert"));
	alert1.click();
	Thread.sleep(3000);
	// switchTo  alert window and accept
	driver.switchTo().alert().accept(); // ok button is clicked
	Thread.sleep(3000);
	driver.navigate().refresh();
	
	
	// Find confirm button and perform ok & cancel operations
	WebElement confirm = driver.findElement(By.xpath("//button[@id='confirm']"));
	confirm.click();
	Thread.sleep(3000);
	// switchTo  alert window and cancel
	driver.switchTo().alert().dismiss();//cancel  button is clicked
	Thread.sleep(3000);
	driver.navigate().refresh();
	WebElement confirm1 = driver.findElement(By.xpath("//button[@id='confirm']"));
	confirm1.click();
	Thread.sleep(3000);
	// switchTo  alert window and accept
	driver.switchTo().alert().accept(); // ok button is clicked
	
	// handling promt alert
	
	driver.navigate().refresh();
	WebElement prompt = driver.findElement(By.xpath("//button[@id='prompt']"));
	prompt.click();
	Thread.sleep(3000);
	driver.switchTo().alert().sendKeys("Ranjit");
	driver.switchTo().alert().accept();
	
		
		
	
	
}
}
