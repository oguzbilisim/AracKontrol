
import java.awt.Color;
import java.awt.Font;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class cikis extends javax.swing.JFrame {

    
    public cikis() {
        initComponents();
        table_update();
        clock();
        setBackground(new Color(0,0,0));
        table1.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        table1.getTableHeader().setOpaque(false);
        table1.getTableHeader().setBackground(new Color (32,136,203));
        table1.getTableHeader().setForeground(new Color(255,255,255));
        table1.setRowHeight(25);
    }
    
    String tcikissaat;
    
    public void clock()
    {
        Thread clock = new Thread()
                {
                    public void run()
                    {
                        try {
                            for(;;){
                             Calendar cal = new GregorianCalendar();
        
                             int day = cal.get(Calendar.DAY_OF_MONTH);
                             int month = cal.get(Calendar.MONTH);
                             int year = cal.get(Calendar.YEAR);
                             int second = cal.get(Calendar.SECOND);
                             int minute = cal.get(Calendar.MINUTE);
                             int hour = cal.get(Calendar.HOUR);
        
                             tcikissaat = "  "+hour+"."+minute+"."+second;
                             saat.setText( "  "+hour+"."+minute+"."+second+"   "+day+"/"+month+"/"+day);
        
                            sleep(1000);
                            }
                        } catch (InterruptedException ex) {
                            Logger.getLogger(kullanicigirisi.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                };
        clock.start();
       
    }

    Connection con;
    
    PreparedStatement insert;
    PreparedStatement update;
    
    private void table_update(){
    
        int c;
        
        try{

            Class.forName("com.mysql.jdbc.Driver");
            
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/oguzhan2", "root","");
         
            insert = con.prepareStatement("select * from tablo");
            
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData Rss = rs.getMetaData();
            c=Rss.getColumnCount();
            
            DefaultTableModel Df = (DefaultTableModel)table1.getModel();
         
            Df.setRowCount(0);
            
            while(rs.next())
            {
            
                Vector v2 = new Vector();
                
                for(int a =1; a<=c;a++){
                
                    v2.add(rs.getString("plaka"));
                    v2.add(rs.getString("adsoyad"));
                    v2.add(rs.getString("agirlik"));
                    v2.add(rs.getString("girissaat"));
                    v2.add(rs.getString("cikissaat"));
                
                }
                
                Df.addRow(v2);
                 
            }
            
            }
                 
               catch(ClassNotFoundException ex){
                  
                  Logger.getLogger(giris.class.getName()).log(Level.SEVERE,null,ex);
                   
               }
        
        catch(SQLException ex){
        
            Logger.getLogger(giris.class.getName()).log(Level.SEVERE,null,ex);
        
        }
    
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_cikis = new javax.swing.JButton();
        btn_cikis1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtagirlik2 = new javax.swing.JTextField();
        txtadsoyad2 = new javax.swing.JTextField();
        txtplaka2 = new javax.swing.JTextField();
        btn_off1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        btncikis = new javax.swing.JButton();
        saat = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_cikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/girisbtn22.png"))); // NOI18N
        btn_cikis.setBorderPainted(false);
        btn_cikis.setContentAreaFilled(false);
        btn_cikis.setFocusable(false);
        btn_cikis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cikisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cikisMouseExited(evt);
            }
        });
        btn_cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cikisActionPerformed(evt);
            }
        });

        btn_cikis1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/sorgubtn22.png"))); // NOI18N
        btn_cikis1.setBorderPainted(false);
        btn_cikis1.setContentAreaFilled(false);
        btn_cikis1.setFocusable(false);
        btn_cikis1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cikis1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cikis1MouseExited(evt);
            }
        });
        btn_cikis1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cikis1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PLAKA : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("AD SOYAD :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("AĞIRLIK :");

        btn_off1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/offbutton.png"))); // NOI18N
        btn_off1.setBorderPainted(false);
        btn_off1.setContentAreaFilled(false);
        btn_off1.setFocusable(false);
        btn_off1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_off1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_off1MouseExited(evt);
            }
        });
        btn_off1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_off1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("ÇIKIŞ");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLAKA", "AD SOYAD", "AGIRLIK", "GIRIS SAATI", "CIKIS SAATİ"
            }
        ));
        table1.setFocusable(false);
        table1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        table1.setSelectionBackground(new java.awt.Color(255, 255, 0));
        table1.setShowVerticalLines(false);
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        btncikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/cikisbtn.png"))); // NOI18N
        btncikis.setBorderPainted(false);
        btncikis.setContentAreaFilled(false);
        btncikis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btncikisMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btncikisMouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncikisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncikisMouseExited(evt);
            }
        });
        btncikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncikisActionPerformed(evt);
            }
        });

        saat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saat.setText("saat");

        jLabel7.setText("Oğuzhan ÇİNKAYA 181307045");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addGap(637, 637, 637)
                .addComponent(saat))
            .addGroup(layout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addComponent(jLabel5))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cikis1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtplaka2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtadsoyad2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtagirlik2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncikis, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(900, 900, 900)
                .addComponent(btn_off1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7))
                    .addComponent(saat))
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btn_cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(btn_cikis1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(txtplaka2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(txtadsoyad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(txtagirlik2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149)
                        .addComponent(btncikis, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btn_off1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
String tableGirisSaat;
    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked

        int i = table1.getSelectedRow();
        TableModel model = table1.getModel();
        
        txtplaka2.setText(model.getValueAt(i,0).toString());
        txtadsoyad2.setText(model.getValueAt(i,1).toString());
        txtagirlik2.setText(model.getValueAt(i,2).toString());
        tableGirisSaat=model.getValueAt(i, 3).toString();
    }//GEN-LAST:event_table1MouseClicked

    private void btncikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncikisActionPerformed
    
        
        DefaultTableModel Df = (DefaultTableModel)table1.getModel();
        int selectedIndex = table1.getSelectedRow();
        
        
        try{
           
            
            
                Class.forName("com.mysql.jdbc.Driver");
            
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/oguzhan2", "root","");
         
            update = con.prepareStatement("update tablo set cikissaat ='"+tcikissaat+ "' where cikissaat='-' and plaka ='"+txtplaka2.getText()+"'"+" and agirlik='"+txtagirlik2.getText()+"'"+" and adsoyad='"+txtadsoyad2.getText()+"'"+" and girissaat='"+tableGirisSaat+"'");
            
            
            update.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"ÇIKIŞ YAPILDI!");
            
            table_update();
            
            txtplaka2.setText("");
            txtadsoyad2.setText("");
            txtagirlik2.setText("");
            
            
            }
       
                  
               catch(ClassNotFoundException ex){
                  
                  Logger.getLogger(giris.class.getName()).log(Level.SEVERE,null,ex);
                   
               }
        
        catch(SQLException ex){
        
            Logger.getLogger(giris.class.getName()).log(Level.SEVERE,null,ex);
        
        }
        
    }//GEN-LAST:event_btncikisActionPerformed

    private void btn_cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cikisActionPerformed
       
                giris grs = new giris();
                grs.setVisible(true);
                setVisible(false);
                
    }//GEN-LAST:event_btn_cikisActionPerformed

    private void btn_cikis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cikis1ActionPerformed
       
                sorgu srg = new sorgu();
                srg.setVisible(true);
                setVisible(false);
        
        
    }//GEN-LAST:event_btn_cikis1ActionPerformed

    private void btn_off1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_off1ActionPerformed
        int YesOrNo = JOptionPane.showConfirmDialog(null, "Uygulamayı Kapatmak İstediğinize Emin Misiniz?","ÇIKIŞ İŞLEMİ",JOptionPane.YES_NO_OPTION);
      
      if(YesOrNo==0){
      
          this.dispose();
      }
      
      else{
      
      
      }
    }//GEN-LAST:event_btn_off1ActionPerformed

    private void btncikisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncikisMousePressed
        
    }//GEN-LAST:event_btncikisMousePressed

    private void btncikisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncikisMouseReleased
       
    }//GEN-LAST:event_btncikisMouseReleased

    private void btncikisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncikisMouseExited
    
        btncikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/cikisbtn.png")));        
    }//GEN-LAST:event_btncikisMouseExited

    private void btncikisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncikisMouseEntered
        
        btncikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/cikisbtn2.png")));  
    }//GEN-LAST:event_btncikisMouseEntered

    private void btn_off1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_off1MouseEntered
        
        btn_off1.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/offbutton2.png")));
        
    }//GEN-LAST:event_btn_off1MouseEntered

    private void btn_off1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_off1MouseExited
        btn_off1.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/offbutton.png")));
    }//GEN-LAST:event_btn_off1MouseExited

    private void btn_cikisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cikisMouseEntered
        btn_cikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/girisbtnn.png")));
    }//GEN-LAST:event_btn_cikisMouseEntered

    private void btn_cikisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cikisMouseExited
        btn_cikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/girisbtn22.png")));
    }//GEN-LAST:event_btn_cikisMouseExited

    private void btn_cikis1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cikis1MouseExited
        btn_cikis1.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/sorgubtn22.png")));
    }//GEN-LAST:event_btn_cikis1MouseExited

    private void btn_cikis1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cikis1MouseEntered
         btn_cikis1.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/sorgubtnn.png")));
    }//GEN-LAST:event_btn_cikis1MouseEntered

    
    
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
            java.util.logging.Logger.getLogger(cikis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cikis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cikis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cikis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cikis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cikis;
    private javax.swing.JButton btn_cikis1;
    private javax.swing.JButton btn_off1;
    private javax.swing.JButton btncikis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel saat;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txtadsoyad2;
    private javax.swing.JTextField txtagirlik2;
    private javax.swing.JTextField txtplaka2;
    // End of variables declaration//GEN-END:variables
}
