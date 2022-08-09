package br.com.atividade.dao;

import javax.persistence.EntityManager;

import br.com.atividade.model.PeriodoCurso;

public class PeriodoCursoDAO {
	
	private EntityManager em;

	public PeriodoCursoDAO(EntityManager em) {
		this.em = em;
	}

	public void cadastrar(PeriodoCurso periodo) {
		this.em.persist(periodo);
	}

}
