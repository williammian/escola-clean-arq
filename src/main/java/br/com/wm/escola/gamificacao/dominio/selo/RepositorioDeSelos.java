package br.com.wm.escola.gamificacao.dominio.selo;

import java.util.List;

import br.com.wm.escola.shared.dominio.CPF;

public interface RepositorioDeSelos {
	
	void adicionar(Selo selo);
	
	List<Selo> selosDoAlunoDeCPF(CPF cpf);

}
