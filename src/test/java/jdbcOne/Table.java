// Program for database connectivity..,
package jdbcOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Table
{
    public static void main(String[] args) throws Exception
    {
        // 1. Load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. Establish the connection
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/today","root","boss");

        // 3. Create the statement
        Statement st = c.createStatement();

        // 4. Execute the statement
//        st.executeUpdate("create table school(id int,s_name varchar(50),address varchar(100))");
//        System.out.println("Table created successfully");


        // Insert the data..,
        st.executeUpdate("insert into school values(1011,'Berlin School of Excellence','Berlin')");
        st.executeUpdate("insert into school values(2811,'Oxford School of Excellence','Kentucky')");

        // 5. Close the connection
        c.close();
    }
}
