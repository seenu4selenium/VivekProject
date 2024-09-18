package testNG;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCaseExecution_Assignment11 {

	WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opencart-prf.exense.ch/index.php?route=account/login");
	}

	@Test
	public void tc_01() throws Exception {
		driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]")).click();
		String erormsg = driver
				.findElement(By.xpath("//*[text()=' Warning: No match for E-Mail Address and/or Password.']"))
				.getText();
		System.out.println(erormsg);
	}

	@Test
	public void tc_02() throws Exception {
		//Clear the existing test data
		driver.findElement(By.xpath("//input[@placeholder = 'E-Mail Address']")).clear();
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).clear();
		driver.findElement(By.xpath("//input[@placeholder = 'E-Mail Address']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]")).click();
		String erormsg = driver
				.findElement(By.xpath("//*[text()=' Warning: No match for E-Mail Address and/or Password.']"))
				.getText();
		System.out.println(erormsg);

	}

	@Test
	public void tc_03() throws Exception {
		driver.findElement(By.xpath("//input[@placeholder = 'E-Mail Address']")).clear();
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).clear();
		driver.findElement(By.xpath("//input[@placeholder = 'E-Mail Address']")).sendKeys("asingh@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]")).click();

		// verify new page has displayed or not
		if (driver.findElements(By.linkText("Change your password")).size() > 0) {// 1>0
			System.out.println("The given element is present on screen");
		} else {
			System.out.println("The given element is NOT present on screen");
		}
		Thread.sleep(5000);
	}

	@Test
	public void tc_04() throws Exception {
		driver.findElement(By.xpath("(//*[text()='Logout'])[2]")).click();
		Thread.sleep(5000);
	}

	@AfterMethod
	public void myscreenshot() throws Exception {
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("yyyyMMMdd_HHmmss");
		String timeStamp = df.format(d);

		File scrn1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrn1, new File("./screenshots/TestCaseExecution_Assignment11_" + timeStamp + ".png"));
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
