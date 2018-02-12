package com.ualbany.hw1.problem3;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TPanel extends JPanel {
	//This will display output
	private JTextArea textArea;
	
	public TPanel() {
		textArea = new JTextArea();
		setLayout(new BorderLayout());
		add(new JScrollPane(textArea), BorderLayout.CENTER);
	}
	
	public void addText(String text) {
		textArea.append(text);
	}
	
}
