package com.swiggy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.swiggy.entity.SwiggyUser;
import com.swiggy.entity.TimelineDetails;
import com.swiggy.exception.ReservedwordException;

public class SwiggyDAO implements SwiggyDAOInterface {

	
	public int createprofileDAO(SwiggyUser b) {
		int i=0;
		try {
				if(b.getName().equals("swiggy")) {throw new ReservedwordException();}
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE","system","orcl");
			PreparedStatement ps=con.prepareStatement("insert into SwiggyUser values(?,?,?,?)");
			ps.setString(1,b.getName());
			ps.setString(2,b.getPasword());
			ps.setString(3,b.getEmail());
			ps.setString(4,b.getAddress());
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int deleteprofileDAO(SwiggyUser b) {
		int i=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE","system","orcl");
			PreparedStatement ps=con.prepareStatement("delete from SwiggyUser where email=?");
			ps.setString(1,b.getEmail());
			
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return i;
	}

	@Override
	public SwiggyUser viewprofileDAO(SwiggyUser b) {
		SwiggyUser s=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE","system","orcl");
			PreparedStatement ps=con.prepareStatement("select * from SwiggyUser where email=?");
			ps.setString(1,b.getEmail());
			
			ResultSet res=ps.executeQuery();
			
			if(res.next()) {
				String n=res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				s=new SwiggyUser();
				s.setName(n);
				s.setPasword(p);
				s.setEmail(e);
				s.setAddress(a);
				
				
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return s;
		
	}

	@Override
	public List<SwiggyUser> viewallprofileDAO() {
		SwiggyUser s=null;
		List<SwiggyUser> m= new ArrayList<SwiggyUser>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE","system","orcl");
			PreparedStatement ps=con.prepareStatement("select * from SwiggyUser");
			
			
			ResultSet res=ps.executeQuery();
			
			while(res.next()) {
				String n=res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				s=new SwiggyUser();
				s.setName(n);
				s.setPasword(p);
				s.setEmail(e);
				s.setAddress(a);
				
				m.add(s);
				
				
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return m;
		
	}

	@Override
	public List<SwiggyUser> searchprofileDAO(SwiggyUser b) {
		
		SwiggyUser s=null;
		List<SwiggyUser> m= new ArrayList<SwiggyUser>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE","system","orcl");
			PreparedStatement ps=con.prepareStatement("select * from SwiggyUser where name=?");
			ps.setString(1,b.getName());
			
			ResultSet res=ps.executeQuery();
			
			while(res.next()) {
				String n=res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				s=new SwiggyUser();
				s.setName(n);
				s.setPasword(p);
				s.setEmail(e);
				s.setAddress(a);
				
				m.add(s);
				
				
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return m;
	
	}

	@Override
	public int editprofileDAO(SwiggyUser b) {
		int i=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE","system","orcl");
			PreparedStatement ps=con.prepareStatement("update SwiggyUser set name=?,pasword=?,address=? where email=?");
			ps.setString(1,b.getName());
			ps.setString(2,b.getPasword());
			ps.setString(4,b.getEmail());
			ps.setString(3,b.getAddress());
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
		
	}

	@Override
	public SwiggyUser signInprofileDAO(SwiggyUser b) {
SwiggyUser s=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE","system","orcl");
			PreparedStatement ps=con.prepareStatement("select * from SwiggyUser where email=? and pasword=?");
			ps.setString(1,b.getEmail());
			ps.setString(2,b.getPasword());
			
			ResultSet res=ps.executeQuery();
			
			if(res.next()) {
				String n=res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				s=new SwiggyUser();
				s.setName(n);
				s.setPasword(p);
				s.setEmail(e);
				s.setAddress(a);
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
				
				
		return s;
}

	@Override
	public int createTimelineDAO(TimelineDetails tld) {
	int i = 0;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE","system","orcl");
			
			PreparedStatement ps = con.prepareStatement("insert into TimelineDetails values(?,?,?,?)");
			ps.setString(1, tld.getMessageid());
			ps.setString(2, tld.getSender());
			ps.setString(3, tld.getMessage());
			
			ps.setString(5, tld.getReceiver());
			
			i = ps.executeUpdate();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return i;
	}

	}

