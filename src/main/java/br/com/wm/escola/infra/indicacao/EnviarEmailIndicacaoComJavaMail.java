package br.com.wm.escola.infra.indicacao;

import br.com.wm.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.wm.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(Aluno indicado) {
		//logica de envio de emails com a lib Java Mail
	}

}
