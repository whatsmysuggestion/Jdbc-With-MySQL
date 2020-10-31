import java.sql.*;

public class DropExample {


	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");//localhost or 127.0.0.1 or ipaddress 
		//remote ipaddress
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mubeen","root","root");
	Statement st=con.createStatement();
	
	
	st.execute("truncate table emp");
	
	
	con.close();

	}

}
