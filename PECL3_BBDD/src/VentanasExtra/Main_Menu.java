/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanasExtra;

import java.sql.*;
import VentanasExtra.Consultas;
import MenusTablas.*;

/**
 *
 * @author razvanvc
 */
public class Main_Menu extends javax.swing.JFrame {

    public static Connection conexion;
    /**
     * Creates new form Vista_Gestor
     */
    
    public Main_Menu(Connection c) {
        Main_Menu.conexion = c;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Tienda = new javax.swing.JButton();
        btn_Ticket = new javax.swing.JButton();
        btn_Trabajador = new javax.swing.JButton();
        btn_Opinion = new javax.swing.JButton();
        btn_Socio = new javax.swing.JButton();
        btn_Producto = new javax.swing.JButton();
        btn_Oferta = new javax.swing.JButton();
        btn_Cupon = new javax.swing.JButton();
        btn_Consulta = new javax.swing.JButton();
        btn_Productos_Comprados = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        btn_Productos_Devueltos = new javax.swing.JButton();
        btn_Producto_Cupon = new javax.swing.JButton();
        btn_Producto_en_Oferta = new javax.swing.JButton();
        btn_Cajero = new javax.swing.JButton();
        btn_Reponedor = new javax.swing.JButton();
        btn_T_P_T = new javax.swing.JButton();
        btn_Socio_Cupon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Tienda.setText("Tienda");
        btn_Tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TiendaActionPerformed(evt);
            }
        });

        btn_Ticket.setText("Ticket");
        btn_Ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TicketActionPerformed(evt);
            }
        });

        btn_Trabajador.setText("Trabajador");
        btn_Trabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TrabajadorActionPerformed(evt);
            }
        });

        btn_Opinion.setText("Opinion");
        btn_Opinion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OpinionActionPerformed(evt);
            }
        });

        btn_Socio.setText("Socio");
        btn_Socio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SocioActionPerformed(evt);
            }
        });

        btn_Producto.setText("Producto");
        btn_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProductoActionPerformed(evt);
            }
        });

        btn_Oferta.setText("Oferta");
        btn_Oferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OfertaActionPerformed(evt);
            }
        });

        btn_Cupon.setText("Cupon");
        btn_Cupon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CuponActionPerformed(evt);
            }
        });

        btn_Consulta.setText("Consulta");
        btn_Consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultaActionPerformed(evt);
            }
        });

        btn_Productos_Comprados.setText("Productos Comprados");
        btn_Productos_Comprados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Productos_CompradosActionPerformed(evt);
            }
        });

        btn_Exit.setText("Cerrar Sesion");
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });

        btn_Productos_Devueltos.setText("Productos Devueltos");
        btn_Productos_Devueltos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Productos_DevueltosActionPerformed(evt);
            }
        });

        btn_Producto_Cupon.setText("Productos en Cupon");
        btn_Producto_Cupon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Producto_CuponActionPerformed(evt);
            }
        });

        btn_Producto_en_Oferta.setText("Productos en Oferta");
        btn_Producto_en_Oferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Producto_en_OfertaActionPerformed(evt);
            }
        });

        btn_Cajero.setText("Cajero");
        btn_Cajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CajeroActionPerformed(evt);
            }
        });

        btn_Reponedor.setText("Reponedor");
        btn_Reponedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReponedorActionPerformed(evt);
            }
        });

        btn_T_P_T.setText("Puntuar Trabajador");
        btn_T_P_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_T_P_TActionPerformed(evt);
            }
        });

        btn_Socio_Cupon.setText("Socios Cupon");
        btn_Socio_Cupon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Socio_CuponActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Oferta, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_Cajero, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Reponedor, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Productos_Comprados, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_T_P_T, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Socio_Cupon, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Producto_en_Oferta, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Cupon, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Producto_Cupon, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Tienda, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Socio, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Opinion, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Productos_Devueltos, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_Tienda, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(btn_Socio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_Ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Oferta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Cajero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Reponedor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Productos_Comprados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Opinion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Productos_Devueltos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Socio_Cupon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_T_P_T, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Cupon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Producto_Cupon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Producto_en_Oferta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(630, 424));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_TiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TiendaActionPerformed
        // TODO add your handling code here:
        Tienda ventana = new Tienda(conexion);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_TiendaActionPerformed

    private void btn_TicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TicketActionPerformed
        // TODO add your handling code here:
        Ticket ventana = new Ticket(conexion);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_TicketActionPerformed

    private void btn_TrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TrabajadorActionPerformed
        // TODO add your handling code here:
        Trabajador ventana = new Trabajador(conexion);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_TrabajadorActionPerformed

    private void btn_OpinionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OpinionActionPerformed
        // TODO add your handling code here:
        Opinion ventana = new Opinion(conexion);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_OpinionActionPerformed

    private void btn_SocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SocioActionPerformed
        // TODO add your handling code here:
        Socio ventana = new Socio(conexion);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_SocioActionPerformed

    private void btn_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProductoActionPerformed
        // TODO add your handling code here:
        Producto ventana = new Producto(conexion);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_ProductoActionPerformed

    private void btn_OfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OfertaActionPerformed
        // TODO add your handling code here:
        Oferta ventana = new Oferta(conexion);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_OfertaActionPerformed

    private void btn_CuponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CuponActionPerformed
        // TODO add your handling code here:
        Cupon ventana = new Cupon(conexion);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_CuponActionPerformed

    private void btn_ConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultaActionPerformed
        // TODO add your handling code here:
        Consultas ventana = new Consultas(conexion);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_ConsultaActionPerformed

    private void btn_Productos_CompradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Productos_CompradosActionPerformed
        // TODO add your handling code here:
        Productos_Comprados ventana = new Productos_Comprados(conexion);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_Productos_CompradosActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        // TODO add your handling code here:
        Iniciar_Sesion is = new Iniciar_Sesion();
        this.setVisible(false);
        is.setVisible(true);
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void btn_Productos_DevueltosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Productos_DevueltosActionPerformed
        // TODO add your handling code here:
        Productos_Devueltos ventana = new Productos_Devueltos(conexion);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_Productos_DevueltosActionPerformed

    private void btn_Producto_CuponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Producto_CuponActionPerformed
        // TODO add your handling code here:
        Producto_Cupon ventana = new Producto_Cupon(conexion);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_Producto_CuponActionPerformed

    private void btn_Producto_en_OfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Producto_en_OfertaActionPerformed
        // TODO add your handling code here:
        Producto_en_Oferta ventana = new Producto_en_Oferta(conexion);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_Producto_en_OfertaActionPerformed

    private void btn_CajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CajeroActionPerformed
        // TODO add your handling code here:
        Cajero ventana = new Cajero(conexion);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_CajeroActionPerformed

    private void btn_ReponedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReponedorActionPerformed
        // TODO add your handling code here:
        Reponedor ventana = new Reponedor(conexion);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_ReponedorActionPerformed

    private void btn_T_P_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_T_P_TActionPerformed
        // TODO add your handling code here:
        Trabajador_Puntua_Trabajador ventana = new Trabajador_Puntua_Trabajador(conexion);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_T_P_TActionPerformed

    private void btn_Socio_CuponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Socio_CuponActionPerformed
        // TODO add your handling code here:
        Socio_Cupon ventana = new Socio_Cupon(conexion);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_Socio_CuponActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Menu(conexion).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cajero;
    private javax.swing.JButton btn_Consulta;
    private javax.swing.JButton btn_Cupon;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Oferta;
    private javax.swing.JButton btn_Opinion;
    private javax.swing.JButton btn_Producto;
    private javax.swing.JButton btn_Producto_Cupon;
    private javax.swing.JButton btn_Producto_en_Oferta;
    private javax.swing.JButton btn_Productos_Comprados;
    private javax.swing.JButton btn_Productos_Devueltos;
    private javax.swing.JButton btn_Reponedor;
    private javax.swing.JButton btn_Socio;
    private javax.swing.JButton btn_Socio_Cupon;
    private javax.swing.JButton btn_T_P_T;
    private javax.swing.JButton btn_Ticket;
    private javax.swing.JButton btn_Tienda;
    private javax.swing.JButton btn_Trabajador;
    // End of variables declaration//GEN-END:variables
}
