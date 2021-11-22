package jedanaesti;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import sedmi.SedmiAction;

public class JedanaestiPanel extends JPanel{
	
	

	private JTextArea textArea; 
	private JButton submitButton;
	private JedanaestiAction jedanaestiAction;
	private JScrollPane scroll;

	
	public JedanaestiPanel() {
		
		initPanel();
	
	}
	
	private void initPanel() {
		
		 submitButton = new JButton("jedanaesti Submit");
		 textArea = new JTextArea(35, 55);
		 
		 jedanaestiAction = new JedanaestiAction(this);
		 submitButton.addActionListener(jedanaestiAction);
		 
		 scroll = new JScrollPane(textArea);
		 scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		 
		 this.add(scroll);
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
