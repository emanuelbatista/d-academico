package com.edu.ifpb.dac.dacademico.desktop.visao;

import com.edu.ifpb.dac.dacademico.core.exceptions.EntidadeInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.desktop.controladores.TurmaController;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Aluno;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Aula;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Horario;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Laboratorio;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Sala;
import com.edu.ifpb.dac.dacademico.entidades.dominio.SalaNormal;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Turma;
import java.time.DayOfWeek;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author douglasgabriel
 */
public class TurmaAulasList extends javax.swing.JFrame {

    private enum TabelaHorario {
        
        M1(1), M2(2), M3(3), M4(4), M5(5), T1(6), T2(7), T3(8), T4(9), T5(10)
        , N1(11), N2(12), N3(13), N4(14);
        
        int posicao;
        
        private TabelaHorario (int posicao){
            this.posicao = posicao;
        }
    }
    
    private TurmaController controller = new TurmaController();
    private DefaultTableModel tableModel;
    private Turma turma;

    public TurmaAulasList(Turma turma) {
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
        tableModel.addColumn("Horário");
        tableModel.addColumn("Segunda-Feira");
        tableModel.addColumn("Terça-Feira");
        tableModel.addColumn("Quarta-Feira");
        tableModel.addColumn("Quinta-Feira");
        tableModel.addColumn("Sexta-Feira");
        for (TabelaHorario horario : TabelaHorario.values()){
            tableModel.addRow(new Object[]{horario.toString()});            
        }
        for (Aula aula : turma.getAulas()) {
            try {
                tableModel.setValueAt(
                        aula
                        , TabelaHorario.valueOf(aula.getHorario().getDescricao()).posicao-1
                        , aula.getDia().getValue()
                );
            } catch (Exception e) {
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
        SalaJLabel = new javax.swing.JLabel();
        salaTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        SalaJLabel1 = new javax.swing.JLabel();
        laboratoriojTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        coverjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/turmaAulas.png"))); // NOI18N
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
        jScrollPane1.setBounds(20, 230, 430, 150);

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

        SalaJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        SalaJLabel.setForeground(new java.awt.Color(0, 77, 64));
        SalaJLabel.setText("Sala:");
        getContentPane().add(SalaJLabel);
        SalaJLabel.setBounds(20, 390, 40, 30);
        getContentPane().add(salaTextField);
        salaTextField.setBounds(60, 390, 130, 30);

        jLabel1.setText("Digite a abreviação de uma sala ou laboratório.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 430, 360, 14);

        SalaJLabel1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        SalaJLabel1.setForeground(new java.awt.Color(0, 77, 64));
        SalaJLabel1.setText("Laboratório:");
        getContentPane().add(SalaJLabel1);
        SalaJLabel1.setBounds(210, 390, 90, 30);
        getContentPane().add(laboratoriojTextField);
        laboratoriojTextField.setBounds(300, 390, 150, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarjButtonActionPerformed
        try {
            if (jTable.getSelectedColumn()== 0){
                JOptionPane.showMessageDialog(null, "A célula da tabela selecionada não é válida", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            if (jTable.getValueAt(jTable.getSelectedRow(), jTable.getSelectedColumn()) == null){
                Aula aula = new Aula();
                aula.setTurma(turma);
                Horario horario = controller.recuperarHorarioPelaDescricao((String)jTable.getValueAt(jTable.getSelectedRow(), 0));
                aula.setHorario(horario);
                aula.setDia(DayOfWeek.of(jTable.getSelectedColumn()));
                if((salaTextField.getText().equals(""))&&(laboratoriojTextField.getText().equals(""))){
                    JOptionPane.showMessageDialog(null, "Adicione a abreviação de uma sala ou laboratorio para a aula!", "Erro", JOptionPane.ERROR_MESSAGE);
                }else{
                try{
                    if(laboratoriojTextField.getText().equals("")){
                        SalaNormal sala = controller.recuperarSalaNormalPelaAbreviacao(salaTextField.getText());
                        aula.setSalaNormal(sala);
                        
                    }else{
                        Laboratorio lab = controller.recuperarLaboratorioPelaAbreviacao(laboratoriojTextField.getText());
                        aula.setLaboratorio(lab);
                    }
                } catch(EntidadeInexistenteException e){
                        JOptionPane.showMessageDialog(null, "Abreviações informadas não existem!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
                
//                do {
//                    try{
//                        if (aula.getSalas().size() > 0)
//                            if (!(JOptionPane.showConfirmDialog(null, "Deseja atribuir mais uma sala para a aula?") == JOptionPane.OK_OPTION))
//                                break;
//                        sala = controller.recuperarSalaPelaAbreviacao(JOptionPane.showInputDialog(null, "Informe a abreviação da sala que a aula será realizada"));
//                    }catch( EntidadeInexistenteException e){
//                        JOptionPane.showMessageDialog(null, "Nenhuma sala encontrada com essa abreviação", "Erro", JOptionPane.ERROR_MESSAGE);
//                        if (aula.getSalas().size() <= 0)
//                            JOptionPane.showMessageDialog(null, "É necessário atribuir pelo menos uma sala para a aula", "Erro", JOptionPane.ERROR_MESSAGE);
//                        continue;
//                    }
//                }while(sala != null);
                turma.getAulas().add(aula);
                controller.atualizar(turma);
                atualizarTabela();
                }
            }else {
                JOptionPane.showMessageDialog(null, "Já existe uma aula neste horário", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Selecione um item da lista", "Erro", JOptionPane.ERROR_MESSAGE);
        }catch (EntidadeInexistenteException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar o horário", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (ValidacaoException e) {
            e.getErrors().forEach(x -> JOptionPane.showMessageDialog(null, x.toString(), "Erro", JOptionPane.ERROR_MESSAGE));
        }
    }//GEN-LAST:event_adicionarjButtonActionPerformed

    private void removerjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerjButtonActionPerformed
        try {
            Aula aula = (Aula) jTable.getValueAt(jTable.getSelectedRow(), jTable.getSelectedColumn());
            if (aula != null){                
                turma.getAulas().remove(aula);
                controller.atualizar(turma);
                controller.removerAula(aula);
                atualizarTabela();
            }else {
                JOptionPane.showMessageDialog(null, "Não existe aula cadastrada para este horário", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Selecione um item da lista", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (ValidacaoException e) {
            e.getErrors().forEach(x -> JOptionPane.showMessageDialog(null, x.toString(), "Erro", JOptionPane.ERROR_MESSAGE));
        }
    }//GEN-LAST:event_removerjButtonActionPerformed

    private void voltarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarjButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarjButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SalaJLabel;
    private javax.swing.JLabel SalaJLabel1;
    private javax.swing.JButton adicionarjButton;
    private javax.swing.JLabel coverjLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField laboratoriojTextField;
    private javax.swing.JLabel nomeTurmaJLabel;
    private javax.swing.JButton removerjButton;
    private javax.swing.JTextField salaTextField;
    private javax.swing.JButton voltarjButton;
    // End of variables declaration//GEN-END:variables
}
