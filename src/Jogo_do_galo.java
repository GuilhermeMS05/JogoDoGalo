
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Guilherme
 */
public class Jogo_do_galo extends javax.swing.JFrame {
    int jogador = 1;

    /**
     * Creates new form Jogo_do_galo
     */
    public Jogo_do_galo() {
        initComponents();
    }
    
    void ganhador(){
        if (b1.getText() == "X" && b2.getText() == "X" && b3.getText() == "X" ){
            b1.setBackground(Color.BLUE);
            b2.setBackground(Color.BLUE);
            b3.setBackground(Color.BLUE);
            JOptionPane.showMessageDialog(null,"O ganhador foi o jogador 1(X)");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            b1.setBackground(Color.WHITE);
            b2.setBackground(Color.WHITE);
            b3.setBackground(Color.WHITE);
        }
        else if (b1.getText() == "O" && b2.getText() == "O" && b3.getText() == "O"){
            b1.setBackground(Color.BLUE);
            b2.setBackground(Color.BLUE);
            b3.setBackground(Color.BLUE);
            JOptionPane.showMessageDialog(null,"O ganhador foi o jogador 2(O)");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            b1.setBackground(Color.WHITE);
            b2.setBackground(Color.WHITE);
            b3.setBackground(Color.WHITE);
        }
        else if (b1.getText() == "X" && b4.getText() == "X" && b7.getText() == "X" ){
            b1.setBackground(Color.BLUE);
            b4.setBackground(Color.BLUE);
            b7.setBackground(Color.BLUE);
            JOptionPane.showMessageDialog(null,"O ganhador foi o jogador 1(X)");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
        }
        else if (b1.getText() == "O" && b4.getText() == "O" && b7.getText() == "O"){
            b1.setBackground(Color.BLUE);
            b4.setBackground(Color.BLUE);
            b7.setBackground(Color.BLUE);
            JOptionPane.showMessageDialog(null,"O ganhador foi o jogador 2(O)");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
        }
        else if (b4.getText() == "X" && b5.getText() == "X" && b6.getText() == "X" ){
            b4.setBackground(Color.BLUE);
            b5.setBackground(Color.BLUE);
            b6.setBackground(Color.BLUE);
            JOptionPane.showMessageDialog(null,"O ganhador foi o jogador 1(X)");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
        }
        else if (b4.getText() == "O" && b5.getText() == "O" && b6.getText() == "O"){
            b4.setBackground(Color.BLUE);
            b5.setBackground(Color.BLUE);
            b6.setBackground(Color.BLUE);
            JOptionPane.showMessageDialog(null,"O ganhador foi o jogador 2(O)");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
        }
        else if (b1.getText() == "X" && b5.getText() == "X" && b9.getText() == "X" ){
            b1.setBackground(Color.BLUE);
            b5.setBackground(Color.BLUE);
            b9.setBackground(Color.BLUE);
            JOptionPane.showMessageDialog(null,"O ganhador foi o jogador 1(X)");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
        }
        else if (b1.getText() == "O" && b5.getText() == "O" && b9.getText() == "O"){
            JOptionPane.showMessageDialog(null,"O ganhador foi o jogador 2(O)");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
        }
        else if (b7.getText() == "X" && b8.getText() == "X" && b9.getText() == "X" ){
            JOptionPane.showMessageDialog(null,"O ganhador foi o jogador 1(X)");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
        }
        else if (b7.getText() == "O" && b8.getText() == "O" && b9.getText() == "O"){
            JOptionPane.showMessageDialog(null,"O ganhador foi o jogador 2(O)");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
        }
        else if (b2.getText() == "X" && b5.getText() == "X" && b8.getText() == "X" ){
            JOptionPane.showMessageDialog(null,"O ganhador foi o jogador 1(X)");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
        }
        else if (b2.getText() == "O" && b5.getText() == "O" && b8.getText() == "O"){
            JOptionPane.showMessageDialog(null,"O ganhador foi o jogador 2(O)");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
        }
        else if (b3.getText() == "X" && b6.getText() == "X" && b9.getText() == "X" ){
            JOptionPane.showMessageDialog(null,"O ganhador foi o jogador 1(X)");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
        }
        else if (b3.getText() == "O" && b6.getText() == "O" && b9.getText() == "O"){
            JOptionPane.showMessageDialog(null,"O ganhador foi o jogador 2(O)");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
        }
        else if (b3.getText() == "X" && b5.getText() == "X" && b7.getText() == "X" ){
            JOptionPane.showMessageDialog(null,"O ganhador foi o jogador 1(X)");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
        }
        else if (b3.getText() == "O" && b5.getText() == "O" && b7.getText() == "O"){
            JOptionPane.showMessageDialog(null,"O ganhador foi o jogador 2(O)");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jogadores = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        j1 = new javax.swing.JLabel();
        j2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("sdfasf");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Jogo Do Galo");

        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(255, 255, 255));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(255, 255, 255));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(255, 255, 255));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(255, 255, 255));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(255, 255, 255));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(255, 255, 255));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(255, 255, 255));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(255, 255, 255));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exit.setText("Sair");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        j1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        j1.setText("Jogador 1 (X)");

        j2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        j2.setText("Jogador 2 (O)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(j1)
                            .addComponent(j2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(j1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(j2))))
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(reset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exit)))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
      if (jogador == 1){
          b1.setText("X");
          jogador = 2;
          j1.setForeground(Color.BLACK);
          j2.setForeground(Color.BLUE);
          
      }
      else{
          b1.setText("O");
          jogador = 1;
          j2.setForeground(Color.BLACK);
          j1.setForeground(Color.BLUE);
      }
      ganhador();
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if (jogador == 1){
          b2.setText("X");
          jogador = 2;
          j1.setForeground(Color.BLACK);
          j2.setForeground(Color.BLUE);
          
      }
      else{
          b2.setText("O");
          jogador = 1;
          j2.setForeground(Color.BLACK);
          j1.setForeground(Color.BLUE);
      }
        ganhador();
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if (jogador == 1){
          b3.setText("X");
          jogador = 2;
          j1.setForeground(Color.BLACK);
          j2.setForeground(Color.BLUE);
          
      }
      else{
          b3.setText("O");
          jogador = 1;
          j2.setForeground(Color.BLACK);
          j1.setForeground(Color.BLUE);
      }
        
        ganhador();
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        if (jogador == 1){
          b4.setText("X");
          jogador = 2;
          j1.setForeground(Color.BLACK);
          j2.setForeground(Color.BLUE);
          
      }
      else{
          b4.setText("O");
          jogador = 1;
          j2.setForeground(Color.BLACK);
          j1.setForeground(Color.BLUE);
      }
        ganhador();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if (jogador == 1){
          b5.setText("X");
          jogador = 2;
          j1.setForeground(Color.BLACK);
          j2.setForeground(Color.BLUE);
          
      }
      else{
          b5.setText("O");
          jogador = 1;
          j2.setForeground(Color.BLACK);
          j1.setForeground(Color.BLUE);
      }
        ganhador();
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        if (jogador == 1){
          b6.setText("X");
          jogador = 2;
          j1.setForeground(Color.BLACK);
          j2.setForeground(Color.BLUE);
          
      }
      else{
          b6.setText("O");
          jogador = 1;
          j2.setForeground(Color.BLACK);
          j1.setForeground(Color.BLUE);
      }
        ganhador();
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        if (jogador == 1){
          b7.setText("X");
          jogador = 2;
          j1.setForeground(Color.BLACK);
          j2.setForeground(Color.BLUE);
          
      }
      else{
          b7.setText("O");
          jogador = 1;
          j2.setForeground(Color.BLACK);
          j1.setForeground(Color.BLUE);
      }
        ganhador();
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if (jogador == 1){
          b8.setText("X");
          jogador = 2;
          j1.setForeground(Color.BLACK);
          j2.setForeground(Color.BLUE);
          
      }
      else{
          b8.setText("O");
          jogador = 1;
          j2.setForeground(Color.BLACK);
          j1.setForeground(Color.BLUE);
      }
        ganhador();
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        if (jogador == 1){
          b9.setText("X");
          jogador = 2;
          j1.setForeground(Color.BLACK);
          j2.setForeground(Color.BLUE);
          
      }
      else{
          b9.setText("O");
          jogador = 1;
          j2.setForeground(Color.BLACK);
          j1.setForeground(Color.BLUE);
      }
        ganhador();
    }//GEN-LAST:event_b9ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        
    }//GEN-LAST:event_resetActionPerformed

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
            java.util.logging.Logger.getLogger(Jogo_do_galo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo_do_galo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo_do_galo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo_do_galo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo_do_galo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton exit;
    private javax.swing.JLabel j1;
    private javax.swing.JLabel j2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup jogadores;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
