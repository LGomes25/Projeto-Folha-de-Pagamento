package app;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Dependente;
import model.Funcionario;
import model.Pessoa;
import service.FolhaPagamento;

//C:\serratec-2025-1\curso\dadosfuncionario.csv

public class RodaFolha {

	public static void main(String[] args) {
		
		//Iniciar Scanner de leitura
		Scanner sc = new Scanner(System.in);

		// criando lista de dependente e funcionario
		List<Funcionario> funcs = new ArrayList<>();
		List<Dependente> deps = new ArrayList<>();
		List<Pessoa> pessoas = new ArrayList<>();
		List<FolhaPagamento> folhas = new ArrayList<>();
		
		//Carregamento inicial automatico lista pre-prenchida via construtor
		service.ListFuncTest.carregaLista(funcs, deps, pessoas);

		//inicio da área de testes

//		
			

//		\/verificar motivo pelo qual não funciona\/
//		System.out.println(fun1.comparaCpf(fun1)); 
		 
		//Fim da área de testes
		
//		Inicio de menu
		int op = 0;// escolha para menus

		while (op != 9) {
			util.Menu.principal(); // chama o menu pricipal

			op = util.Menu.validaOp(sc); // chama leitura aceitando apenas numeros

			switch (op) {
			case 1: //importar arquivo .csv
				FileReader arquivo = util.Menu.sub1(sc, funcs);//lê caminha do arquivo
				service.ImportFileCsv.importArquivo(sc, arquivo, funcs);//importa dados*somente funcionarios*
				break;

			case 2: //Cadastrar novo Funcionário manualmente
				System.out.println("Em desenvolvimento 2");
				break;

			case 3: // Executar Folha
				util.Menu.sub3(sc, funcs, folhas);
				break;

			case 4:// Chama o menu de listas
				util.Menu.sub4(sc, funcs, deps, pessoas);
				break;

			case 5: //Gerar arquivo (.csv)
				System.out.println("Em desenvolvimento 5");
				break;

			case 6: //Enviar listas para Banco de Dados
				System.out.println("Em desenvolvimento 6");
				break;

			case 9: // encerra o programa amigavelmente
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
