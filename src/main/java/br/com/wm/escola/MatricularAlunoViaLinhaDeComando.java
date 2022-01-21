package br.com.wm.escola;

import br.com.wm.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.wm.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.wm.escola.dominio.PublicadorDeEventos;
import br.com.wm.escola.dominio.aluno.LogDeAlunoMatriculado;
import br.com.wm.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoViaLinhaDeComando {
	
	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "123.456.789-00";
		String email = "fulano@email.com";
		
		MatricularAlunoDto dto = new MatricularAlunoDto(nome, cpf, email);
		
		PublicadorDeEventos publicador = new PublicadorDeEventos();
		publicador.adicionar(new LogDeAlunoMatriculado());
		
		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria(), publicador);
		matricular.executa(dto);
	}

}
