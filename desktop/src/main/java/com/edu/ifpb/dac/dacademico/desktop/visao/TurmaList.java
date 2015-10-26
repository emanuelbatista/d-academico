package com.edu.ifpb.dac.dacademico.desktop.visao;

import com.edu.ifpb.dac.dacademico.core.exceptions.EntidadeInexistenteException;
import com.edu.ifpb.dac.dacademico.desktop.controladores.TurmaController;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Turma;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author douglasgabriel
 */
public class TurmaList extends javax.swing.JFrame {

    TurmaController controller = new TurmaController();
    DefaultTableModel tableModel;

    public TurmaList() {
        initComponents();
        setTitle("Lista de turma");
        setResizable(false);
        setSize(600, 620);
        setLocationRelativeTo(null);
        setVisible(true);
        atualizarTabela();
    }

    private void atualizarTabela() {
        tableModel = new DefaultTableModel();
        tableModel.addColumn("cod");
        tableModel.addColumn("Identificação");
        tableModel.addColumn("Curso");
        tableModel.addColumn("Professor");
        tableModel.addColumn("Disciplina");
        tableModel.addColumn("Alunos");
        List<Turma> turmas = controller.listarTodos();
        for (Turma turma : turmas) {
            try{
                tableModel.addRow(
                        new Object[]{
                            turma.getCod()
                            , turma.getIdentificacao()
                            , turma.getCurso().getAbreviacao()
                            , turma.getProfessor() != null ? turma.getProfessor().getNomeCompleto() : ""
                            , turma.getDisciplina().getDescricao()
                            , turma.getAlunos() != null ? turma.getAlunos().size() : 0
                        });
            }catch (Exception e){
                System.out.println(turma);
            }
        }
        jTable.setModel(tableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        coverjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        voltarjButton = new javax.swing.JButton();
        atualizarjButton = new javax.swing.JButton();
        removerjButton = new javax.swing.JButton();
        ReposicaoAulasjButton = new javax.swing.JButton();
        nomeCompletoJLabel = new javax.swing.JLabel();
        alunosjButton = new javax.swing.JButton();
        aulasjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        coverjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/turmaLista.png"))); // NOI18N
        getContentPane().add(coverjLabel);
        coverjLabel.setBounds(0, 0, 610, 192);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "E-mail", "Login"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 200, 560, 240);

        voltarjButton.setText("Voltar");
        voltarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarjButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarjButton);
        voltarjButton.setBounds(30, 450, 120, 40);

        atualizarjButton.setText("Atualizar");
        atualizarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarjButtonActionPerformed(evt);
            }
        });
        getContentPane().add(atualizarjButton);
        atualizarjButton.setBounds(230, 450, 140, 40);

        removerjButton.setText("Remover");
        removerjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerjButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removerjButton);
        removerjButton.setBounds(440, 450, 130, 40);

        ReposicaoAulasjButton.setText("Reposição");
        ReposicaoAulasjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReposicaoAulasjButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ReposicaoAulasjButton);
        ReposicaoAulasjButton.setBounds(440, 540, 140, 40);

        nomeCompletoJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        nomeCompletoJLabel.setForeground(new java.awt.Color(0, 77, 64));
        nomeCompletoJLabel.setText("Gerenciar:");
        getContentPane().add(nomeCompletoJLabel);
        nomeCompletoJLabel.setBounds(30, 500, 230, 30);

        alunosjButton.setText("Alunos");
        alunosjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alunosjButtonActionPerformed(evt);
            }
        });
        getContentPane().add(alunosjButton);
        alunosjButton.setBounds(30, 540, 120, 40);

        aulasjButton.setText("Aulas");
        aulasjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aulasjButtonActionPerformed(evt);
            }
        });
        getContentPane().add(aulasjButton);
        aulasjButton.setBounds(230, 540, 140, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atualizarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarjButtonActionPerformed
        try {
            new TurmaCadastro(controller.recuperar(Long.parseLong(jTable.getValueAt(jTable.getSelectedRow(), 0).toString())));
            this.dispose();
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Selecione um item da lista", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (EntidadeInexistenteException e){
            JOptionPane.showMessageDialog(null, "Erro ao carregar administrador selecionado", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_atualizarjButtonActionPerformed

    private void removerjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerjButtonActionPerformed
        try {
            Turma turma = controller.recuperar(Long.parseLong(jTable.getValueAt(jTable.getSelectedRow(), 0).toString()));
            if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover a disciplina?") == JOptionPane.OK_OPTION)
                controller.remover(turma);
            atualizarTabela();
        } catch (EntidadeInexistenteException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar disciplina selecionada", "Erro", JOptionPane.ERROR_MESSAGE);
        }catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Selecione um item da lista", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removerjButtonActionPerformed

    private void voltarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarjButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarjButtonActionPerformed

    private void alunosjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alunosjButtonActionPerformed
        try {
            new TurmaAlunoList(controller.recuperar(Long.parseLong(jTable.getValueAt(jTable.getSelectedRow(), 0).toString())));
        } catch (EntidadeInexistenteException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar turma selecionada", "Erro", JOptionPane.ERROR_MESSAGE);
        }catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Selecione um item da lista", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_alunosjButtonActionPerformed

    private void aulasjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aulasjButtonActionPerformed
        try {
            new TurmaAulasList(controller.recuperar(Long.parseLong(jTable.getValueAt(jTable.getSelectedRow(), 0).toString())));
        } catch (EntidadeInexistenteException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar turma selecionada", "Erro", JOptionPane.ERROR_MESSAGE);
        }catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Selecione um item da lista", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_aulasjButtonActionPerformed

    private void ReposicaoAulasjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReposicaoAulasjButtonActionPerformed
        try {
            new TurmaReposicaoAulasList(controller.recuperar(Long.parseLong(jTable.getValueAt(jTable.getSelectedRow(), 0).toString())));
        } catch (EntidadeInexistenteException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar turma selecionada", "Erro", JOptionPane.ERROR_MESSAGE);
        }catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Selecione um item da lista", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ReposicaoAulasjButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ReposicaoAulasjButton;
    private javax.swing.JButton alunosjButton;
    private javax.swing.JButton atualizarjButton;
    private javax.swing.JButton aulasjButton;
    private javax.swing.JLabel coverjLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel nomeCompletoJLabel;
    private javax.swing.JButton removerjButton;
    private javax.swing.JButton voltarjButton;
    // End of variables declaration//GEN-END:variables
}
