package com.day9.payexpress;

import java.time.LocalDate;
public class Water extends Bill{
		// constructor
		public Water(double amount, LocalDate dueDate) {
			super("Water", amount, dueDate);
		}

		@Override
		public void pay(double amountPaid) {
			double total = getTotalToPay();
			if (amountPaid >= total) {
				markAsPaid();
				System.out.println("Water bill paid successfully.");
			} else {
				System.out.println("Payment insufficient. Water supply may be restricted.");
			}
		}

		@Override
		public void sendReminder() {
			System.out.println("REMINDER: Water bill pending! Supply may be disconnected soon.");
		}
}


