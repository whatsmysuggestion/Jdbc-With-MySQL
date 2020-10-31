import java.sql.*;
public class StatementBatch {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");//localhost or 127.0.0.1 or ipaddress 
		//remote ipaddress
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mubeen","root","root");
	Statement st=con.createStatement();	
	
	
	st.addBatch("delete from emp");
	
	st.addBatch("insert into emp values(1,'a',12.3)");
	st.addBatch("insert into emp values(2,'b',13.3)");
	st.addBatch("insert into emp values(3,'c',14.3)");
	st.addBatch("insert into emp values(4,'d',15.3)");
	
	
	
	 
	int n[]=st.executeBatch();	
	if(n.length>1)
		System.out.println("Records Updated");	
	con.close();

	}

}
