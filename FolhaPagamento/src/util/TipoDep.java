package util;

public enum TipoDep {

	//Constantes e valores
	FILHO(189.59),
	SOBRINHO(189.59),
	OUTROS(189.59);

	//declaração
	private Double valor;

	private TipoDep(Double valor) {
		this.valor = valor;
	}

	public Double getValor() {
		return valor;
	}
	
	
	
		
	
	
}
