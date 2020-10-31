import java.sql.*;
public class DatabaseMetaDataExample {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");//localhost or 127.0.0.1 or ipaddress 
		//remote ipaddress
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mubeen",
				"root","root");
		DatabaseMetaData dbmd=con.getMetaData();
		
		//System.out.println(dbmd.getDatabaseMajorVersion());
		//System.out.println(dbmd.getDatabaseMinorVersion());
		System.out.println(dbmd.getDatabaseProductName());
		System.out.println(dbmd.getDatabaseProductVersion());
		System.out.println(dbmd.getDriverName());
		System.out.println(dbmd.getDriverMajorVersion());
		System.out.println(dbmd.getDriverMinorVersion());
		System.out.println(dbmd.getDriverVersion());
		
		con.close();
		
		
 

	}

}
