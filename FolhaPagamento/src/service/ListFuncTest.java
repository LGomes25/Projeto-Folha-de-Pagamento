package service;

import java.time.LocalDate;
import java.util.List;

import model.Dependente;
import model.Funcionario;
import model.Pessoa;
import util.TipoDep;

public class ListFuncTest {

	// Lista para instanciamento de funcionarios, e dependentes, pré-carregada

//	List<Funcionario> funcs = new ArrayList<>();
//	List<Dependente> deps = new ArrayList<>();
//	List<Pessoa> pessoas = new ArrayList<>();

	public static void carregaLista(List<Funcionario> funcs, List<Dependente> deps, List<Pessoa> pessoas) {

		// Instanciamento de funcionarios
		Funcionario fun1 = new Funcionario("Leonardo", "33344455567", LocalDate.of(2000, 2, 20), 1500.00);
		Funcionario fun2 = new Funcionario("Mariana", "33344455569", LocalDate.of(1995, 5, 15), 2500.00);
		Funcionario fun3 = new Funcionario("Carlos", "33344455569", LocalDate.of(1988, 10, 30), 3500.00);
		Funcionario fun4 = new Funcionario("Ana", "44455566678", LocalDate.of(1992, 7, 8), 4500.00);
		Funcionario fun5 = new Funcionario("Gabriel", "55566677781", LocalDate.of(2001, 12, 25), 6000.00);
		Funcionario fun6 = new Funcionario("Jonas", "55566677780", LocalDate.of(2001, 11, 25), 10000.00);

		// instanciamento dependentes
		Dependente dep1 = new Dependente("José", "66655588812", LocalDate.of(2017, 02, 20), TipoDep.FILHO);
		Dependente dep2 = new Dependente("Ana", "12345678912", LocalDate.of(2015, 11, 20), TipoDep.SOBRINHO);
		Dependente dep3 = new Dependente("Lucas", "23456789123", LocalDate.of(2010, 3, 5), TipoDep.OUTROS);
		Dependente dep4 = new Dependente("Beatriz", "34567891234", LocalDate.of(2017, 8, 15), TipoDep.FILHO);
		Dependente dep5 = new Dependente("Gabriel", "45678912345", LocalDate.of(2014, 9, 25), TipoDep.SOBRINHO);
		Dependente dep6 = new Dependente("João", "45678912344", LocalDate.of(2012, 5, 25), TipoDep.OUTROS);

		funcs.add(fun1);
		funcs.add(fun2);
		funcs.add(fun3);
		funcs.add(fun4);
		funcs.add(fun5);
		funcs.add(fun6);
		deps.add(dep1);
		deps.add(dep2);
		deps.add(dep3);
		deps.add(dep4);
		deps.add(dep5);
		deps.add(dep6);
		pessoas.add(fun1);
		pessoas.add(fun2);
		pessoas.add(fun3);
		pessoas.add(fun4);
		pessoas.add(fun5);
		pessoas.add(fun6);
		pessoas.add(dep1);
		pessoas.add(dep2);
		pessoas.add(dep3);
		pessoas.add(dep4);
		pessoas.add(dep5);
		pessoas.add(dep6);

	}

}
