/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package stop_watch;

/**
 *
 * @author pushon
 */
public class stopwatch2 extends javax.swing.JFrame {

    /**
     * Creates new form stopwatch2
     */
    static int milliseconds = 0;
    static int seconds = 0;
    static int hours = 0;
    static int minutes = 0;
    static boolean state = true;
    
    

    public stopwatch2() {
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

        txtminutes = new java.awt.Label();
        txtseconds = new java.awt.Label();
        txtmilliseconds = new java.awt.Label();
        txthours = new java.awt.Label();
        btnstart = new javax.swing.JButton();
        btnstop = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STOP WATCH");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(500, 250, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtminutes.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txtminutes.setText("00:");
        getContentPane().add(txtminutes, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 24, 66, 62));

        txtseconds.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txtseconds.setText("00:");
        getContentPane().add(txtseconds, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 24, 66, 62));

        txtmilliseconds.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtmilliseconds.setText("00");
        getContentPane().add(txtmilliseconds, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 24, 66, 62));

        txthours.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txthours.setText("00:");
        getContentPane().add(txthours, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 24, 66, 62));

        btnstart.setBackground(new java.awt.Color(0, 255, 0));
        btnstart.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnstart.setText("Start");
        btnstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstartActionPerformed(evt);
            }
        });
        getContentPane().add(btnstart, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 123, 85, 32));

        btnstop.setBackground(new java.awt.Color(255, 0, 0));
        btnstop.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnstop.setForeground(new java.awt.Color(255, 255, 255));
        btnstop.setText("Stop");
        btnstop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstopActionPerformed(evt);
            }
        });
        getContentPane().add(btnstop, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 123, 85, 32));

        btnreset.setBackground(new java.awt.Color(0, 0, 0));
        btnreset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnreset.setForeground(new java.awt.Color(255, 255, 255));
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 123, 107, 32));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
       
        // TODO add your handling code here:
        state = false;
        
        hours = 0;
        minutes = 0;
        seconds = 0 ;
        milliseconds= 0 ;
       
        txthours.setText("00 : ");
        txtminutes.setText("00 : ");
        txtseconds.setText("00 : ");
        txtmilliseconds.setText("0000");
        
        
        
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstartActionPerformed
        state = true;
        Thread t = new Thread() {
            public void run() {
                
                for (;;) {
                    if (state == true) 
                    {
                        try 
                        {
                            sleep(1);
                            
                           if(milliseconds > 1000)
                            {
                                milliseconds = 0;
                                seconds++;
                            }
                           else if (seconds > 60) 
                            {
                                milliseconds = 0;
                                seconds = 0;
                                minutes++;
                            }
                           else if (minutes > 60)
                            {
                                milliseconds=0;
                                seconds=0;
                                minutes = 0;
                                hours++;
                            }
                            txtmilliseconds.setText(" : "+milliseconds);                    
                            milliseconds++;
                            txtseconds.setText(" : "+seconds);
                            txtminutes.setText(" : "+minutes);
                            txthours.setText(" "+hours);
                            
                        } catch (Exception e) {

                        }
                    } 
                    else 
                    {
                        break;
                    }
                }
            }
        };
        t.start();
    }//GEN-LAST:event_btnstartActionPerformed

    private void btnstopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstopActionPerformed
        // TODO add your handling code here:
        state = false;
    }//GEN-LAST:event_btnstopActionPerformed

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
            java.util.logging.Logger.getLogger(stopwatch2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stopwatch2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stopwatch2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stopwatch2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new stopwatch2().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnstart;
    private javax.swing.JButton btnstop;
    private java.awt.Label txthours;
    private java.awt.Label txtmilliseconds;
    private java.awt.Label txtminutes;
    private java.awt.Label txtseconds;
    // End of variables declaration//GEN-END:variables
}
