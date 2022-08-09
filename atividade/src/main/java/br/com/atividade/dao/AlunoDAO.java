package br.com.atividade.dao;

import javax.persistence.EntityManager;

import br.com.atividade.model.Aluno;

public class AlunoDAO {
	
	private EntityManager em;

	public AlunoDAO(EntityManager em) {
		this.em = em;
	}

	public void cadastrar(Aluno aluno) {
		this.em.persist(aluno);
	}
	
	public void remover(Aluno aluno) {
		aluno = this.em.merge(aluno);
		this.em.remove(aluno);
	}
	

}
