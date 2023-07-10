
package clases;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClaseEliminarProducto {
    public void Eliminar(int codigo)throws SQLException {
        
        bdConexion con = new bdConexion();
        PreparedStatement pstm;
        
        try{ 
        
            pstm = con.getConnection().prepareStatement("delete from producto where codigo = "+codigo+";");
            int control = pstm.executeUpdate();
            
            if(control>0){
                JOptionPane.showMessageDialog(null, "LOS DATOS HAN SIDO GUARDADOS", "Guardado", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Error en control DELETE en Clase EiminarProducto", "ERROR", 0);
            }

            con.desconectar();
            
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", 0);
        }
    }
}
