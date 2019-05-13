package Selenium_Manipal;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMay6excercise {

	
		public static void main(String[] args)  {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\RajiThomas\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://newtours.demoaut.com");
			
			//my code
			driver.findElement(By.linkText("Home")).click();
			System.out.println(driver.getTitle());
			if (driver.getTitle().contains("Under Construction")) {
				
				System.out.println("Page is not working");
				
			} else {

				System.out.println("Page is working");
			
			}
			driver.findElement(By.linkText("Flights")).click();
			System.out.println(driver.getTitle());
			if (driver.getTitle().contains("Under Construction")) {
				
				System.out.println("Page is not working");
				
			} else {

				System.out.println("Page is working");
			
			}
			driver.findElement(By.linkText("Hotels")).click();
			System.out.println(driver.getTitle());
			if (driver.getTitle().contains("Under Construction")) {
				
				System.out.println("Page is not working");
				
			} else {

				System.out.println("Page is working");
			
			}
			driver.findElement(By.linkText("Car Rentals")).click();
			System.out.println(driver.getTitle());
			if (driver.getTitle().contains("Under Construction")) {
				
				System.out.println("Page is not working");
				
			} else {

				System.out.println("Page is working");
			
			}
			driver.findElement(By.linkText("Cruises")).click();
			System.out.println(driver.getTitle());
			if (driver.getTitle().contains("Under Construction")) {
				
				System.out.println("Page is not working");
				
			} else {

				System.out.println("Page is working");
			
			}
			driver.findElement(By.linkText("Destinations")).click();
			System.out.println(driver.getTitle());
			if (driver.getTitle().contains("Under Construction")) {
				
				System.out.println("Page is not working");
				
			} else {

				System.out.println("Page is working");
			
			}
			driver.findElement(By.linkText("Vacations")).click();
			System.out.println(driver.getTitle());
			if (driver.getTitle().contains("Under Construction")) {
				
				System.out.println("Page is not working");
				
			} else {

				System.out.println("Page is working");
			
			}
			//other code
			/*for (int i=0;i<=6;i++) {
			
			List<WebElement> list = driver.findElements(By.className("mouseOut"));
			String pagename= list.get(i).getText();
			list.get(i).click();
			String title = driver.getTitle();
			
			if(title.startsWith("Under")) 
					{
				System.out.println(pagename + " : Not Working");
					}

			else 
					{
				System.out.println(pagename + " : Working");
					}
			
			}*/
		
		}
		
}
	
	
	
	


