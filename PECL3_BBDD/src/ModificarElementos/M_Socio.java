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
public final class M_Socio extends javax.swing.JFrame {

    public static Connection conexion;

    /**
     * Creates new form E_Tienda
     */
    public M_Socio(Connection c) {
        M_Socio.conexion = c;
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
        lbl_DNI = new javax.swing.JLabel();
        lbl_TelefonoA = new javax.swing.JLabel();
        tf_MailA = new javax.swing.JTextField();
        tf_DNIA = new javax.swing.JTextField();
        lbl_ValoresA = new javax.swing.JLabel();
        lbl_ValoresN = new javax.swing.JLabel();
        btn_Modify = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        lbl_MailA = new javax.swing.JLabel();
        tf_TelefonoA = new javax.swing.JTextField();
        lbl_MailN = new javax.swing.JLabel();
        lbl_TelefonoN = new javax.swing.JLabel();
        tf_TelefonoN = new javax.swing.JTextField();
        lbl_NombreA = new javax.swing.JLabel();
        lbl_NombreN = new javax.swing.JLabel();
        tf_NombreA = new javax.swing.JTextField();
        tf_MailN = new javax.swing.JTextField();
        lbl_DNI1 = new javax.swing.JLabel();
        tf_DNIN = new javax.swing.JTextField();
        lbl_DNI2 = new javax.swing.JLabel();
        tf_ID = new javax.swing.JTextField();
        tf_DireccionN = new javax.swing.JTextField();
        lbl_Direccion = new javax.swing.JLabel();
        lbl_DireccionN = new javax.swing.JLabel();
        tf_DireccionA = new javax.swing.JTextField();
        tf_NombreN = new javax.swing.JTextField();
        lbl_SaldoAN = new javax.swing.JLabel();
        tf_SaldoAN = new javax.swing.JTextField();
        lbl_SaldoAA = new javax.swing.JLabel();
        tf_SaldoAA = new javax.swing.JTextField();
        btn_Copiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar");

        cb_TS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_TSActionPerformed(evt);
            }
        });

        lbl_Info.setText("Seleccione una opinion de la lista:");

        lbl_DNI.setText("DNI:");

        lbl_TelefonoA.setText("Telefono:");

        tf_MailA.setEditable(false);

        tf_DNIA.setEditable(false);

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

        lbl_MailA.setText("Mail:");

        tf_TelefonoA.setEditable(false);

        lbl_MailN.setText("Mail:");

        lbl_TelefonoN.setText("Telefono:");

        lbl_NombreA.setText("Nombre:");

        lbl_NombreN.setText("Nombre:");

        tf_NombreA.setEditable(false);

        lbl_DNI1.setText("DNI:");

        lbl_DNI2.setText("ID:");

        tf_ID.setEditable(false);

        lbl_Direccion.setText("Dirección:");

        lbl_DireccionN.setText("Dirección:");

        tf_DireccionA.setEditable(false);

        lbl_SaldoAN.setText("Saldo Acumulado:");

        lbl_SaldoAA.setText("Saldo Acumulado:");

        tf_SaldoAA.setEditable(false);

        btn_Copiar.setText("Duplicar");
        btn_Copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CopiarActionPerformed(evt);
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
                        .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Modify, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Info)
                                    .addComponent(cb_TS, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_ValoresA, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(lbl_SaldoAA))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl_DNI2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbl_NombreA, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbl_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(lbl_MailA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbl_TelefonoA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_DNI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_TelefonoA, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_MailA, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(tf_DNIA, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_ID, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_NombreA, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_DireccionA, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_SaldoAA, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_NombreN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_DNI1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_SaldoAN, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_ValoresN, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lbl_DireccionN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_MailN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_TelefonoN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tf_DireccionN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                        .addComponent(tf_MailN, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_TelefonoN, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_DNIN, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_SaldoAN)))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tf_NombreN)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn_Copiar)))
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_TS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ValoresA, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ValoresN)
                    .addComponent(btn_Copiar))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_DNI2))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_NombreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_NombreA)
                    .addComponent(lbl_NombreN)
                    .addComponent(tf_NombreN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_DNIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_DNI)
                    .addComponent(lbl_DNI1)
                    .addComponent(tf_DNIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_TelefonoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TelefonoA)
                    .addComponent(tf_TelefonoN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TelefonoN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_MailA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_MailA)
                    .addComponent(lbl_MailN)
                    .addComponent(tf_MailN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_DireccionA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Direccion)
                    .addComponent(tf_DireccionN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_DireccionN))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_SaldoAA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_SaldoAA)
                    .addComponent(lbl_SaldoAN)
                    .addComponent(tf_SaldoAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Modify, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Exit, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        setSize(new java.awt.Dimension(832, 454));
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
     * Comprueba y Modifica los datos de Socio en la BD
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
     * Copia los parametros de un lado a otro
     * @param evt 
     */
    private void btn_CopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CopiarActionPerformed
        // TODO add your handling code here:
        tf_DNIN.setText(tf_DNIA.getText());
        tf_MailN.setText(tf_MailA.getText());
        tf_DireccionN.setText(tf_DireccionA.getText());
        tf_SaldoAN.setText(tf_SaldoAA.getText());
        tf_TelefonoN.setText(tf_TelefonoA.getText());
        tf_NombreN.setText(tf_NombreA.getText());
    }//GEN-LAST:event_btn_CopiarActionPerformed

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
            java.util.logging.Logger.getLogger(M_Socio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @SuppressWarnings("override")
            public void run() {
                new M_Socio(conexion).setVisible(true);
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
        if (tf_NombreN.getText().equals("") || tf_DNIN.getText().equals("") || tf_TelefonoN.getText().equals("") || tf_MailN.getText().equals("") || tf_DireccionN.getText().equals("") || tf_SaldoAN.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No puede haber campos vacios", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            if (comprobarNumeroDouble(tf_SaldoAN.getText()) || comprobarNumero(tf_TelefonoN.getText(), 9)) {
                if (tf_DNIN.getText().length() != 9) {
                    s = true;
                } else {
                    JOptionPane.showMessageDialog(null, "El campo DNI ha de tener 9 caracteres", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Los campos Saldo y Telefono han de ser numericos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
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
            //s.executeUpdate("UPDATE socio SET nombre = 'Echo McWayer', dni = '16680718Z', telefono = '680889835', mail = 'rutrum.justo.Praesent@euultricessit.com', direccion = 'P.O. Box 358, 550 Iaculis Ave', saldo_acumulado = 86.26 WHERE numero = 1;");
            //UPDATE socio SET nombre = 'Echo McWayer', dni = '16680718Z', telefono = '680889835', mail = 'rutrum.justo.Praesent@euultricessit.com', direccion = 'P.O. Box 358, 550 Iaculis Ave', saldo_acumulado = 86.26 WHERE numero = 1;
            s.executeUpdate("UPDATE socio SET nombre = '" + tf_NombreN.getText() + "', dni = '" + tf_DNIN.getText() + "',telefono = '" + tf_TelefonoN.getText() + "', "
                    + "mail = '" + tf_MailN.getText() + "', direccion = '" + tf_DireccionN.getText() + "', saldo_acumulado = '" + Double.valueOf(tf_SaldoAN.getText())
                    + "' WHERE numero = '" + cb_TS.getItemAt(cb_TS.getSelectedIndex()) + "'");
            JOptionPane.showMessageDialog(null, "Se ha modificado correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
            //INCLUIR MODIFICAR LOS CUPONES ASOCIADOS AL SOCIO
            confirmacion("¿Deseas modificar mas socios?", "Modificar Socio");
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

            int id;
            rs = s.executeQuery("SELECT * FROM socio WHERE numero = '" + cb_TS.getItemAt(cb_TS.getSelectedIndex()) + "'");
            while (rs.next()) {
                tf_ID.setText(rs.getString(1));
                tf_NombreA.setText(rs.getString(2));
                tf_DNIA.setText(rs.getString(3));
                tf_TelefonoA.setText(rs.getString(4));
                tf_MailA.setText(rs.getString(5));
                tf_DireccionA.setText(rs.getString(6));
                tf_SaldoAA.setText(Double.toString(rs.getDouble(7)));
            }

        } catch (SQLException ex) {
            Logger.getLogger(M_Socio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Rellena el CB_TS con los Socios de la BD
     */
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
            rs = s.executeQuery("SELECT * FROM socio");
            while (rs.next()) {
                cb_TS.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(M_Socio.class.getName()).log(Level.SEVERE, null, ex);
        }

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
            M_Socio ventana = new M_Socio(conexion);
            ventana.setVisible(true);
            this.setVisible(false);
            //Abrir nueva ventana para insertar Ticket en cupon
        } else {
            this.setVisible(false);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Copiar;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Modify;
    private javax.swing.JComboBox<String> cb_TS;
    private javax.swing.JLabel lbl_DNI;
    private javax.swing.JLabel lbl_DNI1;
    private javax.swing.JLabel lbl_DNI2;
    private javax.swing.JLabel lbl_Direccion;
    private javax.swing.JLabel lbl_DireccionN;
    private javax.swing.JLabel lbl_Info;
    private javax.swing.JLabel lbl_MailA;
    private javax.swing.JLabel lbl_MailN;
    private javax.swing.JLabel lbl_NombreA;
    private javax.swing.JLabel lbl_NombreN;
    private javax.swing.JLabel lbl_SaldoAA;
    private javax.swing.JLabel lbl_SaldoAN;
    private javax.swing.JLabel lbl_TelefonoA;
    private javax.swing.JLabel lbl_TelefonoN;
    private javax.swing.JLabel lbl_ValoresA;
    private javax.swing.JLabel lbl_ValoresN;
    private javax.swing.JTextField tf_DNIA;
    private javax.swing.JTextField tf_DNIN;
    private javax.swing.JTextField tf_DireccionA;
    private javax.swing.JTextField tf_DireccionN;
    private javax.swing.JTextField tf_ID;
    private javax.swing.JTextField tf_MailA;
    private javax.swing.JTextField tf_MailN;
    private javax.swing.JTextField tf_NombreA;
    private javax.swing.JTextField tf_NombreN;
    private javax.swing.JTextField tf_SaldoAA;
    private javax.swing.JTextField tf_SaldoAN;
    private javax.swing.JTextField tf_TelefonoA;
    private javax.swing.JTextField tf_TelefonoN;
    // End of variables declaration//GEN-END:variables
}
