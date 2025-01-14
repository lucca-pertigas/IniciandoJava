package Condicional1;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, escolha;
		double result;
		System.out.print("Digite o primeiro numero: ");
		n1 = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		n2 = sc.nextInt();
		System.out.print("Calculadora:\n"
				+ "1 - Soma\n"
				+ "2 - Substracao\n"
				+ "3 - Divisao\n"
				+ "4 - Multiplicacao\n");
		escolha = sc.nextInt();
		if (escolha == 1) {
			result = n1 + n2;
			System.out.print("Resultado - " + result);
		} else {
			if (escolha == 2) {
				result = n1 - n2;
				System.out.print("Resultado - " + result);
			} else {
				if (escolha == 3) {
					if (n2 != 0) {
						result = n1 / n2;
						System.out.print("Resultado - " + result);
					} else {
						System.out.print("Não é possivel realizar operação");
					}
				} else {
					if (escolha == 4) {
						result = n1 * n2;
						System.out.print("Resultado - " + result);
					} else {
						System.out.print("Nao existe essa opcao");
					}
				}
			}
		}

	}

}
