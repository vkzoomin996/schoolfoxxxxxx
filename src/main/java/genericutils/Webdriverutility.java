package genericutils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Webdriverutility {
	
	public void implcitwait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void max(WebDriver driver) {
		 driver.manage().window().maximize();
	}
}
