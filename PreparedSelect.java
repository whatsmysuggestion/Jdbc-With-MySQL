import java.sql.*;

import java.util.*;


public class PreparedSelect {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");//localhost or 127.0.0.1 or ipaddress 
		//remote ipaddress
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mubeen","root","root");
		
		PreparedStatement pst=con.prepareStatement("select * from emp where eno=?");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int no=sc.nextInt();
		pst.setInt(1, no);

		ResultSet rs=pst.executeQuery();		 
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
		}

		con.close();
	}

}
