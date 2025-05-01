package model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Funcionario extends Pessoa {

	// Atributos
	private Integer id;
	private Double salarioBruto;
	private Double descontoInss;
	private Double descontoIR;
	private int contDep;
	private static Set<String> cpfUnico = new HashSet<>();// garantir unicidade <--Não funciona como deveria
	private static Set<String> cpfDuplicado = new HashSet<>();// Listar duplicações

	// Construtor
	public Funcionario(String nome, String cpf, LocalDate dtNasc, Double salarioBruto) {
		super(nome, cpf, dtNasc);
		this.salarioBruto = salarioBruto;
		this.descontoInss = 0.00;
		this.descontoIR = 0.;
		this.contDep = 0;
	}

	// toString
	@Override
	public String toString() {
		return super.toString() + String.format("\t-Sal. Bruto: %.2f\t-Dep.: %d\t-Desc. INSS: %.2f\t-Desc. IR: %.2f", 
	              salarioBruto, contDep, descontoInss, descontoIR);
				
	
	 
	}

	// Getters Setters
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getContDep() {
		return contDep;
	}

	public void setContDep(int contDep) {
		this.contDep = contDep;
	}

	public static Set<String> getCpfUnico() {
		return cpfUnico;
	}

	public static Set<String> getCpfDuplicado() {
		return cpfDuplicado;
	}

	// Metodo Implementa Interface heranca <--não funciona como deveria
	@Override
	public String comparaCpf(Pessoa cpfComp) {
		String retorno = null;
		cpfUnico.add(cpf);
		if (cpfUnico.contains(cpf)) {
			retorno = "duplicado";
		} else {
			retorno = "unico";
		}
		return retorno;
	}

}
