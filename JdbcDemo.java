import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) throws SQLException {
        //Creating the Connection
        String url = "jdbc:postgresql://localhost:port/dbname";
        Connection conn = null;

        int rollno = 1;
        String name = "Jhon";
        int age = 25;
        String sql = "insert into student(rollno, name, age) " + "values (" + rollno + ", '" + name + "', " + age + ")";

        try {
            conn =  DriverManager.getConnection(url, "username", "password");

            Statement st = conn.createStatement();
            int m = st.executeUpdate(sql);
            if (m == 1)
                System.out.println("Record inserted correctly");
            else
                System.out.println("Error inserting record");
        } catch (Exception e) {
            System.err.println(e);
        }
        finally {
            conn.close();
        }

    }

}