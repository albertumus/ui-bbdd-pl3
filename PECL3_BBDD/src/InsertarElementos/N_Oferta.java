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
public final class N_Oferta extends javax.swing.JFrame {

    public static Connection conexion;

    /**
     * Creates new form E_Tienda
     */
    public N_Oferta(Connection c) {
        N_Oferta.conexion = c;
        initComponents();
        setIDOferta();
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
        lbl_Nombre1 = new javax.swing.JLabel();
        lbl_Ciudad1 = new javax.swing.JLabel();
        tf_Descuento = new javax.swing.JTextField();
        tf_ID = new javax.swing.JTextField();
        btn_Insert = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        p_FechaI = new javax.swing.JPanel();
        tf_FechaD = new javax.swing.JTextField();
        tf_FechaM = new javax.swing.JTextField();
        tf_FechaA = new javax.swing.JTextField();
        lbl_Dia = new javax.swing.JLabel();
        lbl_Mes = new javax.swing.JLabel();
        lbl_Anno = new javax.swing.JLabel();
        lbl_Hora2 = new javax.swing.JLabel();
        p_FechaF = new javax.swing.JPanel();
        tf_FechaD1 = new javax.swing.JTextField();
        tf_FechaM1 = new javax.swing.JTextField();
        tf_FechaA1 = new javax.swing.JTextField();
        lbl_Dia1 = new javax.swing.JLabel();
        lbl_Mes1 = new javax.swing.JLabel();
        lbl_Anno1 = new javax.swing.JLabel();
        lbl_Hora3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva Oferta");

        lbl_Info.setText("Rellene los siguientes campos:");

        lbl_Nombre1.setText("ID:");

        lbl_Ciudad1.setText("Descuento:");

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

        lbl_Dia.setText("Dia:");

        lbl_Mes.setText("Mes:");

        lbl_Anno.setText("Año:");

        lbl_Hora2.setText("Fecha Inicio:");

        javax.swing.GroupLayout p_FechaILayout = new javax.swing.GroupLayout(p_FechaI);
        p_FechaI.setLayout(p_FechaILayout);
        p_FechaILayout.setHorizontalGroup(
            p_FechaILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_FechaILayout.createSequentialGroup()
                .addComponent(lbl_Hora2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p_FechaILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_FechaD, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_FechaILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_FechaILayout.createSequentialGroup()
                        .addComponent(lbl_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Anno, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p_FechaILayout.createSequentialGroup()
                        .addComponent(tf_FechaM, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_FechaA, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p_FechaILayout.setVerticalGroup(
            p_FechaILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_FechaILayout.createSequentialGroup()
                .addGroup(p_FechaILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Dia)
                    .addComponent(lbl_Mes)
                    .addComponent(lbl_Anno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_FechaILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Hora2)
                    .addComponent(tf_FechaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_FechaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_FechaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        lbl_Dia1.setText("Dia:");

        lbl_Mes1.setText("Mes:");

        lbl_Anno1.setText("Año:");

        lbl_Hora3.setText("Fecha Fin:");

        javax.swing.GroupLayout p_FechaFLayout = new javax.swing.GroupLayout(p_FechaF);
        p_FechaF.setLayout(p_FechaFLayout);
        p_FechaFLayout.setHorizontalGroup(
            p_FechaFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_FechaFLayout.createSequentialGroup()
                .addComponent(lbl_Hora3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p_FechaFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Dia1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_FechaD1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_FechaFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_FechaFLayout.createSequentialGroup()
                        .addComponent(lbl_Mes1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Anno1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p_FechaFLayout.createSequentialGroup()
                        .addComponent(tf_FechaM1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_FechaA1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p_FechaFLayout.setVerticalGroup(
            p_FechaFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_FechaFLayout.createSequentialGroup()
                .addGroup(p_FechaFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Dia1)
                    .addComponent(lbl_Mes1)
                    .addComponent(lbl_Anno1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_FechaFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Hora3)
                    .addComponent(tf_FechaD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_FechaM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_FechaA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_Ciudad1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(lbl_Nombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_Descuento)
                                    .addComponent(tf_ID)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_Info)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(p_FechaI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(p_FechaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbl_Info)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Nombre1)
                    .addComponent(tf_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Ciudad1)
                    .addComponent(tf_Descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_FechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_FechaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Insert)
                    .addComponent(btn_Exit))
                .addGap(15, 15, 15))
        );

        setSize(new java.awt.Dimension(409, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void btn_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertActionPerformed
        // TODO add your handling code here:
        if (compruebaDatos()) {
            insertarDatos();
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
            java.util.logging.Logger.getLogger(N_Oferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new N_Oferta(conexion).setVisible(true);
            }
        });
    }

    private boolean compruebaDatos() {
        boolean s = false;
        if (tf_Descuento.getText().equals("") || tf_FechaA.getText().equals("") || tf_FechaA1.getText().equals("") || tf_FechaD.getText().equals("") || tf_FechaD1.getText().equals("") || tf_FechaM.getText().equals("") || tf_FechaM1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No puede haber campos vacios", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            if (comprobarNumero(tf_Descuento.getText())) {
                if (comprobarFechaI() && comprobarFechaF()) {
                    s = true;
                }
            } else {
                JOptionPane.showMessageDialog(null, "El descuento ha de ser un valor numerico entre 0 y 100", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        return s;
    }

    @SuppressWarnings("null")
    private void insertarDatos() {

        Statement s = null;
        //Creamos la query
        String FechaI = setFechaI();
        String FechaF = setFechaF();
        try {
            s = conexion.createStatement();
        } catch (SQLException se) {
            System.out.println("probando conexion de consulta");
        }
        try {
            //UPDATE cupon SET descuento = 20 WHERE  id_cupon = 1;
            s.executeUpdate("INSERT INTO public.oferta (id_oferta, descuento, fecha_inicio, fecha_fin) VALUES ('" + tf_ID.getText() + "', '" + tf_Descuento.getText()
                    + "', '" + FechaI + "', '" + FechaF + "');");
            JOptionPane.showMessageDialog(null, "Se ha creado correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
            //INCLUIR MODIFICAR LOS CUPONES ASOCIADOS AL SOCIO
            confirmacion("¿Deseas crear mas ofertas?", "Crear Oferta");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setIDOferta() {
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
            rs = s.executeQuery("SELECT id_oferta FROM oferta order by  id_oferta desc LIMIT 1");
            while (rs.next()) {
                id_opinion = Integer.parseInt(rs.getString(1))+1;
            }
            tf_ID.setText(Integer.toString(id_opinion));
        } catch (SQLException ex) {
            Logger.getLogger(N_Opinion.class.getName()).log(Level.SEVERE, null, ex);
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
            N_Oferta ventana = new N_Oferta(conexion);
            ventana.setVisible(true);
            this.setVisible(false);
            //Abrir nueva ventana para insertar Ticket en cupon
        } else {
            this.setVisible(false);
        }
    }

    /**
     * Comprueba si un String es un numero y si es menor que una longitud
     *
     * @param num String que se desea comprobar si es un numero
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
     * Comprueba si un String es un numero y si es menor que una longitud
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
    private boolean comprobarFechaI() {
        boolean s = false;
        if (comprobarNumero(tf_FechaA.getText(), 4) || comprobarNumero(tf_FechaM.getText(), 2) || comprobarNumero(tf_FechaD.getText(), 2)) {
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

    private boolean comprobarFechaF() {
        boolean s = false;
        if (comprobarNumero(tf_FechaA1.getText(), 4) || comprobarNumero(tf_FechaM1.getText(), 2) || comprobarNumero(tf_FechaD1.getText(), 2)) {
            if (Integer.valueOf(tf_FechaM1.getText()) < 13 && Integer.valueOf(tf_FechaM1.getText()) > 0 && Integer.valueOf(tf_FechaD1.getText()) > 0 && Integer.valueOf(tf_FechaD.getText()) < 31) {
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
     * Crea un JOptionPane que te hace una pregunta segun P
     *
     * @param P Pregunta que aparece en el JOptionPane
     * @param T Titulo del JOptionPane
     */
    /**
     *
     * @return La fecha en un formato correcto para su insercion en la BD
     */
    private String setFechaI() {
        return tf_FechaA.getText() + "-" + tf_FechaM.getText() + "-" + tf_FechaD.getText();
    }

    /**
     *
     * @return La fecha en un formato correcto para su insercion en la BD
     */
    private String setFechaF() {
        return tf_FechaA1.getText() + "-" + tf_FechaM1.getText() + "-" + tf_FechaD1.getText();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Insert;
    private javax.swing.JLabel lbl_Anno;
    private javax.swing.JLabel lbl_Anno1;
    private javax.swing.JLabel lbl_Ciudad1;
    private javax.swing.JLabel lbl_Dia;
    private javax.swing.JLabel lbl_Dia1;
    private javax.swing.JLabel lbl_Hora2;
    private javax.swing.JLabel lbl_Hora3;
    private javax.swing.JLabel lbl_Info;
    private javax.swing.JLabel lbl_Mes;
    private javax.swing.JLabel lbl_Mes1;
    private javax.swing.JLabel lbl_Nombre1;
    private javax.swing.JPanel p_FechaF;
    private javax.swing.JPanel p_FechaI;
    private javax.swing.JTextField tf_Descuento;
    private javax.swing.JTextField tf_FechaA;
    private javax.swing.JTextField tf_FechaA1;
    private javax.swing.JTextField tf_FechaD;
    private javax.swing.JTextField tf_FechaD1;
    private javax.swing.JTextField tf_FechaM;
    private javax.swing.JTextField tf_FechaM1;
    private javax.swing.JTextField tf_ID;
    // End of variables declaration//GEN-END:variables
}
