package genericutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecUtils {
	public Filetuility flib= new Filetuility();
	public JavaUtils jlib=new JavaUtils();
	
	public WebDriver driver;
	

 	public RequestSpecification request;
	public ResponseSpecification response;
	@BeforeSuite
	public void bsConfig() throws Throwable {
		System.out.println("connected to database");
		String URL = flib.readdatafrompropertyFile("url");
		  request = new RequestSpecBuilder()
				  .setBaseUri(URL)
				  .setContentType(ContentType.JSON)
				  .build();
		   response = new ResponseSpecBuilder()
				   .expectContentType(ContentType.JSON).log(LogDetail.ALL)
				   .build();
		
			 
	}
	
	@AfterSuite
	public void asConfig() {
		System.out.println("disconnected with  database");
	}
	 

}
