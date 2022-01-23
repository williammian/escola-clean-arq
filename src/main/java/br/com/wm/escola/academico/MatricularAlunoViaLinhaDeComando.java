package br.com.wm.escola.academico;

import br.com.wm.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.wm.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.wm.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.wm.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import br.com.wm.escola.shared.dominio.evento.PublicadorDeEventos;

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
