
package clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ModificarBd {
    
    public void Modificar(int stock, int precioU, int codigo)throws SQLException {
        
        bdConexion con = new bdConexion();
        PreparedStatement pstm;
        
        try{ 
        
            pstm = con.getConnection().prepareStatement("UPDATE producto SET stock = "+stock+", precio_unitario = "+precioU+" WHERE codigo = "+codigo+";");
            int control = pstm.executeUpdate();
            
            if(control>0){
                JOptionPane.showMessageDialog(null, "LOS DATOS HAN SIDO GUARDADOS", "Guardado", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Error en control update en Clase ModificarBd", "ERROR", 0);
            }

            con.desconectar();
            
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", 0);
        }
     
    }    
}
