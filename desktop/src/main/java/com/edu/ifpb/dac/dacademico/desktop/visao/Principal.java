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

        adminCoverjLabel = new javax.swing.JLabel();
        removerAdminJLabel = new javax.swing.JLabel();
        atualizarAdminJLabel = new javax.swing.JLabel();
        listarAdminJLabel = new javax.swing.JLabel();
        cadastrarAdminJLabel = new javax.swing.JLabel();
        logoJLabel = new javax.swing.JLabel();
        professorCoverjLabel = new javax.swing.JLabel();
        cadastrarProfessorJLabel = new javax.swing.JLabel();
        listarProfessorJLabel = new javax.swing.JLabel();
        atualizarProfessorJLabel = new javax.swing.JLabel();
        removerProfessorJLabel = new javax.swing.JLabel();
        alunoCoverjLabel = new javax.swing.JLabel();
        cadastrarAlunoJLabel = new javax.swing.JLabel();
        listarAlunoJLabel = new javax.swing.JLabel();
        atualizarAlunoJLabel = new javax.swing.JLabel();
        removerAlunoJLabel = new javax.swing.JLabel();
        cursoCoverjLabel = new javax.swing.JLabel();
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
        salaCoverjLabel = new javax.swing.JLabel();
        removerSalaJLabel = new javax.swing.JLabel();
        atualizarSalaJLabel = new javax.swing.JLabel();
        listarSalaJLabel = new javax.swing.JLabel();
        cadastrarSalaJLabel = new javax.swing.JLabel();
        laboratorioCoverjLabel = new javax.swing.JLabel();
        removerLaboratorioJLabel = new javax.swing.JLabel();
        atualizarLaboratorioJLabel = new javax.swing.JLabel();
        listarLaboratorioJLabel = new javax.swing.JLabel();
        cadastrarLaboratorioJLabel = new javax.swing.JLabel();
        logoutJLabel = new javax.swing.JLabel();
        backgroundjLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        adminCoverjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/admin_cover.png"))); // NOI18N
        getContentPane().add(adminCoverjLabel);
        adminCoverjLabel.setBounds(80, 90, 190, 152);

        removerAdminJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remove_label.png"))); // NOI18N
        getContentPane().add(removerAdminJLabel);
        removerAdminJLabel.setBounds(80, 360, 180, 40);

        atualizarAdminJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/up_label.png"))); // NOI18N
        getContentPane().add(atualizarAdminJLabel);
        atualizarAdminJLabel.setBounds(80, 320, 180, 40);

        listarAdminJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lista_label.png"))); // NOI18N
        getContentPane().add(listarAdminJLabel);
        listarAdminJLabel.setBounds(80, 280, 180, 40);

        cadastrarAdminJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo_label.png"))); // NOI18N
        getContentPane().add(cadastrarAdminJLabel);
        cadastrarAdminJLabel.setBounds(80, 240, 180, 40);

        logoJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        getContentPane().add(logoJLabel);
        logoJLabel.setBounds(20, 10, 190, 70);

        professorCoverjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/professor_cover.png"))); // NOI18N
        getContentPane().add(professorCoverjLabel);
        professorCoverjLabel.setBounds(280, 90, 190, 152);

        cadastrarProfessorJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo_label.png"))); // NOI18N
        getContentPane().add(cadastrarProfessorJLabel);
        cadastrarProfessorJLabel.setBounds(280, 240, 180, 40);

        listarProfessorJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lista_label.png"))); // NOI18N
        getContentPane().add(listarProfessorJLabel);
        listarProfessorJLabel.setBounds(280, 280, 180, 40);

        atualizarProfessorJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/up_label.png"))); // NOI18N
        getContentPane().add(atualizarProfessorJLabel);
        atualizarProfessorJLabel.setBounds(280, 320, 180, 40);

        removerProfessorJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remove_label.png"))); // NOI18N
        getContentPane().add(removerProfessorJLabel);
        removerProfessorJLabel.setBounds(280, 360, 180, 40);

        alunoCoverjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alunos_cover.png"))); // NOI18N
        getContentPane().add(alunoCoverjLabel);
        alunoCoverjLabel.setBounds(480, 90, 190, 152);

        cadastrarAlunoJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo_label.png"))); // NOI18N
        getContentPane().add(cadastrarAlunoJLabel);
        cadastrarAlunoJLabel.setBounds(480, 240, 180, 40);

        listarAlunoJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lista_label.png"))); // NOI18N
        getContentPane().add(listarAlunoJLabel);
        listarAlunoJLabel.setBounds(480, 280, 180, 40);

        atualizarAlunoJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/up_label.png"))); // NOI18N
        getContentPane().add(atualizarAlunoJLabel);
        atualizarAlunoJLabel.setBounds(480, 320, 180, 40);

        removerAlunoJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remove_label.png"))); // NOI18N
        getContentPane().add(removerAlunoJLabel);
        removerAlunoJLabel.setBounds(480, 360, 180, 40);

        cursoCoverjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cursos_cover.png"))); // NOI18N
        getContentPane().add(cursoCoverjLabel);
        cursoCoverjLabel.setBounds(680, 90, 550, 123);

        cadastrarCursoJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo_label.png"))); // NOI18N
        getContentPane().add(cadastrarCursoJLabel);
        cadastrarCursoJLabel.setBounds(680, 240, 180, 40);

        listarCursoJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lista_label.png"))); // NOI18N
        getContentPane().add(listarCursoJLabel);
        listarCursoJLabel.setBounds(680, 280, 180, 40);

        atualizarCursoJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/up_info_label.png"))); // NOI18N
        getContentPane().add(atualizarCursoJLabel);
        atualizarCursoJLabel.setBounds(680, 320, 180, 35);

        removerCursoJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remove_label.png"))); // NOI18N
        getContentPane().add(removerCursoJLabel);
        removerCursoJLabel.setBounds(680, 360, 180, 40);

        cadastrarDisciplinaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/nova_label.png"))); // NOI18N
        getContentPane().add(cadastrarDisciplinaJLabel);
        cadastrarDisciplinaJLabel.setBounds(870, 240, 180, 34);

        listarDisciplinaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lista_label.png"))); // NOI18N
        getContentPane().add(listarDisciplinaJLabel);
        listarDisciplinaJLabel.setBounds(870, 280, 180, 40);

        atualizarDisciplinaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/up_info_label.png"))); // NOI18N
        getContentPane().add(atualizarDisciplinaJLabel);
        atualizarDisciplinaJLabel.setBounds(870, 320, 180, 35);

        removerDisciplinaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remove_label.png"))); // NOI18N
        getContentPane().add(removerDisciplinaJLabel);
        removerDisciplinaJLabel.setBounds(870, 360, 180, 40);

        cadastrarTurmaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/nova_label.png"))); // NOI18N
        getContentPane().add(cadastrarTurmaJLabel);
        cadastrarTurmaJLabel.setBounds(1050, 240, 180, 34);

        listarTurmaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lista_label.png"))); // NOI18N
        getContentPane().add(listarTurmaJLabel);
        listarTurmaJLabel.setBounds(1050, 280, 180, 40);

        atualizarTurmaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/up_info_label.png"))); // NOI18N
        getContentPane().add(atualizarTurmaJLabel);
        atualizarTurmaJLabel.setBounds(1050, 320, 180, 35);

        removerTurmaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remove_label.png"))); // NOI18N
        getContentPane().add(removerTurmaJLabel);
        removerTurmaJLabel.setBounds(1050, 360, 180, 40);

        salaCoverjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sala_cover.png"))); // NOI18N
        getContentPane().add(salaCoverjLabel);
        salaCoverjLabel.setBounds(70, 420, 190, 152);

        removerSalaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remove_label.png"))); // NOI18N
        getContentPane().add(removerSalaJLabel);
        removerSalaJLabel.setBounds(80, 700, 180, 40);

        atualizarSalaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/up_info_label.png"))); // NOI18N
        getContentPane().add(atualizarSalaJLabel);
        atualizarSalaJLabel.setBounds(80, 660, 180, 35);

        listarSalaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lista_label.png"))); // NOI18N
        getContentPane().add(listarSalaJLabel);
        listarSalaJLabel.setBounds(80, 620, 180, 40);

        cadastrarSalaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/nova_label.png"))); // NOI18N
        getContentPane().add(cadastrarSalaJLabel);
        cadastrarSalaJLabel.setBounds(80, 580, 180, 34);

        laboratorioCoverjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lab_cover.png"))); // NOI18N
        getContentPane().add(laboratorioCoverjLabel);
        laboratorioCoverjLabel.setBounds(270, 420, 190, 152);

        removerLaboratorioJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remove_label.png"))); // NOI18N
        getContentPane().add(removerLaboratorioJLabel);
        removerLaboratorioJLabel.setBounds(280, 700, 180, 40);

        atualizarLaboratorioJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/up_info_label.png"))); // NOI18N
        getContentPane().add(atualizarLaboratorioJLabel);
        atualizarLaboratorioJLabel.setBounds(280, 660, 180, 35);

        listarLaboratorioJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lista_label.png"))); // NOI18N
        getContentPane().add(listarLaboratorioJLabel);
        listarLaboratorioJLabel.setBounds(280, 620, 180, 40);

        cadastrarLaboratorioJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/nova_label.png"))); // NOI18N
        getContentPane().add(cadastrarLaboratorioJLabel);
        cadastrarLaboratorioJLabel.setBounds(280, 580, 180, 34);

        logoutJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logout_icon.png"))); // NOI18N
        getContentPane().add(logoutJLabel);
        logoutJLabel.setBounds(1120, 20, 104, 50);

        backgroundjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/inicio_background.png"))); // NOI18N
        getContentPane().add(backgroundjLabel);
        backgroundjLabel.setBounds(-13, -10, 1690, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminCoverjLabel;
    private javax.swing.JLabel alunoCoverjLabel;
    private javax.swing.JLabel atualizarAdminJLabel;
    private javax.swing.JLabel atualizarAlunoJLabel;
    private javax.swing.JLabel atualizarCursoJLabel;
    private javax.swing.JLabel atualizarDisciplinaJLabel;
    private javax.swing.JLabel atualizarLaboratorioJLabel;
    private javax.swing.JLabel atualizarProfessorJLabel;
    private javax.swing.JLabel atualizarSalaJLabel;
    private javax.swing.JLabel atualizarTurmaJLabel;
    private javax.swing.JLabel backgroundjLabel;
    private javax.swing.JLabel cadastrarAdminJLabel;
    private javax.swing.JLabel cadastrarAlunoJLabel;
    private javax.swing.JLabel cadastrarCursoJLabel;
    private javax.swing.JLabel cadastrarDisciplinaJLabel;
    private javax.swing.JLabel cadastrarLaboratorioJLabel;
    private javax.swing.JLabel cadastrarProfessorJLabel;
    private javax.swing.JLabel cadastrarSalaJLabel;
    private javax.swing.JLabel cadastrarTurmaJLabel;
    private javax.swing.JLabel cursoCoverjLabel;
    private javax.swing.JLabel laboratorioCoverjLabel;
    private javax.swing.JLabel listarAdminJLabel;
    private javax.swing.JLabel listarAlunoJLabel;
    private javax.swing.JLabel listarCursoJLabel;
    private javax.swing.JLabel listarDisciplinaJLabel;
    private javax.swing.JLabel listarLaboratorioJLabel;
    private javax.swing.JLabel listarProfessorJLabel;
    private javax.swing.JLabel listarSalaJLabel;
    private javax.swing.JLabel listarTurmaJLabel;
    private javax.swing.JLabel logoJLabel;
    private javax.swing.JLabel logoutJLabel;
    private javax.swing.JLabel professorCoverjLabel;
    private javax.swing.JLabel removerAdminJLabel;
    private javax.swing.JLabel removerAlunoJLabel;
    private javax.swing.JLabel removerCursoJLabel;
    private javax.swing.JLabel removerDisciplinaJLabel;
    private javax.swing.JLabel removerLaboratorioJLabel;
    private javax.swing.JLabel removerProfessorJLabel;
    private javax.swing.JLabel removerSalaJLabel;
    private javax.swing.JLabel removerTurmaJLabel;
    private javax.swing.JLabel salaCoverjLabel;
    // End of variables declaration//GEN-END:variables
}
