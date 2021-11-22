package app;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Observable;

import javax.swing.*;
import javax.xml.transform.Result;

import view.MainFrame;

public class AppCore {

	private static AppCore instance = null;
	
	private static String ADRESS = "jdbc:mysql://localhost:3306/";//localhost:3306/javabase//"jdbc:jtds:sqlserver://147.91.175.155/";
	private static String DATABASE = "adventureworks";//testdb
	private static String USERNAME = "******", PASSWORD = "*****";
	
	private MainFrame mainFrame;
	
	private Connection con;
	
	public static AppCore getInstance() {
		if (instance == null) {
			instance = new AppCore();
		}
		return instance;
	}

	public AppCore() {
		
		connectToDatabase();
		initFrame();
		initActions();
	}
	
	private void initActions() {
		
		//updateText = new UpdateText(rawText,mainFrame.getMainPanel());
		
		//mainFrame.getMainPanel().getSubmitButton().addActionListener(updateText);
		
	}
	public void initModel(ResultSet rezult) throws SQLException {

		JDialog prikaz = new JDialog(mainFrame, "Rezultat upita", true);
		prikaz.setSize(800,600);
		prikaz.setLocationRelativeTo(mainFrame);

		JTable tabela = new JTable();
		tabela.setModel(TabelaModel.make(rezult));

		JScrollPane skrol = new JScrollPane(tabela);
		prikaz.getContentPane().add(skrol);
		prikaz.setVisible(true);
	
	}

	
	private void initFrame() {
		mainFrame=new MainFrame();
		mainFrame.setVisible(true);
		
		//table.addObserver(mainFrame.getMainPanel().getTableView());
		
		WindowListener exitListener = new WindowAdapter() {

		    @Override
		    public void windowClosing(WindowEvent e) {
		        int confirm = JOptionPane.showOptionDialog(
		             null, "Are You Sure to Close Application?", 
		             "Exit Confirmation", JOptionPane.YES_NO_OPTION, 
		             JOptionPane.QUESTION_MESSAGE, null, null, null);
		        if (confirm == 0) {
		        	try {
						con.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		           System.exit(0);
		        }
		    }
		};
		mainFrame.addWindowListener(exitListener);
		
		
		
	}

	private void connectToDatabase() {
		try {
			Class.forName ("com.mysql.cj.jdbc.Driver");

			 con = DriverManager.getConnection(ADRESS + DATABASE, USERNAME, PASSWORD);
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	

	public MainFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}

	
	
	
	
	

	
	
	
}
