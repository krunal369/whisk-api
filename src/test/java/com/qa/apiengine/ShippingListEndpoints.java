package com.qa.apiengine;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class ShippingListEndpoints {
	/**
	 * EndPoints are define shipping List
	 */
	
	//Declare Request variable
	private final RequestSpecification httpRequest;
	
	public ShippingListEndpoints(String BaseUrl, String token) {
		// define variable and respective header for request.
		RestAssured.baseURI = BaseUrl;
		httpRequest = RestAssured.given();		 
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "Bearer " + token);		
	}
	
	public Response createShippingList(String name,boolean primary) {
		/*
		 *This is endpoints to add new shipping list. It will consider take
		 *  two parameter name and primay and return response.
		 */
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "string"); 
		requestParams.put("primary", false);
		httpRequest.body(requestParams.toJSONString());
		return httpRequest.request(Method.POST, Route.shippingList());
	}
	public Response getShippingListById(String Id) {
		/*
		 *This is endpoints to get shipping list by Id and will return response.
		 */
		System.out.println(RestAssured.baseURI+Id);
		return httpRequest.request(Method.GET, Route.shoppingListId(Id));
    }
	public Response deleteShippingById(String Id) {
		/*
		 *This is endpoints to get shipping list by Id and will return response.
		 */
		return httpRequest.request(Method.DELETE, Route.shoppingListId(Id));
    }
	
}
