package Selenium_Manipal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_April30 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RajiThomas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		String expectedTitle = driver.getTitle();
		System.out.println("Expected Title: "+expectedTitle);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		String actualTitle = driver.getTitle();
		System.out.println("Actual title: "+actualTitle);
		if(expectedTitle.equals(actualTitle)) {
			
			System.out.println("Both are same");
			Thread.sleep(3000);
			driver.findElement(By.id("welcome")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='welcome-menu']/ul/li[2]/a")).click();
			
			
			
		}
		
		else {
			
			System.out.println("Both are not same");
			driver.close();
		}
		
		
		
		
		
		
		
		
	}

}
