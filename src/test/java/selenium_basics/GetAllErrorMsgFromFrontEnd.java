package selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllErrorMsgFromFrontEnd {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(10000);

		// Click on submit button without fill mandatory fields
		driver.findElement(By.id("submit")).click();

//		// get the text
//		String emailAddressErrorText = driver.findElement(By.className("alert alert-danger")).getText();
//		System.out.println(emailAddressErrorText);
		
		
		//Find the multiple elements
		List<WebElement> allWebElements = driver.findElements(By.xpath("//div[contains(@class,'alert-danger')]"));
		
		//Print all the error message by using advanced for loop
		for (WebElement abc : allWebElements) {
			System.out.println(abc.getText());
		}
		
		

	}

}
