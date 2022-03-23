package swiggy.controller;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.swiggy.controller.SwiggyController;

class Controllertest {
	SwiggyController sc=null;

	@BeforeEach
	void setUp() throws Exception {
		 sc=new SwiggyController();
	}

	@AfterEach
	void tearDown() throws Exception {
		sc=null;
	}

	@Test
	void testCreateprofileController() {
		int i=sc.createprofileController();
		assert i>0: "test fail to create profile";
	}

	@Test
	void testDeleteprofileController() {
		int i=sc.deleteprofileController();
		assert i>0: "test fail to delete profile";
	}

	@Test
	void testViewprofileController() {
		int i=sc.viewprofileController();
		assert i>0: "test fail to view profile";
	}

	@Test
	void testViewallprofileController() {
		int i=sc.viewallprofileController();
		assert i>0: "test fail to viewall profile";
	}

	@Test
	void testSearchprofileController() {
		int i=sc.searchprofileController();
		assert i>0: "test fail to search profile";
	}

	@Test
	void testEditprofileController() {
		int i=sc.editprofileController();
		assert i>0: "test fail to edit profile";
	}
	
	@Test
	void testSignIn() {
		int i=sc.signIn();
		assert i>0: "test fail to signIN profile";
	}

	@Test
	void testCreatetimeline() {
		int i=sc.createtimeline();
		assert i>0: "test fail to create profile";
	}

}
