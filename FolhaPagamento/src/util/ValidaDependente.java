package util;

import model.Dependente;

public interface ValidaDependente extends ValidaCpf{

	String verificaIdade (Dependente dep);
	
}
