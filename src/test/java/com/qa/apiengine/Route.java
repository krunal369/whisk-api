package com.qa.apiengine;

public class Route {
	private static final String lIST = "/list";
    private static final String VERSION = "/v2";    
    
    public static String shippingList(){
    	return lIST + VERSION;
    }
    public static String shoppingListId(String ShippingListId){
    	return lIST + VERSION + "/" + ShippingListId; 
    }

}
