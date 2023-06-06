package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select_Ex
{
    public static void main(String[] args)
    {
    // Select query
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb2","root","boss");
            Statement st = c.createStatement();
                     ResultSet rt = st.executeQuery("select * from test");
                        while(rt.next())
                        {
                            int id = rt.getInt("id");
                            String name = rt.getString("name");
                            System.out.println("ID- "+id+"Name- "+name);
                        }

                        c.close();
        } catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}
