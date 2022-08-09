package br.com.atividade.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cursos_oferecidos")
public class CursoOferecido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	private String codigo;

	// private String cargaHoraria;

	@ManyToOne(cascade = CascadeType.ALL)
	private UnidadeEscolar unidadeEscolar;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "curso_oferecido_id")
	private List<PeriodoCurso> periodosCursos;

	public CursoOferecido() {
	}

	public CursoOferecido(String nome, String codigo) {
		this.nome = nome;
		this.codigo = codigo;
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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public UnidadeEscolar getUnidadeEscolar() {
		return unidadeEscolar;
	}

	public void setUnidadeEscolar(UnidadeEscolar unidadeEscolar) {
		this.unidadeEscolar = unidadeEscolar;
	}
	
	public List<PeriodoCurso> getPeriodosCursos() {
		return periodosCursos;
	}
	
	public void setPeriodosCursos(List<PeriodoCurso> periodosCursos) {
		this.periodosCursos = periodosCursos;
	}

}
