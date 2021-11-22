package peti;

import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.AbstractAction;

import app.AppCore;
import cetvrti.CetvrtiPanel;

public class PetiAction extends AbstractAction{
	private PetiPanel petiPanel;

	public PetiAction(PetiPanel petiPanel) {
		this.petiPanel=petiPanel;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		try {
			findMaxSales();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<SalesFromTerritory> findMaxSales() throws SQLException {
		
		ArrayList<SalesFromTerritory> sales = new ArrayList<>();
		
		String query = "SELECT MAX(sp.SalesYTD) as MaxSales, sp.SalesPersonID, sp.TerritoryID, sp.SalesQuota, sp.Bonus, sp.CommissionPct, sp.SalesLastYear, sp.rowguid, sp.ModifiedDate\r\n"
				+ "FROM salesterritory st\r\n"
				+ "JOIN salesperson sp\r\n"
				+ "ON sp.TerritoryID = st.TerritoryID\r\n"
				+ "GROUP BY st.TerritoryID\r\n";
		PreparedStatement statement = AppCore.getInstance().getCon().prepareStatement(query);
		ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()){ 
				sales.add(
					 new SalesFromTerritory(
								resultSet.getDouble("MaxSales"),
								resultSet.getInt("SalesPersonID"),
								resultSet.getInt("TerritoryID"),
								resultSet.getDouble("SalesQuota"),
								resultSet.getDouble("Bonus"),
								resultSet.getDouble("CommissionPct"),
								resultSet.getDouble("SalesLastYear"),
								resultSet.getBytes("rowguid"),
								resultSet.getDate("ModifiedDate")
								));
					
			}
			petiPanel.getTextArea().setText(sales.toString());
			return sales;
	}

}
