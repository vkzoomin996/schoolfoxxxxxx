package crud_operation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericutils.Endpoints;
import genericutils.SpecUtils;
import io.restassured.response.Response;
import pojoclass.Createresource;

import static io.restassured.RestAssured.*;

 
public class Create_a_Project extends SpecUtils{
	@Test
	public void create_a_resources() {
		
 
		Createresource cp=new Createresource("Veeresha K","SchoolFox"+jlib.getRandom(),"On-Going",7);

  	
  	Response res = given().spec(request).body(cp).when().post(Endpoints.createProject);
  	res.then().spec(response);
 	

}
}