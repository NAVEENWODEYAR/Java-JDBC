// WAP to insert the data into the tab
package jdbcOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert_Ex
{
    public static void main(String[] args) throws Exception
    {
    Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/today","root","boss");
        Statement st = c.createStatement();
                    st.executeUpdate("insert into pd values(2,'Dairy Milk',40,'1pc')");
                    st.executeUpdate("insert into pd values(4,'Oreo',25,'1pc')");
                    st.executeUpdate("insert into pd values(6,'Goodday',10,'10pc')");
                    st.executeUpdate("insert into pd values(8,'Crack Jack',15,'15pc')");
                    st.executeUpdate("insert into pd values(10,'Dairy Rich',25,'10pc')");
                    st.executeUpdate("insert into pd values(20,'Five Star',5,'15pc')");
                   System.out.println("Inserted the data successfully into the table");
                    c.close();
    }
}
