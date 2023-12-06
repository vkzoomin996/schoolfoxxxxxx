package genericutils;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

 
public class RestAssuredlib {
	public String getjsondata(Response response, String path) {
 String jsondata = response.jsonPath().get(path);
return jsondata;
 }

}
