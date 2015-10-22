package com.edu.ifpb.dac.dacademico.desktop.visao;

import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.desktop.controladores.DisciplinaController;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Curso;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Disciplina;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author douglasgabriel
 */
public class DisciplinaCadastro extends javax.swing.JFrame {

    private DisciplinaController controller = new DisciplinaController();
    Disciplina disciplina;

    public DisciplinaCadastro() {
        inicializar();
    }

    //Deve ser chamado quando for para atualizar um admin já cadastrado
    public DisciplinaCadastro(Disciplina disciplina) {
        this.disciplina = disciplina;
        inicializar();
        setTitle("Atualização de disciplina");
        backgroundJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alunoUp.png")));
        entrarJButton.setText("Atualizar");
        nomeJTextField.setText(disciplina.getDescricao());
        abreviacaoJTextField.setText(disciplina.getAbreviacao());
        cargaHorariajSpinner.setValue(disciplina.getCargaHoraria());
        periodojSpinner.setValue(disciplina.getPeriodo());
        aulasPorSemanajSpinner.setValue(disciplina.getAulasPorSemana());
    }

    private void inicializar() {
        initComponents();
        setTitle("Cadastro de aluno");
        setResizable(false);
        setSize(480, 590);
        setLocationRelativeTo(null);
        setVisible(true);        
    }
    
