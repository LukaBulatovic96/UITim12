package trinaesti;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import sedmi.SedmiAction;

public class TrinaestiPanel extends JPanel{
	

	private JTextArea textArea; 
	private JButton submitButton;
	private TrinaestiAction trinaestiAction;
	
	private JScrollPane scroll;
	
	public TrinaestiPanel() {
		
		initPanel();
	
	}
	
	private void initPanel() {
		
		 submitButton = new JButton("trinaesti Submit");
		 textArea = new JTextArea(35, 55);
		 
		 trinaestiAction = new TrinaestiAction(this);
		 submitButton.addActionListener(trinaestiAction);
		 
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
