package com.edu.ifpb.dac.dacademico.desktop.visao;

import com.edu.ifpb.dac.dacademico.core.exceptions.LoginInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.SenhaErradaException;
import com.edu.ifpb.dac.dacademico.desktop.controladores.LoginController;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Professor;
import com.edu.ifpb.dac.dacademico.entidades.dominio.TipoUsuario;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author douglasgabriel
 */
public class Login extends javax.swing.JFrame {

    private TipoUsuario tipoUsuario;
    private LoginController controller = new LoginController();

    public Login(TipoUsuario tipoUsuario) {
        initComponents();
        setTitle("Login");
        setResizable(false);
        setSize(480, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        this.tipoUsuario = tipoUsuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        senhaJPasswordField = new javax.swing.JPasswordField();
        senhaJLabel = new javax.swing.JLabel();
        loginJTextField1 = new javax.swing.JTextField();
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
        senhaJPasswordField.setBounds(20, 350, 440, 40);

        senhaJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        senhaJLabel.setForeground(java.awt.Color.white);
        senhaJLabel.setText("Senha:");
        getContentPane().add(senhaJLabel);
        senhaJLabel.setBounds(20, 320, 80, 30);
        getContentPane().add(loginJTextField1);
        loginJTextField1.setBounds(20, 260, 440, 40);

        loginJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        loginJLabel.setForeground(java.awt.Color.white);
        loginJLabel.setText("Login:");
        getContentPane().add(loginJLabel);
        loginJLabel.setBounds(20, 230, 80, 30);

        voltarJButton.setText("Voltar");
        voltarJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarJButtonMouseClicked(evt);
            }
        });
        getContentPane().add(voltarJButton);
        voltarJButton.setBounds(20, 420, 90, 40);

        entrarJButton.setText("Entrar");
        entrarJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarJButtonMouseClicked(evt);
            }
        });
        getContentPane().add(entrarJButton);
        entrarJButton.setBounds(360, 420, 90, 40);

        backgroundJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/inicio_background.png"))); // NOI18N
        getContentPane().add(backgroundJLabel);
        backgroundJLabel.setBounds(0, -180, 1367, 769);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarJButtonMouseClicked
        String login = loginJLabel.getText();
        String senha = new String(senhaJPasswordField.getPassword());
        if (!login.trim().isEmpty() && !senha.trim().isEmpty()) {
            Professor professor = null;
            try {
                professor = controller.login(login, senha);
            } catch (LoginInexistenteException e) {
                JOptionPane.showMessageDialog(null, "Erro no login", "O login informado não existe", JOptionPane.ERROR_MESSAGE);
            } catch (SenhaErradaException e) {
                JOptionPane.showMessageDialog(null, "Erro no login", "A senha informada não conrresponde ao login", JOptionPane.ERROR_MESSAGE);
            }
            if (professor != null) {
                JOptionPane.showMessageDialog(null, "Sucesso", "Você conseguiu se logar", JOptionPane.INFORMATION_MESSAGE);
            }
        }
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundJLabel;
    private javax.swing.JButton entrarJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JTextField loginJTextField1;
    private javax.swing.JLabel senhaJLabel;
    private javax.swing.JPasswordField senhaJPasswordField;
    private javax.swing.JButton voltarJButton;
    // End of variables declaration//GEN-END:variables
}
