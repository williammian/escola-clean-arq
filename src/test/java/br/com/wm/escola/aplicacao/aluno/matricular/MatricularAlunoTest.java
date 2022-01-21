package br.com.wm.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.wm.escola.dominio.PublicadorDeEventos;
import br.com.wm.escola.dominio.aluno.Aluno;
import br.com.wm.escola.dominio.aluno.CPF;
import br.com.wm.escola.dominio.aluno.LogDeAlunoMatriculado;
import br.com.wm.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		PublicadorDeEventos publicador = new PublicadorDeEventos();
		publicador.adicionar(new LogDeAlunoMatriculado());
		
		RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
		MatricularAluno useCase = new MatricularAluno(repositorio, publicador);
		
		MatricularAlunoDto dados = new MatricularAlunoDto("Fulano", "123.456.789-00", "fulano@email.com");
		useCase.executa(dados);
		
		Aluno encontrado = repositorio.buscarPorCPF(new CPF("123.456.789-00"));
		
		assertEquals("Fulano", encontrado.getNome());
		assertEquals("123.456.789-00", encontrado.getCpf());
		assertEquals("fulano@email.com", encontrado.getEmail());
	}

}
