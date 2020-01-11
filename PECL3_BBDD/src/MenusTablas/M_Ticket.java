/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenusTablas;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author razvanvc
 */
public final class M_Ticket extends javax.swing.JFrame {

    public static Connection conexion;

    /**
     * Creates new form E_Tienda
     */
    public M_Ticket(Connection c) {
        M_Ticket.conexion = c;
        initComponents();
        rellenaCBSelect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cb_TS = new javax.swing.JComboBox<>();
        lbl_Info = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        lbl_Puntuacion = new javax.swing.JLabel();
        tf_HoraA = new javax.swing.JTextField();
        tf_IDA = new javax.swing.JTextField();
        lbl_ValoresA = new javax.swing.JLabel();
        lbl_ValoresN = new javax.swing.JLabel();
        btn_Modify = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        lbl_Fecha = new javax.swing.JLabel();
        lbl_Hora = new javax.swing.JLabel();
        lbl_nSocio = new javax.swing.JLabel();
        lbl_nSocio1 = new javax.swing.JLabel();
        tf_NSA = new javax.swing.JTextField();
        tf_TrabajadorA = new javax.swing.JTextField();
        tf_TotalA = new javax.swing.JTextField();
        tf_FechaA = new javax.swing.JTextField();
        lbl_Fecha1 = new javax.swing.JLabel();
        lbl_Hora1 = new javax.swing.JLabel();
        lbl_nSocio2 = new javax.swing.JLabel();
        lbl_nSocio3 = new javax.swing.JLabel();
        tf_FechaN = new javax.swing.JTextField();
        tf_HoraN = new javax.swing.JTextField();
        cb_NSocioN = new javax.swing.JComboBox<>();
        cb_TrabajadorN = new javax.swing.JComboBox<>();
        lbl_nSocio4 = new javax.swing.JLabel();
        tf_TotalN = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cb_TS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_TSActionPerformed(evt);
            }
        });

        lbl_Info.setText("Seleccione una opinion de la lista:");

        lbl_id.setText("ID:");

        lbl_Puntuacion.setText("Fecha:");

        tf_HoraA.setEditable(false);

        tf_IDA.setEditable(false);

        lbl_ValoresA.setText("Valores Actuales:");

        lbl_ValoresN.setText("Valores Nuevos:");

        btn_Modify.setText("Cambiar");
        btn_Modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModifyActionPerformed(evt);
            }
        });

        btn_Exit.setText("Cancelar");
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });

        lbl_Fecha.setText("Hora:");

        lbl_Hora.setText("Numero Socio:");

        lbl_nSocio.setText("Trabajador:");

        lbl_nSocio1.setText("Total:");

        tf_NSA.setEditable(false);

        tf_TrabajadorA.setEditable(false);

        tf_TotalA.setEditable(false);

        tf_FechaA.setEditable(false);

        lbl_Fecha1.setText("Fecha:");

        lbl_Hora1.setText("Hora:");

        lbl_nSocio2.setText("Numero Socio:");

        lbl_nSocio3.setText("Trabajador:");

        lbl_nSocio4.setText("Total:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Info)
                            .addComponent(cb_TS, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ValoresA, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tf_IDA))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbl_Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbl_Hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbl_nSocio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbl_nSocio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbl_Puntuacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_FechaA, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_HoraA, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_NSA, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_TrabajadorA, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_TotalA, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbl_Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(tf_FechaN, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lbl_nSocio4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbl_Hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tf_HoraN)
                                                .addComponent(tf_TotalN, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(lbl_ValoresN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_NSocioN, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbl_nSocio2)
                                        .addComponent(lbl_nSocio3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(26, 26, 26)
                                    .addComponent(cb_TrabajadorN, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn_Modify, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_ValoresN)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Fecha1)
                            .addComponent(tf_FechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Hora1)
                            .addComponent(tf_HoraN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nSocio2)
                            .addComponent(cb_NSocioN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nSocio3)
                            .addComponent(cb_TrabajadorN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nSocio4)
                            .addComponent(tf_TotalN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_TS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_ValoresA, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_id)
                            .addComponent(tf_IDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Puntuacion)
                            .addComponent(tf_FechaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Fecha)
                            .addComponent(tf_HoraA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Hora)
                            .addComponent(tf_NSA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nSocio)
                            .addComponent(tf_TrabajadorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nSocio1)
                            .addComponent(tf_TotalA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Exit)
                    .addComponent(btn_Modify)))
        );

        setSize(new java.awt.Dimension(883, 405));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cb_TSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_TSActionPerformed
        // TODO add your handling code here:
        rellenaDatos();
        rellenarCBTrabajador();
        rellenarCBSocio();
    }//GEN-LAST:event_cb_TSActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void btn_ModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModifyActionPerformed
        // TODO add your handling code here:
        modificarDatos();
    }//GEN-LAST:event_btn_ModifyActionPerformed

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
            java.util.logging.Logger.getLogger(M_Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(M_Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(M_Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(M_Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new M_Ticket(conexion).setVisible(true);
            }
        });
    }

    @SuppressWarnings("null")
    private void modificarDatos() {

        Statement s = null;
        //Creamos la query
        try {
            s = conexion.createStatement();
        } catch (SQLException se) {
            System.out.println("probando conexion de consulta");
        }
        try {
            //UPDATE ticket SET fecha = '2017-12-12', hora = '12:12:12', numero_socio = 2, dni_trabajador_cajero = '12345678A', total = 200 WHERE id_ticket = 31;
            //UPDATE opinion SET texto = 'Lorem', puntuacion = 4, fecha = '2019-08-28', hora = '05:54:16', numero_socio = 1, nombre_tienda = 'Consum' WHERE  id_opinion = 1;
//            s.executeUpdate("UPDATE opinion SET texto = '" + "', puntuacion = " + cb_PuntuacionN.getItemAt(cb_PuntuacionN.getSelectedIndex())
//                    + ", fecha = '" + tf_FechaN.getText() + "', hora = '" + tf_HoraN.getText() + "', numero_socio = " + cb_NSocioN.getItemAt(cb_NSocioN.getSelectedIndex())
//                    + ", nombre_tienda = '" + cb_TrabajadorN.getItemAt(cb_TrabajadorN.getSelectedIndex()) + "' WHERE  id_opinion = " + cb_TS.getItemAt(cb_TS.getSelectedIndex()));
//            System.out.println("Done");
            s.executeUpdate("UPDATE ticket SET fecha = '"+tf_FechaN.getText()+"', hora = '"+tf_HoraN.getText()+"', numero_socio = '"+cb_NSocioN.getItemAt(cb_NSocioN.getSelectedIndex())
                    +"', dni_trabajador_cajero = '"+cb_TrabajadorN.getItemAt(cb_TrabajadorN.getSelectedIndex())+"', total = '"+tf_TotalN.getText()+"' WHERE id_ticket = '"+tf_IDA.getText()+"'");
        } catch (SQLException ex) {
            Logger.getLogger(M_Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("null")
    private void rellenaDatos() {
        ResultSet rs = null;
        Statement s = null;
        //Creamos la query
        try {
            s = conexion.createStatement();
        } catch (SQLException se) {
            System.out.println("probando conexion de consulta");
        }
        try {

            rs = s.executeQuery("SELECT * FROM ticket WHERE id_ticket = " + cb_TS.getItemAt(cb_TS.getSelectedIndex()));
            while (rs.next()) {
                tf_IDA.setText(rs.getString(1));
                tf_FechaA.setText(rs.getString(2));
                tf_HoraA.setText(rs.getString(3));
                tf_NSA.setText(rs.getString(4));
                tf_TrabajadorA.setText(rs.getString(5));
                tf_TotalA.setText(rs.getString(6));
            }
        } catch (SQLException ex) {
            Logger.getLogger(M_Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("null")
    private void rellenaCBSelect() {
        cb_TS.removeAllItems();
        ResultSet rs = null;
        Statement s = null;
        //cb_TS.addItem("Seleccione una opinion...");
        //Creamos la query
        try {
            s = conexion.createStatement();
        } catch (SQLException se) {
            System.out.println("probando conexion de consulta");
        }
        try {
            rs = s.executeQuery("SELECT * FROM ticket");
            while (rs.next()) {
                cb_TS.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(M_Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("null")
    private void rellenarCBTrabajador() {
        cb_TrabajadorN.removeAllItems();
        ResultSet rs = null;
        Statement s = null;
        //cb_TS.addItem("Seleccione una opinion...");
        //Creamos la query
        try {
            s = conexion.createStatement();
        } catch (SQLException se) {
            System.out.println("probando conexion de consulta");
        }
        try {
            rs = s.executeQuery("SELECT * FROM cajero");
            while (rs.next()) {
                cb_TrabajadorN.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(M_Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("null")
    private void rellenarCBSocio() {
        cb_NSocioN.removeAllItems();
        ResultSet rs = null;
        Statement s = null;
        //cb_TS.addItem("Seleccione una opinion...");
        //Creamos la query
        try {
            s = conexion.createStatement();
        } catch (SQLException se) {
            System.out.println("probando conexion de consulta");
        }
        try {
            rs = s.executeQuery("SELECT * FROM socio");
            while (rs.next()) {
                cb_NSocioN.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(M_Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Modify;
    private javax.swing.JComboBox<String> cb_NSocioN;
    private javax.swing.JComboBox<String> cb_TS;
    private javax.swing.JComboBox<String> cb_TrabajadorN;
    private javax.swing.JLabel lbl_Fecha;
    private javax.swing.JLabel lbl_Fecha1;
    private javax.swing.JLabel lbl_Hora;
    private javax.swing.JLabel lbl_Hora1;
    private javax.swing.JLabel lbl_Info;
    private javax.swing.JLabel lbl_Puntuacion;
    private javax.swing.JLabel lbl_ValoresA;
    private javax.swing.JLabel lbl_ValoresN;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_nSocio;
    private javax.swing.JLabel lbl_nSocio1;
    private javax.swing.JLabel lbl_nSocio2;
    private javax.swing.JLabel lbl_nSocio3;
    private javax.swing.JLabel lbl_nSocio4;
    private javax.swing.JTextField tf_FechaA;
    private javax.swing.JTextField tf_FechaN;
    private javax.swing.JTextField tf_HoraA;
    private javax.swing.JTextField tf_HoraN;
    private javax.swing.JTextField tf_IDA;
    private javax.swing.JTextField tf_NSA;
    private javax.swing.JTextField tf_TotalA;
    private javax.swing.JTextField tf_TotalN;
    private javax.swing.JTextField tf_TrabajadorA;
    // End of variables declaration//GEN-END:variables
}
