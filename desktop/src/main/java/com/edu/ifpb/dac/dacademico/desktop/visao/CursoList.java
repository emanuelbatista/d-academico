package com.edu.ifpb.dac.dacademico.desktop.visao;

import com.edu.ifpb.dac.dacademico.core.exceptions.EntidadeInexistenteException;
import com.edu.ifpb.dac.dacademico.desktop.controladores.CursoController;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Curso;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author douglasgabriel
 */
public class CursoList extends javax.swing.JFrame {

    CursoController controller = new CursoController();
    DefaultTableModel tableModel;

    public CursoList() {
        initComponents();
        setTitle("Lista de cursos");
        setResizable(false);
        setSize(480, 573);
        setLocationRelativeTo(null);
        setVisible(true);        
        atualizarTabela();
    }

    private void atualizarTabela() {
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Codigo");
        tableModel.addColumn("Nome");
        tableModel.addColumn("Abreviação");
        tableModel.addColumn("Unidade");
        tableModel.addColumn("Períodos");
        List<Curso> cursos = controller.listarTodos();
        for (Curso curso : cursos) {
            tableModel.addRow(new Object[]{curso.getCod(),curso.getDescricao(), curso.getAbreviacao(), curso.getUnidade(), curso.getPeriodo()});
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        coverjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cursoLista.png"))); // NOI18N
        getContentPane().add(coverjLabel);
        coverjLabel.setBounds(0, 0, 518, 192);

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
        jScrollPane1.setBounds(20, 200, 450, 240);

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
        atualizarjButton.setBounds(170, 450, 140, 40);

        removerjButton.setText("Remover");
        removerjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerjButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removerjButton);
        removerjButton.setBounds(325, 450, 130, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atualizarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarjButtonActionPerformed
        try {
            new CursoCadastro(controller.recuperar(Long.parseLong(jTable.getValueAt(jTable.getSelectedRow(), 0).toString())));
            this.dispose();
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Selecione um item da lista", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (EntidadeInexistenteException e){
            JOptionPane.showMessageDialog(null, "Erro ao carregar administrador selecionado", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_atualizarjButtonActionPerformed

    private void removerjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerjButtonActionPerformed
        try {
            Curso curso = controller.recuperar(Long.parseLong(jTable.getValueAt(jTable.getSelectedRow(), 0).toString()));
            if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover o curso") == JOptionPane.OK_OPTION)
                controller.remover(curso);
            atualizarTabela();
        }catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Selecione um item da lista", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (EntidadeInexistenteException ex) {
            Logger.getLogger(CursoList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_removerjButtonActionPerformed

    private void voltarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarjButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarjButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarjButton;
    private javax.swing.JLabel coverjLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton removerjButton;
    private javax.swing.JButton voltarjButton;
    // End of variables declaration//GEN-END:variables
}
