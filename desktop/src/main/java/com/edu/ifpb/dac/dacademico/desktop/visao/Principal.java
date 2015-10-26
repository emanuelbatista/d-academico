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
        turmaReposicaojLabel = new javax.swing.JLabel();
        turmaAlunosjLabel = new javax.swing.JLabel();
        turmaAulasjLabel = new javax.swing.JLabel();
        backgroundjLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        removerAdminJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removerAdminJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removerAdminJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(removerAdminJLabel);
        removerAdminJLabel.setBounds(10, 380, 180, 40);

        atualizarAdminJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atualizarAdminJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atualizarAdminJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(atualizarAdminJLabel);
        atualizarAdminJLabel.setBounds(10, 350, 180, 30);

        listarAdminJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listarAdminJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listarAdminJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(listarAdminJLabel);
        listarAdminJLabel.setBounds(10, 310, 180, 40);

        cadastrarAdminJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarAdminJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarAdminJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(cadastrarAdminJLabel);
        cadastrarAdminJLabel.setBounds(10, 280, 180, 30);

        cadastrarProfessorJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarProfessorJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarProfessorJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(cadastrarProfessorJLabel);
        cadastrarProfessorJLabel.setBounds(200, 280, 190, 30);

        listarProfessorJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listarProfessorJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listarProfessorJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(listarProfessorJLabel);
        listarProfessorJLabel.setBounds(200, 310, 190, 40);

        atualizarProfessorJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atualizarProfessorJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atualizarProfessorJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(atualizarProfessorJLabel);
        atualizarProfessorJLabel.setBounds(200, 350, 190, 30);

        removerProfessorJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removerProfessorJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removerProfessorJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(removerProfessorJLabel);
        removerProfessorJLabel.setBounds(200, 380, 190, 40);

        cadastrarAlunoJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarAlunoJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarAlunoJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(cadastrarAlunoJLabel);
        cadastrarAlunoJLabel.setBounds(400, 280, 180, 30);

        listarAlunoJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listarAlunoJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listarAlunoJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(listarAlunoJLabel);
        listarAlunoJLabel.setBounds(400, 310, 180, 40);

        atualizarAlunoJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atualizarAlunoJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atualizarAlunoJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(atualizarAlunoJLabel);
        atualizarAlunoJLabel.setBounds(400, 350, 180, 30);

        removerAlunoJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removerAlunoJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removerAlunoJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(removerAlunoJLabel);
        removerAlunoJLabel.setBounds(400, 380, 180, 40);

        cadastrarCursoJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarCursoJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarCursoJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(cadastrarCursoJLabel);
        cadastrarCursoJLabel.setBounds(590, 280, 180, 30);

        listarCursoJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listarCursoJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listarCursoJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(listarCursoJLabel);
        listarCursoJLabel.setBounds(590, 310, 190, 40);

        atualizarCursoJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(atualizarCursoJLabel);
        atualizarCursoJLabel.setBounds(590, 350, 180, 30);

        removerCursoJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(removerCursoJLabel);
        removerCursoJLabel.setBounds(590, 380, 190, 40);

        cadastrarDisciplinaJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarDisciplinaJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarDisciplinaJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(cadastrarDisciplinaJLabel);
        cadastrarDisciplinaJLabel.setBounds(780, 280, 180, 30);

        listarDisciplinaJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listarDisciplinaJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listarDisciplinaJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(listarDisciplinaJLabel);
        listarDisciplinaJLabel.setBounds(780, 310, 180, 40);

        atualizarDisciplinaJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(atualizarDisciplinaJLabel);
        atualizarDisciplinaJLabel.setBounds(780, 350, 180, 30);

        removerDisciplinaJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(removerDisciplinaJLabel);
        removerDisciplinaJLabel.setBounds(780, 380, 180, 40);

        cadastrarTurmaJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarTurmaJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarTurmaJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(cadastrarTurmaJLabel);
        cadastrarTurmaJLabel.setBounds(970, 280, 180, 30);

        listarTurmaJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listarTurmaJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listarTurmaJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(listarTurmaJLabel);
        listarTurmaJLabel.setBounds(970, 310, 180, 30);

        atualizarTurmaJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atualizarTurmaJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atualizarTurmaJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(atualizarTurmaJLabel);
        atualizarTurmaJLabel.setBounds(970, 350, 180, 30);

        removerTurmaJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removerTurmaJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removerTurmaJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(removerTurmaJLabel);
        removerTurmaJLabel.setBounds(970, 380, 180, 40);

        logoutJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutJLabelMouseClicked(evt);
            }
        });
        getContentPane().add(logoutJLabel);
        logoutJLabel.setBounds(1194, 20, 120, 60);

        turmaReposicaojLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        turmaReposicaojLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                turmaReposicaojLabelMouseClicked(evt);
            }
        });
        getContentPane().add(turmaReposicaojLabel);
        turmaReposicaojLabel.setBounds(1150, 350, 180, 30);

        turmaAlunosjLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        turmaAlunosjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                turmaAlunosjLabelMouseClicked(evt);
            }
        });
        getContentPane().add(turmaAlunosjLabel);
        turmaAlunosjLabel.setBounds(1150, 270, 180, 40);

        turmaAulasjLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        turmaAulasjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                turmaAulasjLabelMouseClicked(evt);
            }
        });
        getContentPane().add(turmaAulasjLabel);
        turmaAulasjLabel.setBounds(1150, 310, 180, 40);

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

    private void atualizarAdminJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atualizarAdminJLabelMouseClicked
        new AdminList();
    }//GEN-LAST:event_atualizarAdminJLabelMouseClicked

    private void removerAdminJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removerAdminJLabelMouseClicked
        new AdminList();
    }//GEN-LAST:event_removerAdminJLabelMouseClicked

    private void listarProfessorJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarProfessorJLabelMouseClicked
        new ProfessorList();
    }//GEN-LAST:event_listarProfessorJLabelMouseClicked

    private void atualizarProfessorJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atualizarProfessorJLabelMouseClicked
        new ProfessorList();
    }//GEN-LAST:event_atualizarProfessorJLabelMouseClicked

    private void removerProfessorJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removerProfessorJLabelMouseClicked
        new ProfessorList();
    }//GEN-LAST:event_removerProfessorJLabelMouseClicked

    private void listarAlunoJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarAlunoJLabelMouseClicked
        new AlunoList();
    }//GEN-LAST:event_listarAlunoJLabelMouseClicked

    private void atualizarAlunoJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atualizarAlunoJLabelMouseClicked
        new AlunoList();
    }//GEN-LAST:event_atualizarAlunoJLabelMouseClicked

    private void removerAlunoJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removerAlunoJLabelMouseClicked
        new AlunoList();
    }//GEN-LAST:event_removerAlunoJLabelMouseClicked

    private void cadastrarCursoJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarCursoJLabelMouseClicked
        new CursoCadastro();
    }//GEN-LAST:event_cadastrarCursoJLabelMouseClicked

    private void listarCursoJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarCursoJLabelMouseClicked
       new CursoList();
    }//GEN-LAST:event_listarCursoJLabelMouseClicked

    private void cadastrarDisciplinaJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarDisciplinaJLabelMouseClicked
        new DisciplinaCadastro();
    }//GEN-LAST:event_cadastrarDisciplinaJLabelMouseClicked

    private void listarDisciplinaJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarDisciplinaJLabelMouseClicked
        new DisciplinaList();
    }//GEN-LAST:event_listarDisciplinaJLabelMouseClicked

    private void cadastrarTurmaJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarTurmaJLabelMouseClicked
        new TurmaCadastro();
    }//GEN-LAST:event_cadastrarTurmaJLabelMouseClicked

    private void listarTurmaJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarTurmaJLabelMouseClicked
        new TurmaList();
    }//GEN-LAST:event_listarTurmaJLabelMouseClicked

    private void atualizarTurmaJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atualizarTurmaJLabelMouseClicked
        new TurmaList();
    }//GEN-LAST:event_atualizarTurmaJLabelMouseClicked

    private void removerTurmaJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removerTurmaJLabelMouseClicked
        new TurmaList();
    }//GEN-LAST:event_removerTurmaJLabelMouseClicked

    private void turmaReposicaojLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turmaReposicaojLabelMouseClicked
        new TurmaList();
    }//GEN-LAST:event_turmaReposicaojLabelMouseClicked

    private void turmaAlunosjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turmaAlunosjLabelMouseClicked
        new TurmaList();
    }//GEN-LAST:event_turmaAlunosjLabelMouseClicked

    private void turmaAulasjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turmaAulasjLabelMouseClicked
        new TurmaList();        
    }//GEN-LAST:event_turmaAulasjLabelMouseClicked

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
    private javax.swing.JLabel turmaAlunosjLabel;
    private javax.swing.JLabel turmaAulasjLabel;
    private javax.swing.JLabel turmaReposicaojLabel;
    // End of variables declaration//GEN-END:variables
}
