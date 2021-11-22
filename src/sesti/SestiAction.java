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
		
		String statementString="SELECT C.Name,COUNT(SOH.SalesOrderID) as Used\n" +
				"FROM SalesOrderHeader as SOH\n" +
				"JOIN CurrencyRate as CR on SOH.CurrencyRateID = CR.CurrencyRateID\n" +
				"JOIN Currency as C on CR.ToCurrencyCode = C.CurrencyCode\n" +
				"GROUP BY C.Name\n" +
				"ORDER BY Used DESC;";
		
		ResultSet rs = stmt.executeQuery(statementString);

		AppCore.getInstance().initModel(rs);

	}

}
