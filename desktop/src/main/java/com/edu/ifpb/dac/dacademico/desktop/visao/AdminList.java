package com.edu.ifpb.dac.dacademico.desktop.visao;

import com.edu.ifpb.dac.dacademico.core.exceptions.LoginInexistenteException;
import com.edu.ifpb.dac.dacademico.desktop.controladores.AdminController;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Administrador;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author douglasgabriel
 */
public class AdminList extends javax.swing.JFrame {

    AdminController controller = new AdminController();
    DefaultTableModel tableModel = new DefaultTableModel();

    public AdminList() {
        initComponents();
        setTitle("Lista de administradores");
        setResizable(false);
        setSize(480, 573);
        setLocationRelativeTo(null);
        setVisible(true);
        tableModel.addColumn("Nome");
        tableModel.addColumn("E-mail");
        tableModel.addColumn("Login");
        atualizarTabela();
    }

    private void atualizarTabela() {
        List<Administrador> admins = controller.listarTodos();
        for (Administrador admin : admins) {
            tableModel.addRow(new Object[]{admin.getNomeCompleto(), admin.getEmail(), admin.getLogin()});
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

        coverjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adminLista.png"))); // NOI18N
        getContentPane().add(coverjLabel);
        coverjLabel.setBounds(0, 0, 517, 194);

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
        getContentPane().add(removerjButton);
        removerjButton.setBounds(325, 450, 130, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atualizarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarjButtonActionPerformed
        try {
            new AdminCadastro(controller.recuperarPeloLogin(jTable.getValueAt(jTable.getSelectedRow(), 2).toString()));
            this.dispose();
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Selecione um item da lista", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (LoginInexistenteException e){
            JOptionPane.showMessageDialog(null, "Erro ao carregar administrador selecionado", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_atualizarjButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarjButton;
    private javax.swing.JLabel coverjLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton removerjButton;
    private javax.swing.JButton voltarjButton;
    // End of variables declaration//GEN-END:variables
}
