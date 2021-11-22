package sesti;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.AbstractAction;

import app.AppCore;
import peti.PetiPanel;

public class SestiAction extends AbstractAction{
	private SestiPanel sestiPanel;

	public SestiAction(SestiPanel sestiPanel) {
		this.sestiPanel=sestiPanel;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		try {
			testSQL();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

}
	
private void testSQL() throws SQLException {
		
		Statement stmt = AppCore.getInstance().getCon().createStatement();
		
		String statementString="select * from product";
		
		ResultSet rs = stmt.executeQuery(statementString);

		ResultSetMetaData rsmd = rs.getMetaData();
	
		
		
		int columnsNumber = rsmd.getColumnCount();
		for (int i = 1; i <= columnsNumber; i++ ) {
			  String name = rsmd.getColumnName(i);
			  System.out.print(name + " ");
			}
		System.out.println();
		System.out.println("____________________");
		
		while(rs.next()) {
			for (int j2 = 1; j2 <= columnsNumber; j2++) {
				System.out.print(rs.getString(j2) + " ");
			}
			System.out.println();
		}
		
		
	}

}
