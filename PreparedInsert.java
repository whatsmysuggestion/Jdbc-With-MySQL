import java.sql.*;
import java.util.*;
public class PreparedInsert {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");//localhost or 127.0.0.1 or ipaddress 
		//remote ipaddress
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mubeen","root","root");
		
		
		
	PreparedStatement pst=con.prepareStatement("insert into emp values(?,?,?)");	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no,name and fee");
	pst.setInt(1, sc.nextInt());
	pst.setString(2,sc.next());
	pst.setFloat(3, sc.nextFloat());
	
	int n=pst.executeUpdate();	
	if(n==1)
		System.out.println("Record Inserted");
	con.close();	
	}
}
