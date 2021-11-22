package drugi;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;


public class DrugiPanel extends JPanel{
	
	private JTextArea textArea; 
	
	private JButton submitButton2;
	private JButton submitButton3;
	
	private DrugiAction drugiAction;
	private TreciAction treciAction;
	
	private JScrollPane scroll;
	
	public DrugiPanel() {
		
		initPanel();
	
	}
	
	private void initPanel() {
		
		 submitButton2 = new JButton("drugi Submit");
		 submitButton3 = new JButton("Treci Submit");
		 
		 textArea = new JTextArea(35, 55);
		 
		 drugiAction = new DrugiAction(this);
		 treciAction = new TreciAction(this);
		 
		 submitButton2.addActionListener(drugiAction);
		 submitButton3.addActionListener(treciAction);
		 
		 scroll = new JScrollPane(textArea);
		 scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		 
		 this.add(scroll);
		 this.add(submitButton2);
		 this.add(submitButton3);
		 
		
	}
	

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public JButton getSubmitButton() {
		return submitButton2;
	}

	public void setSubmitButton(JButton submitButton) {
		this.submitButton2 = submitButton;
	}
	
	

}
