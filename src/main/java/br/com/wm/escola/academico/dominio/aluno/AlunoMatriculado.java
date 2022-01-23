package br.com.wm.escola.academico.dominio.aluno;

import java.time.LocalDateTime;

import br.com.wm.escola.academico.dominio.Evento;
import br.com.wm.escola.shared.dominio.CPF;

public class AlunoMatriculado implements Evento {
	
	private final CPF cpfDoAluno;
	private final LocalDateTime momento;

	public AlunoMatriculado(CPF cpfDoAluno) {
		this.cpfDoAluno = cpfDoAluno;
		this.momento = LocalDateTime.now();
	}

	@Override
	public LocalDateTime momento() {
		return this.momento;
	}

	public LocalDateTime getMomento() {
		return momento;
	}

	public CPF getCpfDoAluno() {
		return cpfDoAluno;
	}
	
}
