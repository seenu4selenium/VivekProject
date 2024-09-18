package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextDemo_ClgWeekLive {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(10000);

		// Click on submit button without fill mandatory fields
		driver.findElement(By.id("submit")).click();

		// get the text
		String emailAddressErrorText = driver.findElement(By.id("emailAddressError")).getText();
		System.out.println(emailAddressErrorText);

		String firstNameErrorText = driver.findElement(By.id("firstNameError")).getText();
		System.out.println(firstNameErrorText);

	}

}
