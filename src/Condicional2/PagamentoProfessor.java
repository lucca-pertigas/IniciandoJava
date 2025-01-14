package Condicional2;

import java.util.Scanner;

public class PagamentoProfessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int categoria, tempo;
		double valor = 0;
		System.out.print("Qual a categoria do professor: ");
		categoria = sc.nextInt();
		System.out.print("Digite quantas horas o professor trabalhou: ");
		tempo = sc.nextInt();
		if (categoria == 1) {
			valor = tempo * 12;
		} else {
			if (categoria == 2) {
				valor = tempo * 17;
			} else {
				if (categoria == 3) {
					valor = tempo * 25;
				}
			}
		}
		System.out.print("Valor para pagar ao professor: " + valor);

	}

}
