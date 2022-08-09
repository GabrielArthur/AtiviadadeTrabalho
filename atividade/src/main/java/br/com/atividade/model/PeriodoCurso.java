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
@Table(name = "periodos_cursos")
public class PeriodoCurso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String periodo;

	@ManyToOne(cascade = CascadeType.ALL)
	private CursoOferecido cursoOferecido;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "periodocuso_id")
	private List<DisciplinaOferecida> disciplinaOferecida;

	public PeriodoCurso() {
	}

	public PeriodoCurso(String periodo) {
		super();
		this.periodo = periodo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public CursoOferecido getCursoOferecido() {
		return cursoOferecido;
	}

	public void setCursoOferecido(CursoOferecido cursoOferecido) {
		this.cursoOferecido = cursoOferecido;
	}

	public List<DisciplinaOferecida> getDisciplinaOferecida() {
		return disciplinaOferecida;
	}

	public void setDisciplinaOferecida(List<DisciplinaOferecida> disciplinaOferecida) {
		this.disciplinaOferecida = disciplinaOferecida;
	}

}
