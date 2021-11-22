package deseti;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import sedmi.SedmiAction;

public class DesetiPanel extends JPanel{


	private JTextArea textArea; 
	private JButton submitButton;
	private DesetiAction desetiAction;
	
	public DesetiPanel() {
		
		initPanel();
	
	}
	
	private void initPanel() {
		
		 submitButton = new JButton("deseti Submit");
		 textArea = new JTextArea(15, 40);
		 
		 desetiAction = new DesetiAction(this);
		 submitButton.addActionListener(desetiAction);
		 
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
