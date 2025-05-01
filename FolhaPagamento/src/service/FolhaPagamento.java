package service;

import java.time.LocalDate;

import model.Funcionario;
import util.InssDescEnum;
import util.IrDescEnum;

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
		return  funcionario + String.format("\t-Sal. Líquido: %.2f\t-Dt. Pag: " + dataPagamento, salLiquido);
	}

	//Método para calcular desconto do INSS
	public static Double calculaInss(Double salarioBruto) {
		double calculoInss = 0.;
		if (salarioBruto <= InssDescEnum.FAIXA1.getMaxSalFaixa()) {
			calculoInss = ( salarioBruto * InssDescEnum.FAIXA1.getAliquotaInss())-InssDescEnum.FAIXA1.getDeduzirInss();
		}else if (salarioBruto <= InssDescEnum.FAIXA2.getMaxSalFaixa()) {
			calculoInss = ( salarioBruto * InssDescEnum.FAIXA2.getAliquotaInss())-InssDescEnum.FAIXA2.getDeduzirInss();
		}else if (salarioBruto <= InssDescEnum.FAIXA3.getMaxSalFaixa()) {
			calculoInss = ( salarioBruto * InssDescEnum.FAIXA3.getAliquotaInss())-InssDescEnum.FAIXA3.getDeduzirInss();
		}else if (salarioBruto <= InssDescEnum.FAIXA4.getMaxSalFaixa()) {
			calculoInss = ( salarioBruto * InssDescEnum.FAIXA4.getAliquotaInss())-InssDescEnum.FAIXA4.getDeduzirInss();
		}else if (salarioBruto >= InssDescEnum.TETO.getMinSalFaixa()) {
			calculoInss = InssDescEnum.DESCMAX.getDescMax();
		}
		return calculoInss;
	}
	
	public static Double calculaIr(Double salarioBruto, Integer numDependente) {
		Double calculoIr = 0.;
		Double salBase = salarioBruto - (numDependente*IrDescEnum.DESCPORDEP.getDescontoPorDependente())- calculaInss(salarioBruto);
		if (salBase <= IrDescEnum.FAIXA1.getSalMenorFaixa()) {
			calculoIr = 0.;
		} else if (salBase <= IrDescEnum.FAIXA2.getSalMaiorFaixa()) {
			calculoIr = (salBase * IrDescEnum.FAIXA2.getAliquotaIr()) - IrDescEnum.FAIXA2.getDeduzirIr(); 
		} else if (salBase <= IrDescEnum.FAIXA3.getSalMaiorFaixa()) {
			calculoIr = (salBase * IrDescEnum.FAIXA3.getAliquotaIr()) - IrDescEnum.FAIXA3.getDeduzirIr(); 
		} else if (salBase <= IrDescEnum.FAIXA4.getSalMaiorFaixa()) {
			calculoIr = (salBase * IrDescEnum.FAIXA4.getAliquotaIr()) - IrDescEnum.FAIXA4.getDeduzirIr(); 
		}else {
			calculoIr = (salBase * IrDescEnum.FAIXA5.getAliquotaIr()) - IrDescEnum.FAIXA5.getDeduzirIr(); 
		}
		return calculoIr;
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
