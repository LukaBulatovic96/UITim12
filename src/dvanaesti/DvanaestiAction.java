package dvanaesti;

import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.AbstractAction;

import app.AppCore;
import sedmi.SedmiPanel;

public class DvanaestiAction extends AbstractAction{

	private DvanaestiPanel dvanaestiPanel;

	public DvanaestiAction(DvanaestiPanel dvanaestiPanel) {
		this.dvanaestiPanel=dvanaestiPanel;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		try {
			findEmployees();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

}
	
public ArrayList<EmployeePayFrequency> findEmployees() throws SQLException {
	
	   ArrayList<EmployeePayFrequency> employees = new ArrayList<>();
	   String queryProduct = "SELECT ph.PayFrequency, ph.Rate, e.EmployeeID, c.NameStyle, c.Title, c.FirstName, c.LastName, c.MiddleName\r\n"
	   		+ "\r\n"
	   		+ "FROM employee e\r\n"
	   		+ "\r\n"
	   		+ "JOIN employeepayhistory ph\r\n"
	   		+ "\r\n"
	   		+ "ON e.EmployeeID = ph.EmployeeID\r\n"
	   		+ "\r\n"
	   		+ "JOIN contact c\r\n"
	   		+ "\r\n"
	   		+ "ON e.ContactID = c.ContactID\r\n"
	   		+ "\r\n"
	   		+ "WHERE ph.PayFrequency = 2";
	   		
	    PreparedStatement statement = AppCore.getInstance().getCon().prepareStatement(queryProduct);
	    ResultSet resultSet = statement.executeQuery();
	    while(resultSet.next()){
	    	employees.add(new EmployeePayFrequency(
	    			resultSet.getInt("PayFrequency"),
	    			resultSet.getDouble("Rate"),
	    			resultSet.getInt("EmployeeID"),
	    			resultSet.getBoolean("NameStyle"),
	    			resultSet.getString("Title"),
	    			resultSet.getString("FirstName"),
	    			resultSet.getString("LastName"),
	    			resultSet.getString("MiddleName")
	    	));
	    }
	    
	    dvanaestiPanel.getTextArea().setText(employees.toString());
		return employees;
	}
}
