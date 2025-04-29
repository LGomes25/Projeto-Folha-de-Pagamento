package model;

import java.time.LocalDate;

import util.ValidaCpf;

public abstract class Pessoa implements ValidaCpf {

	//Atributos
	protected String nome;
	protected String cpf;
	protected LocalDate dtNasc;
	
	//Construtor
	public Pessoa(String nome, String cpf, LocalDate dtNasc) {
		this.nome = nome;
		this.cpf = cpf;
		this.dtNasc = dtNasc;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\tCPF: " + cpf + "\tDt. Nasc.: " + dtNasc;
	}

	//Getters Setters
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(LocalDate dtNasc) {
		this.dtNasc = dtNasc;
	}


	
	
	
	
}
