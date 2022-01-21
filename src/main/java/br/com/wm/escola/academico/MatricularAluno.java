package br.com.wm.escola.academico;

import br.com.wm.escola.academico.dominio.aluno.Aluno;
import br.com.wm.escola.academico.dominio.aluno.CPF;
import br.com.wm.escola.academico.dominio.aluno.Email;
import br.com.wm.escola.academico.dominio.aluno.RepositorioDeAlunos;
import br.com.wm.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAluno {
	
	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		CPF cpf = new CPF("123.456.789-00");
		Email email = new Email("fulano@email.com");
		
		Aluno aluno = new Aluno(cpf, nome, email);
		
		RepositorioDeAlunos repositorio = new RepositorioDeAlunosEmMemoria();
		repositorio.matricular(aluno);
	}

}
