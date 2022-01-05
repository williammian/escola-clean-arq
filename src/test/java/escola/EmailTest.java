package escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailTest {

	@Test
	void naoDeveriaCriarEmailsComEnderecosInvalidos() {
		assertThrows(IllegalArgumentException.class, 
				() -> new Email(null));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new Email(""));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new Email("emailInvalido"));
	}
	
	@Test
	void deveriaCriarEmailValido() {
		String enderecoEmail = "william_mian@yahoo.com.br";
		Email email = new Email(enderecoEmail);
		
		assertEquals(enderecoEmail, email.getEndereco());
	}

}
