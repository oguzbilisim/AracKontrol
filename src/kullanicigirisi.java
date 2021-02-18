
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class kullanicigirisi extends javax.swing.JFrame {

  
    public kullanicigirisi() {
        initComponents();
        clock();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.height/2 - getHeight()/2);
        
    }
    
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
        
                             saat.setText("  "+hour+"."+minute+"."+second+"   "+day+"/"+month+"/"+day);
        
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

        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        btngiris = new javax.swing.JButton();
        lbl_username = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_off = new javax.swing.JButton();
        saat = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Kullanıcı adı: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 191, -1, -1));

        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameKeyReleased(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 216, 146, -1));

        jLabel2.setText("Sifre: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 260, -1, -1));

        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 283, 146, -1));

        btngiris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/giriss.png"))); // NOI18N
        btngiris.setBorderPainted(false);
        btngiris.setContentAreaFilled(false);
        btngiris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btngirisMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btngirisMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btngirisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btngirisMouseExited(evt);
            }
        });
        btngiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngirisActionPerformed(evt);
            }
        });
        getContentPane().add(btngiris, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 371, 146, 64));
        getContentPane().add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 216, 156, 22));
        getContentPane().add(lbl_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 283, 156, 22));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 128));
        jLabel3.setText("KANTAR UYGULAMASI");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 35, -1, -1));

        btn_off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/offbutton.png"))); // NOI18N
        btn_off.setBorderPainted(false);
        btn_off.setContentAreaFilled(false);
        btn_off.setFocusable(false);
        btn_off.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_offMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_offMouseExited(evt);
            }
        });
        btn_off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_offActionPerformed(evt);
            }
        });
        getContentPane().add(btn_off, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 550, 100, 100));

        saat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saat.setText("saat");
        getContentPane().add(saat, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, -1, -1));

        jLabel4.setText("Oğuzhan ÇİNKAYA 181307045");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 6, -1, -1));

        jLabel5.setText("(oguzhan)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 216, -1, -1));

        jLabel6.setText("(181307045)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 286, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngirisActionPerformed

        if(username.getText().trim().isEmpty()&& password.getText().trim().isEmpty()){
        lbl_username.setText("Kullanıcı adını girmediniz!");
        lbl_password.setText("Şifreyi girmediniz!");
            
        }
        else if(username.getText().trim().isEmpty()){
            
        lbl_username.setText("KKullanıcı adını girmediniz!");
        lbl_password.setText("Şifreyi girmediniz!");
            
        }
        else{
        
        try{
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/oguzhan2", "root","");
            String sql = "Select * from giris where username=? and password=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, username.getText());
            pst.setString(2, password.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
            
                JOptionPane.showMessageDialog(null, "Giris Basarılı");
                
                menu mnu = new menu();
                mnu.setVisible(true);
                setVisible(false);
                
            }
            
            else{

                JOptionPane.showMessageDialog(null, "Giriş Başarısız");
            
                username.setText("");
                password.setText("");
                
            }
            
            con.close();
                  
                  }
               catch(Exception e){
                  
                  JOptionPane.showMessageDialog(null, e);
                   
               }
        
        }
        
    }//GEN-LAST:event_btngirisActionPerformed

    private void usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyReleased
      
        lbl_username.setText("");
        
        
    }//GEN-LAST:event_usernameKeyReleased

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        
        lbl_password.setText("");
        
    }//GEN-LAST:event_passwordKeyReleased

    private void btn_offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_offActionPerformed
        
      int YesOrNo = JOptionPane.showConfirmDialog(null, "Uygulamayı Kapatmak İstediğinize Emin Misiniz?","ÇIKIŞ İŞLEMİ",JOptionPane.YES_NO_OPTION);
      
      if(YesOrNo==0){
      
          this.dispose();
      }
      
      else{
      
      
      }
        
    }//GEN-LAST:event_btn_offActionPerformed

    private void btngirisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngirisMouseEntered
        
        btngiris.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/giris2.png")));
        
    }//GEN-LAST:event_btngirisMouseEntered

    private void btngirisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngirisMouseClicked
        
    }//GEN-LAST:event_btngirisMouseClicked

    private void btngirisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngirisMousePressed
        
    }//GEN-LAST:event_btngirisMousePressed

    private void btngirisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngirisMouseExited
       btngiris.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/giriss.png")));
    }//GEN-LAST:event_btngirisMouseExited

    private void btn_offMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_offMouseEntered
       btn_off.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/offbutton2.png")));
    }//GEN-LAST:event_btn_offMouseEntered

    private void btn_offMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_offMouseExited
       btn_off.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/offbutton.png")));
    }//GEN-LAST:event_btn_offMouseExited

    
    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kullanicigirisi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_off;
    private javax.swing.JButton btngiris;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel saat;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
