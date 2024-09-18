package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) {

		// Open any browser (Chrome)
		WebDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();

		// type FB URL
		driver.get("https://www.facebook.com/");

		// Type UN&PWD
		driver.findElement(By.name("email")).sendKeys("Vivek#$%Tsdgvsdt534ydsf");
		driver.findElement(By.name("pass")).sendKeys("4w365ythbzdfgoijl");

		// Click on Login button
		driver.findElement(By.name("login")).click();
	}

}
