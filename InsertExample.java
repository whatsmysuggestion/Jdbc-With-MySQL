import java.sql.*;
public class InsertExample {

	public static void main(String[] args)throws Exception {
	Class.forName("com.mysql.jdbc.Driver");//localhost or 127.0.0.1 or ipaddress 
	//remote ipaddress
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mubeen","root","root");
	
	Statement st=con.createStatement();
	
	
	
	ResultSet rs=st.executeQuery("select * from emp");
	

	while(rs.next())
	{
		

	
		System.out.println(rs.getInt("eno")+" "+rs.getString("ename")+" "+rs.getDouble(3));
	}
	

	
	con.close();
 

	}

}
