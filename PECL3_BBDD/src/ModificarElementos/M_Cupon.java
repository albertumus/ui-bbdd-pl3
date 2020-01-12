/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModificarElementos;

import InsertarElementos.N_Productos_Cupon;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author razvanvc
 */
public final class M_Cupon extends javax.swing.JFrame {

    public static Connection conexion;

    /**
     * Creates new form E_Tienda
     */
    public M_Cupon(Connection c) {
        M_Cupon.conexion = c;
        initComponents();
        rellenaCB();
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
        lbl_Ciudad = new javax.swing.JLabel();
        lbl_Nombre1 = new javax.swing.JLabel();
        lbl_Ciudad1 = new javax.swing.JLabel();
        tf_DescuentoA = new javax.swing.JTextField();
        tf_IDA = new javax.swing.JTextField();
        tf_DescuentoN = new javax.swing.JTextField();
        lbl_ValoresA = new javax.swing.JLabel();
        lbl_ValoresN = new javax.swing.JLabel();
        btn_Modify = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Cupon");

        cb_TS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_TSActionPerformed(evt);
            }
        });

        lbl_Info.setText("Seleccione un cupon de la lista:");

        lbl_Ciudad.setText("Descuento:");

        lbl_Nombre1.setText("ID:");

        lbl_Ciudad1.setText("Descuento:");

        tf_DescuentoA.setEditable(false);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                .addComponent(btn_Modify, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lbl_Ciudad1)
                                        .addGap(24, 24, 24))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_Nombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_DescuentoA, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                    .addComponent(tf_IDA)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl_Ciudad)
                                .addGap(24, 24, 24)
                                .addComponent(tf_DescuentoN))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_ValoresN)
                                    .addComponent(lbl_ValoresA))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(cb_TS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Info)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbl_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_TS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_ValoresA, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Nombre1)
                    .addComponent(tf_IDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Ciudad1)
                    .addComponent(tf_DescuentoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl_ValoresN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Ciudad)
                    .addComponent(tf_DescuentoN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Modify)
                    .addComponent(btn_Exit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(331, 321));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Cambia los campos segun la opinion seleccionada
     *
     * @param evt
     */
    private void cb_TSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_TSActionPerformed
        // TODO add your handling code here:
        rellenaDatos();
    }//GEN-LAST:event_cb_TSActionPerformed

    /**
     * Sale de esta ventana sin conservar los cambios
     *
     * @param evt
     */
    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_ExitActionPerformed

    /**
     * Comprueba y Modifica los datos de Cupon en la BD
     *
     * @param evt
     */
    private void btn_ModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModifyActionPerformed
        // TODO add your handling code here:
        if (comprobarDatos()) {
            modificarDatos();
        }
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
            java.util.logging.Logger.getLogger(M_Cupon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(M_Cupon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(M_Cupon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(M_Cupon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new M_Cupon(conexion).setVisible(true);
            }
        });
    }

    /**
     * Comprueba que todos los datos esten en el formato adecuado
     *
     * @return true si lo estan | false si no lo estan
     */
    private boolean comprobarDatos() {
        boolean s = false;
        if (comprobarNumero(tf_DescuentoN.getText())) {
            s = true;
        }
        return s;
    }

    /**
     * Modifica los datos de la BD
     */
    @SuppressWarnings({"null", "UseSpecificCatch"})
    private void modificarDatos() {

        Statement s = null;
        //Creamos la query
        try {
            s = conexion.createStatement();
        } catch (SQLException se) {
            System.out.println("probando conexion de consulta");
        }
        try {
            //UPDATE cupon SET descuento = 20 WHERE  id_cupon = 1;
            s.executeUpdate("UPDATE cupon SET descuento = '" + tf_DescuentoN.getText() + "' WHERE id_cupon = '" + cb_TS.getItemAt(cb_TS.getSelectedIndex()) + "'");
            JOptionPane.showMessageDialog(null, "Se ha modificado correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
            confirmacion("¿Deseas modificar los productos que pertenecen al cupon?", "Modificar Cupon");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Rellena los datos de los diferentes campos con los datos de la BD
     */
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
            rs = s.executeQuery("SELECT * FROM cupon WHERE id_cupon = '" + cb_TS.getItemAt(cb_TS.getSelectedIndex()) + "'");
            while (rs.next()) {
                tf_IDA.setText(rs.getString(1));
                tf_DescuentoA.setText(rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(M_Cupon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Rellena el CB_TS con los Cupones de la BD
     */
    @SuppressWarnings("null")
    private void rellenaCB() {
        cb_TS.removeAllItems();
        ResultSet rs = null;
        Statement s = null;
        //Creamos la query
        try {
            s = conexion.createStatement();
        } catch (SQLException se) {
            System.out.println("probando conexion de consulta");
        }
        try {
            rs = s.executeQuery("SELECT * FROM cupon");
            while (rs.next()) {
                cb_TS.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(M_Cupon.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Comprueba si un String es un numero y si es menor que una longitud
     *
     * @param num String que se desea comprobar si es un numero
     * @param Longitud Longitud especificada del numero
     * @return false si no lo es | true si lo es
     */
    @SuppressWarnings("UseSpecificCatch")
    private boolean comprobarNumero(String num) {
        boolean r = false;
        try {
            int Check = Integer.valueOf(num);
            System.out.println(Check);
            if (Check >= 0 && Check <= 100) {
                r = true;
            }
        } catch (Exception e) {
            r = false;
        }
        return r;
    }

    /**
     * Crea un JOptionPane que te hace una pregunta segun P
     *
     * @param P Pregunta que aparece en el JOptionPane
     * @param T Titulo del JOptionPane
     */
    private void confirmacion(String P, String T) {
        int n = JOptionPane.showConfirmDialog(
                null,
                P,
                T,
                JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
            N_Productos_Cupon ventana = new N_Productos_Cupon(tf_IDA.getText(), conexion);
            ventana.setVisible(true);
            this.setVisible(false);
            //Abrir nueva ventana para insertar Ticket en cupon
        } else {
            confirmacion2("¿Deseas modificar algun cupon mas?", "Modificar Cupon");
            this.setVisible(false);
        }
    }

    /**
     * Crea un JOptionPane que te hace una pregunta segun P
     *
     * @param P Pregunta que aparece en el JOptionPane
     * @param T Titulo del JOptionPane
     */
    private void confirmacion2(String P, String T) {
        int n = JOptionPane.showConfirmDialog(
                null,
                P,
                T,
                JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
            M_Cupon ventana = new M_Cupon(conexion);
            ventana.setVisible(true);
            this.setVisible(false);
            //Abrir nueva ventana para insertar Ticket en cupon
        } else {
            this.setVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Modify;
    private javax.swing.JComboBox<String> cb_TS;
    private javax.swing.JLabel lbl_Ciudad;
    private javax.swing.JLabel lbl_Ciudad1;
    private javax.swing.JLabel lbl_Info;
    private javax.swing.JLabel lbl_Nombre1;
    private javax.swing.JLabel lbl_ValoresA;
    private javax.swing.JLabel lbl_ValoresN;
    private javax.swing.JTextField tf_DescuentoA;
    private javax.swing.JTextField tf_DescuentoN;
    private javax.swing.JTextField tf_IDA;
    // End of variables declaration//GEN-END:variables
}
