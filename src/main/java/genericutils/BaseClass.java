package genericutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	public ExcelUtils elib=new ExcelUtils();
	public Filetuility flib= new Filetuility();
	public JavaUtils jlibJavaUtils=new JavaUtils();
	public Webdriverutility wlib=new Webdriverutility();
	public WebDriver driver;
	 
	@BeforeSuite
	public void bsconfif() {
		System.out.println("connected to data base");
		
	}
	@AfterSuite
	public void asconfig() {
		System.out.println("close database");
	}
	@BeforeClass
	public void  bcConfig() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver=new ChromeDriver();
		
		
	}
	@AfterClass
	public void acConfig() {
		driver.close();
		
	}
	@BeforeMethod
	public void bmconfig() throws Throwable {
		System.out.println("login to the application");
		 String URL = flib.readdatafrompropertyFile("urll");
 		 driver.get(URL);
	}
	@AfterMethod
	public void amConfig() {
		System.out.println("logOut from the application");

	}
	
	

}
