package Selenium_Manipal;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleMay8Excercise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RajiThomas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,"t"));
		Thread.sleep(3000);
		
		ArrayList<String>tabs=new ArrayList<String>(driver.getWindowHandles());
		System.out.println("TABS: "+tabs.size());
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(1));
		
		

	}

}
