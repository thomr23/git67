package Selenium_Manipal;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Selenium_May7 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RajiThomas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
		WebElement link = driver.findElement(By.linkText("Car Rentals"));
//mouse hover
		Actions build = new Actions(driver);
		Action moveover = build.moveToElement(link).build();
		moveover.perform();
		build.sendKeys(link,(Keys.ENTER)).perform();
		
	
	
	}

}
