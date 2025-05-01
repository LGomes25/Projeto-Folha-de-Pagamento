package app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Dependente;
import model.Funcionario;
import model.Pessoa;
import service.FolhaPagamento;
import util.TipoDep;

public class RodaFolha {

	public static void main(String[] args) {

		//Instanciamento de funcionarios
		Funcionario fun1 = new Funcionario("Leonardo", "33344455567", LocalDate.of(2000, 2, 20), 1500.00);
		Funcionario fun2 = new Funcionario("Mariana", "33344455569", LocalDate.of(1995, 5, 15), 2500.00);
		Funcionario fun3 = new Funcionario("Carlos", "33344455569", LocalDate.of(1988, 10, 30), 3500.00);
		Funcionario fun4 = new Funcionario("Ana", "44455566678", LocalDate.of(1992, 7, 8), 4500.00);
		Funcionario fun5 = new Funcionario("Gabriel", "55566677781", LocalDate.of(2001, 12, 25), 6000.00);
		Funcionario fun6 = new Funcionario("Jonas", "55566677780", LocalDate.of(2001, 11, 25), 10000.00);
		
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
		List<Pessoa> pessoas = new ArrayList<>();
		List<FolhaPagamento> folhas = new ArrayList<>();
		
		//Carregar listas funcionario, dependente e pessoa
		funcs.add(fun1); funcs.add(fun2); funcs.add(fun3); funcs.add(fun4); funcs.add(fun5); funcs.add(fun6); 
		deps.add(dep1); deps.add(dep2); deps.add(dep3); deps.add(dep4); deps.add(dep5); deps.add(dep6); 
		pessoas.add(fun1); pessoas.add(fun2); pessoas.add(fun3); pessoas.add(fun4); pessoas.add(fun5); pessoas.add(fun6);
		pessoas.add(dep1);pessoas.add(dep2); pessoas.add(dep3); pessoas.add(dep4); pessoas.add(dep5); pessoas.add(dep6);
		
		//rodar folha
		for (int i = 0; i < funcs.size(); i++) {
			funcs.get(i).setDescontoInss(FolhaPagamento.calculaInss(funcs.get(i).getSalarioBruto()));
			funcs.get(i).setDescontoIR(FolhaPagamento.calculaIr(funcs.get(i).getSalarioBruto(),funcs.get(i).getContDep()));
			folhas.add(new FolhaPagamento(LocalDate.now(), funcs.get(i)));
		}
		for (FolhaPagamento f : folhas) {
			System.out.println(f);
		}
		
		//		System.out.println(fun1.comparaCpf(fun1)); <--verificar motivo pelo qual não funciona
		 
		//Inicio de menu
		
		Scanner sc = new Scanner(System.in);
		int op=0;//escolha para menus
		
		while (op!=9) {
			util.Menu.principal(); //chama o menu pricipal
			
			op=util.Menu.validaOp(sc); //chama leitura aceitando apenas numeros
			
			switch (op) {
			case 1:
				System.out.println("Em desenvolvimento 1");
				break;
				
			case 2:
				System.out.println("Em desenvolvimento 2");
				break;
				
			case 3: //Chama o menu de listas
				util.Menu.sub3(sc, funcs, deps, pessoas);
				break;
				
			case 4:
				System.out.println("Em desenvolvimento 4");
				break;
				
			case 5:
				System.out.println("Em desenvolvimento 5");
				break;
				
			case 9: //encerra o programa amigavelmente
				op = util.Menu.sub9(sc);
				break;
				
			default:
				System.out.println("Opção escolhida inválida\n");
				break;
			}
			
		}
	
	
	
	
	
	
	
	
	
		sc.close();
	}

}
