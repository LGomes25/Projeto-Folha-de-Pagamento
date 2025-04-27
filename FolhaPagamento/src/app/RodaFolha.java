package app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Dependente;
import model.Funcionario;

public class RodaFolha {

	public static void main(String[] args) {

		//Instanciamento de funcionarios
		Funcionario fun1 = new Funcionario("Leonardo", "11122233345", LocalDate.of(2000, 2, 20), 4500.00);
		Funcionario fun2 = new Funcionario("Mariana", "22233344456", LocalDate.of(1995, 5, 15), 5200.00);
		Funcionario fun3 = new Funcionario("Carlos", "33344455567", LocalDate.of(1988, 10, 30), 6000.00);
		Funcionario fun4 = new Funcionario("Ana", "44455566678", LocalDate.of(1992, 7, 8), 4800.00);
		Funcionario fun5 = new Funcionario("Gabriel", "55566677789", LocalDate.of(2001, 12, 25), 4100.00);
		
		//instanciamento dependentes
		Dependente dep1 = new Dependente("José", "77788899945", LocalDate.of(2019, 6, 30), "FILHO");
		Dependente dep2 = new Dependente("Ana", "12345678912", LocalDate.of(2015, 11, 20), "SOBRINHO");
		Dependente dep3 = new Dependente("Lucas", "23456789123", LocalDate.of(2010, 3, 5), "OUTROS");
		Dependente dep4 = new Dependente("Beatriz", "34567891234", LocalDate.of(2017, 8, 15), "FILHO");
		Dependente dep5 = new Dependente("Gabriel", "45678912345", LocalDate.of(2014, 9, 25), "SOBRINHO");
				
		//Impressao de funcionarios
//		System.out.println(fun1);
//		System.out.println(fun2);
//		System.out.println(fun3);
//		System.out.println(fun4);
//		System.out.println(fun5);
		
		//impressao de dependentes
//		System.out.println(dep1);
//		System.out.println(dep2);
//		System.out.println(dep3);
//		System.out.println(dep4);
//		System.out.println(dep5);
		
		//criando lista de dependente e funcionario
		List<Funcionario> funcionarios = new ArrayList<>();
		List<Dependente> dependentes = new ArrayList<>();
		
		//Carregar listas funcionario
		funcionarios.add(fun1);
		funcionarios.add(fun2);
		funcionarios.add(fun3);
		funcionarios.add(fun4);
		funcionarios.add(fun5);
		
		//Carregar listas dependentes
		dependentes.add(dep1);
		dependentes.add(dep2);
		dependentes.add(dep3);
		dependentes.add(dep4);
		dependentes.add(dep5);
		
		System.out.println(funcionarios);
		System.out.println(dependentes);
		
		
	}

}
