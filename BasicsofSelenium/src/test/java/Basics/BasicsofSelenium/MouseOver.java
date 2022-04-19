package Basics.BasicsofSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver v100.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ebay.in/");

		// Shipping & Payments
		Thread.sleep(3000);
		WebElement Ship_payments = driver.findElement(By.linkText("Shipping & Payments"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Ship_payments).build().perform();
		Thread.sleep(3000);

		// Seller Updates
		WebElement SellerUpdates = driver.findElement(By.linkText("Seller Updates"));
		actions.moveToElement(SellerUpdates).build().perform();
		Thread.sleep(3000);
		// Product Listing
		WebElement ProductListing = driver.findElement(By.linkText("Product Listing"));
		actions.moveToElement(ProductListing).build().perform();
		Thread.sleep(3000);
		driver.close();
	}
///////
}
