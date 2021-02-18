
import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class menu extends javax.swing.JFrame {

   
    public menu() {
        initComponents();
        clock();
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
        btn_cikis = new javax.swing.JButton();
        btn_off = new javax.swing.JButton();
        btn_giris = new javax.swing.JButton();
        btn_sorgu = new javax.swing.JButton();
        saat = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("    HOŞ GELDİNİZ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 24, 486, 103));

        btn_cikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/cikisbtn2.png"))); // NOI18N
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
        getContentPane().add(btn_cikis, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 271, 150, 88));

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

        btn_giris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/girisbtn2.png"))); // NOI18N
        btn_giris.setBorderPainted(false);
        btn_giris.setContentAreaFilled(false);
        btn_giris.setFocusable(false);
        btn_giris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_girisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_girisMouseExited(evt);
            }
        });
        btn_giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_girisActionPerformed(evt);
            }
        });
        getContentPane().add(btn_giris, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 271, 150, 88));

        btn_sorgu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/sorgubtn2.png"))); // NOI18N
        btn_sorgu.setBorderPainted(false);
        btn_sorgu.setContentAreaFilled(false);
        btn_sorgu.setFocusable(false);
        btn_sorgu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_sorguMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_sorguMouseExited(evt);
            }
        });
        btn_sorgu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sorguActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sorgu, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 271, 150, 88));

        saat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saat.setText("SAAT");
        getContentPane().add(saat, new org.netbeans.lib.awtextra.AbsoluteConstraints(841, 13, -1, -1));

        jLabel2.setText("Oğuzhan ÇİNKAYA 181307045");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/volvo.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_girisActionPerformed
       
        
               giris grs = new giris();
                grs.setVisible(true);
                setVisible(false);
        
        
    }//GEN-LAST:event_btn_girisActionPerformed

    private void btn_cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cikisActionPerformed
        
                cikis cks = new cikis();
                cks.setVisible(true);
                setVisible(false);
        
    }//GEN-LAST:event_btn_cikisActionPerformed

    private void btn_sorguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sorguActionPerformed
      
        
                sorgu srg = new sorgu();
                srg.setVisible(true);
                setVisible(false);
        
        
        
    }//GEN-LAST:event_btn_sorguActionPerformed

    private void btn_offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_offActionPerformed
       
        int YesOrNo = JOptionPane.showConfirmDialog(null, "Uygulamayı Kapatmak İstediğinize Emin Misiniz?","ÇIKIŞ İŞLEMİ",JOptionPane.YES_NO_OPTION);
      
      if(YesOrNo==0){
      
          this.dispose();
      }
      
      else{
      
      
      }
    }//GEN-LAST:event_btn_offActionPerformed

    private void btn_offMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_offMouseEntered
       
        btn_off.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/offbutton2.png")));
    }//GEN-LAST:event_btn_offMouseEntered

    private void btn_offMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_offMouseExited
       
        btn_off.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/offbutton.png")));
    }//GEN-LAST:event_btn_offMouseExited

    private void btn_girisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_girisMouseEntered
        
         btn_giris.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/girisbtn.png")));
        
    }//GEN-LAST:event_btn_girisMouseEntered

    private void btn_girisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_girisMouseExited
       
        btn_giris.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/girisbtn2.png")));
    }//GEN-LAST:event_btn_girisMouseExited

    private void btn_cikisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cikisMouseEntered
         
        btn_cikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/cikisbtn.png")));
    }//GEN-LAST:event_btn_cikisMouseEntered

    private void btn_cikisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cikisMouseExited
       
        btn_cikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/cikisbtn2.png")));
    }//GEN-LAST:event_btn_cikisMouseExited

    private void btn_sorguMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sorguMouseExited
       
        btn_sorgu.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/sorgubtn2.png")));
    }//GEN-LAST:event_btn_sorguMouseExited

    private void btn_sorguMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sorguMouseEntered
       btn_sorgu.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/sorgubtn.png")));
    }//GEN-LAST:event_btn_sorguMouseEntered

   
    public static void main(String args[]) {
       
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cikis;
    private javax.swing.JButton btn_giris;
    private javax.swing.JButton btn_off;
    private javax.swing.JButton btn_sorgu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel saat;
    // End of variables declaration//GEN-END:variables
}
