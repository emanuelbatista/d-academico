package com.edu.ifpb.dac.dacademico.desktop.visao;

import com.edu.ifpb.dac.dacademico.core.exceptions.EntidadeInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.desktop.controladores.TurmaController;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Aluno;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Turma;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author douglasgabriel
 */
public class TurmaAulaList extends javax.swing.JFrame {

    private TurmaController controller = new TurmaController();
    private DefaultTableModel tableModel;
    private Turma turma;

    public TurmaAulaList(Turma turma) {
        this.turma = turma;
        initComponents();
        nomeTurmaJLabel.setText(turma.getDisciplina().getDescricao() + ", " + turma.getCurso().getDescricao());
        setTitle("Lista de alunos de turma");
        setResizable(false);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        atualizarTabela();
    }

    private void atualizarTabela() {
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Nome");
        tableModel.addColumn("E-mail");
        tableModel.addColumn("Matrícula");
        for (Aluno aluno : turma.getAlunos()) {
            try {
                tableModel.addRow(
                        new Object[]{
                            aluno.getNomeCompleto(), aluno.getEmail(), aluno.getMatricula()
                        });
            } catch (Exception e) {
                System.out.println(aluno);
                continue;
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
        adicionarjButton = new javax.swing.JButton();
        removerjButton = new javax.swing.JButton();
        nomeTurmaJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        coverjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/turmaGerenciarAluno.png"))); // NOI18N
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
        jScrollPane1.setBounds(20, 230, 430, 210);

        voltarjButton.setText("Voltar");
        voltarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarjButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarjButton);
        voltarjButton.setBounds(20, 450, 120, 40);

        adicionarjButton.setText("Adicionar");
        adicionarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarjButtonActionPerformed(evt);
            }
        });
        getContentPane().add(adicionarjButton);
        adicionarjButton.setBounds(160, 450, 140, 40);

        removerjButton.setText("Remover");
        removerjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerjButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removerjButton);
        removerjButton.setBounds(320, 450, 130, 40);

        nomeTurmaJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        nomeTurmaJLabel.setForeground(new java.awt.Color(0, 77, 64));
        nomeTurmaJLabel.setText("Nome da turma");
        getContentPane().add(nomeTurmaJLabel);
        nomeTurmaJLabel.setBounds(20, 190, 430, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarjButtonActionPerformed
        try {
            String matricula = JOptionPane.showInputDialog(null, "Informe a matrícula do aluno:");
            Aluno aluno = controller.recuperarAlunoPelaMatricula(matricula);
            turma.getAlunos().add(aluno);
            aluno.getTurmas().add(turma);
            controller.atualizar(turma);
            atualizarTabela();
        } catch (EntidadeInexistenteException e) {
            JOptionPane.showMessageDialog(null, "Nenhuma aluno com a matricula informada foi encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (ValidacaoException e) {
            e.getErrors().forEach(x -> JOptionPane.showMessageDialog(null, x.toString(), "Erro", JOptionPane.ERROR_MESSAGE));
        }
    }//GEN-LAST:event_adicionarjButtonActionPerformed

    private void removerjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerjButtonActionPerformed
        try {
            Aluno aluno = controller.recuperarAlunoPelaMatricula(jTable.getValueAt(jTable.getSelectedRow(), 2).toString());
            if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover o aluno?") == JOptionPane.OK_OPTION) {
                turma.getAlunos().remove(aluno);
                aluno.getTurmas().remove(turma);
            }
            controller.atualizar(turma);
            atualizarTabela();
        } catch (EntidadeInexistenteException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar disciplina selecionada", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Selecione um item da lista", "Erro", JOptionPane.ERROR_MESSAGE);
        }catch (ValidacaoException e) {
            e.getErrors().forEach(x -> JOptionPane.showMessageDialog(null, x.toString(), "Erro", JOptionPane.ERROR_MESSAGE));
        }
    }//GEN-LAST:event_removerjButtonActionPerformed

    private void voltarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarjButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarjButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarjButton;
    private javax.swing.JLabel coverjLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel nomeTurmaJLabel;
    private javax.swing.JButton removerjButton;
    private javax.swing.JButton voltarjButton;
    // End of variables declaration//GEN-END:variables
}
