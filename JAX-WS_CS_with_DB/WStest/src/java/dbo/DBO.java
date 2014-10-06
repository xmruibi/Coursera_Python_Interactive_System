package DBreader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class DBO {
	private Connection conn;
	private Statement stmt;
	private DataSource ds;

	public DBO() {
	}

	public void open() 
	{
		try 
		{
			Class.forName("org.apache.derby.jdbc.ClientDriver");           
			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/DB4WSTest","root","root");
			stmt=conn.createStatement();
			System.out.println("Connected Successfully");
		} 
		catch (Exception ex) 
		{
		System.err.println("Connection Error: " + ex.getMessage());
		}
	}

	
	public void close() 
	{
		try 
		{
		
	
			conn.close();
			System.out.println ("Connection Closed");
		} 
		catch (SQLException ex) 
		{
			System.err.println("Errors when close the connection: " + ex.getMessage());
		}
	}


	public ResultSet executeQuery(String sql) throws SQLException
	{
		ResultSet rs = null;
		
                rs=conn.prepareStatement(sql).executeQuery();

		//rs = stmt.executeQuery(sql);
		System.out.println ("Successful Query!");
		return rs;
	}

	
	public int executeUpdate(String sql) throws SQLException
	{
		int ret = 0;
		
	
		ret = stmt.executeUpdate(sql);
	
		System.out.println ("Successful Update!");
		return ret;
	}

}
