import java.sql.Connection;
import java.sql.DriverManager;


public class dbConnection {
	Connection conn = null;
	public Connection dbconnect()
	{
		
		String url = "jdbc:mysql://localhost:3306/";
		String db = "gup";
		String driver = "com.mysql.jdbc.Driver";
		String user = "root";
		String pass = "";
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url + db, user, pass);
			if(conn == null){
				System.out.println("Connection is not established");
			}
			return conn ;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null ;
	}
	
}

