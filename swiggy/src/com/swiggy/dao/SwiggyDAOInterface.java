package com.swiggy.dao;

import java.util.ArrayList;
import java.util.List;

import com.swiggy.entity.SwiggyUser;
import com.swiggy.entity.TimelineDetails;

public interface SwiggyDAOInterface {

	int createprofileDAO(SwiggyUser b);

	int deleteprofileDAO(SwiggyUser b);

	SwiggyUser viewprofileDAO(SwiggyUser b);

	List<SwiggyUser> viewallprofileDAO();

	List<SwiggyUser> searchprofileDAO(SwiggyUser b);

	int editprofileDAO(SwiggyUser b);

	SwiggyUser signInprofileDAO(SwiggyUser b);

	int createTimelineDAO(TimelineDetails tld);

}
