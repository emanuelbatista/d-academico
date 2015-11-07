package com.edu.ifpb.dac.dacademico.desktop.visao;

import com.edu.ifpb.dac.dacademico.core.exceptions.LoginInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.SenhaErradaException;
import com.edu.ifpb.dac.dacademico.desktop.controladores.LoginController;
import java.awt.KeyEventPostProcessor;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author douglasgabriel
 */
public class Login extends javax.swing.JFrame {

    private LoginController controller = new LoginController();

    public Login() {
        initComponents();
        setTitle("Login");
        setResizable(false);
        setSize(480, 503);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        senhaJPasswordField = new javax.swing.JPasswordField();
        senhaJLabel = new javax.swing.JLabel();
        loginJTextField = new javax.swing.JTextField();
        loginJLabel = new javax.swing.JLabel();
        voltarJButton = new javax.swing.JButton();
        entrarJButton = new javax.swing.JButton();
        backgroundJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(senhaJPasswordField);
        senhaJPasswordField.setBounds(90, 310, 320, 40);

        senhaJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        senhaJLabel.setForeground(java.awt.Color.white);
        senhaJLabel.setText("Senha:");
        getContentPane().add(senhaJLabel);
        senhaJLabel.setBounds(90, 280, 80, 30);
        getContentPane().add(loginJTextField);
        loginJTextField.setBounds(90, 230, 320, 40);

        loginJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        loginJLabel.setForeground(java.awt.Color.white);
        loginJLabel.setText("Login:");
        getContentPane().add(loginJLabel);
        loginJLabel.setBounds(90, 200, 80, 30);

        voltarJButton.setText("Voltar");
        voltarJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarJButtonMouseClicked(evt);
            }
        });
        voltarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarJButton);
        voltarJButton.setBounds(90, 420, 90, 40);

        entrarJButton.setText("Entrar");
        entrarJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarJButtonMouseClicked(evt);
            }
        });
        entrarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(entrarJButton);
        entrarJButton.setBounds(320, 420, 90, 40);

        backgroundJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login_background.png"))); // NOI18N
        getContentPane().add(backgroundJLabel);
        backgroundJLabel.setBounds(0, 0, 501, 501);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarJButtonMouseClicked
        
    }//GEN-LAST:event_entrarJButtonMouseClicked

    private void voltarJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarJButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_voltarJButtonMouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            entrarJButton.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_formKeyPressed

    private void voltarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarJButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarJButtonActionPerformed

    private void entrarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarJButtonActionPerformed
        String login = loginJTextField.getText();
        String senha = new String(senhaJPasswordField.getPassword());
        if (!login.trim().isEmpty() && !senha.trim().isEmpty()) {
            try {
                new Principal (controller.login(login, senha));
                this.dispose();
            } catch (LoginInexistenteException e) {
                JOptionPane.showMessageDialog(null, "O login informado não existe","Erro no login", JOptionPane.ERROR_MESSAGE);
            } catch (SenhaErradaException e) {
                JOptionPane.showMessageDialog(null, "A senha informada não conrresponde ao login", "Erro no login", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_entrarJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundJLabel;
    private javax.swing.JButton entrarJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JTextField loginJTextField;
    private javax.swing.JLabel senhaJLabel;
    private javax.swing.JPasswordField senhaJPasswordField;
    private javax.swing.JButton voltarJButton;
    // End of variables declaration//GEN-END:variables
}
