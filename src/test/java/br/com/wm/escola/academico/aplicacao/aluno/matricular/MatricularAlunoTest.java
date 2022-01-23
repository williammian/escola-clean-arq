package br.com.wm.escola.academico.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.wm.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.wm.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.wm.escola.academico.dominio.aluno.Aluno;
import br.com.wm.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.wm.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import br.com.wm.escola.shared.dominio.CPF;
import br.com.wm.escola.shared.dominio.evento.PublicadorDeEventos;

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
