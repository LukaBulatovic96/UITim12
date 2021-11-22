package sedmi;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import sesti.SestiAction;

public class SedmiPanel extends JPanel{
	

	private JTextArea textArea; 
	private JButton submitButton;
	private SedmiAction sedmiAction;
	
	public SedmiPanel() {
		
		initPanel();
	
	}
	
	private void initPanel() {
		
		 submitButton = new JButton("sedmi Submit");
		 textArea = new JTextArea(15, 40);
		 
		 sedmiAction = new SedmiAction(this);
		 submitButton.addActionListener(sedmiAction);
		 
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
