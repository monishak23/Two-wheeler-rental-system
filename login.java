import javax.swing.*;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usrtxt = new javax.swing.JTextField();
        log_btn = new javax.swing.JButton();
        pwdtxt = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        signup_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Password");

        usrtxt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        usrtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrtxtActionPerformed(evt);
            }
        });

        log_btn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        log_btn.setText("Login");
        log_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_btnActionPerformed(evt);
            }
        });

        pwdtxt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                        .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                        .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .add(18, 18, 18)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                        .add(usrtxt)
                                        .add(pwdtxt, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(log_btn)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jPanel1Layout.createSequentialGroup()
                                .add(22, 22, 22)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                        .add(jLabel2)
                                        .add(usrtxt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(18, 18, 18)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                        .add(jLabel3)
                                        .add(pwdtxt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 40, Short.MAX_VALUE)
                                .add(log_btn)
                                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setText("USER LOGIN");

        signup_btn.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        signup_btn.setText("Sign up");
        signup_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_btnActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .add(layout.createSequentialGroup()
                                                .add(157, 157, 157)
                                                .add(jLabel1)
                                                .add(0, 135, Short.MAX_VALUE)))
                                .addContainerGap())
                        .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(0, 0, Short.MAX_VALUE)
                                .add(signup_btn)
                                .add(224, 224, 224))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                                .addContainerGap()
                                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 25, Short.MAX_VALUE)
                                .add(signup_btn)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usrtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usrtxtActionPerformed

    private void log_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_btnActionPerformed

        String user = usrtxt.getText().trim();
        String pwd = pwdtxt.getText().trim();
        if(user.equals("chethana") && pwd.equals("javacat2") || user.equals("monisha") && pwd.equals("javacat2") || user.equals("haritha") && pwd.equals("javacat2"))
        {
            customer c = new customer();
            this.hide();
            c.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Username and Password does not match!\nPlease sign up to proceed");
            usrtxt.setText(null);
            pwdtxt.setText(null);
        }
    }//GEN-LAST:event_log_btnActionPerformed

    private void signup_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_btnActionPerformed
        register r = new register();
        this.hide();
        r.setVisible(true);
    }//GEN-LAST:event_signup_btnActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton log_btn;
    private javax.swing.JPasswordField pwdtxt;
    private javax.swing.JButton signup_btn;
    private javax.swing.JTextField usrtxt;
    // End of variables declaration//GEN-END:variables

}
