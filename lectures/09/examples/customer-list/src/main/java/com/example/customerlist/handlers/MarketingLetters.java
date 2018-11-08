package com.example.customerlist.handlers;

import com.example.customerlist.Customer;
import com.example.customerlist.CustomerEventHandler;

/**
 * This sends a new email to the customer when he or she signs up for our
 * business.
 */
public class MarketingLetters implements CustomerEventHandler {

	@Override
	public void customerAdded(Customer customer) {
		System.out.println("Email to send to " + customer.getEmailAddress()
				+ ": Dear " + customer.getName()
				+ ", welcome to C0-One Enterprises!");
	}

	@Override
	public void customerUpdated(Customer customer) {
		// Do nothing
	}

	@Override
	public void customerDeleted(Customer customer) {
		// Do nothing
	}

}
