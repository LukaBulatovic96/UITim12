package Observer;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.Table;


public abstract class Observer {
	
	  // protected Subject subject;
	   public abstract void update(String text) throws SQLException;
	   
	   
	}