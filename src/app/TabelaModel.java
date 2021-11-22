package app;


import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Vector;

public class TabelaModel {

    static boolean isDate[] = new boolean[100];
    static SimpleDateFormat df = new SimpleDateFormat("dd/MMMMMMMMM/yyyy");

    public static DefaultTableModel make (ResultSet rs) throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData();

        Vector<String> colNames = new Vector<>();

        int colCount = metaData.getColumnCount();

        for (int i = 1; i <= colCount; i++) {
            if (metaData.getColumnTypeName(i)=="datetime"){
                isDate[i]=true;
            } else isDate[i]=false;

            colNames.add(metaData.getColumnName(i));
        }

        Vector<Vector<Object>> dataVectors = new Vector<>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<>();
            for (int j = 1; j <= colCount; j++) {
                if (isDate[j]){
                    try {
                        Timestamp ts = (Timestamp) rs.getObject(j);
                        Date date= new Date( ts.getTime());
                        vector.add(df.format(date));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    vector.add(rs.getObject(j));
                }
            }
            dataVectors.add(vector);
        }
        return new DefaultTableModel(dataVectors, colNames);
    }
}
