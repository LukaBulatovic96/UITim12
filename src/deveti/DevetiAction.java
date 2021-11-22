package deveti;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.AbstractAction;

import app.AppCore;
import sedmi.SedmiPanel;

public class DevetiAction extends AbstractAction{
	

	private DevetiPanel devetiPanel;

	public DevetiAction(DevetiPanel devetiPanel) {
		this.devetiPanel=devetiPanel;
		
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
		
		String statementString="CALL Customers_Countries('Mountain-500')";
		
		ResultSet rs = stmt.executeQuery(statementString);

		AppCore.getInstance().initModel(rs);
	}

}
