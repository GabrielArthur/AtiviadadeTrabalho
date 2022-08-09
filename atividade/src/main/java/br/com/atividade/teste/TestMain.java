package br.com.atividade.teste;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.atividade.dao.AlunoDAO;
import br.com.atividade.dao.CursoOferecidoDAO;
import br.com.atividade.dao.DisciplinaOferecidaDAO;
import br.com.atividade.dao.EmpresaDAO;
import br.com.atividade.dao.PeriodoCursoDAO;
import br.com.atividade.dao.ProfessorDAO;
import br.com.atividade.dao.UnidadeEscolarDAO;
import br.com.atividade.model.Aluno;
import br.com.atividade.model.CursoOferecido;
import br.com.atividade.model.DisciplinaOferecida;
import br.com.atividade.model.Empresa;
import br.com.atividade.model.PeriodoCurso;
import br.com.atividade.model.Professor;
import br.com.atividade.model.UnidadeEscolar;
import br.com.atividade.util.JpaUtil;

public class TestMain {

	public static void main(String[] args) {
		
		//Cria Empresas
		Empresa empresa = new Empresa("Empresa","Americanas");
		Empresa empresa2 = new Empresa("Teste","Ambev");
		Empresa empresa3 = new Empresa("Negoico", "LeNovo");
		
		//Cria Unidade
		UnidadeEscolar uni = new UnidadeEscolar("uni1", "cabo", "superior");
		UnidadeEscolar uni2 = new UnidadeEscolar("uni2", "cohab", "medio");
		UnidadeEscolar uni3 = new UnidadeEscolar("uni3", "garapu", "fundamental");
		UnidadeEscolar uni4 = new UnidadeEscolar("uni4", "SantoInacio", "pos");
		UnidadeEscolar uni5 = new UnidadeEscolar("uni5", "São Francisco", "Tecnico");
		UnidadeEscolar uni6 = new UnidadeEscolar("uni5", "Ponte dos Carvalhos", "Doutorado");
		
		//Cria Aluno
		Aluno aluno = new Aluno("Tadeu");
		Aluno aluno2 = new Aluno("Marcos");
		Aluno aluno3 = new Aluno("Hugo");
		Aluno aluno4 = new Aluno("Vitoria");
		Aluno aluno5 = new Aluno("Beatriz");
		Aluno aluno6 = new Aluno("Luiz");
		
		//Cria professor
		Professor professor = new Professor("Professor1","12345", "50:00");
		Professor professor2 = new Professor("Professor2","429105", "80:00");
		
		CursoOferecido cursoOferecido = new CursoOferecido("Matematica","123");
		CursoOferecido cursoOferecido2 = new CursoOferecido("Quimica","456");
		
		PeriodoCurso periodoCurso = new PeriodoCurso("4 periodo");
		PeriodoCurso periodoCurso2 = new PeriodoCurso("5 periodo");
		
		DisciplinaOferecida disciplinaOferecida = new DisciplinaOferecida("disciplina teste");
		DisciplinaOferecida disciplinaOferecida2 = new DisciplinaOferecida("disciplina 2");
		
		
		//Cria unidades(list) de unidades escolares
		List<UnidadeEscolar> unidades = new ArrayList<>();
		unidades.add(uni);
		unidades.add(uni2);
		
		List<UnidadeEscolar> unidades2 = new ArrayList<>();
		unidades2.add(uni3);
		unidades2.add(uni4);
		
		List<UnidadeEscolar> unidades3 = new ArrayList<>();
		unidades2.add(uni5);
		unidades2.add(uni6);
		
		//Cria list de alunos
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(aluno);
		alunos.add(aluno2);
		
		List<Aluno> alunos2 = new ArrayList<Aluno>();
		alunos2.add(aluno3);
		alunos2.add(aluno4);
		
		List<Aluno> alunos3 = new ArrayList<Aluno>();
		alunos3.add(aluno5);
		alunos3.add(aluno6);
		
		//list de professor
		List<Professor> professores = new ArrayList<Professor>();
		professores.add(professor);
		professores.add(professor2);
		
		List<CursoOferecido> cursosOferecidos = new ArrayList<CursoOferecido>();
		cursosOferecidos.add(cursoOferecido);
		cursosOferecidos.add(cursoOferecido2);
		
		
		List<PeriodoCurso> periodoCursos = new ArrayList<PeriodoCurso>();
		periodoCursos.add(periodoCurso);
		periodoCursos.add(periodoCurso2);
		
		
		List<DisciplinaOferecida> disciplinasOferecidas = new ArrayList<DisciplinaOferecida>();
		disciplinasOferecidas.add(disciplinaOferecida);
		disciplinasOferecidas.add(disciplinaOferecida2);
		
		
		//set de alunos nas unidades escolares
		uni.setAlunos(alunos);
		aluno.setUnidadeEscolar(unidades);;
		aluno2.setUnidadeEscolar(unidades2);
		
		//set de unidades escolares na empresa
		empresa.setUnidadeEscolar(unidades);
		empresa2.setUnidadeEscolar(unidades2);
		
		
		//set professor em unidade escolar
		uni.setProfessores(professores);
	
		uni.setCursoOferecido(cursosOferecidos);
	
		cursoOferecido.setPeriodosCursos(periodoCursos);
		
		periodoCurso.setDisciplinaOferecida(disciplinasOferecidas);
		
		//Começo do manager
		EntityManager em = JpaUtil.getEntityManager();
		
		EmpresaDAO empresaDAO = new EmpresaDAO(em);
		UnidadeEscolarDAO unidadeEscolarDAO = new UnidadeEscolarDAO(em);
		AlunoDAO alunoDAO = new AlunoDAO(em);
		ProfessorDAO professorDAO = new ProfessorDAO(em);
		CursoOferecidoDAO cursoOferecidoDAO = new CursoOferecidoDAO(em);
		PeriodoCursoDAO periodoCursoDAO = new PeriodoCursoDAO(em);
		DisciplinaOferecidaDAO disciplinaOferecidaDAO = new DisciplinaOferecidaDAO(em);
		
		em.getTransaction().begin();
		
		empresaDAO.cadastrar(empresa);
		empresaDAO.cadastrar(empresa2);
		empresaDAO.cadastrar(empresa3);
		unidadeEscolarDAO.cadastrar(uni);
		unidadeEscolarDAO.cadastrar(uni2);
		unidadeEscolarDAO.cadastrar(uni3);
		unidadeEscolarDAO.cadastrar(uni4);
		unidadeEscolarDAO.cadastrar(uni5);
		unidadeEscolarDAO.cadastrar(uni6);
		alunoDAO.cadastrar(aluno);
		alunoDAO.cadastrar(aluno2);
		alunoDAO.cadastrar(aluno3);
		alunoDAO.cadastrar(aluno4);
		professorDAO.cadastrar(professor);
		professorDAO.cadastrar(professor2);
		cursoOferecidoDAO.cadastrar(cursoOferecido);
		cursoOferecidoDAO.cadastrar(cursoOferecido2);
		periodoCursoDAO.cadastrar(periodoCurso);
		periodoCursoDAO.cadastrar(periodoCurso2);
		disciplinaOferecidaDAO.cadastrar(disciplinaOferecida);
		disciplinaOferecidaDAO.cadastrar(disciplinaOferecida2);
		
		em.getTransaction().commit();
		
		em.close();
	}

}