import java.sql.*;
 

public class PreparedDrop {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");//localhost or 127.0.0.1 or ipaddress 
		//remote ipaddress
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parminder","root","root");
		
		PreparedStatement pst=con.prepareStatement("truncate table emp");
		
		pst.execute();
		
		con.close();		 


	}

}
