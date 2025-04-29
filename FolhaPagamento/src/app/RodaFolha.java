package app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Dependente;
import model.Funcionario;
import util.TipoDep;

public class RodaFolha {

	public static void main(String[] args) {

		//Instanciamento de funcionarios
		Funcionario fun1 = new Funcionario("Leonardo", "33344455567", LocalDate.of(2000, 2, 20), 4500.00);
		Funcionario fun2 = new Funcionario("Mariana", "33344455569", LocalDate.of(1995, 5, 15), 5200.00);
		Funcionario fun3 = new Funcionario("Carlos", "33344455569", LocalDate.of(1988, 10, 30), 6000.00);
		Funcionario fun4 = new Funcionario("Ana", "44455566678", LocalDate.of(1992, 7, 8), 4800.00);
		Funcionario fun5 = new Funcionario("Gabriel", "55566677781", LocalDate.of(2001, 12, 25), 4100.00);
		Funcionario fun6 = new Funcionario("Jonas", "55566677780", LocalDate.of(2001, 11, 25), 4300.00);
		
		//instanciamento dependentes
		Dependente dep1 = new Dependente("José", "66655588812", LocalDate.of(2017, 02, 20), TipoDep.FILHO);
		Dependente dep2 = new Dependente("Ana", "12345678912", LocalDate.of(2015, 11, 20), TipoDep.SOBRINHO);
		Dependente dep3 = new Dependente("Lucas", "23456789123", LocalDate.of(2010, 3, 5), TipoDep.OUTROS);
		Dependente dep4 = new Dependente("Beatriz", "34567891234", LocalDate.of(2017, 8, 15), TipoDep.FILHO);
		Dependente dep5 = new Dependente("Gabriel", "45678912345", LocalDate.of(2014, 9, 25), TipoDep.SOBRINHO);
		Dependente dep6 = new Dependente("João", "45678912344", LocalDate.of(2012, 5, 25), TipoDep.OUTROS);
				
		
		//criando lista de dependente e funcionario
		List<Funcionario> funcs = new ArrayList<>();
		List<Dependente> deps = new ArrayList<>();
		
		//Carregar listas funcionario
		funcs.add(fun1);
		funcs.add(fun2);
		funcs.add(fun3);
		funcs.add(fun4);
		funcs.add(fun5);
		funcs.add(fun6);
		
		//Carregar listas dependentes
		deps.add(dep1);
		deps.add(dep2);
		deps.add(dep3);
		deps.add(dep4);
		deps.add(dep5);
		deps.add(dep6);
		
		//apresentando os dados carregados chamada função compara cpf
		for (Funcionario func : funcs) {
			System.out.println(func.toString());
		}
		
//		System.out.println(fun1.comparaCpf(fun1)); <--verificar motivo pelo qual não funciona
				
	}

}
