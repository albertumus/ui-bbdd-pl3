/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertarElementos;

import ModificarElementos.M_Trabajador;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author razvanvc
 */
public final class N_Trabajador extends javax.swing.JFrame {

    public static Connection conexion;

    /**
     * Creates new form E_Tienda
     */
    public N_Trabajador(Connection c) {
        N_Trabajador.conexion = c;
        initComponents();
        rellenarCBTienda();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Info = new javax.swing.JLabel();
        lbl_DNI = new javax.swing.JLabel();
        tf_DNI = new javax.swing.JTextField();
        btn_Modify = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        cb_NMedia = new javax.swing.JComboBox<>();
        lbl_Fecha1 = new javax.swing.JLabel();
        lbl_Hora1 = new javax.swing.JLabel();
        lbl_nSocio2 = new javax.swing.JLabel();
        lbl_nSocio3 = new javax.swing.JLabel();
        lbl_TelefonoN = new javax.swing.JLabel();
        tf_Telefono = new javax.swing.JTextField();
        cb_Turno = new javax.swing.JComboBox<>();
        cb_NTienda = new javax.swing.JComboBox<>();
        lbl_NombreN = new javax.swing.JLabel();
        tf_Nombre = new javax.swing.JTextField();
        tf_Movil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbl_Info.setText("Rellene los siguientes campos:");

        lbl_DNI.setText("DNI:");

        btn_Modify.setText("Insertar");
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

        cb_NMedia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        lbl_Fecha1.setText("Movil:");

        lbl_Hora1.setText("Turno");

        lbl_nSocio2.setText("Nota Media:");

        lbl_nSocio3.setText("Nombre Tienda:");

        lbl_TelefonoN.setText("Telefono:");

        cb_Turno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mañana", "Tarde" }));

        lbl_NombreN.setText("Nombre:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Modify, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Info)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tf_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(lbl_nSocio2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbl_nSocio3)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(lbl_TelefonoN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lbl_Fecha1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lbl_Hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lbl_NombreN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tf_Telefono, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cb_Turno, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cb_NTienda, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cb_NMedia, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_Nombre)
                                        .addComponent(tf_Movil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_DNI)
                    .addComponent(tf_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_NombreN)
                    .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TelefonoN)
                    .addComponent(tf_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Fecha1)
                    .addComponent(tf_Movil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Hora1)
                    .addComponent(cb_Turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nSocio3)
                    .addComponent(cb_NTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_NMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nSocio2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Modify, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Exit, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(381, 381));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
     * Comprueba y Inserta los datos de Cupon en la BD
     *
     * @param evt
     */
    private void btn_ModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModifyActionPerformed
        // TODO add your handling code here:
        if (comprobarTrabajador()) {
            insertarTrabajador();
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
            java.util.logging.Logger.getLogger(N_Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(N_Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(N_Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(N_Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
            public void run() {
                new N_Trabajador(conexion).setVisible(true);
            }
        });
    }

    /**
     * Comprueba que todos los datos esten en el formato adecuado
     *
     * @return true si lo estan | false si no lo estan
     */
    private boolean comprobarTrabajador() {
        boolean s = false;
        if (tf_Nombre.getText().equals("") || tf_Telefono.getText().equals("") || tf_Movil.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No puede haber campos vacios", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            if (cb_NMedia.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Selecciona una Nota Media", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                if (comprobarNumero(tf_Telefono.getText(), 9) && comprobarNumero(tf_Movil.getText(), 9)) {
                    if (tf_DNI.getText().length() == 9) {
                        s = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "EL campo DNI ha de tener 9 caracteres 9 cifras", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Los campos Telefono y Movil han de ser numericos y tener 9 cifras", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        return s;
    }

    /**
     * Inserta los datos de Trabajador en la BD
     *
     * @param evt
     */
    @SuppressWarnings({"null", "UseSpecificCatch"})
    private void insertarTrabajador() {
        Statement s = null;
        String turno = null;
        turno = TurnoNuevo();
        try {
            s = conexion.createStatement();
        } catch (SQLException se) {
            System.out.println("probando conexion de consulta");
        }
        try {
            //NSERT INTO public.trabajador (dni, nombre, telefono, movil, turno, nombre_tienda, nota_media) VALUES ('16590814Y', 'Rogan Clay', '123456789', '5', false, 'Mercadona', 2);
            s.executeUpdate("INSERT INTO public.trabajador (dni, nombre, telefono, movil, turno, nombre_tienda, nota_media) VALUES('" + tf_DNI.getText() + "', '" + tf_Nombre.getText() + "', '" + tf_Telefono.getText() + "', '"
                    + tf_Movil.getText() + "', '" + turno + "', '" + cb_NTienda.getItemAt(cb_NTienda.getSelectedIndex()) + "', " + cb_NMedia.getItemAt(cb_NMedia.getSelectedIndex()) + ")");
            //JOptionPane.showOptionDialog(rootPane, s, turno, WIDTH, HEIGHT, null, null, NORMAL);
            JOptionPane.showMessageDialog(null, "Se ha modificado correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
            //INCLUIR ES CAJERO O REPONEDOR confirmacion2
            confirmacion("¿Deseas modificar mas socios?", "Modificar Producto");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Comprueba el valor del CB para introducirlo en la BD
     *
     * @return "true" si es por la mañana | "false" si es por la tarde
     */
    private String TurnoNuevo() {
        String Salida = null;
        if (cb_Turno.getSelectedIndex() == 0) {
            Salida = "true";
        } else {
            Salida = "false";
        }
        return Salida;
    }

    /**
     * Rellena el CB_NTienda con los datos de las tiendas en la BD
     */
    private void rellenarCBTienda() {
        cb_NTienda.removeAllItems();
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
            rs = s.executeQuery("SELECT * FROM tienda");
            while (rs.next()) {
                cb_NTienda.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(M_Trabajador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Comprueba si un String es un numero
     *
     * @param num
     * @param Longitud
     * @return false si no lo es | true si lo es
     */
    @SuppressWarnings("UseSpecificCatch")
    private boolean comprobarNumero(String num, int Longitud) {
        boolean r = false;
        try {
            Integer.valueOf(num);
            r = true;
        } catch (Exception e) {
            r = false;
        }
        if (num.length() != Longitud) {
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
            N_Trabajador ventana = new N_Trabajador(conexion);
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
    private javax.swing.JComboBox<String> cb_NMedia;
    private javax.swing.JComboBox<String> cb_NTienda;
    private javax.swing.JComboBox<String> cb_Turno;
    private javax.swing.JLabel lbl_DNI;
    private javax.swing.JLabel lbl_Fecha1;
    private javax.swing.JLabel lbl_Hora1;
    private javax.swing.JLabel lbl_Info;
    private javax.swing.JLabel lbl_NombreN;
    private javax.swing.JLabel lbl_TelefonoN;
    private javax.swing.JLabel lbl_nSocio2;
    private javax.swing.JLabel lbl_nSocio3;
    private javax.swing.JTextField tf_DNI;
    private javax.swing.JTextField tf_Movil;
    private javax.swing.JTextField tf_Nombre;
    private javax.swing.JTextField tf_Telefono;
    // End of variables declaration//GEN-END:variables
}