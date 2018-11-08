package com.example.app;

import javax.swing.SwingUtilities;

import com.example.customerlist.CustomerEventHandler;
import com.example.customerlist.CustomerList;
import com.example.customerlist.handlers.CustomerListListener;
import com.example.customerlist.handlers.MarketingLetters;
import com.example.gui.CustomerManagementUI;

/**
 * The main point of entry into our customer management system.
 */
public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Main().createAndShowCustomerList();
			}
		});
	}

	public void createAndShowCustomerList() {
		// Create a new instance of the data structure maintaining customers
		CustomerList customerList = new CustomerList();

		// Create a new instance of our ui, passing on the data structure we
		// created
		CustomerManagementUI ui = new CustomerManagementUI(customerList);

		// This handler sends a welcome email when a new customer is added
		CustomerEventHandler marketingHandler = new MarketingLetters();

		// This handler adds the new customer to our list of names on our
		// management panel. Note the argument passed to the constructor.
		CustomerEventHandler uiHandler = new CustomerListListener(
				ui.getManagementPanel());

		// Add the handlers we made.
		customerList.addHandler(marketingHandler);
		customerList.addHandler(uiHandler);

		// Show the UI.
		ui.show();
	}
}
