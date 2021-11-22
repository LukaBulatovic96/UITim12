package osmi;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.AbstractAction;

import app.AppCore;
import sedmi.SedmiPanel;

public class OsmiAction extends AbstractAction{
	

	private OsmiPanel osmiPanel;

	public OsmiAction(OsmiPanel osmiPanel) {
		this.osmiPanel=osmiPanel;
		
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
		
		String statementString="SELECT P.ProductID  , P.Name , ROUND(SUM(SOD.Linetotal),0) as EARNINGS     \n" +
				"\tFROM Product as P\n" +
				"\tJOIN SalesOrderDetail as SOD on P.ProductID=SOD.ProductID \n" +
				"\tGROUP BY P.Name\n" +
				"\tORDER BY EARNINGS;\n";
		
		ResultSet rs = stmt.executeQuery(statementString);

		ResultSetMetaData rsmd = rs.getMetaData();


		int columnsNumber = rsmd.getColumnCount();
		for (int i = 1; i <= columnsNumber; i++ ) {
			String name = rsmd.getColumnName(i);
			System.out.print(name + " | ");
		}
		System.out.println();
		System.out.println("____________________");

		while(rs.next()) {
			for (int j2 = 1; j2 <= columnsNumber; j2++) {
				System.out.print(rs.getString(j2) + " | ");
			}
			System.out.println();
		}
		
		
	}


}
