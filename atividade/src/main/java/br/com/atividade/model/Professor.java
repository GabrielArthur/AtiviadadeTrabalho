package br.com.atividade.model;

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
@Table(name = "professores")
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String materia;

	@Column(nullable = false)
	private String cargaHoraria;

	@ManyToMany(mappedBy = "professores", cascade = CascadeType.ALL)
	private List<UnidadeEscolar> unidadeEscolar;

	public Professor() {
	}

	public Professor(String nome, String materia, String cargaHoraria) {
		this.nome = nome;
		this.materia = materia;
		this.cargaHoraria = cargaHoraria;
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

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public List<UnidadeEscolar> getUnidadeEscolar() {
		return unidadeEscolar;
	}

	public void setUnidadeEscolar(List<UnidadeEscolar> unidadeEscolar) {
		this.unidadeEscolar = unidadeEscolar;
	}

}
