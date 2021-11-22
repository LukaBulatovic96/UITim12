package cetvrti;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import prvi.PrviAction;

public class CetvrtiPanel extends JPanel{

	private JTextArea textArea; 
	private JButton submitButton;
	private CetvrtiAction cetvrtiAction;
	
	private JScrollPane scroll;
	
	public CetvrtiPanel() {
		
		initPanel();
	
	}
	
	private void initPanel() {
		
		 submitButton = new JButton("cetvrti Submit");
		 textArea = new JTextArea(15, 40);
		 
		 cetvrtiAction = new CetvrtiAction(this);
		 submitButton.addActionListener(cetvrtiAction);
		 
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
