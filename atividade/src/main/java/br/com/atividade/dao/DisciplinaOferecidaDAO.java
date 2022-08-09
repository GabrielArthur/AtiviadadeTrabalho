package br.com.atividade.dao;

import javax.persistence.EntityManager;

import br.com.atividade.model.DisciplinaOferecida;

public class DisciplinaOferecidaDAO {
	
	private EntityManager em;

	public DisciplinaOferecidaDAO(EntityManager em) {
		this.em = em;
	}

	public void cadastrar(DisciplinaOferecida disciplina) {
		this.em.persist(disciplina);
	}

}
