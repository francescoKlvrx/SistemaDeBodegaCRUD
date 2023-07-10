
package clases;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;
public class bdConexion {
    private static Connection con = null;
   
    static String bd = "bodega";
    static String user = "root";
    static String pass = "Murcielago27#";
    static String url = "jdbc:mysql://localhost:3306/"+bd+"?zeroDateTimeBehavior=CONVERT_TO_NULL";   
    
    public bdConexion(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            
            if(con != null){
                //JOptionPane.showMessageDialog(null, "Conexion Exitosa", "INFO", 1);
                System.out.println("Conexion Exitosa");
            }
        
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", 0);
        }catch(ClassNotFoundException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", 0);
        }
        
    }

    public Connection getConnection(){
        return con;
    }
    
    public void desconectar() throws SQLException {
        con.close();
    }

}
