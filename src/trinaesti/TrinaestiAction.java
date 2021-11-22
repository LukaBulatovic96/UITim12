package trinaesti;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.AbstractAction;

import com.mysql.cj.jdbc.CallableStatement;

import app.AppCore;
import peti.SalesFromTerritory;
import sedmi.SedmiPanel;

public class TrinaestiAction extends AbstractAction {

	private TrinaestiPanel trinaestiPanel;

	public TrinaestiAction(TrinaestiPanel trinaestiPanel) {
		this.trinaestiPanel = trinaestiPanel;

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

		String statementString = "SELECT d.DepartmentID, d.Name, h.EmployeeID, e.MaritalStatus, e.Gender, e.BirthDate, e.HireDate from department d "
				+ "JOIN employeedepartmenthistory h ON d.DepartmentID = h.DepartmentID Join employee e "
				+ "ON e.EmployeeID = h.EmployeeID" + "";

		ResultSet rs = stmt.executeQuery(statementString);

		ResultSetMetaData rsmd = rs.getMetaData();

		ArrayList<Department> departmentList = new ArrayList<>();

		int columnsNumber = rsmd.getColumnCount();
		for (int i = 1; i <= columnsNumber; i++) {
			String name = rsmd.getColumnName(i);
			System.out.print(name + " ");
		}
		System.out.println();
		System.out.println("____________________");
		

		while (rs.next()) {
			for (int j2 = 1; j2 <= columnsNumber; j2++) {
				System.out.print(rs.getString(j2) + " ");
			}
			System.out.println();

			boolean exists = false;

			for (int i = 0; i < departmentList.size(); i++) {
				if (departmentList.get(i).getId() == rs.getInt("DepartmentID")) {
					exists = true;
					if (rs.getString("MaritalStatus").contains("M")) {
						departmentList.get(i).incrementMarried();
					} else {
						departmentList.get(i).incrementTotal();
					}

					if (rs.getString("Gender").contains("F")) {
						departmentList.get(i).incrementWomen();
					}
					
					String dateStr = rs.getString("BirthDate").substring(0,4);
					int starost = 2021-Integer.parseInt(dateStr);
					departmentList.get(i).incrementStarost(starost);
					
					String hireDateStr = rs.getString("HireDate").substring(0,4);
					int zaposlen = 2021-Integer.parseInt(hireDateStr);
					departmentList.get(i).incrementUkupnoZaposlenje(zaposlen);
					
				}
			}
			if (!exists) {
				departmentList.add(new Department(rs.getInt("DepartmentID")));
				int i = departmentList.size() - 1;
				if (rs.getString("MaritalStatus").contains("M")) {
					departmentList.get(i).incrementMarried();
				} else {
					departmentList.get(i).incrementTotal();
				}

				if (rs.getString("Gender").contains("F")) {
					departmentList.get(i).incrementWomen();
				}
				
				String dateStr = rs.getString("BirthDate").substring(0,4);
				int starost = 2021-Integer.parseInt(dateStr);
				departmentList.get(i).incrementStarost(starost);
			}

		}

		String finalText ="";
		
		for (int i = 0; i < departmentList.size(); i++) {
			finalText+=departmentList.get(i).toString()+'\n';
		}
		
		trinaestiPanel.getTextArea().setText(finalText);
	}

}
