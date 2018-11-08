package com.example.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import com.example.customerlist.Customer;
import com.example.customerlist.CustomerList;

/**
 * The main panel for managing customers.
 */
public class CustomerManagementPanel extends JPanel {
	private static final long serialVersionUID = -6476908164030067053L;

	private final CustomerList customerList;

	private JTextField customerNameTextField;
	private JTextField customerEmailTextField;
	private JTextField customerAddressTextField;
	private JButton customerAddButton;
	private JList<String> customerNamesList;
	private DefaultListModel<String> customerNamesModel;

	public CustomerManagementPanel(CustomerList customerList) {
		this.customerList = customerList;

		initialize();
	}

	private void initialize() {
		setLayout(new BorderLayout());

		JPanel topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout());

		customerNameTextField = new JTextField(20);
		customerEmailTextField = new JTextField(20);
		customerAddressTextField = new JTextField(20);

		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new GridLayout(3, 2));
		inputPanel.add(new JLabel("Name"));
		inputPanel.add(customerNameTextField);
		inputPanel.add(new JLabel("Email"));
		inputPanel.add(customerEmailTextField);
		inputPanel.add(new JLabel("Address"));
		inputPanel.add(customerAddressTextField);

		customerAddButton = new JButton("Add");
		customerAddButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = customerNameTextField.getText();
				String emailAddress = customerEmailTextField.getText();
				String address = customerAddressTextField.getText();
				Customer customer = new Customer(name, emailAddress, address);
				customerList.addCustomer(customer);
			}
		});

		topPanel.add(inputPanel, BorderLayout.WEST);
		topPanel.add(customerAddButton, BorderLayout.EAST);

		add(topPanel, BorderLayout.NORTH);
		topPanel.setBorder(LineBorder.createBlackLineBorder());

		customerNamesModel = new DefaultListModel<String>();
		customerNamesList = new JList<String>(customerNamesModel);
		customerNamesList.setVisibleRowCount(10);

		add(customerNamesList, BorderLayout.CENTER);
	}

	/**
	 * Update the list of customer names with a new name.
	 * 
	 * @param name
	 *            Customer name to add.
	 */
	public void addCustomerNameToList(String name) {
		customerNamesModel.addElement(name);
	}
}
