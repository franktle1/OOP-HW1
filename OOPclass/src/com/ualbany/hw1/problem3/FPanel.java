package com.ualbany.hw1.problem3;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class FPanel extends JPanel{
	
	
	public FPanel() {
		Border tb = BorderFactory.createTitledBorder("Transaction Panel");
		setBorder(tb);
		Dimension dim = getPreferredSize();
		dim.width = 200;
		setPreferredSize(dim);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		//grid starts at 0,0 at top right
		//weight it how much weight compares to the other cells
		/////////////////// first row /////////////////////////////
		gc.weightx = 1;
		gc.weighty = .1; //brings the entry fields closer to each other

		gc.gridx = 0;
		gc.gridy = 0;
		gc.fill = GridBagConstraints.NONE;//horizontal, vertical, none;
		
		
		
		
		
		
	}
}
