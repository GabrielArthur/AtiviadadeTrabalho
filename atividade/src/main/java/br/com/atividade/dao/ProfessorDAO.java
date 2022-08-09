package br.com.atividade.dao;

import javax.persistence.EntityManager;

import br.com.atividade.model.Professor;

public class ProfessorDAO {
	
	private EntityManager em;

	public ProfessorDAO(EntityManager em) {
		this.em = em;
	}

	public void cadastrar(Professor prof) {
		this.em.persist(prof);
	}
	
	public void remover(Professor prof) {
		prof = this.em.merge(prof);
		this.em.remove(prof);
	}

}
