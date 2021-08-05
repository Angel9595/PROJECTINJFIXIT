package Domain;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Panel_documentacion extends javax.swing.JFrame {
    
    private static final String DRIVER ="com.mysql.jdbc.Driver";
    private static final String USER="root";
    private static final String PASSWORD="mysql97";
    private static final String URL="jdbc:mysql://localhost/reportes_bd?characterEncoding=latin1";  
    
    
    ResultSet rs;
    
    
     public static com.mysql.jdbc.Connection getConnection()
      {
      com.mysql.jdbc.Connection con = null;
      
      try{
      
      Class.forName("com.mysql.jdbc.Driver");
      con = (com.mysql.jdbc.Connection) DriverManager.getConnection(URL,USER,PASSWORD);
      JOptionPane.showMessageDialog(null, "conexion exitosa");
      
      }catch(Exception e){
          System.out.println(e);
      }
       return con;   
          
      }
 
   private void limpiarCajas(){
       cbx_modeloeq.setSelectedIndex(0);
       txt_numserie.setText(null);
       cbx_departamentoeq.setSelectedIndex(0);
       txtarea_descfalla.setText(null);
       txtarea_solucion.setText(null);
       txt_nomusuario.setText(null);
       cbx_dep.setSelectedIndex(0);
   }
   
   public Panel_documentacion() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nomusuario = new javax.swing.JFormattedTextField();
        cbx_dep = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbx_modeloeq = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea_solucion = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtarea_descfalla = new javax.swing.JTextArea();
        txt_numserie = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        cbx_departamentoeq = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        btn_modificar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_limpiar1 = new javax.swing.JButton();
        btn_salir1 = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DOCUMENTADOR DE FALLAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 550, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INFORMACION DOCUMENTADOR:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 330, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SOLUCION:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 100, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("INFORMACION FALLA:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 220, -1));

        txt_nomusuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_nomusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nomusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, 180, 30));

        cbx_dep.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbx_dep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRODUCCION", "SOPORTE TECNICO", "INGENIERIA" }));
        cbx_dep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_depActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, 180, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EQUIPO:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 90, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DEPARTAMENTO:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 130, 40));

        cbx_modeloeq.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbx_modeloeq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CJ4R", "CJ8K", "CJBT", "CJ4LA", "CJ500" }));
        cbx_modeloeq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_modeloeqActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_modeloeq, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 130, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NUMERO SERIE:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 120, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MODELO:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 70, 40));

        txtarea_solucion.setColumns(20);
        txtarea_solucion.setRows(5);
        jScrollPane1.setViewportView(txtarea_solucion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 220, 60));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DEPARTAMENTO:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 130, 40));

        txtarea_descfalla.setColumns(20);
        txtarea_descfalla.setRows(5);
        jScrollPane2.setViewportView(txtarea_descfalla);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 220, 60));

        txt_numserie.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_numserie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numserieActionPerformed(evt);
            }
        });
        getContentPane().add(txt_numserie, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 130, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("DESCRIBE FALLA:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 150, 40));

        cbx_departamentoeq.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbx_departamentoeq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRODUCCION", "GARANTIA", "REPARACION" }));
        cbx_departamentoeq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_departamentoeqActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_departamentoeq, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 130, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("NOMBRE DOCUMENTADOR:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 200, 40));

        btn_modificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_modificar.setText("MODIFICAR");
        getContentPane().add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 110, -1));

        btn_guardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_guardar.setText("GUARDAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, -1, -1));

        btn_buscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_buscar.setText("BUSCAR");
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 320, -1, -1));

        btn_limpiar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_limpiar1.setText("LIMPIAR");
        getContentPane().add(btn_limpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 90, -1));

        btn_salir1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_salir1.setText("SALIR");
        getContentPane().add(btn_salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, -1, -1));

        txt_id.setEnabled(false);
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 320, 80, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Domain/IMAGES/black_protcols.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 1080, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_depActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_depActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_depActionPerformed

    private void txt_nomusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomusuarioActionPerformed

    private void cbx_modeloeqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_modeloeqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_modeloeqActionPerformed

    private void txt_numserieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numserieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numserieActionPerformed

    private void cbx_departamentoeqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_departamentoeqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_departamentoeqActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
   Connection con  = getConnection();
   PreparedStatement ps = null;
    PreparedStatement ps2 = null;
    PreparedStatement ps3 = null;
        try{
            con.setAutoCommit(false);     
        ps=con.prepareStatement("INSERT INTO reportes_bd.equipo (nombre_equipo,num_serie,departamento)VALUES(?,?,?)");
        ps2=con.prepareStatement("INSERT INTO reportes_bd.fallas (descripcion,solucion)VALUES(?,?)");
        ps3=con.prepareStatement("INSERT INTO reportes_bd.usuario (nombre,departamento)VALUES(?,?)");
        ps.setString(1,cbx_modeloeq.getSelectedItem().toString());
        ps.setString(2,txt_numserie.getText());
        ps.setString(3,cbx_departamentoeq.getSelectedItem().toString());
        ps.executeUpdate();
        ps2.setString(1,txtarea_descfalla.getText());
        ps2.setString(2,txtarea_solucion.getText());
        ps2.executeUpdate();
        ps3.setString(1,txt_nomusuario.getText());
        ps3.setString(2,cbx_dep.getSelectedItem().toString());
        ps3.executeUpdate();
        
        con.commit();
        
           int  res = ps.executeUpdate();
        int  res2 = ps2.executeUpdate();
        int  res3 = ps3.executeUpdate();
        if(res > 0&&res2>0&&res3>0){
            JOptionPane.showMessageDialog(null, "Se guardo Reporte Exitosamente");
        }else{
         JOptionPane.showMessageDialog(null, "Error al guardar reporte");
        }
        }catch(SQLException ex){
        System.err.println("ERROR: " + ex.getMessage());
        if(con!=null)
            {
                System.out.println("Rollback");
               try {
                   //deshace todos los cambios realizados en los datos
                    con.rollback();
                } catch (SQLException ex1) {
                     System.err.println( "No se pudo deshacer" + ex1.getMessage() );    
                 }
             }  
        }finally{
           System.out.println( "cierra conexion a la base de datos" );    
            try {
               if(ps!=null) ps.close();                
                if(ps2!=null) ps2.close();                
                if(ps3!=null) ps3.close();  
               if(con!=null) con.close();
            } catch (SQLException ex) {
                System.err.println( ex.getMessage() );    
            }
        }
        
    }//GEN-LAST:event_btn_guardarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel_documentacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar1;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_salir1;
    private javax.swing.JComboBox<String> cbx_dep;
    private javax.swing.JComboBox<String> cbx_departamentoeq;
    private javax.swing.JComboBox<String> cbx_modeloeq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_id;
    private javax.swing.JFormattedTextField txt_nomusuario;
    private javax.swing.JFormattedTextField txt_numserie;
    private javax.swing.JTextArea txtarea_descfalla;
    private javax.swing.JTextArea txtarea_solucion;
    // End of variables declaration//GEN-END:variables
}
