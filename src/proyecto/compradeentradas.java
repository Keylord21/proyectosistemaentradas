
package proyecto;
import java.util.Random;

public class compradeentradas extends javax.swing.JFrame {
    
    public compradeentradas() {
        initComponents();     
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtn_entradas = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rbtn_sombra = new javax.swing.JRadioButton();
        rbtn_palco = new javax.swing.JRadioButton();
        jPanel_factura = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbl_numero = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        lbl_localidades = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        lbl_cantidadentradas = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        lbl_montototal = new javax.swing.JTextPane();
        btn_confirmar = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        txt_ced = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_numero = new javax.swing.JTextField();
        btn_verificar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_menu = new javax.swing.JButton();
        txt_sombra = new javax.swing.JTextField();
        txt_palco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Para comprar entradas necesitamos los siguientes datos:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Cédula:");

        jLabel4.setText("Correo electrónico:");

        jLabel5.setText("Número de telefono:");

        jLabel6.setText("Seleccione el tipo de entrada que se desea adquirir");

        rbtn_sombra.setText("Graderia Sombra");
        rbtn_sombra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_sombraActionPerformed(evt);
            }
        });

        rbtn_palco.setText("Palco");

        jLabel7.setText("Facturación :");

        jLabel8.setText("Cantidad de entradas:");

        jLabel9.setText("Localidad(es):");

        jLabel10.setText("Monto total (Impuestos de venta incluidos):");

        jScrollPane1.setViewportView(lbl_numero);

        jScrollPane3.setViewportView(lbl_localidades);

        jScrollPane4.setViewportView(lbl_cantidadentradas);

        jScrollPane2.setViewportView(lbl_montototal);

        btn_confirmar.setText("Confirmar factura");
        btn_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_facturaLayout = new javax.swing.GroupLayout(jPanel_factura);
        jPanel_factura.setLayout(jPanel_facturaLayout);
        jPanel_facturaLayout.setHorizontalGroup(
            jPanel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_facturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addComponent(btn_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_facturaLayout.setVerticalGroup(
            jPanel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_facturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_facturaLayout.createSequentialGroup()
                        .addGroup(jPanel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btn_verificar.setText("Verificar");
        btn_verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verificarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_menu.setText("Menu Principal");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });

        txt_sombra.setText("0");
        txt_sombra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sombraActionPerformed(evt);
            }
        });

        txt_palco.setText("0");
        txt_palco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_palcoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel_factura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(rbtn_sombra)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_sombra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(71, 71, 71)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel5)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(rbtn_palco)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_palco, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_verificar)
                                                .addGap(39, 39, 39)
                                                .addComponent(btn_cancelar)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(txt_ced))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 350, Short.MAX_VALUE)
                        .addComponent(btn_menu)
                        .addGap(81, 81, 81))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_menu)
                    .addComponent(jLabel4)
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_ced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_sombra)
                    .addComponent(rbtn_palco)
                    .addComponent(btn_verificar)
                    .addComponent(btn_cancelar)
                    .addComponent(txt_sombra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_palco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_factura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("compradeentradas");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtn_sombraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_sombraActionPerformed
    
    }//GEN-LAST:event_rbtn_sombraActionPerformed

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        principal fra=new principal();
        fra.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_menuActionPerformed

    private void btn_verificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verificarActionPerformed
    String nombre = txt_nombre.getText();
    String cedula = txt_ced.getText();
    String correo = txt_correo.getText();
    String numero = txt_numero.getText();
    String mensaje = "";
    Integer palco = 13650;
    Integer sombra = 5650;
    Double iva = 0.13 ;
    
    
    Integer npalco = Integer.parseInt(txt_palco.getText());
    Integer nsombra = Integer.parseInt(txt_sombra.getText());
    
      
    
    Integer aleatorio = 0;
        
        Random r = new Random() ;
        aleatorio = (r.nextInt() + 100);
        
    
    
    
    
        
    if(rbtn_sombra.isSelected() && rbtn_palco.isSelected()){
        mensaje+="Sombra y palco";
        
    }else{
        if(rbtn_sombra.isSelected()){
            mensaje+="Sombra";
            npalco=0;
        }else{
            if(rbtn_palco.isSelected()){
                mensaje+="Palco";
                nsombra=0;
            }
        }
    }
    sombra*= nsombra ;
    palco*= npalco ;
    lbl_numero.setText(Integer.toString(aleatorio));
    lbl_localidades.setText(mensaje);
    lbl_montototal.setText(Integer.toString(sombra + palco));
    lbl_cantidadentradas.setText(Integer.toString(npalco + nsombra));
    }//GEN-LAST:event_btn_verificarActionPerformed

    private void txt_palcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_palcoActionPerformed
   
    }//GEN-LAST:event_txt_palcoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        txt_nombre.setText(null);
        txt_ced.setText(null);
        txt_correo.setText(null);
        txt_numero.setText(null);
        txt_sombra.setText(null);
        txt_palco.setText(null);
        lbl_numero.setText(null);
        lbl_cantidadentradas.setText(null);
        lbl_localidades.setText(null);
        lbl_montototal.setText(null);
        
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void txt_sombraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sombraActionPerformed
        
    }//GEN-LAST:event_txt_sombraActionPerformed

    private void btn_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmarActionPerformed
     verificarentradas ventana = new verificarentradas();
     ventana.setVisible(true);
     
     ventana.nombre=txt_nombre.getText();
     ventana.cedula=txt_ced.getText();
     ventana.correo=txt_correo.getText();
     ventana.cantidadp =txt_palco.getText();
     ventana.cantidads = txt_sombra.getText();
     ventana.factura = lbl_numero.getText();
//ventana.factura = lbl_numero.getSelectionStart();
     ventana.monto = lbl_montototal.getText();
     
     ventana.entradas = lbl_cantidadentradas.getText();
     
    }//GEN-LAST:event_btn_confirmarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new compradeentradas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_confirmar;
    private javax.swing.JButton btn_menu;
    private javax.swing.JButton btn_verificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel_factura;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane lbl_cantidadentradas;
    private javax.swing.JTextPane lbl_localidades;
    public static javax.swing.JTextPane lbl_montototal;
    public static javax.swing.JTextPane lbl_numero;
    private javax.swing.ButtonGroup rbtn_entradas;
    private javax.swing.JRadioButton rbtn_palco;
    private javax.swing.JRadioButton rbtn_sombra;
    public static javax.swing.JTextField txt_ced;
    public static javax.swing.JTextField txt_correo;
    public static javax.swing.JTextField txt_nombre;
    public static javax.swing.JTextField txt_numero;
    public static javax.swing.JTextField txt_palco;
    public static javax.swing.JTextField txt_sombra;
    // End of variables declaration//GEN-END:variables
}
