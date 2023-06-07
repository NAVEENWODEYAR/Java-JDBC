// WAP to perform the delete operation
package jdbcOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete_Ex
{
    public static void main(String[] args) throws  Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/today","root","boss");
        Statement st = cn.createStatement();
                    st.executeUpdate("delete from pd where price='40'");
                    System.out.println("Deleted successfully");
                    cn.close();

    }
}
