import java.sql.*;
public class PreparedBatch {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");//localhost or 127.0.0.1 or ipaddress 
		//remote ipaddress
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mubeen","root","root");
		
		
		PreparedStatement pst=con.prepareStatement("insert into emp values(?,?,?)");
	
	pst.setInt(1, 1);
	pst.setString(2, "a");
	pst.setFloat(3, 13.3f);
	pst.addBatch();
	
	pst.setInt(1, 2);
	pst.setString(2, "b");
	pst.setFloat(3, 14.3f);
	pst.addBatch();
	
	
	pst.setInt(1, 3);
	pst.setString(2, "c");
	pst.setFloat(3, 15.3f);
	pst.addBatch();
	
	
	int n[]=pst.executeBatch();
	
	System.out.println(n.length+" Records Inserted");
	
	con.close();
	
	}

}
