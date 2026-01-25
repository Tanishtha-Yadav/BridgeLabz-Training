package com.exceptionhandling.banktransanctionsystem;

public class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String message) {
		super(message);
	}
}