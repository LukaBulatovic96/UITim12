package sesti;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import peti.PetiAction;

public class SestiPanel extends JPanel{


	private JTextArea textArea; 
	private JButton submitButton;
	private SestiAction sestiAction;
	
	public SestiPanel() {
		
		initPanel();
	
	}
	
	private void initPanel() {
		
		 submitButton = new JButton("sesti Submit");
		 textArea = new JTextArea(15, 40);
		 
		 sestiAction = new SestiAction(this);
		 submitButton.addActionListener(sestiAction);
		 
		 this.add(textArea);
		 this.add(submitButton);
		 
		
	}
	

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public JButton getSubmitButton() {
		return submitButton;
	}

	public void setSubmitButton(JButton submitButton) {
		this.submitButton = submitButton;
	}
	
}
