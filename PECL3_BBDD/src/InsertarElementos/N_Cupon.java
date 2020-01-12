/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertarElementos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author razvanvc
 */
public class N_Cupon extends javax.swing.JFrame {

    public static Connection conexion;

    /**
     * Creates new form N_Tienda
     */
    public N_Cupon(Connection c) {
        N_Cupon.conexion = c;
        initComponents();
        tf_Descuento.setText("");
        setIDCupon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Nombre = new javax.swing.JLabel();
        lbl_Info = new javax.swing.JLabel();
        tf_ID = new javax.swing.JTextField();
        lbl_Ciudad = new javax.swing.JLabel();
        tf_Descuento = new javax.swing.JTextField();
        btn_Crear = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Cupon");

        lbl_Nombre.setText("ID:");

        lbl_Info.setText("Rellene los siguientes campos: ");

        tf_ID.setEditable(false);

        lbl_Ciudad.setText("Descuento:");

        btn_Crear.setText("Crear Cupon");
        btn_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CrearActionPerformed(evt);
            }
        });

        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                        .addGap(11, 11, 11)
                        .addComponent(tf_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_Cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Crear))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_Ciudad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(tf_Descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_Info, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_Info)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Nombre)
                    .addComponent(tf_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Ciudad)
                    .addComponent(tf_Descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Crear)
                    .addComponent(btn_Cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(308, 193));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Comprueba y Inserta los datos de Cupon en la BD
     *
     * @param evt
     */
    @SuppressWarnings("null")
    private void btn_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CrearActionPerformed
        // TODO add your handling code here:
        if (tf_ID.getText().equals("") || tf_Descuento.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No se puede insertar una clave vacia", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            Statement s = null;
            try {
                s = conexion.createStatement();
            } catch (SQLException se) {
                System.out.println("probando conexion de consulta");
            }

            try {
                s.executeUpdate("INSERT INTO public.cupon (id_cupon, descuento) VALUES ('" + tf_ID.getText() + "', '" + tf_Descuento.getText() + "')");
                JOptionPane.showMessageDialog(null, "Se ha insertado correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
                //INCLUIR MODIFICAR LOS CUPONES ASOCIADOS AL SOCIO
                confirmacion("¿Deseas añadir mas cupones?", "Insertar Socio");
            } catch (SQLException se) {
                JOptionPane.showMessageDialog(null, se.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                tf_Descuento.setText("");
                tf_ID.setText("");
            }
        }
    }//GEN-LAST:event_btn_CrearActionPerformed

    /**
     * Sale de esta ventana sin conservar los cambios
     *
     * @param evt
     */
    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_CancelarActionPerformed

    /**
     * Da valor a tf_ID como el siguiente al ultimo en la BD
     */
    @SuppressWarnings("null")
    private void setIDCupon() {
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
            rs = s.executeQuery("SELECT * FROM cupon");
            while (rs.next()) {
                id_opinion++;
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
            N_Cupon ventana = new N_Cupon(conexion);
            ventana.setVisible(true);
            this.setVisible(false);
            //Abrir nueva ventana para insertar Ticket en cupon
        } else {
            this.setVisible(false);
        }
    }
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
            java.util.logging.Logger.getLogger(N_Cupon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @SuppressWarnings("override")
            public void run() {
                new N_Cupon(conexion).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Crear;
    private javax.swing.JLabel lbl_Ciudad;
    private javax.swing.JLabel lbl_Info;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JTextField tf_Descuento;
    private javax.swing.JTextField tf_ID;
    // End of variables declaration//GEN-END:variables
}
