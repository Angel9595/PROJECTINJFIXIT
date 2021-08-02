package Domain;

import javax.swing.JOptionPane;


public class panel_main extends javax.swing.JFrame {
    
    public panel_main() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BACKGROUND = new javax.swing.JPanel();
        btn_DOCFALLA = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Btn_Protocolos = new javax.swing.JButton();
        Btn_pkg = new javax.swing.JButton();
        Btn_Display = new javax.swing.JButton();
        Btn_SDCARD = new javax.swing.JButton();
        Btn_teclado2 = new javax.swing.JButton();
        Btn_Mensajes2 = new javax.swing.JButton();
        btn_Salir1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Btn_Mensajes1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        BACKGROUND.setBackground(new java.awt.Color(255, 255, 255));
        BACKGROUND.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_DOCFALLA.setBackground(new java.awt.Color(255, 255, 255));
        btn_DOCFALLA.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        btn_DOCFALLA.setForeground(new java.awt.Color(255, 255, 255));
        btn_DOCFALLA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Domain/IMAGES/iconfinder-documents01-1622837_121952.png"))); // NOI18N
        btn_DOCFALLA.setText("DOCUMENTAR FALLA");
        btn_DOCFALLA.setBorder(null);
        btn_DOCFALLA.setBorderPainted(false);
        btn_DOCFALLA.setContentAreaFilled(false);
        btn_DOCFALLA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_DOCFALLA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_DOCFALLA.setIconTextGap(-3);
        btn_DOCFALLA.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_DOCFALLA.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_DOCFALLA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DOCFALLAActionPerformed(evt);
            }
        });
        BACKGROUND.add(btn_DOCFALLA, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 150, 100));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Domain/IMAGES/log fix it inj (2).png"))); // NOI18N
        BACKGROUND.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 220, 170));

        Btn_Protocolos.setBackground(new java.awt.Color(0, 0, 0));
        Btn_Protocolos.setFont(new java.awt.Font("Rockwell Extra Bold", 2, 18)); // NOI18N
        Btn_Protocolos.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Protocolos.setText("PROTOCOLOS");
        Btn_Protocolos.setBorder(null);
        Btn_Protocolos.setBorderPainted(false);
        Btn_Protocolos.setContentAreaFilled(false);
        Btn_Protocolos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Protocolos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Protocolos.setIconTextGap(-3);
        Btn_Protocolos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Btn_Protocolos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btn_Protocolos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ProtocolosActionPerformed(evt);
            }
        });
        BACKGROUND.add(Btn_Protocolos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 170, -1));

        Btn_pkg.setBackground(new java.awt.Color(0, 0, 0));
        Btn_pkg.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 18)); // NOI18N
        Btn_pkg.setForeground(new java.awt.Color(255, 255, 255));
        Btn_pkg.setText("PKG");
        Btn_pkg.setBorder(null);
        Btn_pkg.setBorderPainted(false);
        Btn_pkg.setContentAreaFilled(false);
        Btn_pkg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_pkg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_pkgActionPerformed(evt);
            }
        });
        BACKGROUND.add(Btn_pkg, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 120, -1));

        Btn_Display.setBackground(new java.awt.Color(0, 0, 0));
        Btn_Display.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 18)); // NOI18N
        Btn_Display.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Display.setText("DISPLAY");
        Btn_Display.setBorder(null);
        Btn_Display.setBorderPainted(false);
        Btn_Display.setContentAreaFilled(false);
        Btn_Display.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DisplayActionPerformed(evt);
            }
        });
        BACKGROUND.add(Btn_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 140, -1));

        Btn_SDCARD.setBackground(new java.awt.Color(0, 0, 0));
        Btn_SDCARD.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 18)); // NOI18N
        Btn_SDCARD.setForeground(new java.awt.Color(255, 255, 255));
        Btn_SDCARD.setText("SD-CARD");
        Btn_SDCARD.setBorder(null);
        Btn_SDCARD.setBorderPainted(false);
        Btn_SDCARD.setContentAreaFilled(false);
        Btn_SDCARD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_SDCARD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SDCARDActionPerformed(evt);
            }
        });
        BACKGROUND.add(Btn_SDCARD, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 140, -1));

        Btn_teclado2.setBackground(new java.awt.Color(0, 0, 0));
        Btn_teclado2.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 18)); // NOI18N
        Btn_teclado2.setForeground(new java.awt.Color(255, 255, 255));
        Btn_teclado2.setText("TECLADO");
        Btn_teclado2.setBorder(null);
        Btn_teclado2.setBorderPainted(false);
        Btn_teclado2.setContentAreaFilled(false);
        Btn_teclado2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_teclado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_teclado2ActionPerformed(evt);
            }
        });
        BACKGROUND.add(Btn_teclado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 140, -1));

        Btn_Mensajes2.setBackground(new java.awt.Color(0, 0, 0));
        Btn_Mensajes2.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 18)); // NOI18N
        Btn_Mensajes2.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Mensajes2.setText("Mensajes");
        Btn_Mensajes2.setBorder(null);
        Btn_Mensajes2.setBorderPainted(false);
        Btn_Mensajes2.setContentAreaFilled(false);
        Btn_Mensajes2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Mensajes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Mensajes2ActionPerformed(evt);
            }
        });
        BACKGROUND.add(Btn_Mensajes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 140, -1));

        btn_Salir1.setBackground(new java.awt.Color(255, 255, 255));
        btn_Salir1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        btn_Salir1.setForeground(new java.awt.Color(255, 255, 255));
        btn_Salir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Domain/IMAGES/button_exit_15724_1.png"))); // NOI18N
        btn_Salir1.setText("SALIR");
        btn_Salir1.setBorder(null);
        btn_Salir1.setBorderPainted(false);
        btn_Salir1.setContentAreaFilled(false);
        btn_Salir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Salir1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Salir1.setIconTextGap(-3);
        btn_Salir1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_Salir1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Salir1ActionPerformed(evt);
            }
        });
        BACKGROUND.add(btn_Salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 70, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Domain/IMAGES/gray_pcb.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        BACKGROUND.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 600, 390));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Domain/IMAGES/pcb_black.jpg"))); // NOI18N
        jLabel6.setText("jLabel4");
        BACKGROUND.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 0, 820, 430));

        Btn_Mensajes1.setBackground(new java.awt.Color(0, 0, 0));
        Btn_Mensajes1.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 18)); // NOI18N
        Btn_Mensajes1.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Mensajes1.setText("Mensajes");
        Btn_Mensajes1.setBorder(null);
        Btn_Mensajes1.setBorderPainted(false);
        Btn_Mensajes1.setContentAreaFilled(false);
        Btn_Mensajes1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Mensajes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Mensajes1ActionPerformed(evt);
            }
        });
        BACKGROUND.add(Btn_Mensajes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BACKGROUND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BACKGROUND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_pkgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_pkgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_pkgActionPerformed

    private void Btn_DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DisplayActionPerformed
        panel_display panel2 = new panel_display();
        panel2.setVisible(true);
        dispose();
    }//GEN-LAST:event_Btn_DisplayActionPerformed

    private void Btn_SDCARDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SDCARDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_SDCARDActionPerformed

    private void Btn_ProtocolosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ProtocolosActionPerformed
        Panel_protocolos  panelprotocolos = new Panel_protocolos();
        JOptionPane.showMessageDialog(this, "!Asegurate que no existan cortos circuitos ni soladuras frias antes de remplazar un componente¡");
        panelprotocolos.setVisible(true);
        dispose();
    }//GEN-LAST:event_Btn_ProtocolosActionPerformed

    private void btn_DOCFALLAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DOCFALLAActionPerformed
        
    }//GEN-LAST:event_btn_DOCFALLAActionPerformed

    private void Btn_teclado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_teclado2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_teclado2ActionPerformed

    private void Btn_Mensajes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Mensajes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Mensajes1ActionPerformed

    private void Btn_Mensajes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Mensajes2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Mensajes2ActionPerformed

    private void btn_Salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Salir1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_Salir1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new panel_main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BACKGROUND;
    private javax.swing.JButton Btn_Display;
    private javax.swing.JButton Btn_Mensajes1;
    private javax.swing.JButton Btn_Mensajes2;
    private javax.swing.JButton Btn_Protocolos;
    private javax.swing.JButton Btn_SDCARD;
    private javax.swing.JButton Btn_pkg;
    private javax.swing.JButton Btn_teclado2;
    private javax.swing.JButton btn_DOCFALLA;
    private javax.swing.JButton btn_Salir1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables

    
}
