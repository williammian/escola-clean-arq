package br.com.wm.escola.aplicacao.indicacao;

import br.com.wm.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
	
	void enviarPara(Aluno indicado);

}
