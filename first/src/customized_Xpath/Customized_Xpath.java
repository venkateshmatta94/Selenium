package customized_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Customized_Xpath {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\software\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.facebook.com");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("venki@gmail.com");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("zxcvbnm");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();

		Thread.sleep(1000);
		driver.close();

	}
}
