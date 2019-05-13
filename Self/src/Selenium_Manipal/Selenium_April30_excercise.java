package Selenium_Manipal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_April30_excercise {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RajiThomas\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://newtours.demoaut.com/mercurysignon.php");
				
				//Enabled
				WebElement enb = driver.findElement(By.name("userName"));
				
				if (enb.isEnabled()) {
					enb.sendKeys("sunil");
					enb.clear();
					enb.sendKeys("sunil");
				}
				
				if (driver.findElement(By.name("userName")).isDisplayed()) {
				
					driver.findElement(By.name("password")).sendKeys("sunil");
					driver.findElement(By.name("login")).click();
				}
				
				if (driver.findElement(By.xpath("//*[@value='roundtrip']")).isSelected()){
					
					driver.findElement(By.xpath("//*[@value='oneway']")).click();
					
				}
				
				
	}
}
