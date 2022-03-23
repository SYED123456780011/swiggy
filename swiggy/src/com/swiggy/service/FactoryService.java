package com.swiggy.service;

public class FactoryService {

	public static SwiggyServiceInterface createobject() {
		// TODO Auto-generated method stub
		return new 	SwiggyService();
	}

}
