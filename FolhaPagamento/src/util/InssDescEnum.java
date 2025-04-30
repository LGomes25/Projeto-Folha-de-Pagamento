package util;

public enum InssDescEnum {

	//Constantes e Valores
	//Tabela atualiza INSS - 2025
	//v1 => SalMenorFaixa (R$)| v2 => SalMaiorFaixa (R$) |v3 => aliquota(%) | v4 => dedução (R$)
	FAIXA1(0.0, 1518.0, 0.075, 0.0),   
	FAIXA2(1518.01, 2793.88, 0.09, 22.77),
	FAIXA3(2793.89, 4190.83, 0.12, 106.60),
	FAIXA4(4190.84, 8157.41, 0.14, 190.42),
	//Teto: v1 => valorComposição | v2 => SalMaxAplicação (R$) |v3 => aliquota(%)
	TETO(8154.42, 0.14),
	//Desconto máximo permitido
	DESCMAX(951.62);

	//Declaração
	private Double minSalFaixa;
	private Double maxSalFaixa;
	private Double aliquotaInss;
	private Double deduzirInss;
	private Double descMax;
	
	//Construtor1 (tres construtores declarados)
	private InssDescEnum(Double minSalFaixa, Double maxSalFaixa, Double aliquotaInss, Double deduzirInss) {
		this.minSalFaixa = minSalFaixa;
		this.maxSalFaixa = maxSalFaixa;
		this.aliquotaInss = aliquotaInss;
		this.deduzirInss = deduzirInss;
	}

	//Construtor2 Teto (tres construtores declarados) 
	private InssDescEnum(Double minSalFaixa, Double aliquotaInss) { //construtor que poderá receber apenas a atualização do Teto
		this.minSalFaixa = minSalFaixa;
		this.aliquotaInss = aliquotaInss;
	}
	
	//Construtor3 Maximo Desconto (tres construtores declarados) 
	private InssDescEnum(Double descMax) {
		this.descMax = descMax;
	}

	//Getters Setters
	public Double getAliquotaInss() {
		return aliquotaInss;
	}

	public void setAliquotaInss(Double aliquotaInss) {
		this.aliquotaInss = aliquotaInss;
	}

	public Double getDeduzirInss() {
		return deduzirInss;
	}

	public void setDeduzirInss(Double deduzirInss) {
		this.deduzirInss = deduzirInss;
	}

	public Double getMinSalFaixa() {
		return minSalFaixa;
	}

	public void setMinSalFaixa(Double minSalFaixa) {
		this.minSalFaixa = minSalFaixa;
	}

	public Double getMaxSalFaixa() {
		return maxSalFaixa;
	}

	public void setMaxSalFaixa(Double maxSalFaixa) {
		this.maxSalFaixa = maxSalFaixa;
	}

	public Double getDescMax() {
		return descMax;
	}

	public void setDescMax(Double descMax) {
		this.descMax = descMax;
	}
	
	
	
	


	
	

}
