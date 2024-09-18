package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
//		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
//
//		driver.findElement(By.className("login_button")).click();
//		// Click on login button without fill any data
//		// system will display Alert
//
//		driver.findElement(By.id("Button2")).click();
//		Thread.sleep(3000);
//		//Get the alert text
//		System.out.println(driver.switchTo().alert().getText());
//		//To click on OK button on ALert
//		driver.switchTo().alert().accept();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class,'btn-danger')]")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(1000);

		//To click Alert with OK & Cancel tab
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class,'btn-primary')]")).click();
		Thread.sleep(1000);
		//to click on CANCLE option on Confirmation ALERT
		driver.switchTo().alert().dismiss();


		
		
		
		
		

	}

}
