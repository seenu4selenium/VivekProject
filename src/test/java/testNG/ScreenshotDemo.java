package testNG;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenshotDemo {
	@Test
	public void f() throws Exception {

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://blazedemo.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		// takescreenshot and store it into project folder
		// temp it will store in RAM location
		File temp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String projectpath = "C:\\Users\\nalla\\OneDrive\\Desktop\\Documents\\Vivek\\Selenium_Automation\\screenshots\\";
		//Move screenshot to specific location
		FileHandler.copy(temp, new File(projectpath+"blazedemoHomePage.png"));

	}
}
