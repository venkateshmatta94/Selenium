package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver_win32\\chromedriver");
		WebDriver f = new ChromeDriver();
		f.get("http://www.fb.com");
	}

}
