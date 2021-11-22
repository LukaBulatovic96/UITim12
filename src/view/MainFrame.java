package view;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainFrame extends JFrame{
	
	private MainPanel mainPanel;
	
	
	public MainFrame() {
		
	initializeFrame();
	
	setSize(1020, 800); 
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	setTitle("Querry Builder"); 
	setLocationRelativeTo(null);
	
	}
	
	public void initializeFrame() {
		
		mainPanel = new MainPanel();
		
		
		this.add(mainPanel);
	}

	public MainPanel getMainPanel() {
		return mainPanel;
	}

	public void setMainPanel(MainPanel mainPanel) {
		this.mainPanel = mainPanel;
	}

	
	


}
