package br.com.wm.escola.academico.infra.indicacao;

import br.com.wm.escola.academico.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.wm.escola.academico.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(Aluno indicado) {
		//logica de envio de emails com a lib Java Mail
	}

}
