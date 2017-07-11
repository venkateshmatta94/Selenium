package locatorTechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator_Techinque_using {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "E:\\software\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// opening google.com
		driver.get("http://www.google.com");
		// opening facebook.com
		Thread.sleep(2000);
		driver.get("http://www.fb.com");
		// entering fb-username
		driver.findElement(By.id("email")).sendKeys("8164569215");
		// entering fb-password
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("facebook@12");
		// clicking on login button
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='u_0_r']")).click();

		Thread.sleep(5000);
		// closing firefox browser
		driver.close();

	}

}
