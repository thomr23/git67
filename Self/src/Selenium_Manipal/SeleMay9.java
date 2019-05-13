package Selenium_Manipal;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleMay9 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RajiThomas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		
		//to get my Parent window
		
		String parentwindow = driver.getWindowHandle();
		System.out.println("Parent Window: "+parentwindow);
		WebElement Clickbutton = driver.findElement(By.id("button1"));
		//to click
		for (int i=0;i <= 3;i++) {
			Clickbutton.click();
			Thread.sleep(2000);
		
		
		}
		//to identify child window
		List<String> childwindows= new ArrayList<>(driver.getWindowHandles());
		System.out.println("Childwindows: "+childwindows);
		String lastwindow="";
		for (int i=1;i<childwindows.size();i++) {
			driver.switchTo().window(childwindows.get(i));
			driver.switchTo().window("http://www.google.com");
			lastwindow=childwindows.get(i).toString();//converts 
			
		}
		
		//switching back to parent
		
		driver.switchTo().window(parentwindow);
		driver.navigate().to("https://newtours.demoaut.com/");
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(lastwindow);
		driver.get("https:opensource-demo.orangehrmlive.com");
		driver.quit();
		
		
		
		
		
	
	
	}

}
