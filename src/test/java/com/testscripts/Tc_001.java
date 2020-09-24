package com.testscripts;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.utils.EndpointURL;
import com.utils.URL;
import com.webservices.methods.Webservices;

import junit.framework.Assert;

public class Tc_001
{
	
	Response response;
	@BeforeClass
	public void setUp()
	{
		
	}
	
	@Test
	public void usedCars()
	{
		String url=URL.fixURL+EndpointURL.UsedCars.getResourcePath();
		response=Webservices.Get(url);
		//System.out.println(response.getBody().asString());
		int statuscode=response.getStatusCode();
		Assert.assertEquals(200,statuscode);
		
		JsonPath jsonpath=response.jsonPath();
		
		List<String> subcatogories=jsonpath.get("Subcategories");
		
		for(int i=1; i<=subcatogories.size(); i++) 
		{
			if(subcatogories.size()>0)
			{
				System.out.println("Atleast one listing present");
				break;
	        }
			else {
				System.out.println("No Listings for Used Cars");
	             }
		
	     }
    }
}
