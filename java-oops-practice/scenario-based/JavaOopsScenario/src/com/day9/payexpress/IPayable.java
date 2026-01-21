package com.day9.payexpress;

public interface IPayable {
	
		void pay(double amountPaid);

		void sendReminder();
	}
