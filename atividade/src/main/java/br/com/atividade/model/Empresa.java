package br.com.atividade.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "empresas")
public class Empresa{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "nome_fantasia", nullable = true)
	private String nomeFantasia;

	@OneToMany(cascade = CascadeType.DETACH)
	@JoinColumn(name = "empresa_id")
	private List<UnidadeEscolar> unidadeEscolar;

	public Empresa() {
	}

	public Empresa(String nome, String nomeFantasia) {
		this.nome = nome;
		this.nomeFantasia = nomeFantasia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}


	public List<UnidadeEscolar> getUnidadeEscolar() {
		return unidadeEscolar;
	}

	public void setUnidadeEscolar(List<UnidadeEscolar> unidadeEscolar) {
		this.unidadeEscolar = unidadeEscolar;
	}

}
