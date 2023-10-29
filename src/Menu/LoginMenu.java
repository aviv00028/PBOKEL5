package Menu;

import Control.Admin;
import Control.Pembeli;
import Main.FormMain;
import javax.swing.JOptionPane;

public class LoginMenu extends javax.swing.JFrame {

    public LoginMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        UserNameTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        LoginBt = new javax.swing.JButton();
        PasswordTxt = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuBar = new javax.swing.JMenu();
        SigninMenu = new javax.swing.JMenuItem();
        SignupMenu = new javax.swing.JMenuItem();
        FormMain = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("USER NAME");

        UserNameTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UserNameTxt.setToolTipText("");
        UserNameTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("PASSWORD");

        LoginBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LoginBt.setText("LOGIN");
        LoginBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtActionPerformed(evt);
            }
        });

        PasswordTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PasswordTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UserNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginBt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(LoginBt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        MenuBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_settings_20px_4.png"))); // NOI18N
        MenuBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBarActionPerformed(evt);
            }
        });

        SigninMenu.setText("SIGN IN");
        MenuBar.add(SigninMenu);

        SignupMenu.setText("SIGN UP");
        SignupMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupMenuActionPerformed(evt);
            }
        });
        MenuBar.add(SignupMenu);

        FormMain.setText("HOME");
        FormMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormMainActionPerformed(evt);
            }
        });
        MenuBar.add(FormMain);

        jMenuBar1.add(MenuBar);

        jMenu2.setPreferredSize(new java.awt.Dimension(220, 6));
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_home_20px_1.png"))); // NOI18N
        jMenu3.setText("KOHWANHOME");
        jMenu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu3.setPreferredSize(new java.awt.Dimension(100, 50));
        jMenu3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jMenu3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtActionPerformed
        String enteredUsername = UserNameTxt.getText();
        String enteredPassword = new String(PasswordTxt.getPassword());

        Admin admin = new Admin();
        Pembeli pembeli = new Pembeli();

        if (admin.isValidAdmin(enteredUsername, enteredPassword)) {
            JOptionPane.showMessageDialog(null, "HELLO ADMIN");
        } else if (pembeli.isValidPembeli(enteredUsername, enteredPassword)) {
            JOptionPane.showMessageDialog(null, "SELAMAT DATANG " + enteredUsername);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid username or password");
        }
    }//GEN-LAST:event_LoginBtActionPerformed

    private void MenuBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBarActionPerformed
        
    }//GEN-LAST:event_MenuBarActionPerformed

    private void FormMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormMainActionPerformed
        FormMain formMain = new FormMain();
        formMain.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_FormMainActionPerformed

    private void SignupMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupMenuActionPerformed
        SignupMenu signupMenu = new SignupMenu();
        signupMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SignupMenuActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem FormMain;
    private javax.swing.JButton LoginBt;
    private javax.swing.JMenu MenuBar;
    private javax.swing.JPasswordField PasswordTxt;
    private javax.swing.JMenuItem SigninMenu;
    private javax.swing.JMenuItem SignupMenu;
    private javax.swing.JTextField UserNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
