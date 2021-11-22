package cetvrti;

import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.AbstractAction;

import app.AppCore;
import prvi.PrviPanel;

public class CetvrtiAction extends AbstractAction{
	
	private CetvrtiPanel cetvrtiPanel;

	public CetvrtiAction(CetvrtiPanel cetvrtiPanel) {
		this.cetvrtiPanel=cetvrtiPanel;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
		try {
			createProcedure();
			callProcedure();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

}
	

	public void createProcedure() throws SQLException {
		String query = "CREATE PROCEDURE s_getStore(IN storeName varchar(50))\r\n"
				+ "BEGIN\r\n"
				+ "	SELECT COUNT(soh.SalesOrderID) as TotalOrders, AVG(sod.OrderQty) as AvgQuantity, MAX(soh.SubTotal) as Earnings\r\n"
				+ "    FROM store s\r\n"
				+ "	JOIN customer c\r\n"
				+ "    ON s.CustomerID = c.CustomerID\r\n"
				+ "    JOIN salesorderheader soh\r\n"
				+ "    ON c.CustomerID = soh.CustomerID\r\n"
				+ "    JOIN salesorderdetail sod\r\n"
				+ "    ON soh.SalesOrderID = sod.SalesOrderID\r\n"
				+ "    WHERE s.Name = StoreName;\r\n"
				+ "    END //\r\n";
		Statement statement = AppCore.getInstance().getCon().createStatement();
		statement.execute(query);
		
	}
	
	public StoreProcedure callProcedure() throws SQLException {
		
		String storeName = "Progressive Sports";
		StoreProcedure store = new StoreProcedure();
		String query = "call s_getStore('"+ storeName + "')";
		PreparedStatement statement = AppCore.getInstance().getCon().prepareStatement(query);
		ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()){
				store.setTotalOrders(resultSet.getInt("TotalOrders"));
				store.setAvgQuiantity(resultSet.getDouble("AvgQuantity"));
				store.setEarnings(resultSet.getDouble("Earnings"));
			}
		cetvrtiPanel.getTextArea().setText(store.toString());
		return store;
		}

}
