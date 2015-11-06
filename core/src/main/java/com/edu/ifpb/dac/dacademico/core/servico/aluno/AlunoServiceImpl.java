package com.edu.ifpb.dac.dacademico.core.servico.aluno;

import com.edu.ifpb.dac.dacademico.core.exceptions.EntidadeInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.LoginInexistenteException;
import com.edu.ifpb.dac.dacademico.core.exceptions.SenhaErradaException;
import com.edu.ifpb.dac.dacademico.core.exceptions.ValidacaoException;
import com.edu.ifpb.dac.dacademico.core.validacao.HibernateValidacao;
import com.edu.ifpb.dac.dacademico.entidades.dominio.Aluno;
import com.edu.ifpb.dac.dacademico.core.dao.Dao;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author Emanuel Batista da Silva Filho - emanuelbatista2011@gmail.com
 */
@Stateless
@Remote(AlunoService.class)
public class AlunoServiceImpl implements AlunoService {

    @EJB
    private Dao<Aluno, Long> repositorio;

    @Override
    public void salvar(Aluno aluno) throws ValidacaoException {
        validarAluno(aluno);
        repositorio.salvar(aluno);
    }

    private void validarAluno(Aluno aluno) throws ValidacaoException {
        String email = aluno.getEmail();
        String login = aluno.getLogin();
        List<com.edu.ifpb.dac.dacademico.core.errors.Error<Aluno>> errors = HibernateValidacao.<Aluno>validar(aluno);
        List<Aluno> alunos = repositorio.buscarPorAtributo(Aluno.class, "login", login);
        Aluno alunoBanco = repositorio.buscar(Aluno.class, aluno.getCod());
        if (!alunos.isEmpty() && aluno.getCod() == 0 || !alunos.isEmpty() && !alunoBanco.getLogin().equals(login)) {
            com.edu.ifpb.dac.dacademico.core.errors.Error<Aluno> error = new com.edu.ifpb.dac.dacademico.core.errors.Error();
            error.setField("login");
            error.setMessage("Esse login já está cadastrado");
            error.setRootBean(aluno);
            errors.add(error);
        }
        alunos = repositorio.buscarPorAtributo(Aluno.class, "email", email);
        if (!alunos.isEmpty() && aluno.getCod() == 0 || !alunos.isEmpty() && !alunoBanco.getEmail().equals(email)) {
            com.edu.ifpb.dac.dacademico.core.errors.Error<Aluno> error = new com.edu.ifpb.dac.dacademico.core.errors.Error<>();
            error.setField("email");
            error.setMessage("Esse email já está cadastrado");
            errors.add(error);
        }
        if (!errors.isEmpty()) {
            throw new ValidacaoException(errors);
        }
    }

    @Override
    public Aluno login(String login, String senha)
            throws LoginInexistenteException, SenhaErradaException {
        List<Aluno> resultado = repositorio.buscarPorAtributo(Aluno.class, "login", login);
        if (resultado == null || resultado.isEmpty()) {
            throw new LoginInexistenteException();
        }
        Aluno aluno = resultado.get(0);
        if (!aluno.getSenha().equals(senha)) {
            throw new SenhaErradaException();
        }
        return aluno;
    }

    @Override
    public void atualizar(Aluno aluno) throws ValidacaoException {
        validarAluno(aluno);
        repositorio.atualizar(aluno);
    }

    @Override
    public List<Aluno> listarTodos() {
        return repositorio.listarTodos(Aluno.class);
    }

    @Override
    public Aluno recuperarPeloLogin(String login) throws LoginInexistenteException {
        try {
            return repositorio.buscarPorAtributo(Aluno.class, "login", login).get(0);
        } catch (Exception e) {
            throw new LoginInexistenteException();
        }
    }

    @Override
    public void remover(Aluno aluno) {
        repositorio.remover(aluno);
    }

    @Override
    public Aluno recuperarPelaMatricula(String matricula) throws EntidadeInexistenteException {
        try {
            return repositorio.buscarPorAtributo(Aluno.class, "matricula", matricula).get(0);
        } catch (Exception e) {
            throw new EntidadeInexistenteException();
        }
    }
}
