package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BlazeDemo {
	@Test
	public void f() throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://blazedemo.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		Select departure_city = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		departure_city.selectByVisibleText("San Diego");

		Select destination_city = new Select(driver.findElement(By.name("toPort")));
		destination_city.selectByVisibleText("New York");

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		String tableInfo = driver.findElement(By.xpath("//tbody")).getText();
		System.out.println(tableInfo);
		
		
		

//		driver.findElement(By.xpath("(//input[@value='Choose This Flight'])[3]")).click();
//
//		// Purchase Flight click
//		driver.findElement(By.xpath("(//input[@value='Purchase Flight'])")).click();
//		Thread.sleep(1000);
//
//		String tyMsg = driver.findElement(By.xpath("//h1[text()='Thank you for your purchase today!']")).getText();
//		System.out.println(tyMsg);
//		System.out.println("***********************");
//
//		String allMsgs = driver.findElement(By.xpath("//div[contains(@class,'hero-unit')]")).getText();
//		System.out.println(allMsgs);

	}
}
