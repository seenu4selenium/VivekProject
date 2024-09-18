package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementsDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");
		// Editbox
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("asfsdgsdgds");

		// Radio button
		driver.findElement(By.name("radiooptions")).click();

		// Checkbox
		driver.findElement(By.id("checkbox3")).click();

		// Dropdown
		Select skills = new Select(driver.findElement(By.id("Skills")));
		skills.selectByVisibleText("PHP");

		// scroll down to the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("submitbtn")));

		// button
		driver.findElement(By.id("submitbtn")).click();

		// wait for page (1000 ms = 1s)
		Thread.sleep(5000);

		// scroll down to the page		
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("Button1")));

		// refresh button
		driver.findElement(By.id("Button1")).click();

		// to close the current window
		// driver.quit();
	}

}
