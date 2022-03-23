package com.swiggy.controller;

public class FactoryController {

	public static SwiggyControllerInterface createobject() {
		// TODO Auto-generated method stub
		return new SwiggyController();
	}

}
