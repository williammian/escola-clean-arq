package br.com.wm.escola.gamificacao.dominio.selo;

import java.util.List;

import br.com.wm.escola.academico.dominio.aluno.CPF;

public interface RepositorioDeSelos {
	
	void adicionar(Selo selo);
	
	List<Selo> selosDoAlunoDeCPF(CPF cpf);

}
