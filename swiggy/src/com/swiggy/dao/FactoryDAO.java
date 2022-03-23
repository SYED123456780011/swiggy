package com.swiggy.dao;

public class FactoryDAO {

	public static SwiggyDAOInterface createobject() {
		// TODO Auto-generated method stub
		return new SwiggyDAO();
	}

}