    private void iniciarComboBox (){
        List<Curso> cursos = controller.listarCursos();
        for (Curso curso : cursos)
            cursojComboBox.addItem(curso.getDescricao());
        if (disciplina != null)
            cursojComboBox.setSelectedItem(disciplina.getCurso().getDescricao());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        abreviacaoJTextField = new javax.swing.JTextField();
        nomeJTextField = new javax.swing.JTextField();
        nomeJLabel = new javax.swing.JLabel();
        voltarJButton = new javax.swing.JButton();
        entrarJButton = new javax.swing.JButton();
        abreviacaolJLabel = new javax.swing.JLabel();
        cursoJLabel = new javax.swing.JLabel();
        backgroundJLabel = new javax.swing.JLabel();
        cargaHorariajSpinner = new javax.swing.JSpinner();
        periodoJLabel = new javax.swing.JLabel();
        periodojSpinner = new javax.swing.JSpinner();
        aulasPorSemanaJLabel = new javax.swing.JLabel();
        aulasPorSemanajSpinner = new javax.swing.JSpinner();
        cursojComboBox = new javax.swing.JComboBox();
        cargaHorariaJLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(abreviacaoJTextField);
        abreviacaoJTextField.setBounds(10, 290, 440, 40);
        getContentPane().add(nomeJTextField);
        nomeJTextField.setBounds(10, 210, 440, 40);

        nomeJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        nomeJLabel.setForeground(new java.awt.Color(0, 77, 64));
        nomeJLabel.setText("Nome:");
        getContentPane().add(nomeJLabel);
        nomeJLabel.setBounds(10, 180, 230, 30);

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

        abreviacaolJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        abreviacaolJLabel.setForeground(new java.awt.Color(0, 77, 64));
        abreviacaolJLabel.setText("Abreviação:");
        getContentPane().add(abreviacaolJLabel);
        abreviacaolJLabel.setBounds(10, 260, 80, 30);

        cursoJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        cursoJLabel.setForeground(new java.awt.Color(0, 77, 64));
        cursoJLabel.setText("Curso:");
        getContentPane().add(cursoJLabel);
        cursoJLabel.setBounds(10, 420, 130, 30);

        backgroundJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alunoCadastro.png"))); // NOI18N
        getContentPane().add(backgroundJLabel);
        backgroundJLabel.setBounds(0, -10, 480, 200);

        cargaHorariajSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        getContentPane().add(cargaHorariajSpinner);
        cargaHorariajSpinner.setBounds(10, 370, 100, 30);

        periodoJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        periodoJLabel.setForeground(new java.awt.Color(0, 77, 64));
        periodoJLabel.setText("Período");
        getContentPane().add(periodoJLabel);
        periodoJLabel.setBounds(160, 340, 130, 30);

        periodojSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        getContentPane().add(periodojSpinner);
        periodojSpinner.setBounds(160, 370, 100, 30);

        aulasPorSemanaJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        aulasPorSemanaJLabel.setForeground(new java.awt.Color(0, 77, 64));
        aulasPorSemanaJLabel.setText("Aulas por semana");
        getContentPane().add(aulasPorSemanaJLabel);
        aulasPorSemanaJLabel.setBounds(310, 340, 140, 30);

        aulasPorSemanajSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        getContentPane().add(aulasPorSemanajSpinner);
        aulasPorSemanajSpinner.setBounds(310, 370, 100, 30);

        getContentPane().add(cursojComboBox);
        cursojComboBox.setBounds(10, 450, 430, 40);

        cargaHorariaJLabel1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        cargaHorariaJLabel1.setForeground(new java.awt.Color(0, 77, 64));
        cargaHorariaJLabel1.setText("Carga horária:");
        getContentPane().add(cargaHorariaJLabel1);
        cargaHorariaJLabel1.setBounds(10, 340, 130, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarJButtonMouseClicked

    }//GEN-LAST:event_entrarJButtonMouseClicked

    private boolean temInformacoesObrigatoriasVazias() {
        String nome = nomeJTextField.getText();
        String abreviacao = abreviacaoJTextField.getText();
        if (nome.trim().isEmpty() || abreviacao.trim().isEmpty()) {
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
        String mensagemSucesso;
        boolean jaExiste;
        if (disciplina == null) {
            disciplina = new Disciplina();
            mensagemSucesso = "Disciplina cadastrado com sucesso";
            jaExiste = false;
        } else {
            mensagemSucesso = "Disciplina atualizado com sucesso";
            jaExiste = true;
        }
        disciplina.setAbreviacao(abreviacao);
        disciplina.setDescricao(nome);
        disciplina.setAulasPorSemana((Integer) aulasPorSemanajSpinner.getValue());
        disciplina.setCargaHoraria((Integer) cargaHorariajSpinner.getValue());
        disciplina.setPeriodo((Integer) periodojSpinner.getValue());
        disciplina.setCurso(controller.recuperarCursoPelaDescricao((String) cursojComboBox.getSelectedItem()));
        if (jaExiste) {
            try {
                controller.atualizar(disciplina);
            } catch (ValidacaoException e) {
                e.getErrors().forEach(x -> JOptionPane.showMessageDialog(null, x.toString(), "Erro", JOptionPane.ERROR_MESSAGE));
                return;
            }
        } else{
            try {
                controller.cadastrar(disciplina);
            } catch (ValidacaoException e) {
                e.getErrors().forEach(x -> JOptionPane.showMessageDialog(null, x.toString(), "Erro", JOptionPane.ERROR_MESSAGE));
                return;
            }
        }
        JOptionPane.showMessageDialog(null, mensagemSucesso, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_entrarJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField abreviacaoJTextField;
    private javax.swing.JLabel abreviacaolJLabel;
    private javax.swing.JLabel aulasPorSemanaJLabel;
    private javax.swing.JSpinner aulasPorSemanajSpinner;
    private javax.swing.JLabel backgroundJLabel;
    private javax.swing.JLabel cargaHorariaJLabel1;
    private javax.swing.JSpinner cargaHorariajSpinner;
    private javax.swing.JLabel cursoJLabel;
    private javax.swing.JComboBox cursojComboBox;
    private javax.swing.JButton entrarJButton;
    private javax.swing.JLabel nomeJLabel;
    private javax.swing.JTextField nomeJTextField;
    private javax.swing.JLabel periodoJLabel;
    private javax.swing.JSpinner periodojSpinner;
    private javax.swing.JButton voltarJButton;
    // End of variables declaration//GEN-END:variables
}
