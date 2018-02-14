package com.ualbany.hw1.problem3;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FPanel extends JPanel{
	
	//Radio Buttons for Depositing and Withdrawing //Button Group
	//Amount Label: Amount Textfield
	//Balance Label: Amount Textfield (set Uneditable)
	//Enter Button //Cancel Button 
	private JLabel withdrawLabel;
	private JLabel depositLabel;
	private JLabel currBalanceLabel;
	private JLabel amountLabel;
	
	private JRadioButton withdrawButton;
	private JRadioButton depositButton;
	private JTextField amountField;
	private JTextField currBalanceField;
	private JButton enterButton;
	private JButton cancelButton;
	private FormListener formListener;
	
	private String balance;
	

	
	public FPanel(Person customer) {

		amountField = new JTextField(10);
		enterButton = new JButton("Enter");
		cancelButton = new JButton("Cancel");
		
		//Radio Button
		withdrawLabel = new JLabel("Withdraw");
		depositLabel = new JLabel("Deposit");
		withdrawButton = new JRadioButton();
		depositButton = new JRadioButton();
		withdrawButton.setActionCommand("Withdraw");
		depositButton.setActionCommand("Deposit");
		depositButton.setSelected(true);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(withdrawButton);
		buttonGroup.add(depositButton);
		
		Border tb = BorderFactory.createTitledBorder("Transaction Panel");
		setBorder(tb);
		Dimension dim = getPreferredSize();
		dim.width = 300;
		setPreferredSize(dim);
		
		formatPanel();
		
		//when enter is pressed, a FormEvent is created with the information gathered from the activity done in FPanel
		enterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Store all the information gathered from the Fpanel and store into event object
				//data to be sent (I'll only be using what type of transaction was passed, and the amount entered by user)
				String transaction = (String)buttonGroup.getSelection().getActionCommand(); //gets what was selected and gets corresponding command "Withdraw" or "Deposit" 
				String amount = (String)amountField.getText();
				
				FormEvent ev = new FormEvent(this,transaction, amount);
				if(formListener != null) {
					formListener.formEventOccurred(ev);
					}
			}
		});
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Thank you for banking with us today.");
				System.exit(1);
			}
			
		});
	}
	
	public void formatPanel() {
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		//grid starts at 0,0 at top right
		//weight it how much weight compares to the other cells
		////////THIS IS FOR COMPONENT PLACEMENT//////////
		/////////////////// Withdraw RADIO BUTTON /////////////////////////////
		gc.weightx = .05;
		gc.weighty = .01; //brings the entry fields closer to each other

		gc.gridx = 0;
		gc.gridy = 0;
		gc.fill = GridBagConstraints.NONE;//horizontal, vertical, none;
		

		//this is to have the labels flush to the adjacent textfield; IN THIS CASE, IT STICKS RIGHT
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);//top left bottom right // sets padding between label and textfield
		add(new JLabel("Withdraw: "), gc);
		
		gc.gridx = 1;				//going from left to right; setting the name field
		gc.gridy = 0;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		add(withdrawButton, gc);
		
		
		/////////////////// DEPOSIT BUTTON /////////////////////////////
		gc.gridy++; //for every new row, it'll increment y automatically//also means layout is done row-by-row
		gc.gridx = 0;		
		gc.weightx = .05;
		gc.weighty = .01; 
		

		gc.insets = new Insets(0, 0, 0, 5);
		gc.anchor = GridBagConstraints.LINE_END;
		add(new JLabel("Deposit: "), gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		add(depositButton, gc);
		

		
		///////////////////  AMOUNT  /////////////////////////////
		gc.gridy++; //for every new row, it'll increment y automatically//also means layout is done row-by-row
		gc.gridx = 0;		
		gc.weightx = 1;
		gc.weighty = .1; 
		

		gc.insets = new Insets(0, 0, 0, 5);
		gc.anchor = GridBagConstraints.LINE_END;
		add(new JLabel("Amount: "), gc);
		
		gc.gridx = 2;

		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		add(amountField, gc);
		
		///////////////////  Button  /////////////////////////////
		gc.gridy++; //for every new row, it'll increment y automatically//also means layout is done row-by-row
		gc.gridx = 0;		
		gc.weightx = .05;
		gc.weighty = .01; 
		

		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_END;
		add(enterButton, gc);
		
		gc.gridx = 4;
		
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		add(cancelButton, gc);
		
		///////////////////  Button  /////////////////////////////
		gc.gridy++; //for every new row, it'll increment y automatically//also means layout is done row-by-row
		gc.gridx = 0;		
		gc.weightx = 1;
		gc.weighty = 1; 
		

		gc.insets = new Insets(0, 0, 0, 20);
		gc.anchor = GridBagConstraints.LINE_END;
		add(new JPanel(), gc);

	}
	
	//used to capture information from Form Panel and transmit it to the MainFrame Switchboard;
	public void setFormListener(FormListener formListener) {
		this.formListener = formListener;
	}
	
}



///////////////////// CURRENT BALANCE ///////////////////////////// UNIMPLEMENTED
//gc.gridy++; //for every new row, it'll increment y automatically//also means layout is done row-by-row
//gc.gridx = 0;		
//gc.weightx = 1;
//gc.weighty = .1; 
//
//
//gc.insets = new Insets(0, 0, 0, 5);
//gc.anchor = GridBagConstraints.LINE_END;
//add(new JLabel("Balance: "), gc);
//
//gc.gridx = 2;
//
//gc.insets = new Insets(0, 0, 0, 0);
//gc.anchor = GridBagConstraints.LINE_START;
//add(currBalanceField, gc);