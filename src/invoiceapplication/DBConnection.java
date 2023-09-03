package invoiceapplication;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
/**
 *
 * @author lunna
 */
public class DBConnection {
    public final static String username = "root";
    public final static String password = "";
    
    public static void credentials() throws FileNotFoundException, IOException{
        Properties login = new Properties();
        try (FileReader in = new FileReader("login.properties")) {
            login.load(in);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
         
    }
      
    public static Connection connect(){
        Connection con = null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/invoice",username,password);
            System.out.println("Connection made!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    private static Connection DriverManager(String jdbcmysqllocalhost3306webinventory, String root, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
 
}
