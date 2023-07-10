
package Jframes;

import clases.BuscadorBd;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class VentanaBodega extends javax.swing.JFrame {

    BuscadorBd busca = new BuscadorBd();
    public VentanaBodega() {
        initComponents();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        InputBuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BotonCrearProducto = new javax.swing.JButton();
        BotonEliminarProducto = new javax.swing.JButton();
        BotonModificarProducto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BotonMostrarBodega = new javax.swing.JButton();
        BotonBuscarProducto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProducto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("SISTEMA BODEGA");

        jLabel2.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jLabel2.setText("stock disponible :");

        InputBuscar.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jLabel3.setText("añadir un producto");

        BotonCrearProducto.setText("Crear");
        BotonCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearProductoActionPerformed(evt);
            }
        });

        BotonEliminarProducto.setText("Eliminar");
        BotonEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarProductoActionPerformed(evt);
            }
        });

        BotonModificarProducto.setText("Modificar");
        BotonModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarProductoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        jLabel4.setText("mostrar bodega");

        BotonMostrarBodega.setText("Mostrar");
        BotonMostrarBodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostrarBodegaActionPerformed(evt);
            }
        });

        BotonBuscarProducto.setText("Buscar");
        BotonBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarProductoActionPerformed(evt);
            }
        });

        TablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TablaProducto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(InputBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonBuscarProducto))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(BotonCrearProducto))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotonMostrarBodega)
                                    .addComponent(jLabel4))
                                .addGap(97, 97, 97)
                                .addComponent(BotonModificarProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonEliminarProducto))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel1)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(InputBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscarProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(BotonModificarProducto)
                    .addComponent(BotonEliminarProducto))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCrearProducto)
                    .addComponent(BotonMostrarBodega))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarProductoActionPerformed

        String Valor = InputBuscar.getText();
        try {
            //busca.buscarBd(Valor);  
            DefaultTableModel res = busca.buscadorBd(Valor);
            TablaProducto.setModel(res);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_BotonBuscarProductoActionPerformed

    private void BotonMostrarBodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarBodegaActionPerformed
        new VentanaMostrarBodega().setVisible(true);
    }//GEN-LAST:event_BotonMostrarBodegaActionPerformed

    private void BotonModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarProductoActionPerformed
        new VentanaModificarProducto().setVisible(true);
    }//GEN-LAST:event_BotonModificarProductoActionPerformed

    private void BotonCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearProductoActionPerformed
        new VentanaCrearPoducto().setVisible(true);
    }//GEN-LAST:event_BotonCrearProductoActionPerformed

    private void BotonEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarProductoActionPerformed
        new VentanaEliminar().setVisible(true);
    }//GEN-LAST:event_BotonEliminarProductoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaBodega().setVisible(true);
            }
        });
    }
    
   
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscarProducto;
    private javax.swing.JButton BotonCrearProducto;
    private javax.swing.JButton BotonEliminarProducto;
    private javax.swing.JButton BotonModificarProducto;
    private javax.swing.JButton BotonMostrarBodega;
    private javax.swing.JTextField InputBuscar;
    private javax.swing.JTable TablaProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
