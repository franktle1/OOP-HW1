package com.ualbany.hw1.problem3;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//the purpose of this class is to create a new client.
public class CreateNewClient{
	
	private Person newClient;

//	private JLabel firstname;
//	private JLabel lastname;
//	private JLabel addLine1;
//	private JLabel addLine2;
//	private JLabel cityLine;
//	private JLabel zipLine;
//	private JTextField ffield;
//	private JTextField lfield;
//	private JTextField add1Field;
//	private JTextField add2Field;
//	private JTextField cityField;
//	private JTextField zipField;
	public CreateNewClient() {
		setClientInfo();
		System.out.println("Client Address is:" + newClient.getFullAddress());
	}
	
	public void setClientInfo(){
		JPanel panel = new JPanel();
		JLabel firstname = new JLabel("First Name: ");
		JLabel lastname = new JLabel("Last Name: ");
		JLabel addLine1 = new JLabel("Address Line 1: ");
		JLabel addLine2 = new JLabel("Address Line 2: ");
		JLabel cityLine = new JLabel("City: ");
		JLabel zipLine = new JLabel("Zip: ");
		JTextField ffield = new JTextField(20);
		JTextField lfield = new JTextField(20);
		JTextField add1Field = new JTextField(20);
		JTextField add2Field = new JTextField(20);
		JTextField cityField = new JTextField(20);
		JTextField zipField = new JTextField(20);
		
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();//needed for GBLO
		//grid starts at 0,0 at top right
		//weight it how much weight compares to the other cells
		
		/////////////////// FIRST NAME  /////////////////////////////
		gc.weightx = 1;
		gc.weighty = .1; //brings the entry fields closer to each other
		gc.gridx = 0;
		gc.gridy = 0;
		gc.fill = GridBagConstraints.NONE;//horizontal, vertical, none;
		
		//this is to have the labels flush to the adjacent textfield; IN THIS CASE, IT STICKS RIGHT
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(5, 0, 0, 20);//top left bottom right // sets padding between label and textfield
		panel.add(firstname, gc);
		
		//FirstName Text Field
		gc.gridx = 1;				
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		panel.add(ffield, gc);
		
		
		/////////////////// LAST NAME  /////////////////////////////	
		
		gc.gridy++;
		gc.gridx = 0;
		
		gc.weightx = 1;
		gc.weighty = .1; 
		
		gc.insets = new Insets(0, 0, 0, 20);
		gc.anchor = GridBagConstraints.LINE_END;
		panel.add(lastname, gc);
		
		//LastName TextField
		gc.gridx = 1;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		panel.add(lfield, gc);
			
		/////////////////// ADDRESS LINE 1/////////////////////////////	
		gc.gridy++;
		gc.gridx = 0;
		gc.weightx = 1;
		gc.weighty = .1; 
		
		gc.insets = new Insets(0, 0, 0, 20);
		gc.anchor = GridBagConstraints.LINE_END;
		panel.add(addLine1, gc);
		
		// TextField
		gc.gridx = 1;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		panel.add(add1Field, gc);

		
		/////////////////// ADDRESS LINE 2/////////////////////////////	
		gc.gridy++;
		gc.gridx = 0;
		gc.weightx = 1;
		gc.weighty = .1; 
		
		gc.insets = new Insets(0, 0, 0, 20);
		gc.anchor = GridBagConstraints.LINE_END;
		panel.add(addLine2, gc);
		
		// TextField
		gc.gridx = 1;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		panel.add(add2Field, gc);
		
		/////////////////// CITY  /////////////////////////////	
		gc.gridy++;
		gc.gridx = 0;
		gc.weightx = 1;
		gc.weighty = .1; 	

		gc.insets = new Insets(0, 0, 0, 20);
		gc.anchor = GridBagConstraints.LINE_END;
		panel.add(cityLine, gc);
		
		// TextField
		gc.gridx = 1;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		panel.add(cityField, gc);
		
		
		/////////////////// ZIP CODE /////////////////////////////	
		gc.gridy++;
		gc.gridx = 0;
		gc.weightx = 1;
		gc.weighty = .1; 
		
		gc.insets = new Insets(0, 0, 0, 20);
		gc.anchor = GridBagConstraints.LINE_END;
		panel.add(zipLine, gc);
		
		// TextField
		gc.gridx = 1;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		panel.add(cityField, gc);
		
		/////////////    END OF GRIDBAG LAYOUT BOILERPLATE CODE FOR panel ///////////////////////////////
		
		
		
		int result = JOptionPane.showConfirmDialog(null, panel, "Get Customer Info", JOptionPane.OK_CANCEL_OPTION);
		if(result == JOptionPane.OK_OPTION) {
			newClient= new Person(ffield.getText(), lfield.getText());
			if(add2Field.getText().isEmpty() | add2Field.getText()==null)
				newClient.setAddress(new Address(add1Field.getText(), cityField.getText(), zipField.getText()));
			else
				newClient.setAddress(new Address(add1Field.getText(), add2Field.getText(), cityField.getText(), zipField.getText()));
			}
		else
			System.exit(0);
	}//end of Set Client Info
	
	
	

}
