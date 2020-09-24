package com.testscripts;

import java.util.List;
import org.json.JSONObject;
import org.json.XML;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.utils.EndpointURL;
import com.utils.URL;
import com.webservices.methods.Webservices;

import junit.framework.Assert;

public class TC_002 
{
	
	

		Response response;
		@BeforeClass
		public void setUp()
		{
			
		}
		
		@Test
		public void verifyKiaExists()
		{
		String url=URL.fixURL+EndpointURL.UsedCars.getResourcePath();
		response=Webservices.Get(url);
		
		int statuscode=response.getStatusCode();
		Assert.assertEquals(200,statuscode);
		
		JsonPath jsonpath=response.jsonPath();
		String Kia=jsonpath.get("Subcategories[34].Name");
		Assert.assertEquals("Kia",Kia);
		
		
	    }

}
