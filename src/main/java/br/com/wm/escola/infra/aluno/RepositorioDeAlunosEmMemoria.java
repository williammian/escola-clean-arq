package br.com.wm.escola.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.wm.escola.dominio.aluno.Aluno;
import br.com.wm.escola.dominio.aluno.AlunoNaoEncontrado;
import br.com.wm.escola.dominio.aluno.CPF;
import br.com.wm.escola.dominio.aluno.RepositorioDeAlunos;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

	private List<Aluno> matriculados = new ArrayList<>();
	
	@Override
	public void matricular(Aluno aluno) {
		this.matriculados.add(aluno);
	}

	@Override
	public Aluno buscarPorCPF(CPF cpf) {
		return this.matriculados.stream()
				.filter(a -> a.getCpf().equals(cpf.getNumero()))
				.findFirst()
				.orElseThrow(() -> new AlunoNaoEncontrado(cpf));
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		return this.matriculados;
	}

}
