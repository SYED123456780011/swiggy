package com.swiggy.service;

import java.util.List;

import com.swiggy.entity.SwiggyUser;
import com.swiggy.entity.TimelineDetails;

public interface SwiggyServiceInterface {

	int createprofileService(SwiggyUser b);

	int deleteprofileService(SwiggyUser b);

	SwiggyUser viewprofileService(SwiggyUser b);

	List<SwiggyUser> viewallprofileService();

	List<SwiggyUser> searchprofileService(SwiggyUser b);

	int editprofileService(SwiggyUser b);

	SwiggyUser profilesignIN(SwiggyUser b);

	int createTimelineService(TimelineDetails tld);

}
