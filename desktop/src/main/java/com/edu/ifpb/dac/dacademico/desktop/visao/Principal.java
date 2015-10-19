package com.edu.ifpb.dac.dacademico.desktop.visao;

import com.edu.ifpb.dac.dacademico.entidades.dominio.Administrador;
import javax.swing.JFrame;

/**
 *
 * @author douglasgabriel
 */
public class Principal extends javax.swing.JFrame {

    private Administrador admin = new Administrador();
    
    public Principal(Administrador admin) {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("D-Acadêmico | Administrador");
        setVisible(true);
        this.admin = admin;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoJLabel = new javax.swing.JLabel();
        bemVindoJLabel = new javax.swing.JLabel();
        professorJLabel = new javax.swing.JLabel();
        alunoJLabel = new javax.swing.JLabel();
        adminJLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        logoJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        getContentPane().add(logoJLabel);
        logoJLabel.setBounds(30, 30, 240, 94);

        bemVindoJLabel.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        bemVindoJLabel.setForeground(new java.awt.Color(0, 77, 64));
        bemVindoJLabel.setText("|      Administrador");
        getContentPane().add(bemVindoJLabel);
        bemVindoJLabel.setBounds(320, 50, 440, 80);

        professorJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/inicio_professor.png"))); // NOI18N
        professorJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        professorJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                professorJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(professorJLabel);
        professorJLabel.setBounds(10, 140, 330, 330);

        alunoJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/inicio_aluno.png"))); // NOI18N
        alunoJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alunoJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alunoJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(alunoJLabel);
        alunoJLabel.setBounds(360, 140, 330, 330);

        adminJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/inicio_admin.png"))); // NOI18N
        adminJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(adminJLabel);
        adminJLabel.setBounds(700, 140, 330, 330);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/inicio_background.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-13, -10, 1690, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void professorJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_professorJLabelMouseClicked
        
    }//GEN-LAST:event_professorJLabelMouseClicked

    private void alunoJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alunoJLabelMouseClicked
        
    }//GEN-LAST:event_alunoJLabelMouseClicked

    private void adminJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminJLabelMouseClicked
        
    }//GEN-LAST:event_adminJLabelMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminJLabel;
    private javax.swing.JLabel alunoJLabel;
    private javax.swing.JLabel bemVindoJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logoJLabel;
    private javax.swing.JLabel professorJLabel;
    // End of variables declaration//GEN-END:variables
}
