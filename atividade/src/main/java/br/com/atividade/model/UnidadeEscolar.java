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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "unidades_escolares")
public class UnidadeEscolar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "localizacao", nullable = false)
	private String localizacao;

	@Column(name = "tipo_Ensino", nullable = false)
	private String tipoEnsino;

	@ManyToOne(cascade = CascadeType.ALL)
	private Empresa empresa;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "aluno_unidade_escolar", joinColumns = { @JoinColumn(name = "aluno_id") }, inverseJoinColumns = {
			@JoinColumn(name = "unidade_escolar_id") })
	private List<Aluno> alunos;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "professor_unidade_escolar", joinColumns = {
			@JoinColumn(name = "professor_id") }, inverseJoinColumns = { @JoinColumn(name = "unidade_escolar_id") })
	private List<Professor> professores;
	
	@OneToMany(cascade = CascadeType.DETACH)
	@JoinColumn(name = "unidade_escolar_id")
	private List<CursoOferecido> cursoOferecido;

	public UnidadeEscolar() {
	}

	public UnidadeEscolar(String nome, String localizacao, String tipoEnsino) {
		super();
		this.nome = nome;
		this.localizacao = localizacao;
		this.tipoEnsino = tipoEnsino;
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

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getTipoEnsino() {
		return tipoEnsino;
	}

	public void setTipoEnsino(String tipoEnsino) {
		this.tipoEnsino = tipoEnsino;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
	
	public List<CursoOferecido> getCursoOferecido() {
		return cursoOferecido;
	}
	
	public void setCursoOferecido(List<CursoOferecido> cursoOferecido) {
		this.cursoOferecido = cursoOferecido;
	}
	

}
