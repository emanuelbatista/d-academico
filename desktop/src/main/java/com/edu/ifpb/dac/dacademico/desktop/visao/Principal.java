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

        removerAdminJLabel = new javax.swing.JLabel();
        atualizarAdminJLabel = new javax.swing.JLabel();
        listarAdminJLabel = new javax.swing.JLabel();
        cadastrarAdminJLabel = new javax.swing.JLabel();
        cadastrarProfessorJLabel = new javax.swing.JLabel();
        listarProfessorJLabel = new javax.swing.JLabel();
        atualizarProfessorJLabel = new javax.swing.JLabel();
        removerProfessorJLabel = new javax.swing.JLabel();
        cadastrarAlunoJLabel = new javax.swing.JLabel();
        listarAlunoJLabel = new javax.swing.JLabel();
        atualizarAlunoJLabel = new javax.swing.JLabel();
        removerAlunoJLabel = new javax.swing.JLabel();
        cadastrarCursoJLabel = new javax.swing.JLabel();
        listarCursoJLabel = new javax.swing.JLabel();
        atualizarCursoJLabel = new javax.swing.JLabel();
        removerCursoJLabel = new javax.swing.JLabel();
        cadastrarDisciplinaJLabel = new javax.swing.JLabel();
        listarDisciplinaJLabel = new javax.swing.JLabel();
        atualizarDisciplinaJLabel = new javax.swing.JLabel();
        removerDisciplinaJLabel = new javax.swing.JLabel();
        cadastrarTurmaJLabel = new javax.swing.JLabel();
        listarTurmaJLabel = new javax.swing.JLabel();
        atualizarTurmaJLabel = new javax.swing.JLabel();
        removerTurmaJLabel = new javax.swing.JLabel();
        logoutJLabel = new javax.swing.JLabel();
        backgroundjLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        removerAdminJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(removerAdminJLabel);
        removerAdminJLabel.setBounds(30, 380, 180, 40);

        atualizarAdminJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(atualizarAdminJLabel);
        atualizarAdminJLabel.setBounds(30, 350, 180, 30);

        listarAdminJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listarAdminJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listarAdminJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(listarAdminJLabel);
        listarAdminJLabel.setBounds(30, 310, 180, 40);

        cadastrarAdminJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarAdminJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarAdminJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(cadastrarAdminJLabel);
        cadastrarAdminJLabel.setBounds(30, 280, 180, 30);

        cadastrarProfessorJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarProfessorJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarProfessorJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(cadastrarProfessorJLabel);
        cadastrarProfessorJLabel.setBounds(220, 280, 190, 30);

        listarProfessorJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(listarProfessorJLabel);
        listarProfessorJLabel.setBounds(220, 310, 190, 40);

        atualizarProfessorJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(atualizarProfessorJLabel);
        atualizarProfessorJLabel.setBounds(220, 350, 190, 30);

        removerProfessorJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(removerProfessorJLabel);
        removerProfessorJLabel.setBounds(220, 380, 190, 40);

        cadastrarAlunoJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarAlunoJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarAlunoJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(cadastrarAlunoJLabel);
        cadastrarAlunoJLabel.setBounds(420, 280, 180, 30);

        listarAlunoJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(listarAlunoJLabel);
        listarAlunoJLabel.setBounds(420, 310, 180, 40);

        atualizarAlunoJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(atualizarAlunoJLabel);
        atualizarAlunoJLabel.setBounds(420, 350, 180, 30);

        removerAlunoJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(removerAlunoJLabel);
        removerAlunoJLabel.setBounds(420, 380, 180, 40);

        cadastrarCursoJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(cadastrarCursoJLabel);
        cadastrarCursoJLabel.setBounds(610, 280, 180, 30);

        listarCursoJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(listarCursoJLabel);
        listarCursoJLabel.setBounds(610, 310, 190, 40);

        atualizarCursoJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(atualizarCursoJLabel);
        atualizarCursoJLabel.setBounds(610, 350, 180, 30);

        removerCursoJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(removerCursoJLabel);
        removerCursoJLabel.setBounds(610, 380, 190, 40);

        cadastrarDisciplinaJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(cadastrarDisciplinaJLabel);
        cadastrarDisciplinaJLabel.setBounds(800, 280, 180, 30);

        listarDisciplinaJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(listarDisciplinaJLabel);
        listarDisciplinaJLabel.setBounds(800, 310, 180, 40);

        atualizarDisciplinaJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(atualizarDisciplinaJLabel);
        atualizarDisciplinaJLabel.setBounds(800, 350, 180, 30);

        removerDisciplinaJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(removerDisciplinaJLabel);
        removerDisciplinaJLabel.setBounds(800, 380, 180, 40);

        cadastrarTurmaJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(cadastrarTurmaJLabel);
        cadastrarTurmaJLabel.setBounds(980, 280, 180, 30);

        listarTurmaJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(listarTurmaJLabel);
        listarTurmaJLabel.setBounds(980, 310, 180, 30);

        atualizarTurmaJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(atualizarTurmaJLabel);
        atualizarTurmaJLabel.setBounds(980, 350, 180, 30);

        removerTurmaJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(removerTurmaJLabel);
        removerTurmaJLabel.setBounds(980, 380, 180, 40);

        logoutJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(logoutJLabel);
        logoutJLabel.setBounds(1194, 20, 120, 60);

        backgroundjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/modelo.png"))); // NOI18N
        getContentPane().add(backgroundjLabel);
        backgroundjLabel.setBounds(-13, -10, 1690, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutJLabelMouseClicked
        new Login();
        this.dispose();
    }//GEN-LAST:event_logoutJLabelMouseClicked

    private void cadastrarAdminJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarAdminJLabelMouseClicked
        new AdminCadastro();
    }//GEN-LAST:event_cadastrarAdminJLabelMouseClicked

    private void cadastrarProfessorJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarProfessorJLabelMouseClicked
        new ProfessorCadastro();
    }//GEN-LAST:event_cadastrarProfessorJLabelMouseClicked

    private void cadastrarAlunoJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarAlunoJLabelMouseClicked
        new AlunoCadastro();
    }//GEN-LAST:event_cadastrarAlunoJLabelMouseClicked

    private void listarAdminJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarAdminJLabelMouseClicked
        new AdminList();
    }//GEN-LAST:event_listarAdminJLabelMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atualizarAdminJLabel;
    private javax.swing.JLabel atualizarAlunoJLabel;
    private javax.swing.JLabel atualizarCursoJLabel;
    private javax.swing.JLabel atualizarDisciplinaJLabel;
    private javax.swing.JLabel atualizarProfessorJLabel;
    private javax.swing.JLabel atualizarTurmaJLabel;
    private javax.swing.JLabel backgroundjLabel;
    private javax.swing.JLabel cadastrarAdminJLabel;
    private javax.swing.JLabel cadastrarAlunoJLabel;
    private javax.swing.JLabel cadastrarCursoJLabel;
    private javax.swing.JLabel cadastrarDisciplinaJLabel;
    private javax.swing.JLabel cadastrarProfessorJLabel;
    private javax.swing.JLabel cadastrarTurmaJLabel;
    private javax.swing.JLabel listarAdminJLabel;
    private javax.swing.JLabel listarAlunoJLabel;
    private javax.swing.JLabel listarCursoJLabel;
    private javax.swing.JLabel listarDisciplinaJLabel;
    private javax.swing.JLabel listarProfessorJLabel;
    private javax.swing.JLabel listarTurmaJLabel;
    private javax.swing.JLabel logoutJLabel;
    private javax.swing.JLabel removerAdminJLabel;
    private javax.swing.JLabel removerAlunoJLabel;
    private javax.swing.JLabel removerCursoJLabel;
    private javax.swing.JLabel removerDisciplinaJLabel;
    private javax.swing.JLabel removerProfessorJLabel;
    private javax.swing.JLabel removerTurmaJLabel;
    // End of variables declaration//GEN-END:variables
}
