/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MostrarProductosTabla {
       
    public DefaultTableModel MostrarProductos(){
        
        bdConexion con = new bdConexion();
        Statement st;
        ResultSet rs;
        
        String []  nombresColumnas = {"codigo","nombre","stock","precio_unitario"};
        String [] registros = new String[4];
        
        DefaultTableModel res = new DefaultTableModel(null,nombresColumnas);
        
        try{
            st = con.getConnection().createStatement();
            rs = st.executeQuery("select *from producto"); 
        
            while(rs.next()){
                
                registros[0] = rs.getString("codigo");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("stock");
                registros[3] = rs.getString("precio_unitario");
                
                res.addRow(registros);   
            }

            con.desconectar();
            
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", 0);
        }
        
        return res;
    }
    

}
