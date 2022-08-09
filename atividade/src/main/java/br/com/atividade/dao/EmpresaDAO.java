package br.com.atividade.dao;

import java.util.List;


import javax.persistence.EntityManager;

import br.com.atividade.model.Empresa;


public class EmpresaDAO {
	
	private EntityManager em;

	public EmpresaDAO(EntityManager em) {
		this.em = em;
	}

	public void cadastrar(Empresa empresa) {
		this.em.persist(empresa);
	}
	
	public void remover(Empresa empresa) {
		empresa = this.em.merge(empresa);
		this.em.remove(empresa);
	}
	
	public void excluir(Long id) {
		Empresa empresa = em.find(Empresa.class, id);
		em.remove(empresa);
	}
	
	
	public List<Empresa> consultarPorNomeEmpresa(String nome){
		String query = "SELECT e FROM Empresa e WHERE e.empresa.nome = :nome";
		return this.em.createQuery(query, Empresa.class)
				.setParameter("nome", nome)
				.getResultList();
		
	}

}
