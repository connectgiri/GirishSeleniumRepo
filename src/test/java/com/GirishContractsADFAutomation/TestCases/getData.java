package com.GirishContractsADFAutomation.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getData {
	
	
	
	@Test
	public void tesResponseCode() {
		Response resp=RestAssured.get("https://fuscdrmsmc350-fa-ext.us.oracle.com/crmRestApi/resources/latest");
		
		int code=resp.getStatusCode();
		String response=resp.asString();
		System.out.println("Response string:"+ response);
		System.out.println("status:"+ code);
		Assert.assertEquals(code, 200);
	}

	@Test
	public void post() {
		 RestAssured.baseURI = "https://fuscdrmsmc350-fa-ext.us.oracle.com";
         RestAssured.basePath = "/fscmRestApi/resources";		
		 RestAssured.authentication =    RestAssured.basic("ALM_QA", "Welcome1");
		 
		RestAssured.given()
		.when()
		.body("{\n" +
			  "  \"AssetNumber\":\"ATS_OSS_Asset39b32425831\", \n" +
			  "  \"Description\":\"ATS_OSS_Asset28b32425831\",  \n" +
			  " \"CustomerId\":1005, \"CustomerAccountId\":1005,  \n" +
			  " \"CustomerAccountSiteUseId\":1023, \n" +
			  " \"ItemId\":300100173347396, \n" +
			  " \"ItemOrganizationId\":204, \n" +
			  " \"Quantity\":1, \n" +
			  " \"UpdateContractFlag\":\"N\", \n" +
			  " \"ShipmentDate\":\"2019-03-15\n" +
			  "\n\"\n" +
			  "}")
		.header("Authorization","Basic QUxNX1FBOldlbGNvbWU2NDk=")
		.post("/latest/customerAssets")
		.then()
		.assertThat()
		.statusCode(201);
		
	}
	
}
