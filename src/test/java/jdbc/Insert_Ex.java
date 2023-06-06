package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert_Ex
{
    public static void main(String[] args) throws  Exception
    {
     // Insert command
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb2","root","boss");
        Statement st = con.createStatement();
            st.executeUpdate("insert into test values(1,'Ammie')");
            st.executeUpdate("insert into test values(2,'Benny')");
            st.executeUpdate("insert into test values(3,'Clara')");
            st.executeUpdate("insert into test values(4,'Dia')");
            System.out.println("Data inserted successfully");
                con.close();

    }
}
