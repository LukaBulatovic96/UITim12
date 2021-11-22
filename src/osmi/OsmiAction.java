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

		AppCore.getInstance().initModel(rs);
	}


}
