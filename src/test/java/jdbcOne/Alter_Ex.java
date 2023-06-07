// WAP to rename the table
package jdbcOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Alter_Ex
{
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/today","root","boss");
        Statement st = cnn.createStatement();
                    st.executeUpdate("Rename table product To pd");
                    System.out.println("Table name updated");
                    cnn.close();
    }
}
