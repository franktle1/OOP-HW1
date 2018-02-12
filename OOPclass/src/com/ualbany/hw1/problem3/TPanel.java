package com.ualbany.hw1.problem3;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TPanel extends JPanel {
	//This will display output
	private JTextArea textArea;
	
	public TPanel() {
		textArea = new JTextArea();
		textArea.setLineWrap(true);				//Wraps Text
		textArea.setWrapStyleWord(true);		//Wraps Text on word
		setLayout(new BorderLayout());
		add(new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED), BorderLayout.CENTER);
	}
	
	public void addText(String text) {
		textArea.append(text);
	}
	public void delText() {
		textArea.setText("");
	}
	
}
