
package clases;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CrearProducto {
    public void Modificar(int codigo, String nombre, int stock, int precioU)throws SQLException {
        
        bdConexion con = new bdConexion();
        PreparedStatement pstm;
        
        try{ 
        
            pstm = con.getConnection().prepareStatement("insert into producto values("+codigo+", '"+nombre+"', "+stock+" , "+precioU+");");
            int control = pstm.executeUpdate();
            
            if(control>0){
                JOptionPane.showMessageDialog(null, "LOS DATOS HAN SIDO GUARDADOS", "Guardado", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Error en control INSERT INTO en Clase CrearProducto", "ERROR", 0);
            }

            con.desconectar();
            
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", 0);
        }
    } 
}
