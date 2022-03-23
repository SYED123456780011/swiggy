package com.swiggy.service;

import java.util.List;

import com.swiggy.dao.FactoryDAO;
import com.swiggy.dao.SwiggyDAOInterface;
import com.swiggy.entity.SwiggyUser;
import com.swiggy.entity.TimelineDetails;

public class SwiggyService implements SwiggyServiceInterface {

	@Override
	public int createprofileService(SwiggyUser b) {
		SwiggyDAOInterface d=FactoryDAO.createobject();
		int i=d.createprofileDAO(b);
		return i;
	}

	@Override
	public int deleteprofileService(SwiggyUser b) {
		SwiggyDAOInterface d=FactoryDAO.createobject();
		int i=d.deleteprofileDAO(b);
		
		
		return i;
	}

	@Override
	public SwiggyUser viewprofileService(SwiggyUser b) {
		SwiggyDAOInterface d=FactoryDAO.createobject();
		SwiggyUser i=d.viewprofileDAO(b);
		return i;
		
	}

	@Override
	public List<SwiggyUser> viewallprofileService() {
		SwiggyDAOInterface d=FactoryDAO.createobject();
		List<SwiggyUser> i=d.viewallprofileDAO();
		return i;
	}

	@Override
	public List<SwiggyUser> searchprofileService(SwiggyUser b) {
		
		SwiggyDAOInterface d=FactoryDAO.createobject();
		List<SwiggyUser> i=d.searchprofileDAO(b);
		return i;
	}

	@Override
	public int editprofileService(SwiggyUser b) {
		
		SwiggyDAOInterface d=FactoryDAO.createobject();
		int i=d.editprofileDAO(b);
		return i;
	}

	@Override
	public SwiggyUser profilesignIN(SwiggyUser b) {
		SwiggyDAOInterface d=FactoryDAO.createobject();
		SwiggyUser i=d.signInprofileDAO(b);
		return i;
	
	}

	@Override
	public int createTimelineService(TimelineDetails tld) {
		SwiggyDAOInterface d=FactoryDAO.createobject();
		int i = d.createTimelineDAO(tld);
		return i;
		
	}

}
