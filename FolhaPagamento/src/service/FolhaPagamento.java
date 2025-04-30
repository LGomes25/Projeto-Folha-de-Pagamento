package service;

import java.time.LocalDate;
import model.Funcionario;

public class FolhaPagamento {

	//Atributos
	private LocalDate dataPagamento;
	private Double salLiquido;
	private Funcionario funcionario;

	//Construtor
	public FolhaPagamento(LocalDate dataPagamento, Funcionario funcionario) {
		this.dataPagamento = dataPagamento;
		this.funcionario = funcionario;
		this.salLiquido = funcionario.getSalarioBruto()-funcionario.getDescontoInss()-funcionario.getDescontoIR();
	}

	//toString
	@Override
	public String toString() {
		return  funcionario + "\tSal. Líquido: " + salLiquido +"\tDt. Pag: " + dataPagamento;
	}

	
	
	
	//Getters Setters
	public LocalDate getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Double getSalLiquido() {
		return salLiquido;
	}

	public void setSalLiquido(Double salLiquido) {
		this.salLiquido = salLiquido;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionarios(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	
	
	
}
