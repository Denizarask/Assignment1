
import java.sql.Connection;
import java.sql.DriverManager;

public class Assignment1{

public static Connection getConnection()throws Exception{

try{
String url = "jdbc:mysql://localhost:3306/jdbc_Assignment1";
String username = "Deniz";
String password = "111";


Connection conn = DriverManager.getConnection(url,username,password);
System.out.println("Connected to database!");
return conn;
}catch(Exception e){System.out.println(e);}
return null;
}


public static void main(String[]args) throws Exception{
getConnection();

}
}
