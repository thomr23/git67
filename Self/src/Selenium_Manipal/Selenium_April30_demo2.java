package Selenium_Manipal;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_April30_demo2 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\RajiThomas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		
		//send values
		driver.findElement(By.name("userName")).sendKeys("sunil");
		
		//print the value passed now
		String username = driver.findElement(By.name("userName")).getAttribute("value");//getAttribute for field not gettext..gettext is for dropdown
		System.out.println(username);
		
		driver.findElement(By.name("password")).sendKeys("sunil");
		
		driver.findElement(By.xpath("//input[@type='image']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		//Code to select dropdown--eg1 
		WebElement DD = driver.findElement(By.name("passCount"));
		Select sel = new Select (DD);
		sel.selectByVisibleText("2");
		
		//Code to select dropdown --eg2
		WebElement DD1 = driver.findElement(By.name("fromPort"));//dropdown
		Select sel1 = new Select (DD1);//
		sel1.selectByVisibleText("Portland");
		
		//Number of elements in a dropdown
		List<WebElement> op1 = sel1.getOptions();
		System.out.println(op1.size());
		
		//Print values of dropdown
		for (int i = 0; i < op1.size(); i++) {
			
			System.out.println(op1.get(i).getText());
			
		}
		
		//Click radiobutton
		driver.findElement(By.xpath("//*[@type ='radio' and @value='Business']")).click();
		//click continue
		driver.findElement(By.name("findFlights")).click();
		//click continue in next page
		driver.findElement(By.name("reserveFlights")).click();
		//fill in Firstname,lastname,Number
		driver.findElement(By.name("passFirst0")).sendKeys("Raji");
		driver.findElement(By.name("passLast0")).sendKeys("Simon");
		driver.findElement(By.name("creditnumber")).sendKeys("2134567");
		
		//Select 2 checkboxes
		List<WebElement> checkbox = driver.findElements(By.name("ticketLess"));
		
		for(WebElement e:checkbox) { //enhanced for loop//for clicking all checkbox
			
			e.click();
		}
		for (int i=0;i<checkbox.size()-1;i++) {//for only clicking one checkbox
			
			checkbox.get(i).click();
		}
		
		driver.findElement(By.name("buyFlights")).click();
		
		
		
		

	}

}

