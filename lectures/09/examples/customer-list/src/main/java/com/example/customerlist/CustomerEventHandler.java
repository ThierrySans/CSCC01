package com.example.customerlist;

/**
 * This interface describes the actions that can be taken when an event occurs
 * to Customer.
 */
public interface CustomerEventHandler {
	/**
	 * The action to be performed when a customer is added to the CustomerList.
	 * 
	 * @param customer
	 *            The customer that was added.
	 */
	void customerAdded(Customer customer);

	/**
	 * The action to be performed when a customer's details are updated.
	 * 
	 * @param customer
	 *            The customer that was updated.
	 */
	void customerUpdated(Customer customer);

	/**
	 * The action to be performed when a customer is deleted from the
	 * CustomerList.
	 * 
	 * @param customer
	 *            The customer that was deleted.
	 */
	void customerDeleted(Customer customer);
}
