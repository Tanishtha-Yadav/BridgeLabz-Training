package com.lambda.lambdaExpression.hospitalnotification;

public class Alert {
	
	String type;
	String message;
	int priority;
	
	public Alert(String type,String message,int priority)
	{
		this.type=type;
		this.message=message;
		this.priority=priority;
	}
	
	public String toString()
	{
		return "Alet Type :"+type+"Message : "+message+"Priority : "+priority;
	}
}
