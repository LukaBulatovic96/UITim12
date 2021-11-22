package deveti;

import java.awt.event.ActionEvent;
import java.sql.*;

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
		

		PreparedStatement preped = AppCore.getInstance().getCon().prepareStatement("CALL Customers_Countries( ? )");

		String parametar = devetiPanel.getTextArea().getText().trim();

		System.out.println("Parametar je: " + parametar + "\n");

		if (parametar.equalsIgnoreCase("")){
			parametar="Water bottle";
			System.out.println(parametar + " - (default primer parametra)");
		}


		preped.setString(1,parametar);

		ResultSet rs = preped.executeQuery();

		AppCore.getInstance().initModel(rs);
	}

}
