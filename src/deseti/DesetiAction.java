package deseti;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.AbstractAction;

import app.AppCore;
import sedmi.SedmiPanel;

public class DesetiAction extends AbstractAction {
	

	private DesetiPanel desetiPanel;

	public DesetiAction(DesetiPanel desetiPanel) {
		this.desetiPanel=desetiPanel;
		
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
		
		String statementString="select * from AvailableLanguages";
		
		ResultSet rs = stmt.executeQuery(statementString);

		AppCore.getInstance().initModel(rs);

	}

}
