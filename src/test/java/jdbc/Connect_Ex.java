package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connect_Ex
{
    public static void main(String[] args) throws Exception
    {
     // Java program for database connectivity
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb2","root","boss");
        Statement st = cn.createStatement();
                st.executeUpdate("create table test1111(id int,name varchar(20))");
                System.out.println("Successfully created the table");
                cn.close();
    }
}
