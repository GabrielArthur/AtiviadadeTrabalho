package br.com.atividade.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "alunos")
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String nome;

	// @Column(name = "data_nascimento",nullable = false)
	// private LocalDate nascimento;

	@ManyToMany(mappedBy = "alunos", cascade = CascadeType.ALL)
	private List<UnidadeEscolar> unidadeEscolar;

	public Aluno() {
	}

	public Aluno(String nome) {
		this.nome = nome;
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

	public List<UnidadeEscolar> getUnidadeEscolar() {
		return unidadeEscolar;
	}

	public void setUnidadeEscolar(List<UnidadeEscolar> unidadeEscolar) {
		this.unidadeEscolar = unidadeEscolar;
	}

}
