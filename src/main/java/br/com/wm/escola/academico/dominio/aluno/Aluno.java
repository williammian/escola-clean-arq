package br.com.wm.escola.academico.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.wm.escola.shared.dominio.CPF;

public class Aluno {
	
	private CPF cpf;
	private String nome;
	
	private Email email;
	
	private List<Telefone> telefones = new ArrayList<>();
	
	private String senha;
	
	public Aluno(CPF cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	public void adicionarTelefone(String ddd, String numero) {
		if(this.telefones.size() == 2) {
			throw new IllegalArgumentException("Número máximo de telefones já atingido!");
		}
		this.telefones.add(new Telefone(ddd, numero));
	}

	public String getNumeroCpf() {
		return cpf.getNumero();
	}
	
	public CPF getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email.getEndereco();
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}
	
}
