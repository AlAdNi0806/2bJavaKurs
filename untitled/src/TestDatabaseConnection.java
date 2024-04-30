import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDatabaseConnection {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://aws-0-eu-central-1.pooler.supabase.com:5432/malini?user=postgres.fskhuggdujuzrguovqzj&password=-.WVh_L3uekvTcQ";
        try {
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connection successful!");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}
