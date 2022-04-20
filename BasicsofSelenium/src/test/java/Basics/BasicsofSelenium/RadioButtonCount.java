package Basics.BasicsofSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonCount {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver v100.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		List<WebElement> rodioCount= driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println("Total number of Radio Buttons:"+ rodioCount.size() );
		
	}

}
