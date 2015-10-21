package com.edu.ifpb.dac.dacademico.desktop.visao;

import com.edu.ifpb.dac.dacademico.desktop.controladores.AdminController;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Administrador;
import java.util.List;
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
    
    private void atualizarTabela (){
        List<Administrador> admins = controller.listarTodos();
        for (Administrador admin : admins){
            tableModel.addRow(new Object[] {admin.getNomeCompleto(), admin.getEmail(), admin.getLogin()});
        }
        jTable.setModel(tableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        coverjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        coverjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adminLista.png"))); // NOI18N
        getContentPane().add(coverjLabel);
        coverjLabel.setBounds(0, 0, 517, 194);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "E-mail", "Login"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 192, 490, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel coverjLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
