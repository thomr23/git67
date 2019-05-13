package Selenium_Manipal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SeleniumMay7Excercise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RajiThomas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://realestate.upskills.in/admin");
		
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		WebElement link = driver.findElement(By.xpath("//*[@class='menupop with-avatar']"));
		Actions click = new Actions(driver);
		click.moveToElement(link).click().build().perform();
		
		/*WebElement howdy=driver.findElement(By.xpath("//*[@class='ab-item']"));
		Actions build = new Actions(driver);
		Action build2 = build.moveToElement(howdy).build();
		build2.perform();
		build.sendKeys(howdy, (Keys.ENTER)).perform();
		
		//WebElement PIM = driver.findElement(By.id("menu_pim_viewPimModule"));
		
		/*Actions build = new Actions(driver);
		Action PIM1 = build.moveToElement(PIM).build();
		PIM1.perform();
		build.sendKeys(PIM,(Keys.ENTER)).perform();*/
		
		//Actions button = new Actions(driver);
		//button.sendKeys(Keys.ENTER).perform();
		//button.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		/*WebElement menu = driver.findElement(By.id("menu-catalog"));
		Actions action = new Actions(driver);
		action.moveToElement(menu).build().perform();
		action.moveToElement(menu).click();*/
		

	}

}
