/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author keygo
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_bienve = new javax.swing.JLabel();
        lbl_godi = new javax.swing.JLabel();
        btn_comprar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_verificar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        lbl_accion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_contacto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_bienve.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_bienve.setText("Bienvenido al sistemas de compra de entradas");

        lbl_godi.setFont(new java.awt.Font("Segoe UI Semibold", 2, 24)); // NOI18N
        lbl_godi.setText("GodiTickets");

        btn_comprar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_comprar.setText("Comprar entradas");
        btn_comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comprarActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cancelar.setText("Cancelar entradas");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_verificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_verificar.setText("Verificar entradas");
        btn_verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verificarActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        lbl_accion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_accion.setText("Indiquenos que desea realizar:");

        jLabel1.setText("Mantenimiento");

        jLabel2.setText("Mantenimiento");

        btn_contacto.setText("Contacto");
        btn_contacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_contactoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_accion)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_bienve)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addComponent(lbl_godi)
                        .addGap(95, 95, 95))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_contacto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(btn_comprar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cancelar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_verificar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(366, 366, 366)
                                .addComponent(jLabel1)
                                .addGap(83, 83, 83)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_bienve)
                    .addComponent(lbl_godi))
                .addGap(53, 53, 53)
                .addComponent(lbl_accion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_comprar)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_verificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salir)
                    .addComponent(btn_contacto))
                .addContainerGap())
        );

        btn_comprar.getAccessibleContext().setAccessibleName("btn-comprar");
        btn_comprar.getAccessibleContext().setAccessibleDescription("btn-comprar");
        btn_cancelar.getAccessibleContext().setAccessibleName("btn-cancelar");
        btn_cancelar.getAccessibleContext().setAccessibleDescription("");

        getAccessibleContext().setAccessibleName("principal");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comprarActionPerformed
        compradeentradas fra=new compradeentradas();
        fra.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_comprarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
       JOptionPane.showMessageDialog(null,"Esta acci??n se encuentra en Mantenimiento, agradecemos su comprensi??n");    
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();  
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_verificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verificarActionPerformed
     JOptionPane.showMessageDialog(null,"Esta acci??n se encuentra en Mantenimiento, agradecemos su comprensi??n");    
    }//GEN-LAST:event_btn_verificarActionPerformed

    private void btn_contactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_contactoActionPerformed
     JOptionPane.showMessageDialog(null,"Gracias por preferinos : "
             + "Puede contactarnos en redes como GODITICKETS o enviarnos un email a la direccion "
             + "<-contacto@gotickets.com->");    
    }//GEN-LAST:event_btn_contactoActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_comprar;
    private javax.swing.JButton btn_contacto;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_verificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_accion;
    private javax.swing.JLabel lbl_bienve;
    private javax.swing.JLabel lbl_godi;
    // End of variables declaration//GEN-END:variables
}
