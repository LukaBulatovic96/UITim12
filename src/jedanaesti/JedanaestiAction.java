package jedanaesti;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.AbstractAction;

import app.AppCore;
import sedmi.SedmiPanel;

public class JedanaestiAction extends AbstractAction{
	
	private JedanaestiPanel jedanaestiPanel;

	public JedanaestiAction(JedanaestiPanel jedanaestiPanel) {
		this.jedanaestiPanel=jedanaestiPanel;
		
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
		
		String language ="en";

		String statementString="SELECT p.Name, p.ListPrice, r.CultureID  from product p join productmodelproductdescriptionculture r ON p.ProductModelID = r.ProductModelID"
				+ " WHERE r.CultureID ='"+language+"'";
		
		ResultSet rs = stmt.executeQuery(statementString);

		ResultSetMetaData rsmd = rs.getMetaData();
	
String finalText="";
		
		int columnsNumber = rsmd.getColumnCount();
		for (int i = 1; i <= columnsNumber; i++ ) {
			  String name = rsmd.getColumnName(i);
			  System.out.print(name + " ");
			  finalText+=name+" ";
			  
			}
		
		System.out.println();
		System.out.println("____________________");
		
		
		finalText+='\n';
		finalText+="________________________";
		finalText+='\n';
		
		while(rs.next()) {
			for (int j2 = 1; j2 <= columnsNumber; j2++) {
				System.out.print(rs.getString(j2) + " ");
				finalText+=rs.getString(j2) + " ";
			}
			finalText+='\n';
			System.out.println();
		}
		
		
		jedanaestiPanel.getTextArea().setText(finalText);
		
		
	}

}