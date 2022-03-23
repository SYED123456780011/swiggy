package com.swiggy.controller;

import java.util.*;

import java.util.logging.Logger;

import com.swiggy.entity.SwiggyUser;
import com.swiggy.entity.TimelineDetails;
import com.swiggy.service.FactoryService;
import com.swiggy.service.SwiggyServiceInterface;

public class SwiggyController implements SwiggyControllerInterface {
	Logger log=Logger.getLogger("Swiggy Controller");

	@Override
	public int createprofileController() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter pasword");
		String pasword=sc.next();
		System.out.println("enter email");
		String email=sc.next();
		System.out.println("enter address");
		String address=sc.next();
		
		SwiggyUser b=new SwiggyUser();
		b.setName(name);
		b.setPasword(pasword);
		b.setEmail(email);
		b.setAddress(address);
		
		SwiggyServiceInterface c=FactoryService.createobject();
		int i=c.createprofileService(b);
		
		if(i>0) {
			System.out.println("profile created");
		}
		else {
			System.out.println("profile not created");
		}
		return i;

	}

	@Override
	public int deleteprofileController() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter email");
		String email=sc.next();
		
		SwiggyUser b=new SwiggyUser();
		b.setEmail(email);
		
		SwiggyServiceInterface c=FactoryService.createobject();
		int i=c.deleteprofileService(b);
		
		if(i>0) {
			System.out.println("profile deleted");
		}
		else {
			System.out.println("profile not deleted");
		}
		return i;
		
		
	}

	@Override
	public int viewprofileController() {
		int j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter email");
		String email=sc.next();
		SwiggyUser b=new SwiggyUser();
		b.setEmail(email);
		SwiggyServiceInterface c=FactoryService.createobject();
		SwiggyUser i=c.viewprofileService(b);
		
		if(i!=null) {
			
			System.out.println("name is "+i.getName());
			System.out.println("pasword is "+i.getPasword());
			System.out.println("email is "+i.getEmail());
			System.out.println("Address is "+i.getAddress());
			
		j=1;	
		}
		else {
			System.out.println("profile not viewed");
		}
		return j;
		
	}

	
	public int viewallprofileController() {
		int j=0;
		SwiggyServiceInterface c=FactoryService.createobject();
		List<SwiggyUser> i=c.viewallprofileService();
		
		System.out.println(i.size()+" records are found");
		
		if(i!=null) {
		i.forEach(r->{
			System.out.println("name is "+r.getName());
			System.out.println("pasword is "+r.getPasword());
			System.out.println("email is "+r.getEmail());
			System.out.println("address is "+r.getAddress());
			
		});
		j=1;
		}
		return j;
		
		
		
	}

	@Override
	public int searchprofileController() {
		int j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name"); 
		String name=sc.next();
		SwiggyUser b=new SwiggyUser();
		b.setName(name);
		SwiggyServiceInterface c=FactoryService.createobject();
		List<SwiggyUser> i=c.searchprofileService(b);
		
		System.out.println(i.size()+" records are found");
		if(i!=null) {
		i.forEach(r->{
			System.out.println("name is "+r.getName());
			System.out.println("pasword is "+r.getPasword());
			System.out.println("email is "+r.getEmail());
			System.out.println("address is "+r.getAddress());
		});
		j=1;
		}
		return j;
		
		
	}
	
	
	
	
	

	@Override
	public int editprofileController() {
		
		System.out.println("older data is");
		viewprofileController();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  new name");
		String name=sc.next();
		System.out.println("enter  new pasword");
		String pasword=sc.next();
		System.out.println("enter older  email");
		String email=sc.next();
		System.out.println("enter  new address");
		String address=sc.next();
		
		SwiggyUser b=new SwiggyUser();
		b.setName(name);
		b.setPasword(pasword);
		b.setEmail(email);
		b.setAddress(address);
		
		SwiggyServiceInterface c=FactoryService.createobject();
		int i=c.editprofileService(b);
		
		if(i>0) {
			System.out.println("profile created");
		}
		else {
			System.out.println("profile not created");
		}
		return i;
	}

	@Override
	public int signIn() {
		int j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter email");
		String email=sc.next();
		System.out.println("enter pasword");
		String pasword=sc.next();
		
		SwiggyUser b=new SwiggyUser();
		b.setEmail(email);
		b.setPasword(pasword);
		SwiggyServiceInterface c=FactoryService.createobject();
		SwiggyUser i=c.profilesignIN(b);
		
		
		if(i!=null) {
			System.out.println("welcome to swiggy");
			j=1;
			
		}
		else {
			System.out.println("sorry we cant signin");
		}
		return j;
		
		
	}

	@Override
	public int createtimeline() {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Message ID: ");
		String messageid = sc.next();
		
		System.out.println("Enter Sender ID: ");
		String sender = sc.next();
		
		System.out.println("Enter Reciever ID: ");
		String reciever = sc.next();
		
		System.out.println("Enter Message: ");
		String message = sc.next();
		
		
		
		TimelineDetails tld = new TimelineDetails();
		tld.setMessageid(messageid);
		tld.setSender(sender);
		tld.setReceiver(reciever);
		tld.setMessage(message);
		
		SwiggyServiceInterface c=FactoryService.createobject();
		int i = c.createTimelineService(tld);
		if(i>0){
			System.out.println("Your timeline is updated");
		}
		
		else {
			System.out.println("Sorry, unable to create timeline");
		}
		return i;
		
		
	}

}
