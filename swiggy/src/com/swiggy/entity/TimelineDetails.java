package com.swiggy.entity;

public class TimelineDetails {
	private String  Messageid;
	private String sender;
	private String receiver;
	public String getMessageid() {
		return Messageid;
	}
	public void setMessageid(String messageid) {
		Messageid = messageid;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	private  String message;
	private String Date;
	
	
}
