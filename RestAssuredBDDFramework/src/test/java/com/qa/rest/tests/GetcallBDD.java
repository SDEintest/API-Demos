package com.qa.rest.tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matcher;


public class GetcallBDD {
	
@Test
public void test_numberOfCircuitsFor2018_Season(){
	given().
	when().
	get("http://ergast.com/api/f1/2018/circuits.json").
	then().assertThat().
	statusCode(200).
	and().
	body("MRData.CircuitTable.Circuits.circuitId", hasSize(20)).
	and().
	header("Content-Length", equalTo("4738"));
	    
}

}


