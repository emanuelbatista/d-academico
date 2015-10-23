package com.edu.ifpb.dac.dacademico.desktop.visao;

import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.desktop.controladores.CursoController;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Curso;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author douglasgabriel
 */
public class CursoCadastro extends javax.swing.JFrame {

    private CursoController controller = new CursoController();
    Curso curso;

    public CursoCadastro() {
        inicializar();
    }

    //Deve ser chamado quando for para atualizar um admin já cadastrado
    public CursoCadastro(Curso curso) {
        this.curso = curso;
        inicializar();
        setTitle("Atualização de curso");
        backgroundJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cursoUp.png")));
        entrarJButton.setText("Atualizar");
        nomeJTextField.setText(curso.getDescricao());
        abreviacaoJTextField.setText(curso.getAbreviacao());
        unidadeJTextField.setText(curso.getUnidade());
        periodojSpinner.setValue(curso.getPeriodo());
    }

    private void inicializar() {
        initComponents();
        setTitle("Cadastro de curso");
        setResizable(false);
        setSize(480, 590);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        periodoJLabel = new javax.swing.JLabel();
        abreviacaoJTextField = new javax.swing.JTextField();
        nomeJTextField = new javax.swing.JTextField();
        nomeJLabel = new javax.swing.JLabel();
        voltarJButton = new javax.swing.JButton();
        entrarJButton = new javax.swing.JButton();
        abreviacaoJLabel = new javax.swing.JLabel();
        unidadeJLabel = new javax.swing.JLabel();
        unidadeJTextField = new javax.swing.JTextField();
        backgroundJLabel = new javax.swing.JLabel();
        periodojSpinner = new javax.swing.JSpinner();
        backgroundJLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        periodoJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        periodoJLabel.setForeground(new java.awt.Color(0, 77, 64));
        periodoJLabel.setText("Períodos:");
        getContentPane().add(periodoJLabel);
        periodoJLabel.setBounds(10, 450, 80, 30);
        getContentPane().add(abreviacaoJTextField);
        abreviacaoJTextField.setBounds(10, 310, 440, 40);
        getContentPane().add(nomeJTextField);
        nomeJTextField.setBounds(10, 230, 440, 40);

        nomeJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        nomeJLabel.setForeground(new java.awt.Color(0, 77, 64));
        nomeJLabel.setText("Nome:");
        getContentPane().add(nomeJLabel);
        nomeJLabel.setBounds(10, 200, 230, 30);

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

        abreviacaoJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        abreviacaoJLabel.setForeground(new java.awt.Color(0, 77, 64));
        abreviacaoJLabel.setText("Abreviação:");
        getContentPane().add(abreviacaoJLabel);
        abreviacaoJLabel.setBounds(10, 280, 80, 30);

        unidadeJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        unidadeJLabel.setForeground(new java.awt.Color(0, 77, 64));
        unidadeJLabel.setText("Unidade:");
        getContentPane().add(unidadeJLabel);
        unidadeJLabel.setBounds(10, 360, 80, 30);
        getContentPane().add(unidadeJTextField);
        unidadeJTextField.setBounds(10, 390, 440, 40);
        getContentPane().add(backgroundJLabel);
        backgroundJLabel.setBounds(0, -10, 480, 200);

        periodojSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        getContentPane().add(periodojSpinner);
        periodojSpinner.setBounds(90, 450, 60, 30);

        backgroundJLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cursoCadastro.png"))); // NOI18N
        getContentPane().add(backgroundJLabel1);
        backgroundJLabel1.setBounds(0, -10, 480, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarJButtonMouseClicked

    }//GEN-LAST:event_entrarJButtonMouseClicked

    private boolean temInformacoesObrigatoriasVazias() {
        String nome = nomeJTextField.getText();
        String abreviacao = abreviacaoJTextField.getText();
        String unidade = unidadeJTextField.getText();
        if (nome.trim().isEmpty()
                || abreviacao.trim().isEmpty()
                || unidade.trim().isEmpty()) {
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
        String nome = nomeJTextField.getText();
        String abreviacao = abreviacaoJTextField.getText();
        String unidade = unidadeJTextField.getText();
        Integer periodo =Integer.valueOf(periodojSpinner.getValue().toString());
        String mensagemSucesso;
        boolean jaExiste;
        if (curso == null) {
            curso = new Curso();
            mensagemSucesso = "Curso cadastrado com sucesso";
            jaExiste = false;
        } else {
            mensagemSucesso = "Curso atualizado com sucesso";
            jaExiste = true;
        }
        curso.setAbreviacao(abreviacao);
        curso.setUnidade(unidade);
        curso.setDescricao(nome);
        curso.setPeriodo(periodo);
        try {
            if (jaExiste) {
                controller.atualizar(curso);
            } else {
                controller.cadastro(curso);
            }
        } catch (ValidacaoException e) {
            e.getErrors().forEach(x -> JOptionPane.showMessageDialog(null, x.toString(), "Erro", JOptionPane.ERROR_MESSAGE));
            return;
        }
        JOptionPane.showMessageDialog(null, mensagemSucesso, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_entrarJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abreviacaoJLabel;
    private javax.swing.JTextField abreviacaoJTextField;
    private javax.swing.JLabel backgroundJLabel;
    private javax.swing.JLabel backgroundJLabel1;
    private javax.swing.JButton entrarJButton;
    private javax.swing.JLabel nomeJLabel;
    private javax.swing.JTextField nomeJTextField;
    private javax.swing.JLabel periodoJLabel;
    private javax.swing.JSpinner periodojSpinner;
    private javax.swing.JLabel unidadeJLabel;
    private javax.swing.JTextField unidadeJTextField;
    private javax.swing.JButton voltarJButton;
    // End of variables declaration//GEN-END:variables
}
