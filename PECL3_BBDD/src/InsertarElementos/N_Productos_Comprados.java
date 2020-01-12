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
public class N_Productos_Comprados extends javax.swing.JFrame {

    public static String NTicket;
    public static Connection conexion;

    /**
     * Creates new form N_Productos_Cupon
     * @param NTicket Numero del Ticket
     * @param c Conexion con la BD
     */
    public N_Productos_Comprados(String NTicket, Connection c) {
        N_Productos_Comprados.NTicket = NTicket;
        N_Productos_Comprados.conexion = c;
        initComponents();
        tf_Ticket.setText(NTicket);
        rellenarCBProducto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tf_Ticket = new javax.swing.JTextField();
        cb_Producto = new javax.swing.JComboBox<>();
        tf_Cantidad = new javax.swing.JTextField();
        btn_Anadir = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        lbl_Cantidad = new javax.swing.JLabel();
        lbl_Ticket = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Seleccione un producto de la lista:");

        tf_Ticket.setEditable(false);

        cb_Producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un producto..." }));

        btn_Anadir.setText("Añadir");
        btn_Anadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AnadirActionPerformed(evt);
            }
        });

        btn_Exit.setText("Cancelar");
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });

        lbl_Cantidad.setText("Cantidad:");

        lbl_Ticket.setText("Ticket:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_Exit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Anadir))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cb_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_Ticket, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(tf_Ticket))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_Cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(lbl_Cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Cantidad)
                    .addComponent(lbl_Ticket))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_Ticket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cb_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Anadir)
                    .addComponent(btn_Exit))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(385, 167));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Sale de esta ventana sin conservar los cambios
     * @param evt 
     */
    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_ExitActionPerformed

    /**
     * Añade a la BD a la tabla Productos_Cupon
     * @param evt 
     */
    @SuppressWarnings({"UseSpecificCatch", "null"})
    private void btn_AnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AnadirActionPerformed
        // TODO add your handling code here:
        if (tf_Cantidad.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No se puede insertar una clave vacia", "Error en la Insercion", JOptionPane.ERROR_MESSAGE);
        } else {
            if (comprobarNumero(tf_Cantidad.getText())) {
                if (cb_Producto.getSelectedIndex() != 0) {
                    Statement s = null;
                    try {
                        s = conexion.createStatement();
                    } catch (SQLException se) {
                        System.out.println("probando conexion de consulta");
                    }
                    try {
                        //if(tf_Nombre.equals(""))
                        s.executeUpdate("INSERT INTO public.productos_comprados (codigo_producto,id_ticket_ticket,cantidad) VALUES ('" + cb_Producto.getItemAt(cb_Producto.getSelectedIndex())
                                + "','" + tf_Ticket.getText() + "','" + tf_Cantidad.getText() + "')");
                        JOptionPane.showMessageDialog(null, "Se ha insertado correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
                        confirmacion("¿Deseas añadir mas productos?","Añadir Productos");
                    } catch (Exception se) {
                        JOptionPane.showMessageDialog(null, se.getMessage(), "Error en la Insercion", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un producto de la lista", "Error en Seleccion", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El campo cantidad ha de ser numerico", "Error en Campo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_AnadirActionPerformed

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
            java.util.logging.Logger.getLogger(N_Productos_Comprados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @SuppressWarnings("override")
            public void run() {
                new N_Productos_Comprados(NTicket, conexion).setVisible(true);
            }
        });
    }

    /**
     * Comprueba si un String es un numero
     *
     * @param num
     * @return false si no lo es | true si lo es
     */
    @SuppressWarnings("UseSpecificCatch")
    private boolean comprobarNumero(String num) {
        boolean r = false;
        try {
            Integer.valueOf(num);
            r = true;
        } catch (Exception e) {
            r = false;
        }
        return r;
    }

    /**
     * Crea un JOptionPane que te hace una pregunta segun P
     * @param P Pregunta que aparece en el JOptionPane
     * @param T Titulo del JOptionPane
     */
    private void confirmacion(String P,String T) {
        int n = JOptionPane.showConfirmDialog(
                null,
                P,
                T,
                JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
            N_Productos_Comprados ventana = new N_Productos_Comprados(tf_Ticket.getText(), conexion);
            ventana.setVisible(true);
            this.setVisible(false);
            //Abrir nueva ventana para insertar Ticket en cupon
        } else {
            this.setVisible(false);
        }
    }

    /** 
     * Rellena el CBProducto
     */
    @SuppressWarnings("null")
    private void rellenarCBProducto() {
        cb_Producto.removeAllItems();
        cb_Producto.addItem("Seleccione un producto...");
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
            rs = s.executeQuery("SELECT * FROM producto");
            while (rs.next()) {
                cb_Producto.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(N_Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Anadir;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JComboBox<String> cb_Producto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_Cantidad;
    private javax.swing.JLabel lbl_Ticket;
    private javax.swing.JTextField tf_Cantidad;
    private javax.swing.JTextField tf_Ticket;
    // End of variables declaration//GEN-END:variables
}
