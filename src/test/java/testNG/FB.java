package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class FB {
	WebDriver driver;

	// open any browser
	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	// login to fb (url,data,login)
	@Test
	public void f() throws Exception {
		// type FB URL
		driver.get("https://www.facebook.com/");
		// Type UN&PWD
		driver.findElement(By.name("email")).sendKeys("Vivek#$%Tsdgvsdt534ydsf");
		driver.findElement(By.name("pass")).sendKeys("4w365ythbzdfgoijl");
		// Click on Login button
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
	}

	// take screenshot
	@AfterMethod
	public void afterMethod() throws Exception {
		Date d = new Date();
		System.out.println(d);// Tue Aug 27 05:59:11 MDT 2024
		// create user defined data format
		// yyyyMMMdd_HHmmss
		DateFormat df = new SimpleDateFormat("yyyyMMMdd_HHmmss");
		String timeStamp = df.format(d);

		File temp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String projectpath = ".\\screenshots\\";
		// Move screenshot to specific location
		FileHandler.copy(temp, new File(projectpath + "FB_" + timeStamp + ".png"));
	}

	// close the browser
	@AfterClass
	public void afterClass() {
		driver.quit();
		// driver.close();
	}

}
