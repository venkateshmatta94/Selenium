package siblingTravesringUsingXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TraverseToSiblingUsingXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\software\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(1000);
		driver.get("http://www.qaclickacademy.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='homepage']/header/div[2]/div/nav/ul/li[4]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='tablist1-tab1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='tablist1-tab1']/following-sibling::li[1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath(".//*[@id='tablist1-tab1']/following-sibling::li[2]")).click();

	}

}
