package com.example.customerlist;

import java.util.ArrayList;
import java.util.List;

/**
 * The list of customers in our business. Supports listeners which will respond
 * when customers are added or updated.
 */
public class CustomerList {
	private final List<Customer> customers;
	private final List<CustomerEventHandler> handlers;

	public CustomerList() {
		this.customers = new ArrayList<Customer>();
		this.handlers = new ArrayList<CustomerEventHandler>();
	}

	/**
	 * Add a customer to our business.
	 * 
	 * @param customer
	 *            The new customer.
	 */
	public void addCustomer(Customer customer) {
		customers.add(customer);
		for (CustomerEventHandler handler : handlers) {
			handler.customerAdded(customer);
		}
	}

	/**
	 * Change the address of a customer.
	 * 
	 * @param customer
	 *            The customer to update.
	 * @param newAddress
	 *            The new address.
	 */
	public void changeAddress(Customer customer, String newAddress) {
		customer.setAddress(newAddress);
		for (CustomerEventHandler handler : handlers) {
			handler.customerUpdated(customer);
		}
	}

	/**
	 * Add a new event handler (i.e. listener).
	 * 
	 * @param handler
	 *            The new event handler to add.
	 */
	public void addHandler(CustomerEventHandler handler) {
		handlers.add(handler);
	}

	/**
	 * Remove an event handler.
	 * 
	 * @param handler
	 *            The event handler to remove. Must already exist in the list of
	 *            handlers.
	 */
	public void removeHandler(CustomerEventHandler handler) {
		handlers.remove(handler);
	}
}
