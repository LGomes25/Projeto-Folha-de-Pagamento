package model;

import java.time.LocalDate;

public class Funcionario extends Pessoa {

	//Atributos
	private Double salarioBruto;
	private Double descontoInss;
	private Double descontoIR;
	
	//Construtor
	public Funcionario(String nome, String cpf, LocalDate dtNasc, Double salarioBruto) {
		super(nome, cpf, dtNasc);
		this.salarioBruto = salarioBruto;
		this.descontoInss = 0.;
		this.descontoIR = 0.;
	}

	//toString
	@Override
	public String toString() {
		return super.toString() + "\tSal. Bruto: " + salarioBruto + ",\tDescontoInss=" + descontoInss + ",\tDesc IR: "
				+ descontoIR;
	}

	//Getters Setters
	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(Double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public Double getDescontoInss() {
		return descontoInss;
	}

	public void setDescontoInss(Double descontoInss) {
		this.descontoInss = descontoInss;
	}

	public Double getDescontoIR() {
		return descontoIR;
	}

	public void setDescontoIR(Double descontoIR) {
		this.descontoIR = descontoIR;
	}
	
	
	
	
}
