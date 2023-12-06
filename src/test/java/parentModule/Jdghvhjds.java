package parentModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Objectrepo.Loginpage;
import genericutils.Filetuility;

public class Jdghvhjds {
	//table//tr[*]/td[1]/../td[2]
	@Test
	public void nvkjer() throws Throwable {
		Filetuility flib=new Filetuility();
		 String Email = flib.readdatafrompropertyFile("username");
		 String Password = flib.readdatafrompropertyFile("password");
		 int no=9;

		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://rmgtestingserver/domain/Student_Management_System/view/all_teacher3.php");

	Loginpage lp=new Loginpage(driver);
	 Thread.sleep(5000);
	 lp.loginpage(Email, Password);
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//span[.='Teacher']")).click();
	 Thread.sleep(5000);

	 driver.findElement(By.xpath("//a[@href='all_teacher3.php']")).click();
 	WebElement web = driver.findElement(By.xpath("//table//tr["+no+"]//td[ 2]")); 
	System.out.println(web.getText());
	}
 
}
