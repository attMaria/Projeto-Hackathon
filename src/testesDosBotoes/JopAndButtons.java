/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testesDosBotoes;

import jopAlternativo.JopAlternativo;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author harisson.castro
 */
public class JopAndButtons extends javax.swing.JFrame {

    JopAlternativo jopAlternativo = new JopAlternativo();
    /**
     * Creates new form JopAndButtons
     */
    public JopAndButtons() {
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

        btJopPretoBranco2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btJopPretoBranco2.setBackground(new java.awt.Color(0, 0, 0));
        btJopPretoBranco2.setForeground(new java.awt.Color(255, 255, 255));
        btJopPretoBranco2.setText("Teste do jopAlternativo");
        btJopPretoBranco2.setBorderPainted(false);
        btJopPretoBranco2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btJopPretoBranco2.setFocusPainted(false);
        btJopPretoBranco2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btJopPretoBranco2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btJopPretoBranco2MouseExited(evt);
            }
        });
        btJopPretoBranco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJopPretoBranco2ActionPerformed(evt);
            }
        });

        jButton1.setText("resultado do jop");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btJopPretoBranco2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(0, 385, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(btJopPretoBranco2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 334, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btJopPretoBranco2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btJopPretoBranco2MouseExited
        btJopPretoBranco2.setBackground(Color.BLACK);
        btJopPretoBranco2.setForeground(Color.WHITE);
    }//GEN-LAST:event_btJopPretoBranco2MouseExited

    private void btJopPretoBranco2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btJopPretoBranco2MouseEntered
        btJopPretoBranco2.setBackground(Color.WHITE);
        btJopPretoBranco2.setForeground(Color.BLACK);
    }//GEN-LAST:event_btJopPretoBranco2MouseEntered

    private void btJopPretoBranco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJopPretoBranco2ActionPerformed
        jopAlternativo.setVisible(true);
    }//GEN-LAST:event_btJopPretoBranco2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, jopAlternativo.getNumero());
    }//GEN-LAST:event_jButton1ActionPerformed
//
//    public Icon icone(String path, int width, int height) {
//        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage()
//                .getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH));
//
//        return img;

        //STRING PATH
        //path nada mais é que o local que a arquivo/pasta está alocado
        //INT WIDTH & INT HEIGHT
        //os dois nada mais são do que Largura e Altura.
//    }

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
            java.util.logging.Logger.getLogger(JopAndButtons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JopAndButtons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JopAndButtons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JopAndButtons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JopAndButtons().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btJopPretoBranco2;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
