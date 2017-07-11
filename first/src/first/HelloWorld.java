package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "E:\\software\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
