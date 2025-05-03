package util;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import model.Dependente;
import model.Funcionario;
import model.Pessoa;
import service.FolhaPagamento;
//import service.DateProcess;

public class Menu {

	private static LocalDate data;

	public static void principal() {
		System.out.println("=============== InteliFolha ===============");
		System.out.println("1 - Carregar arquivo externo (.csv)");
		System.out.println("2 - Cadastrar novo Funcionário manualmente");
		System.out.println("3 - Executar Folha");
		System.out.println("4 - Visualizar Listas");
		System.out.println("5 - Gerar arquivo (.csv)");
		System.out.println("6 - Enviar listas para Banco de Dados");
		System.out.println("9 - Sair");
		System.out.println("===========================================");
	}

	// Carregar arquivo externo (.csv)
	public static void sub1() {
		System.out.println("Em Desenvolvimento...");
	}

	// Cadastrar novo Funcionário manualmente
	public static void sub2() {
		System.out.println("Em Desenvolvimento...");
	}

	// Executar Folha
	public static void sub3(Scanner sc, List<Funcionario> funcs, List<FolhaPagamento> folhas) {
		System.out.println("\nUsar data do Sistema (" + LocalDate.now() + ")?");
		System.out.println("Digite 1 => data do Sistema");
		System.out.println("Digite 2 => informar data manualmente");
		data = LocalDate.now();
		boolean rodaFolha = false;

		// entrada de data
		try {
			int op = validaOp(sc);
			switch (op) {
				case 1:
					System.out.println("Data do Sistema utilizada: " + data);
					rodaFolha = true;
					break;
				case 2:
					data = service.DateProcess.dataInserir(sc); //Coleta data do console
					rodaFolha = service.DateProcess.dataValidaFolha(data); //verifica data: > 6meses ou inválido
					break;
				default:
					System.out.println("\nOpção escolhida Inválida\nReinicie o Processo\n");
					break;
			}

			// Rodar calculos
			if (rodaFolha) {

				for (int i = 0; i < funcs.size(); i++) {
					funcs.get(i).setDescontoInss(FolhaPagamento.calculaInss(funcs.get(i).getSalarioBruto()));
					funcs.get(i).setDescontoIR(
							FolhaPagamento.calculaIr(funcs.get(i).getSalarioBruto(), funcs.get(i).getContDep()));
					folhas.add(new FolhaPagamento(data, funcs.get(i)));
				}

				// Delay para esperar calculo.
				System.out.println("\nExecutando Folha.  .  .  .");
				Thread.sleep(3000);// precisa estar dentro de um Try/Cath

				// Apresenta dados da folha condensada
				for (FolhaPagamento f : folhas) {
					System.out.println(f);
				}
				System.out.println("\nFolha calculada com sucesso\n");

			}
		} catch (Exception e) {
			System.out.println("\nData inválida!!!\nFolha não calculada\n");

		}
	}

	// Visualizar istas
	public static void sub4(Scanner sc, List<Funcionario> funcionarios, List<Dependente> dependentes,
			List<Pessoa> pessoas) {
		System.out.println("=============== InteliFolha ===============");
		System.out.println("1 - Listar Funcionários");
		System.out.println("2 - Listar Dependentes");
		System.out.println("3 - Listar Todos");
		System.out.println("9 - Retornar ao Menu Principal");
		System.out.println("===========================================");
		int op = validaOp(sc);
		switch (op) {
		case 1: // apresenta a lista de funcionarios
			System.out.println("============================== InteliFolha ==============================");
			System.out.println("--------------------------- Lista Funcionarios ---------------------------");
			for (Funcionario func : funcionarios) {
				System.out.println(func.toString());
			}
			System.out.println("=========================================================================\n");
			break;
		case 2: // apresenta a lista de dependentes
			System.out.println("============================== InteliFolha ==============================");
			System.out.println("--------------------------- Lista Dependentes ----------------------------");
			for (Dependente dep : dependentes) {
				System.out.println(dep.toString());
			}
			System.out.println("=========================================================================\n");
			break;
		case 3: // apresenta a lista de pessoas
			System.out.println("============================== InteliFolha ==============================");
			System.out.println("------------------------------ Lista Geral ------------------------------");
			for (Pessoa pessoa : pessoas) {
				System.out.println(pessoa.toString());
			}
			System.out.println("=========================================================================\n");
			break;
		case 9:
			System.out.println("Opção escolhida 9 -> retornando ao menu principal...\n");
			break;
		default:
			System.out.println("Opção escolhida inválida\n");
			break;
		}
	}

	// Gerar arquivo (.csv)
	public static void sub5() {
		System.out.println("Em Desenvolvimento...");
	}

	// Enviar listas para Banco de Dados
	public static void sub6() {
		System.out.println("Em Desenvolvimento...");
	}

	// sair
	public static int sub9(Scanner sc) {
		System.out.println("============================== InteliFolha ==============================");
		System.out.println("Deseja sair do programa?");
		System.out.println("\nEscolha (0) para retornar ao Menu Principal");
		System.out.println("Escolha (9) para confirmar");
		int op = 1;

		while (op != 0 && op != 9) {
			op = validaOp(sc);
			if (op != 0 && op != 9) {
				System.out.println("Opção escolhida Inválida");
			}
		}

		if (op == 9) {
			System.out.println("================= Programa IteliFolha encerrado =========================\n");
		} else {
			System.out.println("Opção escolhida 0 -> retornando ao menu principal...\n");
		}
		return op;
	}

	// sair
	public static int validaOp(Scanner sc) {
		int op = 0;// escolha para menus
		boolean validacao = false;
		System.out.println("Escolha uma opção: ");
		while (validacao == false) {
			try {
				op = sc.nextInt();
				validacao = true;
			} catch (Exception e) {
				System.out.println("Opção escolhida Inválida");
				System.out.println("Digite apenas números");
				sc.nextLine();// limpar buffer (evita loop continuo)
			}
		}
		return op;
	}
}
