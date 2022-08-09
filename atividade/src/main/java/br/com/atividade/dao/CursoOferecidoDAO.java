package br.com.atividade.dao;

import javax.persistence.EntityManager;

import br.com.atividade.model.CursoOferecido;

public class CursoOferecidoDAO {

	private EntityManager em;

	public CursoOferecidoDAO(EntityManager em) {
		this.em = em;
	}

	public void cadastrar(CursoOferecido curso) {
		this.em.persist(curso);
	}
}
