package model;

import java.time.LocalDate;

import util.TipoDep;
import util.ValidaDependente;

public class Dependente extends Pessoa implements ValidaDependente{

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

	

	//metodo interface Interface 
	@Override
	public String verificaIdade(Dependente dep) {
		// TODO Auto-generated method stub
		return null;
	}

	//Metodo Interface herança pessoa
	@Override
	public String comparaCpf(Pessoa cpfComp) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	
	
	
	
}
