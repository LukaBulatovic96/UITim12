package osmi;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import sedmi.SedmiAction;

public class OsmiPanel extends JPanel{
	

	private JTextArea textArea; 
	private JButton submitButton;
	private OsmiAction osmiAction;
	
	public OsmiPanel() {
		
		initPanel();
	
	}
	
	private void initPanel() {
		
		 submitButton = new JButton("osmi Submit");
		 textArea = new JTextArea(15, 40);
		 
		 osmiAction = new OsmiAction(this);
		 submitButton.addActionListener(osmiAction);
		 
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
