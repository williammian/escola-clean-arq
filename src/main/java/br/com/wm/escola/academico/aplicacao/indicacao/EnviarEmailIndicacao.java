package br.com.wm.escola.academico.aplicacao.indicacao;

import br.com.wm.escola.academico.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
	
	void enviarPara(Aluno indicado);

}
