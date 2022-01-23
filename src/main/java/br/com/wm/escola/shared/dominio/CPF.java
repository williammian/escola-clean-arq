package br.com.wm.escola.shared.dominio;

public class CPF {
	
	private String numero;

	public CPF(String numero) {
		if(numero == null || 
				!numero.matches("[0-9]{3}\\.?[0-9]{3}\\.?[0-9]{3}\\-?[0-9]{2}")) {
			throw new IllegalArgumentException("CPF inválido!");
		}
		
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return numero;
	}
	

}
