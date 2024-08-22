import java.sql.*;
import java.lang.*;
class JdbcDemo1
{
public static void main(String args[])throws Exception
{
//Loading Driver
Class.forName("com.mysql.jdbc.Driver");

//Providing Connection 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/db2","root","P@ssw0rd");

//Using Statement Interface
Statement st=con.createStatement();

//processing query using statement method
st.execute("create table test(id int)");
System.out.println("Table Created");

//closing objects
st.close();
con.close();
}
}
