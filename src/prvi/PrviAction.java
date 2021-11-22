package prvi;

import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.AbstractAction;

import app.AppCore;


public class PrviAction extends AbstractAction{
	
	private PrviPanel prviPanel;

	public PrviAction(PrviPanel prviPanel) {
		this.prviPanel=prviPanel;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		try {
			selectProducts();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

}
/*	
private void testSQL() throws SQLException {
		
		Statement stmt = AppCore.getInstance().getCon().createStatement();
		
		String statementString="select * from product";
		
		ResultSet rs = stmt.executeQuery(statementString);

		ResultSetMetaData rsmd = rs.getMetaData();
	
		
		
		int columnsNumber = rsmd.getColumnCount();
		for (int i = 1; i <= columnsNumber; i++ ) {
			  String name = rsmd.getColumnName(i);
			  System.out.print(name + " ");
			}
		System.out.println();
		System.out.println("____________________");
		
		while(rs.next()) {
			for (int j2 = 1; j2 <= columnsNumber; j2++) {
				System.out.print(rs.getString(j2) + " ");
			}
			System.out.println();
		}
		
		
	}
	*/
	public ArrayList<Product> selectProducts() throws SQLException {
	    ArrayList<Product> products = new ArrayList<>();

	    //UPIT
	    String queryProduct = "SELECT  p.ProductID, p.Name, p.ProductNumber, p.MakeFlag, p.FinishedGoodsFlag, p.Color, p.SafetyStockLevel,\n" +
	            "p.ReorderPoint, p.StandardCost, p.ListPrice, p.Size, p.SizeUnitMeasureCode, p.WeightUnitMeasureCode, p.Weight,\n" +
	            "p.DaysToManufacture, p.ProductLine, p.Class, p.Style, pc.Name AS 'Category Name', p.ProductModelID, p.SellStartDate, p.SellEndDate,\n" +
	            "p.DiscontinuedDate, p.rowguid, p.ModifiedDate\n" +
	            "FROM productsubcategory ps\n" +
	            "JOIN product p\n" +
	            "ON p.ProductSubcategoryID = ps.ProductSubcategoryID\n" +
	            "JOIN productcategory pc\n" +
	            "ON ps.ProductCategoryID = pc.ProductCategoryID";
	    PreparedStatement statement = AppCore.getInstance().getCon().prepareStatement(queryProduct);
	    ResultSet resultSet = statement.executeQuery();
	    while(resultSet.next()){
	        products.add(new Product(
	                resultSet.getInt("ProductID"),
	                resultSet.getString("Name"),
	                resultSet.getString("ProductNumber"),
	                resultSet.getBoolean("MakeFlag"),
	                resultSet.getBoolean("FinishedGoodsFlag"),
	                resultSet.getString("Color"),
	                resultSet.getInt("SafetyStockLevel"),
	                resultSet.getInt("ReorderPoint"),
	                resultSet.getDouble("StandardCost"),
	                resultSet.getDouble("ListPrice"),
	                resultSet.getString("Size"),
	                resultSet.getString("SizeUnitMeasureCode"),
	                resultSet.getString("WeightUnitMeasureCode"),
	                resultSet.getFloat("Weight"),
	                resultSet.getInt("DaysToManufacture"),
	                resultSet.getString("ProductLine"),
	                resultSet.getString("Class"),
	                resultSet.getString("Style"),
	                resultSet.getString("Category Name"),
	                new ProductModel(resultSet.getInt("ProductModelId")),
	                resultSet.getDate("SellStartDate"),
	                resultSet.getDate("SellEndDate"),
	                resultSet.getDate("DiscontinuedDate"),
	                resultSet.getBytes("rowguid"),
	                resultSet.getDate("ModifiedDate")
	        ));

	    }
	    System.out.println(products);
	    prviPanel.getTextArea().setText(products.toString());
	    return products;
	}
	
	
}
