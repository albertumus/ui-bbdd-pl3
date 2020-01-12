/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModificarElementos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author razvanvc
 */
public final class M_Tienda extends javax.swing.JFrame {

    public static Connection conexion;

    /**
     * Creates new form E_Tienda
     */
    public M_Tienda(Connection c) {
        M_Tienda.conexion = c;
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
        lbl_Barrio = new javax.swing.JLabel();
        lbl_Nombre1 = new javax.swing.JLabel();
        lbl_Ciudad1 = new javax.swing.JLabel();
        lbl_Barrio1 = new javax.swing.JLabel();
        tf_BarrioA = new javax.swing.JTextField();
        tf_CiudadA = new javax.swing.JTextField();
        tf_NombreA = new javax.swing.JTextField();
        tf_CiudadN = new javax.swing.JTextField();
        tf_BarrioN = new javax.swing.JTextField();
        lbl_ValoresA = new javax.swing.JLabel();
        lbl_ValoresN = new javax.swing.JLabel();
        btn_Modify = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Tienda");

        cb_TS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_TSActionPerformed(evt);
            }
        });

        lbl_Info.setText("Seleccione una tienda de la lista:");

        lbl_Ciudad.setText("Ciudad: ");

        lbl_Barrio.setText("Barrio:");

        lbl_Nombre1.setText("Nombre: ");

        lbl_Ciudad1.setText("Ciudad: ");

        lbl_Barrio1.setText("Barrio:");

        tf_BarrioA.setEditable(false);

        tf_CiudadA.setEditable(false);

        tf_NombreA.setEditable(false);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Modify, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lbl_Barrio1)
                        .addGap(36, 36, 36)
                        .addComponent(tf_BarrioA))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbl_Nombre1)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Ciudad1)
                                .addGap(24, 24, 24)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_CiudadA, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(tf_NombreA)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Ciudad)
                            .addComponent(lbl_Barrio))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_CiudadN)
                            .addComponent(tf_BarrioN)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ValoresN)
                            .addComponent(lbl_Info)
                            .addComponent(cb_TS, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ValoresA))))
                .addContainerGap())
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
                    .addComponent(tf_NombreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Ciudad1)
                    .addComponent(tf_CiudadA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Barrio1)
                    .addComponent(tf_BarrioA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl_ValoresN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Ciudad)
                    .addComponent(tf_CiudadN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Barrio)
                    .addComponent(tf_BarrioN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Modify)
                    .addComponent(btn_Exit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(312, 397));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cb_TSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_TSActionPerformed
        // TODO add your handling code here:
        rellenaDatos();
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(M_Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @SuppressWarnings("override")
            public void run() {
                new M_Tienda(conexion).setVisible(true);
            }
        });
    }

    /**
     * Comprueba y Modifica los datos de la BD
     */
    @SuppressWarnings({"null", "UseSpecificCatch"})
    private void modificarDatos() {

        if (tf_CiudadN.getText().equals("") || tf_BarrioN.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No puede haber campos vacios", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            Statement s = null;
            //Creamos la query
            try {
                s = conexion.createStatement();
            } catch (SQLException se) {
                System.out.println("probando conexion de consulta");
            }
            try {
                //UPDATE tienda SET ciudad = 'Alcala', barrio = 'El Ensanche' WHERE nombre = 'Ahorramas';
                s.executeUpdate("UPDATE tienda SET ciudad = '" + tf_CiudadN.getText() + "', barrio = '" + tf_BarrioN.getText() + "' WHERE nombre = '" + cb_TS.getItemAt(cb_TS.getSelectedIndex()) + "'");
                JOptionPane.showMessageDialog(null, "Se ha modificado correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
                //INCLUIR MODIFICAR LOS CUPONES ASOCIADOS AL SOCIO
                confirmacion("¿Deseas modificar mas tiendas?", "Modificar Tienda");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
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
            rs = s.executeQuery("SELECT * FROM tienda WHERE nombre = '" + cb_TS.getItemAt(cb_TS.getSelectedIndex()) + "'");
            while (rs.next()) {
                tf_NombreA.setText(rs.getString(1));
                tf_CiudadA.setText(rs.getString(2));
                tf_BarrioA.setText(rs.getString(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(M_Tienda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Rellena el CB_TS con las Tiendas de la BD
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
            rs = s.executeQuery("SELECT * FROM tienda");
            while (rs.next()) {
                cb_TS.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(M_Tienda.class.getName()).log(Level.SEVERE, null, ex);
        }

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
            M_Tienda ventana = new M_Tienda(conexion);
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
    private javax.swing.JLabel lbl_Barrio;
    private javax.swing.JLabel lbl_Barrio1;
    private javax.swing.JLabel lbl_Ciudad;
    private javax.swing.JLabel lbl_Ciudad1;
    private javax.swing.JLabel lbl_Info;
    private javax.swing.JLabel lbl_Nombre1;
    private javax.swing.JLabel lbl_ValoresA;
    private javax.swing.JLabel lbl_ValoresN;
    private javax.swing.JTextField tf_BarrioA;
    private javax.swing.JTextField tf_BarrioN;
    private javax.swing.JTextField tf_CiudadA;
    private javax.swing.JTextField tf_CiudadN;
    private javax.swing.JTextField tf_NombreA;
    // End of variables declaration//GEN-END:variables

}
