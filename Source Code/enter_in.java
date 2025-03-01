package snake_game;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.*;


public class enter_in extends javax.swing.JFrame {

    public enter_in() {
        initComponents();
        b_pic.setVisible(false);
        boy_pic.setVisible(false);
        nam_pic.setVisible(false);
        vs_com.setVisible(false);
        vs_ply.setVisible(false);
        play_pic.setVisible(false);
        Instruction.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        instruction.setVisible(false);
        c1.setVisible(false);
        c2.setVisible(false);
        c3.setVisible(false);
        back.setVisible(false);
        c4.setVisible(false);
        exit.setVisible(false);
        audio();
    }
    static String ply1 = "    #", ply2 = "    $";
    static String ply1name = "PLAYER 1", ply2name = "PLAYER 2";
    
    static AudioStream audios;
    
    public void audio()
    {
        InputStream in;
        
        try
        {
            in = new FileInputStream(new File("C:\\Users\\Ramandeep\\Documents\\NetBeansProjects\\snake_game\\src\\snake_game\\folder\\new.wav"));
            audios = new AudioStream(in);
            AudioPlayer.player.start(audios);
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        play_pic = new javax.swing.JLabel();
        nam_pic = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        vs_com = new javax.swing.JButton();
        c2 = new javax.swing.JLabel();
        vs_ply = new javax.swing.JButton();
        boy_pic = new javax.swing.JLabel();
        Instruction = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        instruction = new javax.swing.JButton();
        c4 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        back = new javax.swing.JLabel();
        b_pic = new javax.swing.JLabel();
        start_pic = new javax.swing.JLabel();
        enter = new javax.swing.JButton();

        play_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snake_game/folder/play1.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(300, 50));
        setPreferredSize(new java.awt.Dimension(546, 378));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p1(evt);
                p2(evt);
            }
        });
        getContentPane().setLayout(null);

        nam_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snake_game/folder/nam1.jpg"))); // NOI18N
        getContentPane().add(nam_pic);
        nam_pic.setBounds(260, 20, 200, 80);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Choose Gameplay");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 110, 240, 40);

        c1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c1.setForeground(new java.awt.Color(0, 204, 204));
        c1.setText("VS Computer");
        getContentPane().add(c1);
        c1.setBounds(240, 160, 150, 30);

        vs_com.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vs_com.setForeground(new java.awt.Color(255, 0, 0));
        vs_com.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snake_game/folder/img1.jpg"))); // NOI18N
        vs_com.setText("VS Computer");
        vs_com.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vs_comActionPerformed(evt);
            }
        });
        getContentPane().add(vs_com);
        vs_com.setBounds(220, 170, 170, 40);

        c2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c2.setForeground(new java.awt.Color(0, 204, 204));
        c2.setText("VS Player");
        getContentPane().add(c2);
        c2.setBounds(240, 210, 160, 30);

        vs_ply.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vs_ply.setForeground(new java.awt.Color(255, 51, 51));
        vs_ply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snake_game/folder/img1.jpg"))); // NOI18N
        vs_ply.setText("VS Player2");
        vs_ply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vs_plyActionPerformed(evt);
            }
        });
        getContentPane().add(vs_ply);
        vs_ply.setBounds(220, 210, 180, 40);

        boy_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snake_game/folder/boy111.jpg"))); // NOI18N
        getContentPane().add(boy_pic);
        boy_pic.setBounds(20, 0, 140, 330);

        Instruction.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Instruction.setForeground(new java.awt.Color(0, 185, 168));
        Instruction.setText("          Instructions");
        getContentPane().add(Instruction);
        Instruction.setBounds(170, 90, 210, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 198, 157));
        jLabel1.setText(":-    First Click on Dice to Draw no 1-6");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 130, 340, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 198, 157));
        jLabel2.setText(":-   Then Click on Moving Dice  to proceed");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 160, 320, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 198, 157));
        jLabel3.setText(":- If 1 ocurs then player start the game ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 200, 310, 17);

        c3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c3.setForeground(new java.awt.Color(0, 204, 204));
        c3.setText("INSTRUCTIONS");
        getContentPane().add(c3);
        c3.setBounds(240, 260, 150, 20);

        instruction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snake_game/folder/img1.jpg"))); // NOI18N
        instruction.setText("jButton1");
        instruction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructionActionPerformed(evt);
            }
        });
        getContentPane().add(instruction);
        instruction.setBounds(220, 250, 180, 40);

        c4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c4.setForeground(new java.awt.Color(0, 153, 153));
        c4.setText("EXIT");
        getContentPane().add(c4);
        c4.setBounds(240, 290, 110, 30);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snake_game/folder/img1.jpg"))); // NOI18N
        exit.setText("jButton1");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(220, 290, 140, 30);

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(0, 153, 153));
        back.setText("Back");
        getContentPane().add(back);
        back.setBounds(240, 290, 110, 30);

        b_pic.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        b_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snake_game/folder/bg_img.jpg"))); // NOI18N
        getContentPane().add(b_pic);
        b_pic.setBounds(0, 0, 570, 340);

        start_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snake_game/folder/intro snake and ladder.gif"))); // NOI18N
        getContentPane().add(start_pic);
        start_pic.setBounds(0, 0, 560, 340);

        enter.setText("Enter");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        getContentPane().add(enter);
        enter.setBounds(3, 13, 500, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        b_pic.setVisible(true);
        boy_pic.setVisible(true);
        nam_pic.setVisible(true);
        Instruction.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);

        play_pic.setVisible(false);
        start_pic.setVisible(false);
        enter.setVisible(false);
        jLabel4.setVisible(true);
        vs_com.setVisible(true);
        vs_ply.setVisible(true);
        instruction.setVisible(true);
        c1.setVisible(true);
        c2.setVisible(true);
        c3.setVisible(true);
        c4.setVisible(true);
        exit.setVisible(true);
        back.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_enterActionPerformed

    private void p1(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p1

    }//GEN-LAST:event_p1


    private void p2(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p2

    }//GEN-LAST:event_p2

    private void vs_comActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vs_comActionPerformed
        new game2().setVisible(true);  
    }//GEN-LAST:event_vs_comActionPerformed

    private void vs_plyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vs_plyActionPerformed
        new game().setVisible(true);   
    }//GEN-LAST:event_vs_plyActionPerformed

    private void instructionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructionActionPerformed
        vs_com.setVisible(false);
        vs_ply.setVisible(false);
        Instruction.setVisible(true);
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(false);
        instruction.setVisible(false);
        c1.setVisible(false);
        c2.setVisible(false);
        c3.setVisible(false);
        back.setVisible(true);
        enter.setVisible(true);
        c4.setVisible(false);
        exit.setVisible(false);
        
    }//GEN-LAST:event_instructionActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        new quit().setVisible(true);         
        
    }//GEN-LAST:event_exitActionPerformed

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
                    java.util.logging.Logger.getLogger(enter_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    java.util.logging.Logger.getLogger(enter_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    java.util.logging.Logger.getLogger(enter_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger(enter_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new enter_in().setVisible(true);
                    }
                });
            }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Instruction;
    private javax.swing.JLabel b_pic;
    private javax.swing.JLabel back;
    private javax.swing.JLabel boy_pic;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JButton enter;
    private javax.swing.JButton exit;
    private javax.swing.JButton instruction;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel nam_pic;
    private javax.swing.JLabel play_pic;
    private javax.swing.JLabel start_pic;
    private javax.swing.JButton vs_com;
    private javax.swing.JButton vs_ply;
    // End of variables declaration//GEN-END:variables
}
