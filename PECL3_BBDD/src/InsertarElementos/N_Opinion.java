/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertarElementos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author razvanvc
 */
public final class N_Opinion extends javax.swing.JFrame {

    public static Connection conexion;

    /**
     * Creates new form E_Tienda
     */
    public N_Opinion(Connection c) {
        N_Opinion.conexion = c;
        initComponents();
        rellenarCBSocio();
        rellenarCBTienda();
        setNOpinion();
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
        lbl_id = new javax.swing.JLabel();
        tf_ID = new javax.swing.JTextField();
        btn_Insert = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        cb_Puntuacion = new javax.swing.JComboBox<>();
        lbl_nSocio2 = new javax.swing.JLabel();
        lbl_nSocio3 = new javax.swing.JLabel();
        lbl_Texto1 = new javax.swing.JLabel();
        lbl_Puntuacion1 = new javax.swing.JLabel();
        cb_NSocio = new javax.swing.JComboBox<>();
        cb_NTienda = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_Texto = new javax.swing.JTextArea();
        p_Hora1 = new javax.swing.JPanel();
        tf_FechaD = new javax.swing.JTextField();
        tf_FechaM = new javax.swing.JTextField();
        tf_FechaA1 = new javax.swing.JTextField();
        lbl_Dia = new javax.swing.JLabel();
        lbl_Mes = new javax.swing.JLabel();
        lbl_Anno = new javax.swing.JLabel();
        lbl_Hora4 = new javax.swing.JLabel();
        p_Hora = new javax.swing.JPanel();
        tf_HoraH = new javax.swing.JTextField();
        tf_HoraM = new javax.swing.JTextField();
        tf_HoraS = new javax.swing.JTextField();
        lbl_Hora2 = new javax.swing.JLabel();
        lbl_Minuto = new javax.swing.JLabel();
        lbl_Segundo = new javax.swing.JLabel();
        lbl_Hora3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva Opinion");

        lbl_Info.setText("Rellene los siguientes campos:");

        lbl_id.setText("ID:");

        tf_ID.setEditable(false);

        btn_Insert.setText("Insertar");
        btn_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertActionPerformed(evt);
            }
        });

        btn_Exit.setText("Cancelar");
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });

        cb_Puntuacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una puntuacion...", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        lbl_nSocio2.setText("Numero Socio:");

        lbl_nSocio3.setText("Nombre Tienda:");

        lbl_Texto1.setText("Texto:");

        lbl_Puntuacion1.setText("Puntuacion:");

        ta_Texto.setColumns(20);
        ta_Texto.setRows(5);
        jScrollPane2.setViewportView(ta_Texto);

        lbl_Dia.setText("Dia:");

        lbl_Mes.setText("Mes:");

        lbl_Anno.setText("Año:");

        lbl_Hora4.setText("Fecha:");

        javax.swing.GroupLayout p_Hora1Layout = new javax.swing.GroupLayout(p_Hora1);
        p_Hora1.setLayout(p_Hora1Layout);
        p_Hora1Layout.setHorizontalGroup(
            p_Hora1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_Hora1Layout.createSequentialGroup()
                .addComponent(lbl_Hora4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p_Hora1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_FechaD, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_Hora1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_Hora1Layout.createSequentialGroup()
                        .addComponent(lbl_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Anno, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p_Hora1Layout.createSequentialGroup()
                        .addComponent(tf_FechaM, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_FechaA1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        p_Hora1Layout.setVerticalGroup(
            p_Hora1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_Hora1Layout.createSequentialGroup()
                .addGroup(p_Hora1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Dia)
                    .addComponent(lbl_Mes)
                    .addComponent(lbl_Anno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_Hora1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Hora4)
                    .addComponent(tf_FechaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_FechaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_FechaA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lbl_Hora2.setText("Hora:");

        lbl_Minuto.setText("Minuto:");

        lbl_Segundo.setText("Segundo:");

        lbl_Hora3.setText("Hora:");

        javax.swing.GroupLayout p_HoraLayout = new javax.swing.GroupLayout(p_Hora);
        p_Hora.setLayout(p_HoraLayout);
        p_HoraLayout.setHorizontalGroup(
            p_HoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_HoraLayout.createSequentialGroup()
                .addComponent(lbl_Hora3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p_HoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Hora2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_HoraH, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_HoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_HoraLayout.createSequentialGroup()
                        .addComponent(lbl_Minuto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Segundo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p_HoraLayout.createSequentialGroup()
                        .addComponent(tf_HoraM, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_HoraS, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        p_HoraLayout.setVerticalGroup(
            p_HoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_HoraLayout.createSequentialGroup()
                .addGroup(p_HoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Hora2)
                    .addComponent(lbl_Minuto)
                    .addComponent(lbl_Segundo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_HoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Hora3)
                    .addComponent(tf_HoraH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_HoraM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_HoraS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbl_Puntuacion1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(lbl_Texto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_Puntuacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbl_Info)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(p_Hora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(p_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbl_nSocio3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_nSocio2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_NSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_NTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(btn_Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_id)
                    .addComponent(tf_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Texto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_Puntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Puntuacion1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p_Hora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nSocio2)
                    .addComponent(cb_NSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nSocio3)
                    .addComponent(cb_NTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Exit)
                    .addComponent(btn_Insert))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(384, 466));
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
    private void btn_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertActionPerformed
        // TODO add your handling code here:
        if (comprobarDatos()) {
            insertarOpinion();
        }
    }//GEN-LAST:event_btn_InsertActionPerformed

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
            java.util.logging.Logger.getLogger(N_Opinion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

            @SuppressWarnings("override")
            public void run() {
                new N_Opinion(conexion).setVisible(true);

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
        if (ta_Texto.getText().equals("") || tf_FechaA1.getText().equals("") || tf_FechaD.getText().equals("") || tf_FechaM.getText().equals("") || tf_HoraH.getText().equals("") || tf_HoraM.getText().equals("") || tf_HoraS.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No puede haber campos vacios", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {

            if (comprobarFecha() && comprobarHora()) {
                s = true;
            }
        }
        return s;
    }

    /**
     * Inserta los datos en la BD
     */
    @SuppressWarnings({"null", "UseSpecificCatch"})
    private void insertarOpinion() {

        Statement s = null;
        //Creamos la query
        try {
            s = conexion.createStatement();
        } catch (SQLException se) {
            System.out.println("probando conexion de consulta");
        }
        try {
            String fecha = setFecha();
            String hora = setHora();
            s.executeUpdate("INSERT INTO opinion (id_opinion, texto, puntuacion, fecha, hora, numero_socio, nombre_tienda) VALUES ('" + tf_ID.getText() + "', '" + ta_Texto.getText()
                    + "', '" + cb_Puntuacion.getItemAt(cb_Puntuacion.getSelectedIndex()) + "', '" + fecha + "', '" + hora + "', '" + cb_NSocio.getItemAt(cb_NSocio.getSelectedIndex()) + "', '"
                    + cb_NTienda.getItemAt(cb_NTienda.getSelectedIndex()) + "')");
            JOptionPane.showMessageDialog(null, "Se ha insertado correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
            confirmacion("¿Deseas insertar mas opiniones?", "Modificar Opinion");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Da valor a tf_ID como el siguiente al ultimo en la BD
     */
    @SuppressWarnings("null")
    private void setNOpinion() {
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
            rs = s.executeQuery("SELECT id_opinion FROM opinion ORDER BY id_opinion");
            while (rs.next()) {
                rs.getString(1);
                id_opinion = Integer.getInteger(rs.getString(1))+1;
            }
            tf_ID.setText(Integer.toString(id_opinion));
        } catch (SQLException ex) {
            Logger.getLogger(N_Opinion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Rellena el CB_NTiendaN con las Tiendas de la BD
     */
    @SuppressWarnings("null")
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
            Logger.getLogger(N_Opinion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Rellena el CB_NSocioN con los Socios de la BD
     */
    @SuppressWarnings("null")
    private void rellenarCBSocio() {
        cb_NSocio.removeAllItems();
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
                cb_NSocio.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(N_Opinion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Comprueba si un String es un numero
     *
     * @param num String que se desea comprobar si es un numero
     * @param Longitud Longitud especificada del numero
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
     * Comprueba que la fecha esta en un formato correcto para la insercion en
     * la BD
     *
     * @return s = true si es correcto | s = false si no es correcto
     */
    private boolean comprobarFecha() {
        boolean s = false;
        if (comprobarNumero(tf_FechaA1.getText(), 4) || comprobarNumero(tf_FechaM.getText(), 2) || comprobarNumero(tf_FechaD.getText(), 2)) {
            if (Integer.valueOf(tf_FechaM.getText()) < 13 && Integer.valueOf(tf_FechaM.getText()) > 0 && Integer.valueOf(tf_FechaD.getText()) > 0 && Integer.valueOf(tf_FechaD.getText()) < 31) {
                s = true;
            } else {
                JOptionPane.showMessageDialog(null, "Error en el campo Fecha, porfavor inserte datos correctos", "Error en Campo", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error en el campo Fecha, porfavor inserte datos correctos", "Error en Campo", JOptionPane.ERROR_MESSAGE);
        }
        return s;
    }

    /**
     * Comprueba que la hora esta en un formato correcto para la insercion en la
     * BD
     *
     * @return s = true si es correcto | s = false si no es correcto
     */
    private boolean comprobarHora() {
        boolean s = false;
        if (comprobarNumero(tf_HoraH.getText(), 2) || comprobarNumero(tf_HoraM.getText(), 2) || comprobarNumero(tf_HoraS.getText(), 2)) {
            if (Integer.valueOf(tf_HoraH.getText()) < 25 && Integer.valueOf(tf_HoraH.getText()) > 0 && Integer.valueOf(tf_HoraM.getText()) > 0 && Integer.valueOf(tf_HoraH.getText()) < 61 && Integer.valueOf(tf_HoraS.getText()) > 0 && Integer.valueOf(tf_HoraS.getText()) < 61) {
                s = true;
            } else {
                JOptionPane.showMessageDialog(null, "Error en el campo Hora, porfavor inserte datos correctos", "Error en Campo", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error en el campo Hora, porfavor inserte datos correctos", "Error en Campo", JOptionPane.ERROR_MESSAGE);
        }
        return s;
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
            N_Opinion ventana = new N_Opinion(conexion);
            ventana.setVisible(true);
            this.setVisible(false);
            //Abrir nueva ventana para insertar Ticket en cupon
        } else {
            this.setVisible(false);
        }
    }

    /**
     *
     * @return La fecha en un formato correcto para su insercion en la BD
     */
    private String setFecha() {
        return tf_FechaA1.getText() + "-" + tf_FechaM.getText() + "-" + tf_FechaD.getText();
    }

    /**
     *
     * @return La hora en un formato correcto para su insercion en la BD
     */
    private String setHora() {
        return tf_HoraH.getText() + ":" + tf_HoraM.getText() + ":" + tf_HoraS.getText();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Insert;
    private javax.swing.JComboBox<String> cb_NSocio;
    private javax.swing.JComboBox<String> cb_NTienda;
    private javax.swing.JComboBox<String> cb_Puntuacion;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Anno;
    private javax.swing.JLabel lbl_Dia;
    private javax.swing.JLabel lbl_Hora2;
    private javax.swing.JLabel lbl_Hora3;
    private javax.swing.JLabel lbl_Hora4;
    private javax.swing.JLabel lbl_Info;
    private javax.swing.JLabel lbl_Mes;
    private javax.swing.JLabel lbl_Minuto;
    private javax.swing.JLabel lbl_Puntuacion1;
    private javax.swing.JLabel lbl_Segundo;
    private javax.swing.JLabel lbl_Texto1;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_nSocio2;
    private javax.swing.JLabel lbl_nSocio3;
    private javax.swing.JPanel p_Hora;
    private javax.swing.JPanel p_Hora1;
    private javax.swing.JTextArea ta_Texto;
    private javax.swing.JTextField tf_FechaA1;
    private javax.swing.JTextField tf_FechaD;
    private javax.swing.JTextField tf_FechaM;
    private javax.swing.JTextField tf_HoraH;
    private javax.swing.JTextField tf_HoraM;
    private javax.swing.JTextField tf_HoraS;
    private javax.swing.JTextField tf_ID;
    // End of variables declaration//GEN-END:variables
}
