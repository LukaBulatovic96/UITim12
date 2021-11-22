package deveti;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import sedmi.SedmiAction;

public class DevetiPanel extends JPanel{
	

	private JTextArea textArea; 
	private JButton submitButton;
	private DevetiAction devetiAction;
	
	public DevetiPanel() {
		
		initPanel();
	
	}
	
	private void initPanel() {
		
		 submitButton = new JButton("deveti Submit");
		 textArea = new JTextArea(15, 40);
		 
		 devetiAction = new DevetiAction(this);
		 submitButton.addActionListener(devetiAction);
		 
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
