
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

public class giris extends javax.swing.JFrame {

    
    public giris() {
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
    
    String girissaat;
    
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
        
                             girissaat = "  "+hour+"."+minute+"."+second;
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_off = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtplaka1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtagirlik1 = new javax.swing.JTextField();
        txtadsoyad1 = new javax.swing.JTextField();
        btn_off1 = new javax.swing.JButton();
        btn_cikis = new javax.swing.JButton();
        btn_cikis1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        btnkaydet1 = new javax.swing.JButton();
        saat = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PLAKA : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("AD SOYAD :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("AĞIRLIK :");

        txtplaka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtplaka1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(3, 192, 60));
        jLabel6.setText("GİRİŞ");

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

        btn_cikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/cikisbtn22.png"))); // NOI18N
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

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLAKA", "AD SOYAD", "AGIRLIK", "GİRİS SAATI", "CIKIS SAATİ"
            }
        ));
        table1.setFocusable(false);
        table1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        table1.setRowHeight(25);
        table1.setSelectionBackground(new java.awt.Color(255, 255, 0));
        table1.setShowVerticalLines(false);
        table1.getTableHeader().setReorderingAllowed(false);
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        btnkaydet1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/kaydet.png"))); // NOI18N
        btnkaydet1.setBorderPainted(false);
        btnkaydet1.setContentAreaFilled(false);
        btnkaydet1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnkaydet1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnkaydet1MouseExited(evt);
            }
        });
        btnkaydet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaydet1ActionPerformed(evt);
            }
        });

        saat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saat.setText("saat");

        jLabel5.setText("Oğuzhan ÇİNKAYA 181307045");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addGap(757, 757, 757)
                .addComponent(saat))
            .addGroup(layout.createSequentialGroup()
                .addGap(372, 372, 372)
                .addComponent(jLabel6))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cikis1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtplaka1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtadsoyad1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtagirlik1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkaydet1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1006, 1006, 1006)
                .addComponent(btn_off1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5))
                    .addComponent(saat))
                .addGap(8, 8, 8)
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btn_cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205)
                        .addComponent(btn_cikis1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(txtplaka1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtadsoyad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(txtagirlik1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(btnkaydet1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btn_off1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
       
        int i = table1.getSelectedRow();
        TableModel model = table1.getModel();
        
        txtplaka1.setText(model.getValueAt(i,0).toString());
        txtadsoyad1.setText(model.getValueAt(i,1).toString());
        txtagirlik1.setText(model.getValueAt(i,2).toString());

        
    }//GEN-LAST:event_table1MouseClicked

    
    Connection con;
    
    PreparedStatement insert;
    
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
    
    private void btnkaydet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaydet1ActionPerformed

        
        
        String plaka = txtplaka1.getText();
        String adsoyad = txtadsoyad1.getText();
        String agirlik = txtagirlik1.getText();
        String cikissaat ="-";   
        
        try{
            
            
            Class.forName("com.mysql.jdbc.Driver");
            
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/oguzhan2", "root","");
         
            insert = con.prepareStatement("insert into tablo(plaka,adsoyad,agirlik,girissaat,cikissaat)values(?,?,?,?,?)");
            insert.setString(1,plaka);
            insert.setString(2,adsoyad);
            insert.setString(3,agirlik);
            insert.setString(4,girissaat);
            insert.setString(5,cikissaat);
            
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"GİRİŞ KAYDEDİLDİ");
            
            table_update();
            
            txtplaka1.setText("");
            txtadsoyad1.setText("");
            txtagirlik1.setText("");
            
            }
                         
               catch(ClassNotFoundException ex){
                  
                  Logger.getLogger(giris.class.getName()).log(Level.SEVERE,null,ex);
                   
               }
        
        catch(SQLException ex){
        
            Logger.getLogger(giris.class.getName()).log(Level.SEVERE,null,ex);
         JOptionPane.showMessageDialog(this,"Girdiğiniz Değerleri Kontrol Ediniz!");
        }
        
        
    }//GEN-LAST:event_btnkaydet1ActionPerformed

    private void txtplaka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtplaka1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtplaka1ActionPerformed

    private void btn_cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cikisActionPerformed
      
                cikis cks = new cikis();
                cks.setVisible(true);
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

    private void btnkaydet1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkaydet1MouseEntered
        
        btnkaydet1.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/kaydet2.png")));
    }//GEN-LAST:event_btnkaydet1MouseEntered

    private void btnkaydet1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkaydet1MouseExited
        
        btnkaydet1.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/kaydet.png")));
    }//GEN-LAST:event_btnkaydet1MouseExited

    private void btn_off1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_off1MouseEntered
        
        btn_off1.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/offbutton2.png")));
    }//GEN-LAST:event_btn_off1MouseEntered

    private void btn_off1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_off1MouseExited
        
        btn_off1.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/offbutton.png")));
    }//GEN-LAST:event_btn_off1MouseExited

    private void btn_cikisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cikisMouseEntered
        
        btn_cikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/cikisbtnn.png")));
        
    }//GEN-LAST:event_btn_cikisMouseEntered

    private void btn_cikisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cikisMouseExited
        btn_cikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/cikisbtn22.png")));
    }//GEN-LAST:event_btn_cikisMouseExited

    private void btn_cikis1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cikis1MouseEntered
        
        btn_cikis1.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/sorgubtnn.png")));
    }//GEN-LAST:event_btn_cikis1MouseEntered

    private void btn_cikis1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cikis1MouseExited
       btn_cikis1.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/sorgubtn22.png")));
    }//GEN-LAST:event_btn_cikis1MouseExited

    
    
    public static void main(String args[]) {
       
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new giris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cikis;
    private javax.swing.JButton btn_cikis1;
    private javax.swing.JButton btn_off;
    private javax.swing.JButton btn_off1;
    private javax.swing.JButton btnkaydet1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel saat;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txtadsoyad1;
    private javax.swing.JTextField txtagirlik1;
    private javax.swing.JTextField txtplaka1;
    // End of variables declaration//GEN-END:variables

}
