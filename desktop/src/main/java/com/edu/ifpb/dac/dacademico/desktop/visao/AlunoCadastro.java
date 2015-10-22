package com.edu.ifpb.dac.dacademico.desktop.visao;

import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.desktop.controladores.AlunoController;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Aluno;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author douglasgabriel
 */
public class AlunoCadastro extends javax.swing.JFrame {

    private AlunoController controller = new AlunoController();
    Aluno aluno;

    public AlunoCadastro() {
        inicializar();
    }

    //Deve ser chamado quando for para atualizar um admin já cadastrado
    public AlunoCadastro(Aluno aluno) {
        this.aluno = aluno;
        inicializar();
        setTitle("Atualização de Aluno");
        backgroundJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alunoUp.png")));
        entrarJButton.setText("Atualizar");
        nomeCompletoJTextField.setText(aluno.getNomeCompleto());
        emailJTextField.setText(aluno.getEmail());
        loginJTextField.setText(aluno.getLogin());
        senhaJPasswordField.setText(aluno.getSenha());
        cpfJTextField.setText(aluno.getCpf());
        matriculaJTextField.setText(aluno.getMatricula());
        rgJTextField.setText(aluno.getRg());
    }

    private void inicializar() {
        initComponents();
        setTitle("Cadastro de aluno");
        setResizable(false);
        setSize(480, 590);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        senhaJPasswordField = new javax.swing.JPasswordField();
        senhaJLabel = new javax.swing.JLabel();
        emailJTextField = new javax.swing.JTextField();
        nomeCompletoJTextField = new javax.swing.JTextField();
        nomeCompletoJLabel = new javax.swing.JLabel();
        voltarJButton = new javax.swing.JButton();
        entrarJButton = new javax.swing.JButton();
        emailJLabel = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        loginJTextField = new javax.swing.JTextField();
        backgroundJLabel = new javax.swing.JLabel();
        rgJTextField = new javax.swing.JTextField();
        matriculaJLabel = new javax.swing.JLabel();
        matriculaJTextField = new javax.swing.JTextField();
        cpfJLabel = new javax.swing.JLabel();
        cpfJTextField = new javax.swing.JTextField();
        rgJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(senhaJPasswordField);
        senhaJPasswordField.setBounds(240, 370, 210, 40);

        senhaJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        senhaJLabel.setForeground(new java.awt.Color(0, 77, 64));
        senhaJLabel.setText("Senha:");
        getContentPane().add(senhaJLabel);
        senhaJLabel.setBounds(240, 340, 80, 30);
        getContentPane().add(emailJTextField);
        emailJTextField.setBounds(10, 290, 440, 40);
        getContentPane().add(nomeCompletoJTextField);
        nomeCompletoJTextField.setBounds(10, 210, 440, 40);

        nomeCompletoJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        nomeCompletoJLabel.setForeground(new java.awt.Color(0, 77, 64));
        nomeCompletoJLabel.setText("Nome completo:");
        getContentPane().add(nomeCompletoJLabel);
        nomeCompletoJLabel.setBounds(10, 180, 230, 30);

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
        voltarJButton.setBounds(10, 520, 90, 40);

        entrarJButton.setText("Cadastrar");
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
        entrarJButton.setBounds(330, 520, 120, 40);

        emailJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        emailJLabel.setForeground(new java.awt.Color(0, 77, 64));
        emailJLabel.setText("E-mail:");
        getContentPane().add(emailJLabel);
        emailJLabel.setBounds(10, 260, 80, 30);

        loginJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        loginJLabel.setForeground(new java.awt.Color(0, 77, 64));
        loginJLabel.setText("Login:");
        getContentPane().add(loginJLabel);
        loginJLabel.setBounds(10, 340, 80, 30);
        getContentPane().add(loginJTextField);
        loginJTextField.setBounds(10, 370, 200, 40);

        backgroundJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alunoCadastro.png"))); // NOI18N
        getContentPane().add(backgroundJLabel);
        backgroundJLabel.setBounds(0, -10, 480, 200);
        getContentPane().add(rgJTextField);
        rgJTextField.setBounds(170, 450, 140, 40);

        matriculaJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        matriculaJLabel.setForeground(new java.awt.Color(0, 77, 64));
        matriculaJLabel.setText("Matrícula:");
        getContentPane().add(matriculaJLabel);
        matriculaJLabel.setBounds(330, 420, 120, 30);
        getContentPane().add(matriculaJTextField);
        matriculaJTextField.setBounds(330, 450, 120, 40);

        cpfJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        cpfJLabel.setForeground(new java.awt.Color(0, 77, 64));
        cpfJLabel.setText("CPF:");
        getContentPane().add(cpfJLabel);
        cpfJLabel.setBounds(10, 420, 80, 30);
        getContentPane().add(cpfJTextField);
        cpfJTextField.setBounds(10, 450, 140, 40);

        rgJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        rgJLabel.setForeground(new java.awt.Color(0, 77, 64));
        rgJLabel.setText("RG:");
        getContentPane().add(rgJLabel);
        rgJLabel.setBounds(170, 420, 80, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarJButtonMouseClicked

    }//GEN-LAST:event_entrarJButtonMouseClicked

    private boolean temInformacoesObrigatoriasVazias() {
        String nomeCompleto = nomeCompletoJTextField.getText();
        String email = emailJTextField.getText();
        String login = loginJTextField.getText();
        String senha = senhaJPasswordField.getPassword().toString();
        String cpf = cpfJTextField.getText();
        String matricula = matriculaJTextField.getText();
        String rg = rgJTextField.getText();
        if (nomeCompleto.trim().isEmpty()
                || email.trim().isEmpty()
                || login.trim().isEmpty()
                || senha.trim().isEmpty()
                || cpf.trim().isEmpty()
                || rg.trim().isEmpty()
                || matricula.trim().isEmpty()) {
            return true;
        }
        return false;
    }

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
        if (temInformacoesObrigatoriasVazias()) {
            JOptionPane.showMessageDialog(null, "Preencha todas as informações", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String nomeCompleto = nomeCompletoJTextField.getText();
        String email = emailJTextField.getText();
        String login = loginJTextField.getText();
        String senha = new String(senhaJPasswordField.getPassword());
        String cpf = cpfJTextField.getText();
        String matricula = matriculaJTextField.getText();
        String rg = rgJTextField.getText();
        String mensagemSucesso;
        boolean jaExiste;
        if (aluno == null) {
            aluno = new Aluno();
            mensagemSucesso = "Aluno cadastrado com sucesso";
            jaExiste = false;
        } else {
            mensagemSucesso = "Aluno atualizado com sucesso";
            jaExiste = true;
        }
        aluno.setEmail(email);
        aluno.setLogin(login);
        aluno.setNomeCompleto(nomeCompleto);
        aluno.setSenha(senha);
        aluno.setCpf(cpf);
        aluno.setRg(rg);
        aluno.setMatricula(matricula);
        if (jaExiste) {
            try {
                controller.atualizar(aluno);
            } catch (ValidacaoException e) {
                e.getErrors().forEach(x -> JOptionPane.showMessageDialog(null, x.toString(), "Erro", JOptionPane.ERROR_MESSAGE));
                return;
            }
        } else{
            try {
                controller.cadastrar(aluno);
            } catch (ValidacaoException e) {
                e.getErrors().forEach(x -> JOptionPane.showMessageDialog(null, x.toString(), "Erro", JOptionPane.ERROR_MESSAGE));
                return;
            }
        }
        JOptionPane.showMessageDialog(null, mensagemSucesso, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_entrarJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundJLabel;
    private javax.swing.JLabel cpfJLabel;
    private javax.swing.JTextField cpfJTextField;
    private javax.swing.JLabel emailJLabel;
    private javax.swing.JTextField emailJTextField;
    private javax.swing.JButton entrarJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JTextField loginJTextField;
    private javax.swing.JLabel matriculaJLabel;
    private javax.swing.JTextField matriculaJTextField;
    private javax.swing.JLabel nomeCompletoJLabel;
    private javax.swing.JTextField nomeCompletoJTextField;
    private javax.swing.JLabel rgJLabel;
    private javax.swing.JTextField rgJTextField;
    private javax.swing.JLabel senhaJLabel;
    private javax.swing.JPasswordField senhaJPasswordField;
    private javax.swing.JButton voltarJButton;
    // End of variables declaration//GEN-END:variables
}
