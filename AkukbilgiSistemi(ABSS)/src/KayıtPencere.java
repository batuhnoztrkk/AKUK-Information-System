
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.Types.NULL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author batu-
 */
public class KayıtPencere extends javax.swing.JFrame {

    /**
     * Creates new form KayıtPencere
     */
    public KayıtPencere() {
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

        jLabel11 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_ad = new javax.swing.JTextField();
        jTextField_soyad = new javax.swing.JTextField();
        jTextField_kullanıcıadı = new javax.swing.JTextField();
        jTextField_eposta = new javax.swing.JTextField();
        jPasswordField_şifre = new javax.swing.JPasswordField();
        jPasswordField_onayşifre = new javax.swing.JPasswordField();
        jPasswordField_özelkod = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonregdenmenüye = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField_telefon = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField_okulno = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldDurum = new javax.swing.JTextField();

        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jDesktopPane1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kayıt Ol :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Ad :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Soyad :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Kullanıcı Adı :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("E-posta :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("Şifre :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 255));
        jLabel7.setText("Şifre Onay :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("Özel Kod :");

        jTextField_ad.setBackground(new java.awt.Color(204, 204, 255));

        jTextField_soyad.setBackground(new java.awt.Color(204, 204, 255));
        jTextField_soyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_soyadActionPerformed(evt);
            }
        });

        jTextField_kullanıcıadı.setBackground(new java.awt.Color(204, 204, 255));
        jTextField_kullanıcıadı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_kullanıcıadıActionPerformed(evt);
            }
        });

        jTextField_eposta.setBackground(new java.awt.Color(204, 204, 255));

        jPasswordField_şifre.setBackground(new java.awt.Color(204, 204, 255));
        jPasswordField_şifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_şifreActionPerformed(evt);
            }
        });

        jPasswordField_onayşifre.setBackground(new java.awt.Color(204, 204, 255));

        jPasswordField_özelkod.setBackground(new java.awt.Color(204, 204, 255));

        jLabel13.setText("jLabel13");

        jButton1.setBackground(new java.awt.Color(240, 94, 3));
        jButton1.setText("Kayıt Ol");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonregdenmenüye.setBackground(new java.awt.Color(240, 94, 3));
        jButtonregdenmenüye.setText("Menüye Dön");
        jButtonregdenmenüye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonregdenmenüyeMouseClicked(evt);
            }
        });
        jButtonregdenmenüye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonregdenmenüyeActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 255));
        jLabel9.setText("Telefon No :");

        jTextField_telefon.setBackground(new java.awt.Color(204, 204, 255));
        jTextField_telefon.setText("050XXXXXXXX");
        jTextField_telefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_telefonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 255));
        jLabel10.setText("Okul numarası :");

        jTextField_okulno.setBackground(new java.awt.Color(204, 204, 255));

        jLabel12.setForeground(new java.awt.Color(204, 204, 255));
        jLabel12.setText("Durum (Tıklayınız)  :");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jTextFieldDurum.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldDurum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDurumActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField_ad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField_soyad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField_kullanıcıadı, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField_eposta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPasswordField_şifre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPasswordField_onayşifre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPasswordField_özelkod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButtonregdenmenüye, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField_telefon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField_okulno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextFieldDurum, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addComponent(jButtonregdenmenüye)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPasswordField_özelkod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(jPasswordField_onayşifre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addComponent(jPasswordField_şifre, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_soyad)
                                    .addComponent(jTextField_kullanıcıadı)
                                    .addComponent(jTextField_eposta)
                                    .addComponent(jTextField_ad, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(jTextField_telefon)
                                    .addComponent(jTextField_okulno)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel13))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldDurum, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jDesktopPane1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPasswordField_onayşifre, jPasswordField_özelkod, jPasswordField_şifre, jTextField_ad, jTextField_eposta, jTextField_kullanıcıadı, jTextField_soyad});

        jDesktopPane1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButtonregdenmenüye});

        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_kullanıcıadı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_eposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField_okulno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldDurum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField_şifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jPasswordField_onayşifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jPasswordField_özelkod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonregdenmenüye)
                    .addComponent(jButton1))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_soyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_soyadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_soyadActionPerformed

    private void jTextField_kullanıcıadıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_kullanıcıadıActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_kullanıcıadıActionPerformed

    private void jButtonregdenmenüyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonregdenmenüyeMouseClicked
        Pencere kpı = new Pencere();
        kpı.setVisible(true);
        kpı.pack();
        kpı.setLocationRelativeTo(null);
        kpı.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonregdenmenüyeMouseClicked

    private void jTextField_telefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_telefonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_telefonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String ad = jTextField_ad.getText();
        String soyad = jTextField_soyad.getText();
        String kullanıcıadı = jTextField_kullanıcıadı.getText();
        String e_posta = jTextField_eposta.getText();
        String telefon = jTextField_telefon.getText();
        String okulno = jTextField_okulno.getText();
        String durum = jTextFieldDurum.getText();
        String sifre = String.valueOf(jPasswordField_şifre.getPassword());
        String sifreonay = String.valueOf(jPasswordField_onayşifre.getPassword());
        String ozel = String.valueOf(jPasswordField_özelkod.getPassword());
        Durak : 
    if(VerifyFields()){
        if(checkozelkod(ozel)){       
                
            if(!checkUsername(kullanıcıadı) && !checkEposta(e_posta) && !checkokulno(okulno) && !checkTelefon(telefon) ){
                    PreparedStatement ps;               
                    ResultSet rs;
                    String registerUserQuery = "INSERT INTO `kullanıcılar`(`ad`, `soyad`, `kullanıcıAdı`, `e_posta`, `telefon`, `okul_no`, `durum`, `şifre`) VALUES (?,?,?,?,?,?,?,?)";
                    
                try {
                    
                    ps = My_CNX.getConnection().prepareStatement(registerUserQuery);
                    ps.setString(1, ad);
                    ps.setString(2, soyad);
                    ps.setString(3, kullanıcıadı);
                    ps.setString(4, e_posta);
                    ps.setString(5, telefon);
                    ps.setString(6, okulno);
                    ps.setString(7, durum);
                    ps.setString(8, sifre);
                    
                    ///////
                    if(ps.executeUpdate() != 0 ){
                        JOptionPane.showMessageDialog(null, "Hesap başarıyla oluşturuldu.Hoşgeldiniz --|"+ad+""+soyad+"|-- .Lütfen giriş yapınız.","Hesap Oluşturuldu",1);
                        
                                Pencere kp = new Pencere();
                                kp.setVisible(true);
                                kp.pack();
                                kp.setLocationRelativeTo(null);
                                kp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                this.dispose();
                        
                    }
                    
                    else{
                        JOptionPane.showMessageDialog(null, "Hesap oluşturulamadı!!");
                    }

                    
                    } 
                catch (SQLException ex) {
                    Logger.getLogger(KayıtPencere.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        
        }else{
            JOptionPane.showMessageDialog(null, "Özel kod için iletişim ---> İnstagram : dpuakuk03 ","Özel Kod Hatası",2);
            
        }      }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldDurumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDurumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDurumActionPerformed

    private void jPasswordField_şifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_şifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_şifreActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        JOptionPane.showMessageDialog(null, "Durum nedir ?. Durum klübümüzdeki statünüzü belirler. Doğru girmeye özen gösteriniz aksi takdirde hesabınız silinir.Bunlardan biriniz yazınız --> (Üye Değilim , Yeni Üye , Üye , Asil Üye , Eski Üye , Yönetim)");
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jButtonregdenmenüyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonregdenmenüyeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonregdenmenüyeActionPerformed
    
    
    public boolean VerifyFields(){
    
        String ad = jTextField_ad.getText();
        String soyad = jTextField_soyad.getText();
        String k_adı = jTextField_kullanıcıadı.getText();
        String e_posta = jTextField_eposta.getText();
        String telefon = jTextField_telefon.getText();
        String okul_no = jTextField_okulno.getText();
        String durum = jTextFieldDurum.getText();
        String sifre = String.valueOf(jPasswordField_şifre.getPassword());
        String sifre_onay = String.valueOf(jPasswordField_onayşifre.getPassword());
        String ozelkod = String.valueOf(jPasswordField_özelkod.getPassword());
        String Üye = "Üye";
        String YeniÜye = "Yeni Üye";
        String AsilÜye = "Asil Üye";
        String EskiÜye = "Eski Üye";
        String Yönetim = "Yönetim";
        String ÜyeDeğil = "Üye Değilim";
        
        
        if(ad.trim().equals("") || soyad.trim().equals("") || k_adı.trim().equals("") || e_posta.trim().equals("") || telefon.trim().equals("") ||
           okul_no.trim().equals("") || sifre.trim().equals("") || sifre_onay.trim().equals("") || ozelkod.trim().equals("") || durum.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Bir veya daha fazla alan boş!","Boş alan",2);
            return false;
        }
        else if(!sifre.equals(sifre_onay)){
            JOptionPane.showMessageDialog(null, "Girdiğiniz şifreler uyuşmuyor lütfen kontrol ediniz.","Şifre onay",2);
            return false;
        }
        else if(sifre.length()<8){
            JOptionPane.showMessageDialog(null, "Şifre en az 8 haneli olmalıdır.Lütfen daha uzun şifre belirleyiniz.","Basit Şifre",2);
            return false;
        }
        else if(okul_no.length()>12){
            JOptionPane.showMessageDialog(null, "Okul numarası 12 haneden büyük olamaz.","Hatalı Okul Numarası",2);
            return false;
        }
        else if(okul_no.length()<=11){
            JOptionPane.showMessageDialog(null, "Okul numarası 11 haneden küçük olamaz.","Hatalı Okul Numarası",2);
            return false;
        }
        else if(telefon.length()>11){
            JOptionPane.showMessageDialog(null, "Telefon numarası 11 haneden büyük olamaz ","Hatalı Telefon Numarası",2);
            return false;
        }
        else if(telefon.length()<=10){
            JOptionPane.showMessageDialog(null, "Telefon numarası 10 haneden küçük olamaz.(Telefon numarasının başına 0 ekleyiniz.) ","Hatalı Telefon Numarası",2);
            return false;
        }
        else if (durum.equals(ÜyeDeğil)){
            JOptionPane.showMessageDialog(null, "Sende klubümüze kayıt olmak istermisin? Hemen binamıza gelip kayıt olabilirsin :)","Aramızda Görmek İsteriz",2);
            return true ;
        }
        else if(!durum.equals(Üye)&& !durum.equals(YeniÜye) && !durum.equals(AsilÜye) && !durum.equals(Yönetim) && !durum.equals(EskiÜye)){
            
            JOptionPane.showMessageDialog(null, "Hatalı durum lütfen küçük büyük harfe dikkat ediniz(Üye , Yeni Üye , Asil Üye , Yönetim , Üye Değilim)Birini yazınız.","Hatalı Durum",2); 
            return false;
        }

        
        else{
            return true;
        }
       
        
    }
    
    public boolean checkEposta(String e_posta) {
    
        PreparedStatement st;
        ResultSet rs;
        boolean e_posta_exist = false;
        
        String query = "SELECT * FROM `kullanıcılar` WHERE `e_posta` = ?";
        
        try {
            st = My_CNX.getConnection().prepareStatement(query);
            st.setString(1, e_posta);
            rs = st.executeQuery();

            if(rs.next()){
                e_posta_exist = true;
                JOptionPane.showMessageDialog(null, "Bu e-posta ile daha önce kayıt olunmuş.(Şifrenizi unuttuysanız yönetimle iletişime geçin.)", "E-Posta", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(KayıtPencere.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return e_posta_exist;
    }
     
    public boolean checkUsername(String username) {
    
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;
        
        String query = "SELECT * FROM `kullanıcılar` WHERE `kullanıcıAdı` = ?";
        
        try {
            st = My_CNX.getConnection().prepareStatement(query);
            st.setString(1, username);
            rs = st.executeQuery();
            
            if(rs.next()){
                username_exist = true;
                JOptionPane.showMessageDialog(null, "Bu kullanıcı zaten adı alınmış", "kullanıcı Adı", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(KayıtPencere.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return username_exist;
    }
    
    
     public boolean checkTelefon(String telefon) {
    
        PreparedStatement st;
        ResultSet rs;
        boolean telefon_exist = false;
        
        String query = "SELECT * FROM `kullanıcılar` WHERE `telefon` = ?";
        
        try {
            st = My_CNX.getConnection().prepareStatement(query);
            
            st.setString(1, telefon);
            rs = st.executeQuery();
            if(rs.next()){
                telefon_exist = true;
                JOptionPane.showMessageDialog(null, "Bu telefon daha önce alınmış.", "Telefon Alınmış", 2);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(KayıtPencere.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
        return telefon_exist;
    }
        
         public boolean checkokulno(String okulno) {
    
        PreparedStatement st;
        ResultSet rs;
        boolean okulno_exist = false;
        
        String query = "SELECT * FROM `kullanıcılar` WHERE `okul_no` = ?";
        
        try {
            st = My_CNX.getConnection().prepareStatement(query);
            
            st.setString(1, okulno);
            rs = st.executeQuery();
            if(rs.next()){
                okulno_exist = true;
                JOptionPane.showMessageDialog(null, "Bu Okul numarası daha önce kullanılmış.", "Okul Numarası", 2);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(KayıtPencere.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
        return okulno_exist;
    }
         
         
         public boolean checkozelkod(String ozel) {
    
        PreparedStatement st;
        ResultSet rs;
        boolean Şifreler = true;
        
        String query = "SELECT * FROM `şifreler` WHERE `Özelkod` = ?";
        
        try {
            st = My_CNX.getConnection().prepareStatement(query);
            st.setString(1, ozel);
            rs = st.executeQuery();

            if(!rs.next()){
                Şifreler = false;
                JOptionPane.showMessageDialog(null, "Özel Kod Hatalı(Özel Kod Sadece Klüp Yöneticilerinde Vardır.)","ÖZEL KOD HATALI",2);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(KayıtPencere.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return Şifreler;
    }

    
    
        
    
    
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
            java.util.logging.Logger.getLogger(KayıtPencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KayıtPencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KayıtPencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KayıtPencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KayıtPencere().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonregdenmenüye;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField_onayşifre;
    private javax.swing.JPasswordField jPasswordField_özelkod;
    private javax.swing.JPasswordField jPasswordField_şifre;
    private javax.swing.JTextField jTextFieldDurum;
    private javax.swing.JTextField jTextField_ad;
    private javax.swing.JTextField jTextField_eposta;
    private javax.swing.JTextField jTextField_kullanıcıadı;
    private javax.swing.JTextField jTextField_okulno;
    private javax.swing.JTextField jTextField_soyad;
    private javax.swing.JTextField jTextField_telefon;
    // End of variables declaration//GEN-END:variables
}
