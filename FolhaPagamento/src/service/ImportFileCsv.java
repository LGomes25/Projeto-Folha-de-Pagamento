package service;

import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import model.Funcionario;

public class ImportFileCsv {

	public static void importArquivo(Scanner sc,FileReader arquivo, List<Funcionario> funcs) {
		
		FileReader file = arquivo;
		Scanner sc2 = new Scanner(file);

		while (sc2.hasNext()) {
			String linha = sc2.nextLine();

			if (!linha.isEmpty()) {
				String[] dados = linha.split(";");
				String nome = dados[0];
				String cpf = dados[1];
				String dataCsv = dados[2];
				DateTimeFormatter formatterEntrada = DateTimeFormatter.ofPattern("yyyyMMdd");
				LocalDate data = LocalDate.parse(dataCsv, formatterEntrada);
				Double salBruto = Double.parseDouble(dados[3]);

				funcs.add(new Funcionario(nome, cpf, data, salBruto));

			}
		}
		sc2.close();
		System.out.println("--------------------- Dados Importados do Arquivo ---------------------");
	}
	
}// fecha class
