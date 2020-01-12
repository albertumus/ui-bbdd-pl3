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
public final class M_Producto extends javax.swing.JFrame {

    public static Connection conexion;

    /**
     * Creates new form E_Tienda
     */
    public M_Producto(Connection c) {
        M_Producto.conexion = c;
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
        tf_PrecioA = new javax.swing.JTextField();
        tf_Codigo = new javax.swing.JTextField();
        tf_PrecioN = new javax.swing.JTextField();
        lbl_ValoresA = new javax.swing.JLabel();
        lbl_ValoresN = new javax.swing.JLabel();
        btn_Modify = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        lbl_Ciudad2 = new javax.swing.JLabel();
        tf_PrecioIVAN = new javax.swing.JTextField(4);
        lbl_Ciudad3 = new javax.swing.JLabel();
        lbl_Ciudad4 = new javax.swing.JLabel();
        tf_PrecioIVAA = new javax.swing.JTextField();
        lbl_Ciudad5 = new javax.swing.JLabel();
        tf_Stock = new javax.swing.JTextField();
        tf_StockN = new javax.swing.JTextField(4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cb_TS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_TSActionPerformed(evt);
            }
        });

        lbl_Info.setText("Seleccione un producto de la lista:");

        lbl_Ciudad.setText("Precio:");

        lbl_Nombre1.setText("Codigo:");

        lbl_Ciudad1.setText("Precio:");

        tf_PrecioA.setEditable(false);

        tf_Codigo.setEditable(false);

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

        lbl_Ciudad2.setText("Precio + IVA:");

        lbl_Ciudad3.setText("Stock:");

        lbl_Ciudad4.setText("Precio + IVA:");

        tf_PrecioIVAA.setEditable(false);

        lbl_Ciudad5.setText("Stock:");

        tf_Stock.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cb_TS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(btn_Modify, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ValoresA)
                            .addComponent(lbl_Info)
                            .addComponent(lbl_ValoresN))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbl_Ciudad4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_Ciudad1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_Nombre1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(lbl_Ciudad5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_PrecioA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                    .addComponent(tf_PrecioIVAA, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_Stock, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_Codigo)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_Ciudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_Ciudad3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_Ciudad2, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_PrecioIVAN, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_PrecioN)
                                    .addComponent(tf_StockN, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addContainerGap())))
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
                    .addComponent(tf_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Ciudad1)
                    .addComponent(tf_PrecioA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Ciudad4)
                    .addComponent(tf_PrecioIVAA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Ciudad5)
                    .addComponent(tf_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl_ValoresN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_PrecioN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Ciudad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_PrecioIVAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Ciudad2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Ciudad3)
                    .addComponent(tf_StockN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Modify)
                    .addComponent(btn_Exit))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(335, 431));
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(M_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new M_Producto(conexion).setVisible(true);
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
        if (comprobarNumeroDouble(tf_PrecioN.getText()) && comprobarNumero(tf_StockN.getText())) {
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
            //UPDATE oferta SET descuento = 3, fecha_inicio = '2019-09-09', fecha_fin = '2019-09-16'  WHERE  id_oferta = 1;
            s.executeUpdate("UPDATE producto SET precio = '" + tf_PrecioN.getText() + "', precio_IVA = '" + tf_PrecioIVAN.getText() + "', stock = '" + tf_StockN.getText() + "'  WHERE codigo = '" + cb_TS.getItemAt(cb_TS.getSelectedIndex()) + "'");
            JOptionPane.showMessageDialog(null, "Se ha modificado correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
            confirmacion("¿Deseas modificar mas productos?", "Modificar Producto");
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
            rs = s.executeQuery("SELECT * FROM producto WHERE codigo = '" + cb_TS.getItemAt(cb_TS.getSelectedIndex()) + "'");
            while (rs.next()) {
                tf_Codigo.setText(rs.getString(1));
                tf_PrecioA.setText(String.valueOf(rs.getDouble(3)));
                tf_PrecioIVAA.setText(String.valueOf(rs.getDouble(2)));
                tf_Stock.setText(rs.getString(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(M_Producto.class.getName()).log(Level.SEVERE, null, ex);
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
            rs = s.executeQuery("SELECT * FROM producto");
            while (rs.next()) {
                cb_TS.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(M_Producto.class.getName()).log(Level.SEVERE, null, ex);
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
            if (Check >= 0) {
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
            M_Producto ventana = new M_Producto(conexion);
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
    private javax.swing.JLabel lbl_Ciudad2;
    private javax.swing.JLabel lbl_Ciudad3;
    private javax.swing.JLabel lbl_Ciudad4;
    private javax.swing.JLabel lbl_Ciudad5;
    private javax.swing.JLabel lbl_Info;
    private javax.swing.JLabel lbl_Nombre1;
    private javax.swing.JLabel lbl_ValoresA;
    private javax.swing.JLabel lbl_ValoresN;
    private javax.swing.JTextField tf_Codigo;
    private javax.swing.JTextField tf_PrecioA;
    private javax.swing.JTextField tf_PrecioIVAA;
    private javax.swing.JTextField tf_PrecioIVAN;
    private javax.swing.JTextField tf_PrecioN;
    private javax.swing.JTextField tf_Stock;
    private javax.swing.JTextField tf_StockN;
    // End of variables declaration//GEN-END:variables
}