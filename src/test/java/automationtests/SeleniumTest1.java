package automationtests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest1 {

	// TODO Auto-generated method stub

	WebDriver driver = null;

	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asd\\workspace\\Test-2\\com.testautomation1.test1\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://github.com/Shaswat5584/Test-2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println("Title: " + driver.getTitle());
		// driver.close();
	}

}
