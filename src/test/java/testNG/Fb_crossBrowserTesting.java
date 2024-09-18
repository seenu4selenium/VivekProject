package testNG;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fb_crossBrowserTesting {
	WebDriver driver;

	@Parameters("browserName")
	@BeforeClass
	public void beforeClass(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println(browserName + " Browser is not available in your local system");
		}

		driver.manage().window().maximize();
	}

	@Test
	public void f(String browserName) throws Exception {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("Vivek#$%Tsdgvsdt534ydsf");

		if (browserName.equalsIgnoreCase("chrome")) {
			driver.findElement(By.name("pass")).sendKeys("4w365ythbzdfgoijl");
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver.findElement(By.name("passf")).sendKeys("4w365ythbzdfgoijl");
		}

		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
	}

	@AfterMethod
	public void afterMethod() throws Exception {
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("yyyyMMMdd_HHmmss");
		String timeStamp = df.format(d);
		File temp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String projectpath = ".\\screenshots\\";
		FileHandler.copy(temp, new File(projectpath + "FB_" + timeStamp + ".png"));
	}

	@AfterClass
	public void afterClass() {
		// driver.quit();
	}

}
