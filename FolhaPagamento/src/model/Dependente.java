package model;

import java.time.LocalDate;

public class Dependente extends Pessoa {

	//Atributos
	private String parentesco;

	//Construtor
	public Dependente(String nome, String cpf, LocalDate dtNasc, String parentesco) {
		super(nome, cpf, dtNasc);
		this.parentesco = parentesco;
	}

	//toString
	@Override
	public String toString() {
		return super.toString() + "\tParentesco: " + parentesco;
	}

	//Getters Setters
	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	
	
	
	
	
	
	
	
	
}
