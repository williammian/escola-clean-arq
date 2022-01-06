package br.com.wm.escola.dominio.aluno;

public class Telefone {
	
	private String ddd;
	private String numero;
	
	public Telefone(String ddd, String numero) {
		if(ddd == null || numero == null) {
			throw new IllegalArgumentException("DDD e número são obrigatórios!");
		}
		
		if(!ddd.matches("[0-9]{2}")) {
			throw new IllegalArgumentException("DDD incorreto!");
		}
		
		if(!numero.matches("[0-9]{8}|[0-9]{9}")) {
			throw new IllegalArgumentException("Telefone incorreto!");
		}
		
		this.ddd = ddd;
		this.numero = numero;
	}

	public String getDdd() {
		return ddd;
	}

	public String getNumero() {
		return numero;
	}

}
