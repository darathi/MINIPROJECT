/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class homepage extends javax.swing.JFrame {

    /** Creates new form homepage */
    public homepage() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        homesignup = new javax.swing.JButton();
        homestudentlogin = new javax.swing.JButton();
        homefacultylogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("z");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 0, 0, 14);

        homesignup.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        homesignup.setText("SIGN UP");
        homesignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homesignupActionPerformed(evt);
            }
        });
        getContentPane().add(homesignup);
        homesignup.setBounds(530, 110, 110, 23);

        homestudentlogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        homestudentlogin.setText("STUDENT LOGIN ");
        homestudentlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homestudentloginActionPerformed(evt);
            }
        });
        getContentPane().add(homestudentlogin);
        homestudentlogin.setBounds(50, 110, 137, 23);

        homefacultylogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        homefacultylogin.setText("FACULTY LOGIN");
        homefacultylogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homefacultyloginActionPerformed(evt);
            }
        });
        getContentPane().add(homefacultylogin);
        homefacultylogin.setBounds(270, 110, 131, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homepagepicsentbyswathi.PNG"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-20, -20, 710, 560);

        pack();
    }// </editor-fold>                        

    private void homestudentloginActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        new LOGINFORM().setVisible(true);
    }                                                

    private void homefacultyloginActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        new LOGINFORM2().setVisible(true);
    }                                                

    private void homesignupActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        new SIGNUP().setVisible(true);
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
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton homefacultylogin;
    private javax.swing.JButton homesignup;
    private javax.swing.JButton homestudentlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration                   

}
