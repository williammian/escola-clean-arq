package br.com.wm.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.wm.escola.dominio.aluno.Telefone;

class TelefoneTest {

	@Test
	void naoDeveriaCriarTelefoneInvalido() {
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone(null, null));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone("1", null));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone(null, "123"));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone("1", "123"));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone("12", "123"));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone("1", "123456789"));
	}
	
	@Test
	void deveriaCriarTelefoneValido() {
		String ddd1 = "12";
		String numero1 = "12345678";
		Telefone telefone1 = new Telefone(ddd1, numero1);
		
		assertEquals(ddd1+"|"+numero1, telefone1.getDdd()+"|"+telefone1.getNumero());
		
		String ddd2 = "12";
		String numero2 = "123456789";
		Telefone telefone2 = new Telefone(ddd2, numero2);
		
		assertEquals(ddd2+"|"+numero2, telefone2.getDdd()+"|"+telefone2.getNumero());
	}

}
