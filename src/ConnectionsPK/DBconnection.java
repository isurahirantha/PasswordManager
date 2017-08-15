package ConnectionsPK;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author SuperUser
 */
public class DBconnection {
//Singletonconnection
    /*   
    public static Connection connect()
    {
        Connection con;
        con = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");  
  
       // Connection con; 
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/passworddb","root","");
            if(con==null){
            System.out.println("Not connected");
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
        
        return con;
    }
*/
    
   private static DBconnection DBconIns;
   private Connection connection = null;
   private DBconnection(){
       
   try
        {
            Class.forName("com.mysql.jdbc.Driver");  
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/passworddb","root","");
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
   
   }
   
   public Connection getConnection(){
    return connection;
   }
   
   public static synchronized DBconnection getConnectionInstance(){
       if(DBconIns==null){
       DBconIns = new DBconnection();
       }
       return DBconIns;
   }

}