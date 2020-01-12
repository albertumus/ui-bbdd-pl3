/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertarElementos;

import ModificarElementos.M_Socio;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author razvanvc
 */
public final class N_Socio extends javax.swing.JFrame {

    public static Connection conexion;

    /**
     * Creates new form E_Tienda
     */
    public N_Socio(Connection c) {
        N_Socio.conexion = c;
        initComponents();
        setIDSocio();
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
        lbl_TelefonoA = new javax.swing.JLabel();
        tf_Mail = new javax.swing.JTextField();
        tf_DNI = new javax.swing.JTextField();
        btn_Modify = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        lbl_MailA = new javax.swing.JLabel();
        tf_Telefono = new javax.swing.JTextField();
        lbl_NombreA = new javax.swing.JLabel();
        tf_Nombre = new javax.swing.JTextField();
        lbl_DNI2 = new javax.swing.JLabel();
        tf_ID = new javax.swing.JTextField();
        lbl_Direccion = new javax.swing.JLabel();
        tf_Direccion = new javax.swing.JTextField();
        lbl_SaldoAA = new javax.swing.JLabel();
        tf_SaldoA = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Socio");

        lbl_Info.setText("Seleccione una opinion de la lista:");

        lbl_DNI.setText("DNI:");

        lbl_TelefonoA.setText("Telefono:");

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

        lbl_MailA.setText("Mail:");

        lbl_NombreA.setText("Nombre:");

        lbl_DNI2.setText("ID:");

        tf_ID.setEditable(false);

        lbl_Direccion.setText("Dirección:");

        lbl_SaldoAA.setText("Saldo Acumulado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Modify, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_MailA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Info)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_DNI2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_NombreA, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbl_TelefonoA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbl_DNI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tf_DNI, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                            .addComponent(tf_Nombre)
                                            .addComponent(tf_ID))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_SaldoAA)
                            .addComponent(lbl_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_Direccion, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tf_SaldoA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(lbl_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_DNI2))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_NombreA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_DNI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TelefonoA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_MailA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Direccion))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_SaldoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_SaldoAA))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Modify, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Exit, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        setSize(new java.awt.Dimension(399, 391));
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
        if (comprobarDatos()) {

            insertarDatos();
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(N_Socio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            @SuppressWarnings("override")
            public void run() {
                new N_Socio(conexion).setVisible(true);
            }
        });
    }

    @SuppressWarnings({"null", "UseSpecificCatch"})
    private void insertarDatos() {
        Statement s = null;
        //Creamos la query
        try {
            s = conexion.createStatement();
        } catch (SQLException se) {
            System.out.println("probando conexion de consulta");
        }
        try {
            s.executeUpdate("INSERT INTO socio (numero, nombre, dni, telefono, mail, direccion, saldo_acumulado) VALUES ('" + tf_ID.getText() + "', '"
                    + tf_Nombre.getText() + "', '" + tf_DNI.getText() + "', '" + tf_Telefono.getText() + "', '" + tf_Mail.getText() + "', '" + tf_Direccion.getText() + "', '" + tf_SaldoA.getText() + "')");
            JOptionPane.showMessageDialog(null, "Se ha creado correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
            //INCLUIR MODIFICAR LOS CUPONES ASOCIADOS AL SOCIO
            confirmacion("¿Deseas crear mas socios?", "Crear Socio");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Da valor a tf_ID como el siguiente al ultimo en la BD
     */
    @SuppressWarnings("null")
    private void setIDSocio() {
        int id_opinion = 1;
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
            rs = s.executeQuery("SELECT numero FROM socio order by  numero desc LIMIT 1");
            while (rs.next()) {
                id_opinion = Integer.parseInt(rs.getString(1))+1;
            }
            tf_ID.setText(Integer.toString(id_opinion));
        } catch (SQLException ex) {
            Logger.getLogger(N_Opinion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Comprueba que todos los datos esten en el formato adecuado
     *
     * @return true si lo estan | false si no lo estan
     */
    private boolean comprobarDatos() {
        boolean s = false;
        if (tf_Nombre.getText().equals("") || tf_DNI.getText().equals("") || tf_Telefono.getText().equals("") || tf_Mail.getText().equals("") || tf_Direccion.getText().equals("") || tf_SaldoA.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No puede haber campos vacios", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            if (comprobarNumeroDouble(tf_SaldoA.getText()) || comprobarNumero(tf_Telefono.getText(), 9)) {
                if (tf_DNI.getText().length() != 9) {
                    JOptionPane.showMessageDialog(null, "El campo DNI ha de tener 9 caracteres", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                   s = true; 
                }
            } else {
                JOptionPane.showMessageDialog(null, "Los campos Saldo y Telefono han de ser numericos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        return s;
    }

    /**
     * Comprueba si un String es un numero y si es menor que una longitud
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
     * Comprueba si un String es un numero y si es menor que una longitud
     *
     * @param num String que se desea comprobar si es un numero
     * @return false si no lo es | true si lo es
     */
    @SuppressWarnings("UseSpecificCatch")
    private boolean comprobarNumeroDouble(String num) {
        boolean r = false;
        try {
            Double Check = Double.valueOf(num);
            System.out.println(Check);
            if (Check >= 0) {
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
            N_Socio ventana = new N_Socio(conexion);
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
    private javax.swing.JLabel lbl_DNI;
    private javax.swing.JLabel lbl_DNI2;
    private javax.swing.JLabel lbl_Direccion;
    private javax.swing.JLabel lbl_Info;
    private javax.swing.JLabel lbl_MailA;
    private javax.swing.JLabel lbl_NombreA;
    private javax.swing.JLabel lbl_SaldoAA;
    private javax.swing.JLabel lbl_TelefonoA;
    private javax.swing.JTextField tf_DNI;
    private javax.swing.JTextField tf_Direccion;
    private javax.swing.JTextField tf_ID;
    private javax.swing.JTextField tf_Mail;
    private javax.swing.JTextField tf_Nombre;
    private javax.swing.JTextField tf_SaldoA;
    private javax.swing.JTextField tf_Telefono;
    // End of variables declaration//GEN-END:variables
}
