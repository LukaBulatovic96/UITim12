package dvanaesti;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import sedmi.SedmiAction;

public class DvanaestiPanel extends JPanel{
	

	private JTextArea textArea; 
	private JButton submitButton;
	private DvanaestiAction dvanaestiAction;
	
	public DvanaestiPanel() {
		
		initPanel();
	
	}
	
	private void initPanel() {
		
		 submitButton = new JButton("dvanaesti Submit");
		 textArea = new JTextArea(15, 40);
		 
		 dvanaestiAction = new DvanaestiAction(this);
		 submitButton.addActionListener(dvanaestiAction);
		 
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
