// WAP create the table in the db from the java progaram
package jdbcOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Create_Ex
{
    public static void main(String[] args) throws Exception
    {
        // 1. Load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. Establish the connection
        Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/today","root","boss");

        // 3. Create the statemtnt
        Statement st = co.createStatement();
                    st.executeUpdate("create table product(pid int, pname varchar(25),price int, qty varchar(20))");

                     System.out.println("Table created successfully");
        // 4. close the connection
        co.close();
    }
}
