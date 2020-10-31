
import java.sql.*;  
public class Proc {  
public static void main(String[] args) throws Exception{  
	Class.forName("com.mysql.jdbc.Driver");//localhost or 127.0.0.1 or ipaddress 
	//remote ipaddress
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mubeen","root","root");
	 
  
CallableStatement stmt=con.prepareCall("{call insert_studentinfo(?,?,?)}");  
stmt.setInt(1,56);  
stmt.setString(2,"ttt");
stmt.setDouble(3,126.3);
stmt.execute();  
  
System.out.println("success");  
}  
}  



/*

DELIMITER // ;
  Create PROCEDURE insert_studentinfo(IN eid int, IN ename varchar(20),IN esal float)
    BEGIN
  insert into emp values (eid, ename,esal);
   END //


*/