package model;

import java.time.LocalDate;

import util.TipoDep;

public class Dependente extends Pessoa{

	//Atributos
	private Integer id;
	private TipoDep parentesco;

	//Construtor
	public Dependente(String nome, String cpf, LocalDate dtNasc, TipoDep parentesco) {
		super(nome, cpf, dtNasc);
		this.parentesco = parentesco;
	}

	//toString
	@Override
	public String toString() {
		return super.toString() + "\tParentesco: " + parentesco;
	}

	//Getters Setters
	public TipoDep getParentesco() {
		return parentesco;
	}

	public void setParentesco(TipoDep parentesco) {
		this.parentesco = parentesco;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
	
	
	
	
	
}
