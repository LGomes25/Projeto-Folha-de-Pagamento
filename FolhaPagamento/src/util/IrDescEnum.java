package util;

public enum IrDescEnum {

	//Constantes e Valores
	//Tabela atualiza INSS - 2025
	//v1 => SalMenorFaixa (R$) |v2 => aliquota(%) | v3 => dedução (R$)
	FAIXA1(2259.20,0.0, 0.0),
	//v1 => SalMenorFaixa (R$)| v2 => SalMaiorFaixa (R$) |v3 => aliquota(%) | v4 => dedução (R$)
	FAIXA2(2259.21, 2826.65, 0.075, 169.44),
	FAIXA3(2826.66, 3751.05, 0.15, 381.44),
	FAIXA4(3751.06, 4664.68, 0.225, 662.77),
	//v1 => SalMenorFaixa (R$)| v2 => aliquota(%) | v3 => dedução (R$)
	FAIXA5(4664.68, 0.275, 896.0),
	//v1 => Desconto por dependente
	DESCPORDEP(189.59);
	
	//Declaração
	private Double salMenorFaixa;
	private Double salMaiorFaixa;
	private Double aliquotaIr;
	private Double deduzirIr;
	private Double descontoPorDependente;
	
	//Construtor1 (Faixas 2,3 e 4)
	private IrDescEnum(Double salMenorFaixa, Double salMaiorFaixa, Double aliquotaIr, Double deduzirIr) {
		this.salMenorFaixa = salMenorFaixa;
		this.salMaiorFaixa = salMaiorFaixa;
		this.aliquotaIr = aliquotaIr;
		this.deduzirIr = deduzirIr;
	}

	//Construtor2 (Faixa 1 e 4)
	private IrDescEnum(Double salMenorFaixa, Double aliquotaIr, Double deduzirIr) {
		this.salMenorFaixa = salMenorFaixa;
		this.aliquotaIr = aliquotaIr;
		this.deduzirIr = deduzirIr;
	}
	private IrDescEnum(Double descontoPorDependente) {
		this.descontoPorDependente = descontoPorDependente;
	}

	//Getters Setters
	public Double getSalMenorFaixa() {
		return salMenorFaixa;
	}

	public void setSalMenorFaixa(Double salMenorFaixa) {
		this.salMenorFaixa = salMenorFaixa;
	}

	public Double getSalMaiorFaixa() {
		return salMaiorFaixa;
	}

	public void setSalMaiorFaixa(Double salMaiorFaixa) {
		this.salMaiorFaixa = salMaiorFaixa;
	}

	public Double getAliquotaIr() {
		return aliquotaIr;
	}

	public void setAliquotaIr(Double aliquotaIr) {
		this.aliquotaIr = aliquotaIr;
	}

	public Double getDeduzirIr() {
		return deduzirIr;
	}

	public void setDeduzirIr(Double deduzirIr) {
		this.deduzirIr = deduzirIr;
	}

	public Double getDescontoPorDependente() {
		return descontoPorDependente;
	}

	public void setDescontoPorDependente(Double descontoPorDependente) {
		this.descontoPorDependente = descontoPorDependente;
	}
	
	
	
	
	
	
	
}
