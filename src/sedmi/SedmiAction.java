package sedmi;

import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.AbstractAction;

import app.AppCore;
import peti.PetiPanel;

public class SedmiAction extends AbstractAction{
	
	private SedmiPanel sedmiPanel;

	public SedmiAction(SedmiPanel sedmiPanel) {
		this.sedmiPanel=sedmiPanel;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		try {
			createView();
			selectView();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}
	
	public void createView() throws SQLException {
		String query = "CREATE VIEW Customer_Regions AS\r\n"
				+ "SELECT st.Name as RegionName, COUNT(c.CustomerID) AS Customers, AVG(soh.SalesOrderID) AS averageOrders, AVG(soh.SubTotal) AS averageSpent\r\n"
				+ "FROM customer c\r\n"
				+ "JOIN salesorderheader soh\r\n"
				+ "ON soh.CustomerID = c.CustomerID\r\n"
				+ "JOIN salesterritory st\r\n"
				+ "ON c.TerritoryID = st.TerritoryID\r\n"
				+ "GROUP BY st.Name";
		Statement statement = AppCore.getInstance().getCon().createStatement();
		statement.execute(query);
	}
	
	public ArrayList<CustomerRegions> selectView() throws SQLException {
		
		ArrayList<CustomerRegions> customers = new ArrayList<>();
		String query = "SELECT * FROM customer_regions";
		PreparedStatement statement = AppCore.getInstance().getCon().prepareStatement(query);
		ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()){
				customers.add(new CustomerRegions(
						resultSet.getString("RegionName"),
						resultSet.getInt("Customers"),
						resultSet.getDouble("averageOrders"),
						resultSet.getDouble("averageSpent")
						));
		    }
			sedmiPanel.getTextArea().setText(customers.toString());
			return customers;
	}

}
