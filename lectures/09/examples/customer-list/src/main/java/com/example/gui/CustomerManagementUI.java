package com.example.gui;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.example.customerlist.CustomerList;

/**
 * The UI for managing customers.
 */
public class CustomerManagementUI {
	private final JFrame frame;
	private final CustomerManagementPanel managementPanel;

	public CustomerManagementUI(CustomerList customerList) {
		managementPanel = new CustomerManagementPanel(customerList);
		frame = new JFrame("15-214 Recitation 06 - Customer List Example");
		frame.getContentPane().add(managementPanel);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(frame.getWidth(), 600);
	}

	public void show() {
		frame.setVisible(true);
	}

	public CustomerManagementPanel getManagementPanel() {
		return managementPanel;
	}

}
