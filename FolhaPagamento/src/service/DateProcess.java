package service;

import java.time.LocalDate;
import java.util.Scanner;

public class DateProcess {

	public static LocalDate dataInserir(Scanner sc) {
		System.out.println("Informe o ano: ");
		int ano = sc.nextInt();
		System.out.println("Informe o mês: ");
		int mes = sc.nextInt();
		System.out.println("Informe o dia: ");
		int dia = sc.nextInt();
		LocalDate data = LocalDate.of(ano, mes, dia);
		System.out.println(String.format("\nData informada: %d-%d-%d", dia, mes, ano));
		return data;
	}

	public static boolean dataValidaFolha(LocalDate data) {
		LocalDate dataDia = LocalDate.now();
		LocalDate dataInfo = data;
		boolean rodaFolha = true;

		int x = 0, y = 0;
		y = dataDia.getYear() - dataInfo.getYear();
		if (y == 1 || y == 0) {
			if (y == 0) {
				x = dataDia.getDayOfYear() - dataInfo.getDayOfYear();
				if (x < 0) {
					System.out.println("\nData Inválida!!!\nFolha não calculada\n");
					rodaFolha = false;
				}
			} else {
				x = dataDia.getDayOfYear() + (366 - dataInfo.getDayOfYear());
				System.out.println(x);
				if (x > 183) {
					System.out.println("\nData anterior a 6 meses ou Inválida!!!\nFolha não calculada\n");
					rodaFolha = false;
				}
			}
		} else {
			System.out.println("\nData anterior a 6 meses ou Inválida!!!\nFolha não calculada\n");
			rodaFolha = false;
		}
		return rodaFolha;
	}

	
	
}
