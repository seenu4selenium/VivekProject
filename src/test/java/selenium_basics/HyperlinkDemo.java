package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperlinkDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//click on Forgot password? hyperlink
		driver.findElement(By.linkText("Forgot password?")).click();		
		//driver.findElement(By.partialLinkText("org")).click();
		
		//Navigational commands
		
		//back()
		driver.navigate().back();
		Thread.sleep(3000);
		
		
		//forward()
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.findElement(By.name("email")).sendKeys("sd5wegv463eryf");
		Thread.sleep(3000);

		//refresh()
		driver.navigate().refresh();
		Thread.sleep(3000);

	}
	
	

}
