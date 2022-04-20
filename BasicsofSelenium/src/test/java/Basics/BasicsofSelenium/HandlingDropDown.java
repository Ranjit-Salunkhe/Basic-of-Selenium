package Basics.BasicsofSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandlingDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver v100.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.opencart.com/");
		WebElement register =driver.findElement(By.className("btn-black"));
		register.click();
		driver.manage().window().maximize();
		WebElement country = driver.findElement(By.id("input-country"));
		
		Select dropdown=new Select(country);
		//dropdown.selectByVisibleText("Hong Kong");
		dropdown.selectByValue("1");
		

	}

}
