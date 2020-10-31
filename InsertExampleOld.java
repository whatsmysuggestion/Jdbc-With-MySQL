import java.sql.*;
public class InsertExampleOld {

	public static void main(String[] args)throws Exception {
 
		Class.forName("com.mysql.jdbc.Driver");

//localhost or 127.0.0.1(loop back address) or ipaddress 
		//remote ipaddress

Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mubeen","root","root");

Statement st=con.createStatement();


	int n=st.executeUpdate("insert into emp values(4,'e',15.45)");
	if(n==1)
		System.out.println("Record Inserted");

	con.close();

	}

}