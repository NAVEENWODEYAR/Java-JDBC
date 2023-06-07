// WAP to perform the select query
package jdbcOne;

import java.sql.*;

public class Select_Ex
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/today","root","boss");
                Statement st = cn.createStatement();
                 ResultSet rs = st.executeQuery("select pname from pd");
                            while(rs.next())
                            {
                                String n = rs.getString("pname");
                                System.out.println("Product Name-"+n);
                            }
                cn.close();
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}
