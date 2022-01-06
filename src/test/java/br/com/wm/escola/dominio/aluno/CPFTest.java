package br.com.wm.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.wm.escola.dominio.aluno.CPF;

class CPFTest {

	@Test
	void naoDeveriaCriarCPFInvalido() {
		assertThrows(IllegalArgumentException.class, 
				() -> new CPF(null));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new CPF("123"));
	}
	
	@Test
	void deveriaCriarCPFValido() {
		String numeroCPF = "508.719.910-04";
		CPF cpf = new CPF(numeroCPF);
		
		assertEquals(numeroCPF, cpf.getNumero());
	}

}
