package drugi;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.AbstractAction;

import app.AppCore;



public class DrugiAction extends AbstractAction{
	
	private DrugiPanel drugiPanel;

	public DrugiAction(DrugiPanel drugiPanel) {
		this.drugiPanel=drugiPanel;
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			testSQL();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
private void testSQL() throws SQLException {
		
		Statement stmt = AppCore.getInstance().getCon().createStatement();
		
		String statementString="select  r.CountryRegionCode, r.Name, s.SalesLastYear - s.CostLastYear, h.StartDate from salesterritory s join countryregion r ON s.CountryRegionCode = r.CountryRegionCode "
				+ "join salesterritoryhistory h ON h.TerritoryID = s.TerritoryID GROUP BY StartDate, CountryRegionCode ORDER BY CountryRegionCode, StartDate DESC";

		
		ResultSet rs = stmt.executeQuery(statementString);

		ResultSetMetaData rsmd = rs.getMetaData();
		
		ArrayList<String> columnList = new ArrayList<>();
		
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
		
		
		drugiPanel.getTextArea().setText(finalText);
		
	}

}