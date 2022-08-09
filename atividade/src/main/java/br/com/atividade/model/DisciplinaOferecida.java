package br.com.atividade.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "disciplina_oferecida")
public class DisciplinaOferecida {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nomeDisciplina;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private PeriodoCurso periodoCurso;

	public DisciplinaOferecida() {}
			
	public DisciplinaOferecida(String nomeDisciplina) {
		super();
		this.nomeDisciplina = nomeDisciplina;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public PeriodoCurso getPeriodoCurso() {
		return periodoCurso;
	}

	public void setPeriodoCurso(PeriodoCurso periodoCurso) {
		this.periodoCurso = periodoCurso;
	}
	
	

}
