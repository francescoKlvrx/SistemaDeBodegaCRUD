
package Jframes;

import clases.CrearProducto;
import java.sql.SQLException;


public class VentanaCrearPoducto extends javax.swing.JFrame {

    public VentanaCrearPoducto() {
        initComponents();
    }
    CrearProducto crear = new CrearProducto();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputCodProducNew = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputNameProductNew = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputCantProductNew = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        inputPrecProductNew = new javax.swing.JTextField();
        BotonGuardarProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("AÑADIR PRODUCTO");

        jLabel2.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jLabel2.setText("Ingresar codigo  de producto :");

        jLabel3.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jLabel3.setText("ingresar nombre del producto");

        jLabel4.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jLabel4.setText("ingresar cantidad del producto");

        jLabel5.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jLabel5.setText("ingresar precio del producto");

        BotonGuardarProducto.setText("Guardar");
        BotonGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(inputNameProductNew)
                                .addComponent(inputCodProducNew, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(inputPrecProductNew, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputCantProductNew, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(BotonGuardarProducto))
                    .addComponent(jLabel4))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel1)
                .addGap(166, 166, 166))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(inputCodProducNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPrecProductNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNameProductNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCantProductNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonGuardarProducto))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarProductoActionPerformed
        int codigo = Integer.parseInt(inputCodProducNew.getText());
        String nombre = (inputNameProductNew.getText());
        int stock = Integer.parseInt(inputCantProductNew.getText());
        int precioU = Integer.parseInt(inputPrecProductNew.getText());
        
         try { 
            crear.Modificar(codigo, nombre, stock, precioU);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            System.out.println("error en la interfaz de VentanaCrearProducto en la parte del BotonGuardarProducto");
        }
    }//GEN-LAST:event_BotonGuardarProductoActionPerformed


    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCrearPoducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGuardarProducto;
    private javax.swing.JTextField inputCantProductNew;
    private javax.swing.JTextField inputCodProducNew;
    private javax.swing.JTextField inputNameProductNew;
    private javax.swing.JTextField inputPrecProductNew;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
