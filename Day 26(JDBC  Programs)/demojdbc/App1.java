 
package demojdbc;
import java.sql.*;
public class App1{
public String getGreeting() {
return "Hello World!";
}
public static void main(String[] args) throws Exception {
// Load database driver in memory
Class.forName("org.postgresql.Driver");
System.out.println("Driver loaded");
Connection conn;
conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test1", "postgres", "root");
System.out.println("Coonection done");
Statement stmt;
stmt=conn.createStatement();
String sql;
 
//sql="select * from student";
//ResultSet rs;
//rs=stmt.executeQuery(sql);
//while (rs.next()) {
//System.out.println(rs.getInt("id")); 
//System.out.println(rs.getString("name"));
// }
sql="select * from student where id=3200";
ResultSet rs;
rs=stmt.executeQuery(sql);
if(rs.next()){
System.out.println("Record Found");
}else{
System.out.println("Record not found");
}
conn.close();
}
}
