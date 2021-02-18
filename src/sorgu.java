
import java.awt.Color;
import java.awt.Font;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class sorgu extends javax.swing.JFrame {

   
    public sorgu() {
        initComponents();
        clock();
        findUsers(txtplaka3.getText(),"plaka");
        
        setBackground(new Color(0,0,0));
        table1.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        table1.getTableHeader().setOpaque(false);
        table1.getTableHeader().setBackground(new Color (32,136,203));
        table1.getTableHeader().setForeground(new Color(255,255,255));
        table1.setRowHeight(25);

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
    
    public Connection getConnection(){
    
        Connection con = null;
        
        
        try{
        
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oguzhan2", "root","");
            
        }
        
        catch(Exception ex){
        
            System.out.println(ex.getMessage());
        
        }
        
        return con;
    
    }
    
    public ArrayList<User> ListUsers(String ValToSearch,String gelenKriter){
    
        ArrayList<User> usersList = new ArrayList<User>();
        
        
        Statement st;
        ResultSet rs;
        
        
        try{
        
            Connection con = getConnection();
            st = con.createStatement();
            
            String searchQuery = "SELECT * FROM `tablo` WHERE CONCAT(`"+gelenKriter+"`)LIKE'%"+ValToSearch+"%'";
           
            
            rs = st.executeQuery(searchQuery);
          
            
            User user;
            
            while(rs.next()){
            
                user = new User(
                
                        rs.getString("plaka"),
                        rs.getString("adsoyad"),
                        rs.getInt("agirlik"),
                        rs.getString("girissaat"),
                        rs.getString("cikissaat")
                        
                
                );
                
                usersList.add(user);
            
            }
        
        }
        
        catch(Exception ex){
            
            System.out.println(ex.getMessage());
        
        
        }
        
    
        return usersList;
    }
    
    

    public void findUsers(String text,String kriter){
    
        
            
        
        
        ArrayList<User> users = ListUsers(text,kriter);
       
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"plaka","adsoyad","agirlik","girissaat","cikissaat"});
        Object[] row = new Object[5];
        
        for (int i = 0; i < users.size(); i++) {
            
            row[0] = users.get(i).getPLAKA();
            row[1] = users.get(i).getADSOYAD();
            row[2] = users.get(i).getAGIRLIK();
            row[3] = users.get(i).getSAAT();
            row[4] = users.get(i).getSAATT();
            model.addRow(row);
            
        }
        
        table1.setModel(model);
    
    }
    
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtplaka3 = new javax.swing.JTextField();
        txtadsoyad3 = new javax.swing.JTextField();
        txtagirlik3 = new javax.swing.JTextField();
        txtgirissaat3 = new javax.swing.JTextField();
        btnsorgula1 = new javax.swing.JButton();
        btnsorgula2 = new javax.swing.JButton();
        btnsorgula3 = new javax.swing.JButton();
        btnsorgula4 = new javax.swing.JButton();
        btn_off1 = new javax.swing.JButton();
        btn_giris = new javax.swing.JButton();
        btn_cikis1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtcikissaat2 = new javax.swing.JTextField();
        btnsorgula5 = new javax.swing.JButton();
        saat = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("PLAKA ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("AD SOYAD  ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("AGIRLIK  ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("GİRİS SAATİ ");

        txtadsoyad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtadsoyad3ActionPerformed(evt);
            }
        });

        btnsorgula1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/sorgula.png"))); // NOI18N
        btnsorgula1.setBorderPainted(false);
        btnsorgula1.setContentAreaFilled(false);
        btnsorgula1.setFocusable(false);
        btnsorgula1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnsorgula1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnsorgula1MouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsorgula1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsorgula1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsorgula1MouseExited(evt);
            }
        });
        btnsorgula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsorgula1ActionPerformed(evt);
            }
        });

        btnsorgula2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/sorgula.png"))); // NOI18N
        btnsorgula2.setBorderPainted(false);
        btnsorgula2.setContentAreaFilled(false);
        btnsorgula2.setDefaultCapable(false);
        btnsorgula2.setFocusable(false);
        btnsorgula2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsorgula2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsorgula2MouseExited(evt);
            }
        });
        btnsorgula2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsorgula2ActionPerformed(evt);
            }
        });

        btnsorgula3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/sorgula.png"))); // NOI18N
        btnsorgula3.setBorderPainted(false);
        btnsorgula3.setContentAreaFilled(false);
        btnsorgula3.setFocusable(false);
        btnsorgula3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsorgula3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsorgula3MouseExited(evt);
            }
        });
        btnsorgula3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsorgula3ActionPerformed(evt);
            }
        });

        btnsorgula4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/sorgula.png"))); // NOI18N
        btnsorgula4.setBorderPainted(false);
        btnsorgula4.setContentAreaFilled(false);
        btnsorgula4.setFocusable(false);
        btnsorgula4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsorgula4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsorgula4MouseExited(evt);
            }
        });
        btnsorgula4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsorgula4ActionPerformed(evt);
            }
        });

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

        btn_giris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/girisbtn22.png"))); // NOI18N
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

        btn_cikis1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/cikisbtn22.png"))); // NOI18N
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

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 165, 0));
        jLabel5.setText("SORGU");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLAKA", "AD SOYAD", "AGIRLIK", "GIRIS SAATİ", "CIKIS SAATI"
            }
        ));
        table1.setFocusable(false);
        table1.setSelectionBackground(new java.awt.Color(255, 255, 0));
        table1.setShowVerticalLines(false);
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("ÇIKIŞ SAATİ ");

        btnsorgula5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/sorgula.png"))); // NOI18N
        btnsorgula5.setBorderPainted(false);
        btnsorgula5.setContentAreaFilled(false);
        btnsorgula5.setFocusable(false);
        btnsorgula5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsorgula5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsorgula5MouseExited(evt);
            }
        });
        btnsorgula5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsorgula5ActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(btn_giris, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cikis1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel5)
                        .addGap(52, 52, 52)
                        .addComponent(saat))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1)
                        .addGap(246, 246, 246)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtplaka3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)
                        .addComponent(txtagirlik3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnsorgula1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)
                        .addComponent(btnsorgula3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addGap(226, 226, 226)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtadsoyad3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)
                        .addComponent(txtgirissaat3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnsorgula2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(btnsorgula4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(468, 468, 468)
                .addComponent(jLabel6))
            .addGroup(layout.createSequentialGroup()
                .addGap(436, 436, 436)
                .addComponent(txtcikissaat2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(436, 436, 436)
                .addComponent(btnsorgula5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(579, 579, 579)
                .addComponent(btn_off1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(49, 49, 49)
                        .addComponent(btn_giris, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)
                        .addComponent(btn_cikis1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(saat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtplaka3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtagirlik3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnsorgula1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsorgula3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtadsoyad3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgirissaat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnsorgula2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsorgula4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabel6)
                .addGap(7, 7, 7)
                .addComponent(txtcikissaat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsorgula5)
                    .addComponent(btn_off1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsorgula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsorgula1ActionPerformed
      
        
        findUsers(txtplaka3.getText(),"plaka");
       
        
    }//GEN-LAST:event_btnsorgula1ActionPerformed

    private void btnsorgula3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsorgula3ActionPerformed
        findUsers(txtagirlik3.getText(),"agirlik");
    }//GEN-LAST:event_btnsorgula3ActionPerformed

    private void btnsorgula2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsorgula2ActionPerformed
        findUsers(txtadsoyad3.getText(),"adsoyad");
    }//GEN-LAST:event_btnsorgula2ActionPerformed

    private void btnsorgula4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsorgula4ActionPerformed
       findUsers(txtgirissaat3.getText(),"girissaat");
    }//GEN-LAST:event_btnsorgula4ActionPerformed

    private void btn_cikis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cikis1ActionPerformed
        
                cikis cks = new cikis();
                cks.setVisible(true);
                setVisible(false);
        
        
    }//GEN-LAST:event_btn_cikis1ActionPerformed

    private void btn_girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_girisActionPerformed
                
                giris grs = new giris();
                grs.setVisible(true);
                setVisible(false);
    }//GEN-LAST:event_btn_girisActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked

        int i = table1.getSelectedRow();
        TableModel model = table1.getModel();

        txtplaka3.setText(model.getValueAt(i,0).toString());
        txtadsoyad3.setText(model.getValueAt(i,1).toString());
        txtagirlik3.setText(model.getValueAt(i,2).toString());
        txtgirissaat3.setText(model.getValueAt(i,3).toString());
        txtcikissaat2.setText(model.getValueAt(i,4).toString());

    }//GEN-LAST:event_table1MouseClicked

    private void btn_off1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_off1ActionPerformed
        int YesOrNo = JOptionPane.showConfirmDialog(null, "Uygulamayı Kapatmak İstediğinize Emin Misiniz?","ÇIKIŞ İŞLEMİ",JOptionPane.YES_NO_OPTION);
      
      if(YesOrNo==0){
      
          this.dispose();
      }
      
      else{
      
      
      }
    }//GEN-LAST:event_btn_off1ActionPerformed

    private void btnsorgula1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsorgula1MouseEntered
          
        btnsorgula1.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/sorgula2.png")));
    }//GEN-LAST:event_btnsorgula1MouseEntered

    private void btnsorgula1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsorgula1MouseExited
         
        btnsorgula1.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/sorgula.png")));
    }//GEN-LAST:event_btnsorgula1MouseExited

    private void btnsorgula3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsorgula3MouseEntered
        
        btnsorgula3.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/sorgula2.png")));
    }//GEN-LAST:event_btnsorgula3MouseEntered

    private void btnsorgula3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsorgula3MouseExited
        btnsorgula3.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/sorgula.png")));
    }//GEN-LAST:event_btnsorgula3MouseExited

    private void btnsorgula2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsorgula2MouseEntered
        
        btnsorgula2.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/sorgula2.png")));
    }//GEN-LAST:event_btnsorgula2MouseEntered

    private void btnsorgula2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsorgula2MouseExited
        btnsorgula2.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/sorgula.png")));
    }//GEN-LAST:event_btnsorgula2MouseExited

    private void btnsorgula4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsorgula4MouseEntered
        
        btnsorgula4.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/sorgula2.png")));
    }//GEN-LAST:event_btnsorgula4MouseEntered

    private void btnsorgula4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsorgula4MouseExited
       btnsorgula4.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/sorgula.png")));
    }//GEN-LAST:event_btnsorgula4MouseExited

    private void btnsorgula1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsorgula1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsorgula1MouseClicked

    private void btnsorgula1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsorgula1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsorgula1MousePressed

    private void btnsorgula1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsorgula1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsorgula1MouseReleased

    private void btn_off1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_off1MouseEntered
       
        btn_off1.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/offbutton2.png")));
    }//GEN-LAST:event_btn_off1MouseEntered

    private void btn_off1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_off1MouseExited
        btn_off1.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/offbutton.png")));
    }//GEN-LAST:event_btn_off1MouseExited

    private void btn_girisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_girisMouseEntered
        btn_giris.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/girisbtnn.png")));
    }//GEN-LAST:event_btn_girisMouseEntered

    private void btn_girisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_girisMouseExited
        btn_giris.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/girisbtn22.png")));
    }//GEN-LAST:event_btn_girisMouseExited

    private void btn_cikis1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cikis1MouseExited
        btn_cikis1.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/cikisbtn22.png")));
    }//GEN-LAST:event_btn_cikis1MouseExited

    private void btn_cikis1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cikis1MouseEntered
        btn_cikis1.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/cikisbtnn.png")));
    }//GEN-LAST:event_btn_cikis1MouseEntered

    private void txtadsoyad3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtadsoyad3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtadsoyad3ActionPerformed

    private void btnsorgula5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsorgula5ActionPerformed
        
        findUsers(txtcikissaat2.getText(),"cikissaat");
    }//GEN-LAST:event_btnsorgula5ActionPerformed

    private void btnsorgula5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsorgula5MouseEntered
        btnsorgula5.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/sorgula2.png")));
    }//GEN-LAST:event_btnsorgula5MouseEntered

    private void btnsorgula5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsorgula5MouseExited
        btnsorgula5.setIcon(new javax.swing.ImageIcon(getClass().getResource("button/sorgula.png")));
    }//GEN-LAST:event_btnsorgula5MouseExited

   
    
    public static void main(String args[]) {
      
        
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
            java.util.logging.Logger.getLogger(sorgu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sorgu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sorgu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sorgu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sorgu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cikis1;
    private javax.swing.JButton btn_giris;
    private javax.swing.JButton btn_off1;
    private javax.swing.JButton btnsorgula1;
    private javax.swing.JButton btnsorgula2;
    private javax.swing.JButton btnsorgula3;
    private javax.swing.JButton btnsorgula4;
    private javax.swing.JButton btnsorgula5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel saat;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txtadsoyad3;
    private javax.swing.JTextField txtagirlik3;
    private javax.swing.JTextField txtcikissaat2;
    private javax.swing.JTextField txtgirissaat3;
    private javax.swing.JTextField txtplaka3;
    // End of variables declaration//GEN-END:variables
}
