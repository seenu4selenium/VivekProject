
package testNG;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import org.testng.annotations.Test;

public class FirstTestNG_Assignment {

	@Test

	public void f() throws Exception {

		WebDriver driver;

		driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");
		          
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.findElement(By.linkText("Practice Site")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("My Account")).click();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("abc@y.com");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Baburao^3974");

		driver.findElement(By.xpath("//input[@value='Login']")).click();
		//wait for page load
		Thread.sleep(3000);

		String msg = driver.findElement(By.xpath("//strong[text()='abc62']")).getText();

		System.out.println(msg);

		String allTxt = driver.findElement(By.xpath("//div[@class='woocommerce-MyAccount-content']")).getText();

		System.out.println(allTxt);
		Thread.sleep(3000);

		driver.findElement(By.linkText("Logout")).click();

	}

}