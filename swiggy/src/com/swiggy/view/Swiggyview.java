package com.swiggy.view; 

import java.util.Scanner;


import com.swiggy.controller.FactoryController;
import com.swiggy.controller.SwiggyControllerInterface;
import com.swiggy.entity.SwiggyUser;

public class Swiggyview {

	public static void main(String[] args) {
		String s="y";
		Scanner sc=new Scanner(System.in);
		while(s.equals("y")) {
		
			 
				System.out.println("***********************");
				System.out.println("welcome to Swiggy");
				System.out.println("********************");
				System.out.println("press 1 to sign UP");
				System.out.println("press 2 to sign IN");
				System.out.println("***********************");
				
				
				System.out.println("enter your choice");
				int ch=sc.nextInt();
				
				SwiggyControllerInterface a=FactoryController.createobject();
				int s1;
				
				switch(ch) {
				case 1:
					a.createprofileController();
					break;
				case 2:
					 s1=a.signIn();
					if(s1>0) {
						while(s.equals("y")) {
							System.out.println("********main menu**********");
		 					
							System.out.println("press 1to delete profile");
							System.out.println("press 2 to view profile");
							System.out.println("press 3 to viewall profile");
							System.out.println("press 4 to search profile");
							System.out.println("press 5 to edit profile");
							System.out.println("press 6 to create timeline");
							System.out.println("select an function");
							int b=sc.nextInt();
						
							switch(b) {
								
								case 1:
									a.deleteprofileController();
									break;
								case 2:
									a.viewprofileController();
									break;
								case 3:
									a.viewallprofileController();
									break;
								case 4:
									a.searchprofileController();
									break;
								case 5:
									a.editprofileController();
									break;
								case 6:
									a.createtimeline();
									break;
								default:
									System.out.println("wrong choice");
							}
							System.out.println("enter y to continue");
							s=sc.next();
						}
					}
					else {
						System.out.println("you are mot on swiggy please create profile");
						
					}
				}
		}
		
	}

}
			
			
			
			
			
			



