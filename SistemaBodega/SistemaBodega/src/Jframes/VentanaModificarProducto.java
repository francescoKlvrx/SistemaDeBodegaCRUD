
package Jframes;

import clases.ModificarBd;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class VentanaModificarProducto extends javax.swing.JFrame {

    public VentanaModificarProducto() {
        initComponents();
    }
    ModificarBd mod = new ModificarBd();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputCodigoVenMod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BotonGuardarModificacion = new javax.swing.JButton();
        inputStockVenMod = new javax.swing.JTextField();
        inputPrecioVenMod = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("INGRESO DE DATOS Y CAMBIOS DE PRECIOS");

        jLabel2.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jLabel2.setText("Ingresar el codigo del producto");

        inputCodigoVenMod.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        inputCodigoVenMod.setText("********");

        jLabel3.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jLabel3.setText("ingrese un nuevo stock de producto");

        jLabel4.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jLabel4.setText("ingrese un nuevo precio de producto");

        BotonGuardarModificacion.setText("Guardar");
        BotonGuardarModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarModificacionActionPerformed(evt);
            }
        });

        inputStockVenMod.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N

        inputPrecioVenMod.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jLabel5.setText("presione aqui para guardar cambios :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(inputStockVenMod, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(inputCodigoVenMod, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(inputPrecioVenMod, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(59, 59, 59)
                                .addComponent(BotonGuardarModificacion))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCodigoVenMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputStockVenMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPrecioVenMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(BotonGuardarModificacion))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGuardarModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarModificacionActionPerformed
        int stock = Integer.parseInt(inputStockVenMod.getText());
        int precioU = Integer.parseInt(inputPrecioVenMod.getText());
        int codigo = Integer.parseInt(inputCodigoVenMod.getText());
        
        try { 
            mod.Modificar(stock, precioU, codigo);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            System.out.println("error en la interfaz de VentanaModificar en la parte del BotonModificar");
        }
    }//GEN-LAST:event_BotonGuardarModificacionActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaModificarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGuardarModificacion;
    private javax.swing.JTextField inputCodigoVenMod;
    private javax.swing.JTextField inputPrecioVenMod;
    private javax.swing.JTextField inputStockVenMod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
