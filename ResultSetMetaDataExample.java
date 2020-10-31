import java.sql.*;


public class ResultSetMetaDataExample {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");//localhost or 127.0.0.1 or ipaddress 
		//remote ipaddress
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mubeen","root","root");
	Statement st=con.createStatement();
	
	
	ResultSet rs=st.executeQuery("select * from emp");
	
	ResultSetMetaData rsmd=rs.getMetaData();
	
	System.out.println(rsmd.getColumnClassName(1));
	System.out.println(rsmd.getColumnCount());
	System.out.println(rsmd.getColumnDisplaySize(1));
	System.out.println(rsmd.getColumnLabel(1));
	System.out.println(rsmd.getColumnName(1));
	System.out.println(rsmd.getColumnType(2));
	System.out.println(rsmd.getColumnTypeName(1));

	con.close();
	}

}
