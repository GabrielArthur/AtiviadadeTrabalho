package br.com.atividade.dao;

import java.util.List;


import javax.persistence.EntityManager;

import br.com.atividade.model.Empresa;
import br.com.atividade.model.UnidadeEscolar;

public class UnidadeEscolarDAO {
	
	private EntityManager em;

	public UnidadeEscolarDAO(EntityManager em) {
		this.em = em;
	}

	public void cadastrar(UnidadeEscolar uni) {
		this.em.persist(uni);
	}
	
	public void remover(UnidadeEscolar uni) {
		uni= this.em.merge(uni);
		this.em.remove(uni);
	}
	
	public List<UnidadeEscolar> consultarPorNomeUnidade(String nome){
		String query = "SELECT u FROM UnidadeEscolar u WHERE u.unidade_escolar.nome = :nome";
		return this.em.createQuery(query, UnidadeEscolar.class)
				.setParameter("nome", nome)
				.getResultList();
		
	}

}
