package perpustakaan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Perpustakaan {
    private static Connection conn;
    static Connection config()throws SQLException{
        try{
            String host = "jdbc:mysql://localhost:3306/db_perpus";
            String usr = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection(host,usr,pass);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"koneksi gagal"+e.getMessage());
        }
        return conn;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
