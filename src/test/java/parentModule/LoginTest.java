package parentModule;

import org.testng.annotations.Test;

import Objectrepo.Loginpage;
import genericutils.BaseClass;
import genericutils.Filetuility;

public class LoginTest extends BaseClass{
	Filetuility flib=new Filetuility();
 @Test
 public void logintest() throws Throwable {
	 String Email = flib.readdatafrompropertyFile("username");
	 String Password = flib.readdatafrompropertyFile("password");
	 Loginpage lp=new Loginpage(driver);
	 Thread.sleep(5000);
	 lp.loginpage(Email, Password);
	 Thread.sleep(5000);

 	 


	 
 }
	

}
