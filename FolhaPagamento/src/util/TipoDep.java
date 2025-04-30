package util;

public enum TipoDep {

	//Constantes e valores
	FILHO(189.59),		//Valor => desconto por dependente
	SOBRINHO(189.59),
	OUTROS(189.59);

	//declaração
	private Double valor;

	//Construtor
	private TipoDep(Double valor) {
		this.valor = valor;
	}

	//Getter
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	
		
	
	
}
