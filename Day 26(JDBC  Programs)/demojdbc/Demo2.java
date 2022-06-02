package demojdbc;
import java.sql.*;
public class Demo2 {
public static void main(String[] args) throws Exception {
// Load database driver in memory
Class.forName("org.postgresql.Driver");
System.out.println("Driver loaded");
Connection conn;
conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test1", "postgres", "root");
System.out.println("Coonection done");
String sql;
sql="insert into student values(?,?)";
PreparedStatement stmt;
stmt=conn.prepareStatement(sql);
stmt.setInt(1, 1500);
stmt.setString(2, "ttt");
stmt.executeUpdate();
conn.close();
}
}
 
