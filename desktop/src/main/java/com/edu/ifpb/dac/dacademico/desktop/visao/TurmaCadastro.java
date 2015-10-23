package com.edu.ifpb.dac.dacademico.desktop.visao;

import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.desktop.controladores.TurmaController;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Curso;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Disciplina;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Professor;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Turma;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author douglasgabriel
 */
public class TurmaCadastro extends javax.swing.JFrame {

    private TurmaController controller = new TurmaController();
    Turma turma;

    public TurmaCadastro() {
        inicializar();
    }

    //Deve ser chamado quando for para atualizar um admin já cadastrado
    public TurmaCadastro(Turma turma) {
        this.turma = turma;
        inicializar();
        setTitle("Atualização de turma");
        backgroundJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/turmaUp.png")));
        entrarJButton.setText("Atualizar");
        identificacaoJTextField.setText(turma.getIdentificacao());
    }

    private void inicializar() {
        initComponents();
        setTitle("Cadastro de aluno");
        setResizable(false);
        setSize(480, 590);
        setLocationRelativeTo(null);
        setVisible(true);
        iniciarCursoComboBox();
        disciplinajComboBox.setEnabled(false);
    }
    
    private void iniciarCursoComboBox (){
        List<Curso> cursos = controller.listarCursos();
        for (Curso curso : cursos)
            cursojComboBox.addItem(curso.getDescricao());
        if (turma != null)
            cursojComboBox.setSelectedItem(turma.getCurso().getDescricao());
    }
    
    private void iniciarProfessorComboBox (){
        List<Professor> professores = controller.listarProfessores();
        for (Professor professor : professores)
            cursojComboBox.addItem(professor);
        if (turma != null)
            cursojComboBox.setSelectedItem(turma.getProfessor());
    }
    
    private void iniciarDisciplinaComboBox (){
        disciplinajComboBox.setEnabled(true);
        Curso curso = controller.recuperarCursoPelaDescricao((String) cursojComboBox.getSelectedItem());
        List<Disciplina> disciplinas = controller.listarDisciplinasPeloCurso(curso);
        for (Disciplina disciplina : disciplinas)
            cursojComboBox.addItem(disciplina);
        if (turma != null)
            cursojComboBox.setSelectedItem(turma.getDisciplina());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        identificacaoJTextField = new javax.swing.JTextField();
        identificacaoJLabel = new javax.swing.JLabel();
        voltarJButton = new javax.swing.JButton();
        entrarJButton = new javax.swing.JButton();
        cursoJLabel = new javax.swing.JLabel();
        backgroundJLabel = new javax.swing.JLabel();
        cursojComboBox = new javax.swing.JComboBox();
        professorJLabel = new javax.swing.JLabel();
        professorjComboBox = new javax.swing.JComboBox();
        disciplinaJLabel = new javax.swing.JLabel();
        disciplinajComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(identificacaoJTextField);
        identificacaoJTextField.setBounds(10, 210, 440, 40);

        identificacaoJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        identificacaoJLabel.setForeground(new java.awt.Color(0, 77, 64));
        identificacaoJLabel.setText("Nome:");
        getContentPane().add(identificacaoJLabel);
        identificacaoJLabel.setBounds(10, 180, 230, 30);

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

        cursoJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        cursoJLabel.setForeground(new java.awt.Color(0, 77, 64));
        cursoJLabel.setText("Curso:");
        getContentPane().add(cursoJLabel);
        cursoJLabel.setBounds(10, 260, 130, 30);

        backgroundJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/turmaCadastro.png"))); // NOI18N
        getContentPane().add(backgroundJLabel);
        backgroundJLabel.setBounds(0, -10, 480, 200);

        cursojComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cursojComboBoxItemStateChanged(evt);
            }
        });
        getContentPane().add(cursojComboBox);
        cursojComboBox.setBounds(10, 290, 440, 40);

        professorJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        professorJLabel.setForeground(new java.awt.Color(0, 77, 64));
        professorJLabel.setText("Professor:");
        getContentPane().add(professorJLabel);
        professorJLabel.setBounds(10, 340, 130, 30);

        getContentPane().add(professorjComboBox);
        professorjComboBox.setBounds(10, 370, 440, 40);

        disciplinaJLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        disciplinaJLabel.setForeground(new java.awt.Color(0, 77, 64));
        disciplinaJLabel.setText("Disciplina:");
        getContentPane().add(disciplinaJLabel);
        disciplinaJLabel.setBounds(10, 420, 130, 30);

        getContentPane().add(disciplinajComboBox);
        disciplinajComboBox.setBounds(10, 450, 440, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarJButtonMouseClicked

    }//GEN-LAST:event_entrarJButtonMouseClicked

    private boolean temInformacoesObrigatoriasVazias() {
        String indentificacao = identificacaoJTextField.getText();
        if (indentificacao.trim().isEmpty()) {
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
        String identificacao = identificacaoJTextField.getText();
        String mensagemSucesso;
        boolean jaExiste;
        if (turma == null) {
            turma = new Turma();
            mensagemSucesso = "Turma cadastrada com sucesso";
            jaExiste = false;
        } else {
            mensagemSucesso = "Turma atualizada com sucesso";
            jaExiste = true;
        }
        turma.setIdentificacao(identificacao);
        turma.setCurso(controller.recuperarCursoPelaDescricao((String) cursojComboBox.getSelectedItem()));
        turma.setProfessor((Professor) professorjComboBox.getSelectedItem());
        turma.setDisciplina((Disciplina) disciplinajComboBox.getSelectedItem());
        if (jaExiste) {
            try {
                controller.atualizar(turma);
            } catch (ValidacaoException e) {
                e.getErrors().forEach(x -> JOptionPane.showMessageDialog(null, x.toString(), "Erro", JOptionPane.ERROR_MESSAGE));
                return;
            }
        } else{
            try {
                controller.cadastrar(turma);
            } catch (ValidacaoException e) {
                e.getErrors().forEach(x -> JOptionPane.showMessageDialog(null, x.toString(), "Erro", JOptionPane.ERROR_MESSAGE));
                return;
            }
        }
        JOptionPane.showMessageDialog(null, mensagemSucesso, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_entrarJButtonActionPerformed

    private void cursojComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cursojComboBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED){
            iniciarDisciplinaComboBox();
        }
    }//GEN-LAST:event_cursojComboBoxItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundJLabel;
    private javax.swing.JLabel cursoJLabel;
    private javax.swing.JComboBox cursojComboBox;
    private javax.swing.JLabel disciplinaJLabel;
    private javax.swing.JComboBox disciplinajComboBox;
    private javax.swing.JButton entrarJButton;
    private javax.swing.JLabel identificacaoJLabel;
    private javax.swing.JTextField identificacaoJTextField;
    private javax.swing.JLabel professorJLabel;
    private javax.swing.JComboBox professorjComboBox;
    private javax.swing.JButton voltarJButton;
    // End of variables declaration//GEN-END:variables
}
